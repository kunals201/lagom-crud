import sbt._

object ProjectSettings {

  def BaseProject(name: String): Project = Project(name, file(name))

}
