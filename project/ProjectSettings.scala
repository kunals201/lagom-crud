import sbt._
import sbt.Keys._

object ProjectSettings {

  val projectDefaultSettings = Defaults.coreDefaultSettings ++ Seq(
    scalaVersion in ThisBuild := "2.12.2"
  )

  def BaseProject(name: String): Project = Project(name, file(name)).settings(projectDefaultSettings)

}
