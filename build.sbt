import ScalaxbKeys._

name := "bpmn-model"

organization := "de.choffmeister"

version := "0.0.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.specs2" %% "specs2" % "2.2.3" % "test"
)

scalaxbSettings

sourceGenerators in Compile <+= scalaxb in Compile

packageName in scalaxb in Compile := "de.choffmeister.bpmnmodel"

testOptions in Test += Tests.Argument("junitxml", "console")
