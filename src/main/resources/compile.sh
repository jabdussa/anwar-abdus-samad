#!/bin/sh

sbt clean 

sbt assembly 

java -jar /Users/anwarabdus-samad/Development/anwar_abdus_samad/target/scala-2.11/sbt-0.13/akka_rest_api_sirrus_v0-assembly-0.0.jar & 

URL='http://localhost:9000/addEntity'

DATA="{\"entityID\": 1,\"data\": \"[1, 2, 3]\"}"

date
echo Sleeping for 30 seconds to let web server come up...
echo

sleep 30

date
echo ... awake
echo 

curl -X POST -H "$HEADER" $URL -d "$DATA"

echo Done
date
