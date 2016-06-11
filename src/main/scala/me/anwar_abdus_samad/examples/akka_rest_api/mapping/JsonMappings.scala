package me.anwar_abdus_samad.examples.akka_rest_api.mapping


import spray.json.DefaultJsonProtocol
import me.anwar_abdus_samad.examples.akka_rest_api.model._

trait JsonMappings extends DefaultJsonProtocol {
  implicit val multiMediaJs = jsonFormat4(MultiMediaEvent)
  implicit val textJs  = jsonFormat4(TextEvent)
}
