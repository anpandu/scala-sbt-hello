name := "hello"

version := "1.0"

scalaVersion := "2.11.9"

// resolvers += "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"

val jsonDependencies = Seq(

  // "com.typesafe.play" %% "play-json" % "2.6.7",
  "org.scalatest" %% "scalatest" % "3.0.3"
)

libraryDependencies ++=  jsonDependencies

assemblyMergeStrategy in assembly := {
  // case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case "META-INF/MANIFEST.MF" => MergeStrategy.discard
  case x => MergeStrategy.first
}