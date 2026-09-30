name := "comp371f26-project2a"

version := "0.1"

enablePlugins(JavaAppPackaging)
executableScriptName := "main"
//addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.11.1")

libraryDependencies ++= Seq(
  "org.scalatest"     %% "scalatest"  % "3.2.19"  % Test,
  "org.scalacheck"    %% "scalacheck" % "1.19.0"  % Test,
  "org.apache.commons" % "commons-collections4" % "4.5.0" //java library with no scala suffix
)
