package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import Models.TaskListInMemoryModel
import scala.util.Try

@Singleton
class TaskList2 @Inject()(val controllerComponents: ControllerComponents)
  extends BaseController {

  implicit val taskWrites = new Writes[List[String]] {
    def writes(tasks: List[String]) = Json.obj(
      "tasks" -> tasks
    )
  }

  def taskList2 = Action { implicit request =>
    val user = request.session.get("Username")
    user match {
      case Some(username) =>
        val tasks = TaskListInMemoryModel.getTasks(username)
        Ok(Json.toJson(tasks))
      case None =>
        Unauthorized(Json.obj("error" -> "Unauthorized access"))
    }
  }

  def login2() = Action { implicit request =>
    Ok(views.html.login1())
  }

  def logout2() = Action { implicit request =>
    Ok(views.html.login1()).withNewSession
  }

  def signup2() = Action(parse.json) { implicit request =>
    val maybeUsername = (request.body \ "username").asOpt[String]
    val maybePassword = (request.body \ "password").asOpt[String]

    (maybeUsername, maybePassword) match {
      case (Some(username), Some(password)) =>
        if (TaskListInMemoryModel.createUser(username, password)) {
          Ok(Json.obj("message" -> "User created successfully"))
        } else {
          BadRequest(Json.obj("error" -> "User already exists"))
        }
      case _ =>
        BadRequest(Json.obj("error" -> "Invalid JSON format"))
    }
  }

  def validateLogin2() = Action(parse.json) { implicit request =>
    val maybeUsername = (request.body \ "username").asOpt[String]
    val maybePassword = (request.body \ "password").asOpt[String]

    (maybeUsername, maybePassword) match {
      case (Some(username), Some(password)) =>
        if (TaskListInMemoryModel.validateUser(username, password)) {
          Ok(Json.obj("message" -> "Login successful")).withSession("Username" -> username)
        } else {
          Unauthorized(Json.obj("error" -> "Invalid username or password"))
        }
      case _ =>
        BadRequest(Json.obj("error" -> "Invalid JSON format"))
    }
  }

  def addTask2() = Action(parse.json) { implicit request =>
    val maybeTask = (request.body \ "task").asOpt[String]
    val maybeUsername = request.session.get("Username")

    (maybeTask, maybeUsername) match {
      case (Some(task), Some(username)) =>
        TaskListInMemoryModel.addTask(username, task)
        Ok(Json.obj("message" -> "Task added successfully"))
      case _ =>
        BadRequest(Json.obj("error" -> "Invalid JSON format or user not logged in"))
    }
  }

  def delete2() = Action(parse.json) { implicit request =>
    val maybeIndex = (request.body \ "index").asOpt[Int]
    val maybeUsername = request.session.get("Username")

    (maybeIndex, maybeUsername) match {
      case (Some(index), Some(username)) =>
        if (TaskListInMemoryModel.deleteTask(username, index)) {
          Ok(Json.obj("message" -> "Task deleted successfully"))
        } else {
          BadRequest(Json.obj("error" -> "Invalid index or task not found"))
        }
      case _ =>
        BadRequest(Json.obj("error" -> "Invalid JSON format or user not logged in"))
    }
  }

  def product2(productType: String, id: Int) = Action {
    Ok(Json.obj("productType" -> productType, "id" -> id))
  }
}
