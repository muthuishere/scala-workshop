package controllers

import auth.{AdminAuthentication, GuestAuthentication, JWTAuthentication}
import javax.inject._
import models.vehicles.Vehicle
import play.api.libs.json.{JsValue, Json}
import play.api.libs.typedmap.TypedKey
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class VehicleController @Inject()(val guestAuthentication: GuestAuthentication, val adminAuthentication: AdminAuthentication, val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */


  def list = guestAuthentication { implicit request =>

    println( "list" + request.attrs.get(TypedKey("role")))

    Ok(Json.toJson(Vehicle.all()))
  }
//
//  def list() = Action { implicit request: Request[AnyContent] =>
//    Ok(Json.toJson(Vehicle.all()))
//
//  }
  def byId(id:Int) = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson(Vehicle.getById(id)))

  }
  def deleteById(id:Int) = adminAuthentication { implicit request: Request[AnyContent] =>
    Vehicle.delete(id)
    Ok

  }

  def create() = adminAuthentication { implicit request: Request[AnyContent] =>

    val json = request.body.asJson.get
    val stock = json.as[Vehicle]
    println(stock)
    Vehicle.create(stock)
    Ok

  }


}
