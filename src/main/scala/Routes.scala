import akka.http.scaladsl.server.Directives._
import api.{EntityApi, ApiErrorHandler}

trait Routes extends ApiErrorHandler with EntityApi {

  val routes =
      entityApi ~ path("")(getFromResource("public/index.html"))

}
