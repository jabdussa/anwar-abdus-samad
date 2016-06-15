name := "akka_rest_api_v0"

version := "0.0"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val scalaTestVersion    = "2.2.4"
  val scalaMockVersion    = "3.2.2"

  Seq(
    "com.typesafe.akka"   %  "akka-actor_2.11"                      % "2.4.7",
    "com.typesafe.akka"   %  "akka-stream_2.11"                     % "2.4.7",
    "com.typesafe.akka"   %  "akka-stream-experimental_2.11"        % "2.0.4",
    "com.typesafe.akka"   %  "akka-http-core-experimental_2.11"     % "2.0.4",
    "com.typesafe.akka"   %  "akka-http-experimental_2.11"          % "2.4.7",
    "com.typesafe.akka"   %  "akka-http-spray-json-experimental_2.11" % "2.4.7",
    "com.typesafe.akka"   %  "akka-http-testkit-experimental_2.11"  % "2.0.4",
    "com.typesafe.slick"  %  "slick_2.11"                           % "3.1.1",
    "com.typesafe.slick"  %  "slick-hikaricp_2.11"                  % "3.1.1",
    "org.slf4j"           %  "slf4j-nop"                            % "1.6.4",
    "org.flywaydb"        %  "flyway-core"                          % "3.2.1",
    "com.typesafe.akka"   %  "akka-testkit_2.11"                    % "2.4.7",
    "org.scalatest"       %% "scalatest"                            % scalaTestVersion,
    "org.scalamock"       %% "scalamock-scalatest-support"          % scalaMockVersion,
    "com.typesafe.akka"   % "akka-http-testkit-experimental_2.11"   % "2.0.4",
    "com.typesafe.play"   %  "play-slick_2.11"                      % "2.0.2",
    "com.typesafe.play"   %  "play-slick-evolutions_2.11"           % "2.0.2"
//    "mysql"               %  "mysql-connector-java"                 % "6.0.2",

  )

}
