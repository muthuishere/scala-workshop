package controllers

import filters.AuthService
import javax.inject._
import models.users.{TokenResponse, User, UserInput}
import models.vehicles.Vehicle
import play.api.libs.json.Json
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class UserController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {




  def login() = Action { implicit request: Request[AnyContent] =>

    println("Starting login")
    val json = request.body.asJson.get
    val stock = json.as[UserInput]

    println("Starting login 2")
    println(stock)
    val user = User.validateUserCredentials(stock);
    val token = AuthService.createToken(user)
    val result= TokenResponse.getAsUserResponse(user,token)
    Ok(Json.toJson(result))

  }


}
