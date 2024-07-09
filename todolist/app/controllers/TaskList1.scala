package controllers

import javax.inject._
import play.api.mvc.ControllerComponents
import play.api.mvc.BaseController
import Models.TaskListInMemoryModel
import views.html.defaultpages.error

@Singleton
class TaskList1 @Inject() (val controllerComponents: ControllerComponents)
    extends BaseController {

  def taskList = Action { implicit request =>
    val user = request.session.get("Username")
    val tasks = TaskListInMemoryModel.getTasks(user.head)
    user match {
      case Some(user) =>
        Ok(views.html.taskList1(tasks, user))
      case None =>
        Redirect(routes.TaskList1.login())

    }

  }

  def login() = Action { implicit request =>
    Ok(views.html.login1())
  }

  def logout() = Action { implicit request =>
    Ok(views.html.login1()).withNewSession
  }

  def signup() = Action { implicit request =>
    {
      val formData = request.body.asFormUrlEncoded
      formData.map { args =>
        val username = args.get("username").head
        val password = args.get("password").head
        if (TaskListInMemoryModel.createUser(username.head, password.head)) {
          Redirect(routes.TaskList1.login())
        } else {
          Redirect(routes.TaskList1.login())
            .flashing("error" -> "User already exists")
        }
      }
    }.getOrElse {
      Ok(views.html.login1())
    }
  }
  def validateLogin1() = Action { implicit request =>
    Ok("Inside validation")
  }

  def validateLogin() = Action { implicit request =>
    val formData = request.body.asFormUrlEncoded
    formData
      .map { args =>
        val username = args.get("username").head
        val password = args.get("password").head
        if (TaskListInMemoryModel.validateUser(username.head, password.head)) {
          Redirect(routes.TaskList1.taskList())
            .withSession("Username" -> username.head)
        } else {
          Redirect(routes.TaskList1.login())
            .flashing("error" -> "Invalid username or password")
        }
      }
      .getOrElse {
        Redirect(routes.TaskList1.login())
      }
  }

  def addTask() = Action { implicit request =>
    val formData = request.body.asFormUrlEncoded
    val userOpt = request.session.get("Username")

    userOpt match {
      case Some(user) =>
        formData
          .map { args =>
            val task = args("task").head.toString
            TaskListInMemoryModel.addTask(user, task)
            Redirect(
              routes.TaskList1.taskList()
            )
          }
          .getOrElse {
            BadRequest("Form data not found")
          }
      case None =>
        Redirect(routes.TaskList1.login())
          .flashing("error" -> "You need to be logged in to add tasks")
    }
  }

  def delete() = Action { implicit request =>
    val formData = request.body.asFormUrlEncoded
    val userOpt = request.session.get("Username")
    userOpt match {
      case Some(user) =>
        formData
          .map { args =>
            val task = args("index").head.toInt
            TaskListInMemoryModel.deleteTask(user, task)
            Redirect(
              routes.TaskList1.taskList()
            )
          }
          .getOrElse {
            BadRequest("Form data not found")
          }
      case None =>
        Redirect(routes.TaskList1.login())
          .flashing(
            "error" -> "You need to be logged in to perform operation"
          )
    }
  }
  def product(productType: String, id: Int) = Action {
    Ok(s"Product trype : $productType , Product Num : $id")
  }
}
