name := "automated-accessibility-test-example"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "2.45.0",
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % "2.45.0",
  "org.scalatest" %% "scalatest" % "2.2.1",
  "org.pegdown" % "pegdown" % "1.1.0" % "test",
  "org.scala-lang" % "scala-library" % "2.10.4",
  "org.scalaj" %% "scalaj-http" % "1.1.0",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.2",
  "info.cukes" % "cucumber-junit" % "1.2.2",
  "info.cukes" % "cucumber-picocontainer" % "1.2.2",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "uk.gov.hmrc" %% "accessibility-driver" % "1.6.0"
)