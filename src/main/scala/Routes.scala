import akka.http.scaladsl.server.Directives._
import api.{CommentsApi, PostsApi, UsersApi, EntityApi, ApiErrorHandler}

trait Routes
  extends ApiErrorHandler

    with UsersApi
    with PostsApi
    with CommentsApi
    with EntityApi {

  val routes =

    /*
    pathPrefix("v0") {
      usersApi ~
      postsApi ~
      commentsApi ~
      entityApi

    } ~ path("")(getFromResource("public/index.html"))
    */

    usersApi ~
      postsApi ~
      commentsApi ~
      entityApi ~
      path("")(getFromResource("public/index.html"))



}
