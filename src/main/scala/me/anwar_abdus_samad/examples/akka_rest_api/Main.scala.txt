package me.anwar_abdus_samad.examples.akka_rest_api

import akka.actor.ActorSystem
import akka.event.{ Logging, LoggingAdapter }
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import me.anwar_abdus_samad.examples.akka_rest_api.utils.Config

import scala.concurrent.ExecutionContext

object Main
  extends App
  with Config {

  private implicit val system = ActorSystem()
  protected implicit val executor: ExecutionContext = system.dispatcher
  protected val log: LoggingAdapter = Logging(system, getClass)
  protected implicit val materializer: ActorMaterializer = ActorMaterializer()

    Http().bindAndHandle(handler = logRequestResult("log")(routes), interface = serverHost, port = serverPort)

}
