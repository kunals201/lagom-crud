name := "Ping"

version := "1.0"

scalaVersion := "2.12.2"

import Dependencies._
import ProjectSettings._



lazy val api = BaseProject("api").settings(
  libraryDependencies := compileDependencies(finatraHttp.value ++ json4sNative.value),

  parallelExecution in Test := false,
  resolvers ++= Seq(Resolver.sonatypeRepo("releases"))
)
