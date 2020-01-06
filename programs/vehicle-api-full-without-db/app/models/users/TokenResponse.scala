package models.users

import play.api.libs.json.Json

case class TokenResponse(var username:String, var role:String,var token:String)

object TokenResponse{
  implicit val writes = Json.writes[TokenResponse]


  def getAsUserResponse(user:User,token:String):TokenResponse={

    new TokenResponse(user.username,user.userrole,token)
  }
}



