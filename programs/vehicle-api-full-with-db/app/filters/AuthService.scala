package filters

import java.util.Date

import io.jsonwebtoken.{Jwts, SignatureAlgorithm}
import javax.inject.Singleton
import models.users.{TokenResponse, User}


object AuthService {

  val JwtSecretKey = "secretKey"
  val JwtSecretAlgo = "HS256"

  def createToken(user: User): String = {
    Jwts.builder().setSubject(user.username).claim("roles", user.userrole).setIssuedAt(new Date())
      .signWith(SignatureAlgorithm.HS256, JwtSecretKey).compact();
  }

  def getUser(jwtToken: String): TokenResponse = {
    var tokenResponse = new TokenResponse("","","")


      val claims = Jwts.parser.setSigningKey(JwtSecretKey).parseClaimsJws(jwtToken).getBody

      tokenResponse = new TokenResponse(claims.getSubject, claims.get("roles").toString, "")

      println(tokenResponse)


    tokenResponse
  }


}
