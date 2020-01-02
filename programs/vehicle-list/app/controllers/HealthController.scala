package controllers

import javax.inject.{Inject, Singleton}
import play.api._
import play.api.mvc._

@Singleton
class HealthController @Inject()
(val controllerComponents: ControllerComponents
) extends BaseController {

  def health = Action {
    implicit request: Request[AnyContent] =>
    Ok
  }
}
