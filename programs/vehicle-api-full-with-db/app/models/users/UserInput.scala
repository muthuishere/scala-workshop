package models.users

import play.api.libs.json.Json

case class UserInput(var username:String, var password:String)

object UserInput {
  implicit val reads = Json.reads[UserInput]

}



