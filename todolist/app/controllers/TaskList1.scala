package controllers

import javax.inject._
import play.api.mvc.ControllerComponents
import play.api.mvc.BaseController
import Models.TaskListInMemonryModel

@Singleton
class TaskList1 @Inject() (val controllerComponents: ControllerComponents)
    extends BaseController {

  def taskList = Action {implicit request =>
    val tasks = TaskListInMemonryModel.getTasks("Mark")
    request.session.get("Username") match {
      case Some(user) =>
        Ok(views.html.taskList1(tasks, user))
      case None =>
        Redirect(routes.TaskList1.login())

    }

  }

  def login() = Action {implicit request=>
    Ok(views.html.login1())
  }

  def logout() = Action {implicit request=>
    Ok(views.html.login1()).withNewSession
  }

  def signup() = Action {implicit request =>
    {
      val formData = request.body.asFormUrlEncoded
      formData.map { args =>
        val username = args.get("username").head
        val password = args.get("password").head
        if (TaskListInMemonryModel.createUser(username.head, password.head)) {
          Redirect(routes.TaskList1.login())
        } else {
          Ok("user already exists")
        }
      }
    }.getOrElse {
      Ok(views.html.login1())
    }
  }
  def validateLogin1() = Action { implicit request =>
    Ok("Inside validation")
  }

  def validateLogin() = Action {implicit request =>
    val formData = request.body.asFormUrlEncoded
    formData
      .map { args =>
        val username = args.get("username").head
        val password = args.get("password").head
        if (TaskListInMemonryModel.validateUser(username.head, password.head)) {
          Redirect(routes.TaskList1.taskList())
            .withSession("Username" -> username.head)
        } else {
          Ok("Incvalid user and pass")
        }
      }
      .getOrElse {
        Redirect(routes.TaskList1.login())
      }
  }

  def product(productType: String, id: Int) = Action {
    Ok(s"Product trype : $productType , Product Num : $id")
  }
}