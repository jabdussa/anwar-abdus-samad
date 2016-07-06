name := "apache_camel_sftp_v0"

version := "0.0"

scalaVersion := "2.11.8"

sbtVersion := "0.13.6"

sbtPlugin := true

test in assembly := {}

libraryDependencies ++= {
  Seq(
    "org.apache.camel" 	% "camel-scala" % "2.17.2",
    "org.apache.camel" 	% "camel-core" 	% "2.17.2",
    "org.apache.camel" 	% "camel-ftp" 	% "2.17.2",
    "com.typesafe" 		% "config" 		% "1.3.0"
  )

}
