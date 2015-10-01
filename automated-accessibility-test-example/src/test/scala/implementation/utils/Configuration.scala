package implementation.utils

object Configuration {
  
  val defaultWait = Option(System.getProperty("defaultWait")).getOrElse("5")

  lazy val environment = System.getProperty("environment", "local").toLowerCase match {
    case "local" => Map("id" -> "local", "defaultWait" -> defaultWait)
    case _ => throw new IllegalArgumentException(s"environment system property is invalid")
  }

  def apply(key: String) = environment(key)

}