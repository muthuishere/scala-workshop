package auth

import filters.AuthService
import javax.inject.Inject
import models.users.TokenResponse
import play.api.Logging
import play.api.libs.typedmap.TypedKey
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}

class JWTAuthentication @Inject() (parser: BodyParsers.Default)(implicit ec: ExecutionContext)
  extends ActionBuilderImpl(parser)
    with Logging {
  override def invokeBlock[A](request: Request[A], block: (Request[A]) => Future[Result]) = {
    logger.info("Calling action")
    println("Calling action")
    val authHeader = request.headers.get("Authorization").getOrElse("")
    val jwtToken = authHeader.split(" ")(1)
    println(jwtToken)
    val tokenResponse: TokenResponse = AuthService.getUser(jwtToken)

   request.addAttr(TypedKey("role"),tokenResponse.role)

    println(tokenResponse)

    block(request)
  }
}



//
//class JWTAuthentication @Inject() (parser: BodyParsers.Default)(implicit ec: ExecutionContext)
//  extends ActionBuilderImpl(parser)
//     {
//  override def invokeBlock[A](request: Request[A], block: (Request[A]) => Future[Result]) = {

//    block(request)
//  }
//}
