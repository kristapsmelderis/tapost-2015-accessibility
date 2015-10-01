package implementation.stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.{JavascriptExecutor, By}
import implementation.selenium.CurrentDriver._

class Accessibility extends ScalaDsl with EN {

  Then( """^accessibility test is executed on the open page$""") {
    () => withCurrentDriver { implicit webDriver =>
      val cache = collection.mutable.Map[String, String]()
      val jse = webDriver.asInstanceOf[JavascriptExecutor]
      def getUrlSource(arg: String): String = cache get arg match {
        case Some(result) => result
        case None =>
          val result: String = scala.io.Source.fromURL(arg).mkString
          cache(arg) = result
          result
      }
      jse.executeScript(getUrlSource("https://raw.githubusercontent.com/GoogleChrome/" +
        "accessibility-developer-tools/stable/dist/js/axs_testing.js"))
      val report = jse.executeScript("var results = axs.Audit.run();return axs.Audit.createReport(results);")
      println(report)
    }
  }

}
