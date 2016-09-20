val scoveragePluginVersion = "1.3.6-SNAPSHOT"

resolvers ++= {
  if (scoveragePluginVersion.endsWith("-SNAPSHOT"))
    Seq(Resolver.sonatypeRepo("snapshots"))
  else
    Seq.empty
}

addSbtPlugin("org.scoverage" % "sbt-scoverage" % scoveragePluginVersion)
