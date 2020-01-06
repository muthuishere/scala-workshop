package controllers

import auth.{AdminAuthentication, GuestAuthentication}
import javax.inject._
import models.DatabaseExecutionContext
import models.vehicles.{Vehicle, VehicleRepository}
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val  vehicleRepository: VehicleRepository,val guestAuthentication: GuestAuthentication, val adminAuthentication: AdminAuthentication, val controllerComponents: ControllerComponents)(implicit ec: DatabaseExecutionContext) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>

    Ok(views.html.index())
  }

  def insertAll() = Action { implicit request: Request[AnyContent] =>

    vehicleRepository.insertAll(Vehicle.all())

    Ok(views.html.index())
  }
}

