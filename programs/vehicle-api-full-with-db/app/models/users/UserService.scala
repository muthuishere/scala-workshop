package models.users

import scala.collection.mutable.ListBuffer

object UserService {

  def getAllUsers():List[User] ={
    var users = new ListBuffer[User]()
    users += new User("xuser","xuser","guest");
    users += new User("xadmin","xadmin","admin");

    return users.toList
  }
}
