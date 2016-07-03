name := "apache_camel_sftp_v0"

version := "0.0"

scalaVersion := "2.11.8"

sbtVersion := "0.13.6"

sbtPlugin := true

test in assembly := {}

libraryDependencies ++= {
  Seq(
	 "org.apache.apex" 	  % "malhar-library" 								  % "3.4.0"
  )

}
