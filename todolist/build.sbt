name := """TodoList"""
organization := "adarsh"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.14"

libraryDependencies += guice
libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.10.0-RC6",
  "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
)
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "adarsh.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "adarsh.binders._"
