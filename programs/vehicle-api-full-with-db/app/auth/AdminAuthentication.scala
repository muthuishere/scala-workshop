package auth

import filters.AuthService
import javax.inject.Inject
import models.users.TokenResponse
import play.api.Logging
import play.api.mvc.Results._
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}

class AdminAuthentication @Inject()(parser: BodyParsers.Default)(implicit ec: ExecutionContext)
  extends ActionBuilderImpl(parser)
    with Logging {
  override def invokeBlock[A](request: Request[A], block: (Request[A]) => Future[Result]) = {
    logger.info("Calling action")
    println("Calling action")
    val authHeader = request.headers.get("Authorization").getOrElse("")

    if(authHeader.length == 0)
      Future.successful(Forbidden("No Token"))

    val jwtToken = authHeader.split(" ")(1)
    println(jwtToken)
    val tokenResponse: TokenResponse = AuthService.getUser(jwtToken)


    println(tokenResponse)

    if (tokenResponse.role == "admin")
      block(request)
    else
      Future.successful(Forbidden("Invalid User only admin alllowed"))
  }
}
