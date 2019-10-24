name := "scala-incremental-confusion"
organization in ThisBuild := "timw"
scalaVersion in ThisBuild := "2.12.10"

lazy val global = project
  .in(file("."))
  .settings()
  .aggregate(
    module1,
    module2
  )

lazy val module1 = project
  .settings(
    name := "module1"
  )

lazy val module2 = project
  .settings(
    name := "module2"
  )
  .dependsOn(
    module1
  )