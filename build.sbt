name := "hamsters-test-release"

version := "fixed"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
   "io.github.scala-hamsters" %% "hamsters" % "1.0.2",
   "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

resolvers += Resolver.url("github repo for hamsters", url("http://scala-hamsters.github.io/hamsters/releases/"))(Resolver.ivyStylePatterns)


