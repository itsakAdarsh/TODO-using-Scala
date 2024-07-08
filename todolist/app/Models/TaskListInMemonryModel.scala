package Models
import scala.collection.mutable

object TaskListInMemonryModel {

  private var user = mutable.Map[String, String]("Mark" -> "pass")
  private val task =
    mutable.Map[String, List[String]]("Mark" -> List("task1", "task2"))
  def validateUser(username: String, password: String): Boolean = {
    user.get(username).map(_ == password).getOrElse(false)
  }
  def createUser(username: String, password: String): Boolean = {
    if (user.contains(username)) {
      false
    } else {
      user(username) = password
      true
    }
  }
  def getTasks(username: String): List[String] = {
    task.get(username).getOrElse(Nil)
  }
  def addTask(username: String, taskItem: String): Unit = {
    val tasks = task.getOrElse(username, Nil)
    task(username) = taskItem :: tasks
  }
  def deleteTask(username:String, index:Int):Boolean={
    val tasks = task.getOrElse(username, Nil)
    if(index>=0 || index<tasks.length){
      task(username) = task(username).patch(index,Nil,1)
      true
    }
    false
  }
}
