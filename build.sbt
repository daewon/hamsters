name := "hamsters-test-release"

version := "fixed"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
   "io.github.scala-hamsters" %% "hamsters" % "1.1.0",
   "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
