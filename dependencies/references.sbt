
resolvers +=   "Java.net Typesafe Repository" at "https://repo.typesafe.com/typesafe/ivy-releases/"
resolvers +=  "Java.net Maven Repository" at "https://repo.typesafe.com/typesafe/maven-releases/"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += "io.jsonwebtoken" % "jjwt" % "0.9.1"


libraryDependencies += jdbc
libraryDependencies += evolutions
libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.5"
libraryDependencies += "com.h2database" % "h2" % "1.4.199"