package me.anwar_abdus_samad.examples.akka_rest_api

import akka.http.scaladsl.server.Directives._
import me.anwar_abdus_samad.examples.akka_rest_api.api.ApiErrorHandler

trait Routes
  extends ApiErrorHandler
  with UsersApi
  with PostsApi
  with CommentsApi {
  val routes =
    pathPrefix("v1") {
      usersApi ~
      postsApi ~
      commentsApi
    } ~ path("")(getFromResource("public/index.html"))
}
