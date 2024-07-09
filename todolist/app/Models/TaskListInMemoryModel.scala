package Models

import scala.collection.mutable

object TaskListInMemoryModel {

  private var users = mutable.Map[String, String]("Mark" -> "pass")
  private val tasks = mutable.Map[String, List[String]]("Mark" -> List("task1", "task2"))

  def validateUser(username: String, password: String): Boolean = {
    users.get(username).contains(password)
  }

  def createUser(username: String, password: String): Boolean = {
    if (users.contains(username)) {
      false
    } else {
      users(username) = password
      true
    }
  }

  def getTasks(username: String): List[String] = {
    tasks.getOrElse(username, Nil)
  }

  def addTask(username: String, taskItem: String): Unit = {
    val userTasks = tasks.getOrElse(username, Nil)
    tasks(username) = taskItem :: userTasks
  }

  def deleteTask(username: String, index: Int): Boolean = {
    val userTasks = tasks.getOrElse(username, Nil)
    if (index >= 0 && index < userTasks.length) {
      tasks(username) = userTasks.patch(index, Nil, 1)
      true
    } else {
      false
    }
  }
}
