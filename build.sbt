name := "hello"

version := "1.0"

scalaVersion := "2.11.9"

val jsonDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.3"
)

libraryDependencies ++=  jsonDependencies

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}