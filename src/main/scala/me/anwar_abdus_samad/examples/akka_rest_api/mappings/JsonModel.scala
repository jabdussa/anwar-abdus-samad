package me.anwar-abdus-samad.examples.akka-rest-api.mappings


import me.anwar-abdus-samad.examples.akka-rest-api.model._
import spray.json.DefaultJsonProtocol

trait JsonMappings extends DefaultJsonProtocol {
  implicit val multiMediaJs = jsonFormat4(MultiMediaEvent)
  implicit val textJs  = jsonFormat4(TextEvent)
}
