package controllers

import javax.inject._
import models.Vehicle
import play.api.data._
import play.api.data.Forms._
import play.api.i18n.I18nSupport
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class VehicleController @Inject()(val controllerComponents: ControllerComponents) extends BaseController with  I18nSupport {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>

    Ok(views.html.vehicle(Vehicle.list(),vehicleForm))
  }
  //case class Vehicle (var sNo:Int,var name:String,var manufacturer:String
  // ,var year:Int,var fuelType:String,var transmission:String)

  def newVehicle = Action { implicit request=>

    vehicleForm.bindFromRequest.fold(
      errors=> BadRequest(views.html.vehicle(Vehicle.list(),errors)),
      current => {
        Vehicle.create(current)
        Redirect(routes.VehicleController.index)
      }
    )
  }

  val vehicleForm = Form( mapping (
    "sNo" -> number,
    "name" -> text,
    "manufacturer" -> text,
    "year" -> number,
    "fuelType" -> text,
    "transmission" -> text)(Vehicle.apply)(Vehicle.unapply))
}
