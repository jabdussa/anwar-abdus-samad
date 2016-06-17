logLevel := Level.Warn

addSbtPlugin("org.flywaydb" % "flyway-sbt" % "4.0.2")

resolvers += "Flyway" at "https://flywaydb.org/repo"
