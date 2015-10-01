package implementation.stepdefs

import cucumber.api.java.{After, Before}
import cucumber.api.scala.{EN, ScalaDsl}
import implementation.selenium.CurrentDriver
import org.scalatest.Matchers


class Hooks extends ScalaDsl with EN with Matchers {
  @Before
  def initialize = {

  }

  //Executes after each scenario in a feature
  @After
  def tearDown = {
    CurrentDriver.quitAndDestroy()
  }
}

