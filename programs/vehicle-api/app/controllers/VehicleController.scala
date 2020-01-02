package controllers

import javax.inject._
import models.Vehicle
import play.api.libs.json.Json
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class VehicleController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def list = Action{ implicit request =>

    Ok(Json.toJson(Vehicle.list()))
  }

}
