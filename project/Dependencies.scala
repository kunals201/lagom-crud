import sbt._

object Dependencies {

  val finatraVersion = "2.11.0"
  val mockitoVersion = "1.10.19"
  val json4sVersion = "3.5.0"

  def compileDependencies(deps: List[ModuleID]): Seq[ModuleID] = deps map (_ % "compile")

  def providedDependencies(deps: List[ModuleID]): Seq[ModuleID] = deps map (_ % "provided")

  def testDependencies(deps: List[ModuleID]): Seq[ModuleID] = deps map (_ % "test")

  def finatraHttp = Def.setting { "com.twitter" % "finatra-http_2.11" % finatraVersion :: Nil }

  def mockito = Def.setting { "org.mockito" % "mockito-core" % mockitoVersion :: Nil }

  def json4sNative = Def.setting { "org.json4s" %% "json4s-native" % json4sVersion :: Nil }

}
