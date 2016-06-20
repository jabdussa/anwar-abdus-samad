package api

import akka.http.scaladsl.model.HttpResponse
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.ExceptionHandler

trait LionsTIgersAndBearsException {
  implicit def myExceptionHandler: ExceptionHandler = ExceptionHandler {

    case e: NoSuchElementException =>
      extractUri { uri =>
        complete(HttpResponse(UnavailableForLegalReasons, entity = s"Lions & Tigers & Bears... Oh My!! ${e.getMessage}"))
      }

  }


}
