name := "flyway_v0"

version := "0.0"

scalaVersion := "2.11.8"

test in assembly := {}

sbtPlugin := true

sbtVersion := "0.13.6"

libraryDependencies ++= {
  Seq(
    "com.typesafe" 	  %  "config" 					% "1.3.0",
    "org.flywaydb"        %  "flyway-core"                          	% "4.0.2",
    "mysql"               %  "mysql-connector-java"                 	% "5.1.39",
    "org.scalatest"       %% "scalatest"                            	% "2.2.4" % "test"
  )

}
// H2 In Memory 
//flywayUrl := "jdbc:h2:file:./target/foobar"

// MySQL
flywayUrl := "jdbc:mysql://localhost/akka_rest_api_v0"

flywayUser := "root"
flywayPassword := ""
