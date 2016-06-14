package me.anwar_abdus_samad.examples.akka_rest_api.api


import akka.http.scaladsl.marshalling.ToResponseMarshallable
import akka.http.scaladsl.model.StatusCodes._
import spray.json._
import scala.concurrent.ExecutionContext.Implicits.global
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import akka.http.scaladsl.server.Directives._

import me.anwar_abdus_samad.examples.akka_rest_api.model._
import me.anwar_abdus_samad.examples.akka_rest_api.mapping.JsonMappings


trait EchoApi extends JsonMappings {

  /*
  val usersApi =
    (path("echo") & get ) {
       complete (s"echo'd")
    }
  */


  val echoApi = {
    logRequestResult("echo-api-service") {
      (path("echo") & get) {
        onSuccess(new Echo("hello")) { _res:String =>
          complete(ToResponseMarshallable(OK -> _res))
        }
      }
    }
  }
}
