name := "tws-dice-system"
version := "0.1"
organization := "es.othercode"
scalaVersion := "2.13.2"

// Custom folders path (/src/main/scala and /src/test/scala by default)
scalaSource in Compile := baseDirectory.value / "/src/main"
scalaSource in Test := baseDirectory.value / "/src/test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % Test

// Project Archetype for sbt-native-packager
enablePlugins(JavaAppPackaging)