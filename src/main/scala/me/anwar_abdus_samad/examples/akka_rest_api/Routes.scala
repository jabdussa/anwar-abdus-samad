package me.anwar_abdus_samad.examples.akka_rest_api

import akka.http.scaladsl.server.Directives._
import me.anwar_abdus_samad.examples.akka_rest_api.api.{EchoApi, ApiErrorHandler}

trait Routes
  extends ApiErrorHandler
  with EchoApi {
  val routes = {
    // pathPrefix("v1") {
      //usersApi ~
      //postsApi ~
      //commentsApi
      echoApi
    } ~ path("")(getFromResource("public/index.html"))
}
