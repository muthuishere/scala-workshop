package controllers

import auth.{AdminAuthentication, GuestAuthentication, JWTAuthentication}
import javax.inject._
import models.vehicles.{Vehicle, VehicleRepository}
import play.api.libs.json.{JsValue, Json}
import play.api.libs.typedmap.TypedKey
import play.api.mvc._
import models.DatabaseExecutionContext
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class VehicleController @Inject()(val  vehicleRepository: VehicleRepository,val guestAuthentication: GuestAuthentication, val adminAuthentication: AdminAuthentication, val controllerComponents: ControllerComponents)(implicit ec: DatabaseExecutionContext) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */


  def list = Action.async { implicit request =>



    vehicleRepository.list().map { vehicles =>
      println("via vehicleRepository",vehicles)
      Ok(Json.toJson(vehicles))
    }



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
