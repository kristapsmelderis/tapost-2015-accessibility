package implementation.stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import implementation.selenium.CurrentDriver._

class Navigation extends ScalaDsl with EN {

  Given( """^user navigates to '(.*)' web page$""") {
    (userUrl: String) => withCurrentDriver { implicit webDriver =>
      webDriver.get(userUrl)
    }
  }

}
