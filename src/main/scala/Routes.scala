import akka.http.scaladsl.server.Directives._
import api.{CommentsApi, PostsApi, ApiErrorHandler, UsersApi}

trait Routes extends ApiErrorHandler with UsersApi with PostsApi with CommentsApi{
  val routes =
    pathPrefix("v0") {
      usersApi ~
      postsApi ~
      commentsApi ~
      permsApi
    } 
    ~ path("")(getFromResource("public/index.html"))
}
