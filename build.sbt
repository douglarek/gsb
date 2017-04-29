lazy val root = (project in file(".")).
  settings(
    name := "sbs",
    version := "0.1",
    scalaVersion := "2.12.2",
    exportJars := true
  )

enablePlugins(JavaServerAppPackaging)

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot" % "1.5.3.RELEASE",
  "org.springframework.boot" % "spring-boot-autoconfigure" % "1.5.3.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-web" % "1.5.3.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-test" % "1.5.3.RELEASE",
  "junit" % "junit" % "4.12"
)