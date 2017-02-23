name := """akkademy-db-client"""
organization := "com.akkademy-db"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.akkademy-db"   %% "akkademy-db" % "0.0.1-SNAPSHOT",
  "com.typesafe.akka" %% "akka-actor" % "2.4.17",
  "com.typesafe.akka" %% "akka-remote" % "2.4.17",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.17",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    //  exclude("org.scala-lang", "scala-reflect")
    exclude("org.scala-lang.modules", "scala-xml_2.11")
)