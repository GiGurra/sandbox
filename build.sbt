lazy val sandbox = (project in file(".")).settings(
  name := "sandbox",
  organization := "se.gigurra",
  version := "SNAPSHOT",
  scalaVersion := "2.11.6",

  parallelExecution in Test := false,
//  test in assembly := {},
//  mainClass in assembly := Some("se.yabs.jobsniffer.Main"),

//  unmanagedSourceDirectories in Compile += baseDirectory.value / "src_generated" / "main" / "java",

  scalacOptions ++= Seq("-feature"),

  libraryDependencies ++= Seq(
//    "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.10",
//    "javax.mail" % "mail" % "1.4.7",
//  "org.sorm-framework" % "sorm" % "0.3.18",
  //  "com.typesafe.slick" % "slick_2.11" % "3.0.0-RC3",
 //   "com.h2database" % "h2" % "1.3.168",
    "org.slf4j" % "slf4j-log4j12" % "1.7.12",
    "com.novocode" % "junit-interface" % "0.11" % "test",
    "org.scala-lang.modules" %% "scala-async" % "0.9.2",
//    "io.spray" %% "spray-can" % "1.3.2",
//    "org.scalaj" %% "scalaj-http" % "1.1.4",
//    "org.scala-lang.modules" %% "scala-xml" % "1.0.3",
    "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"
  ),

  // Sync to maven central is slow, so we add this line for instant access :)
  resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"

)


