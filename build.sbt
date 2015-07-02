name := "pcbroute"

version := "0.0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.assembla.scala-incubator" %% "graph-core" % "1.9.2"
)

mainClass in Compile := Some("com.github.scottmansfield.Main")