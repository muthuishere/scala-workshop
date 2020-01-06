package models.users

import play.api.libs.json.Json

import scala.collection.mutable.ListBuffer

case class User(var username:String, var password:String, var userrole:String)



object User{
  implicit val writes = Json.writes[User]
  implicit val reads = Json.reads[User]


  var users = ListBuffer.empty ++ UserService.getAllUsers()


  def validateUserCredentials(input: UserInput):User ={


    users.find(currentuser=> currentuser.username == input.username && currentuser.password == input.password).getOrElse(throw new Exception("Invalid User"))

  }
  def all(): List[User] = {
    users.toList
  }

  def create(vehicle: User): Unit = {
    users += vehicle
  }


  def getById(id: Long): User = {
    users.find(_.username == id).getOrElse(null)
  }


  def delete(id: Long): Unit = {
    users -= getById(id)
  }


}