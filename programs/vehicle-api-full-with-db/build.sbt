name := """vehicle-api"""
organization := "sessions.playframework"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
//https://github.com/playframework/play-slick
scalaVersion := "2.13.1"

resolvers +=   "Java.net Typesafe Repository" at "https://repo.typesafe.com/typesafe/ivy-releases/"
resolvers +=  "Java.net Maven Repository" at "https://repo.typesafe.com/typesafe/maven-releases/"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += "io.jsonwebtoken" % "jjwt" % "0.9.1"


libraryDependencies += jdbc
libraryDependencies += evolutions
libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.5"
libraryDependencies += "com.h2database" % "h2" % "1.4.199"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "sessions.playframework.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "sessions.playframework.binders._"
