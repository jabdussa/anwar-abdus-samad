package io.collectx.mobilevoter.mappings

import io.collectx.mobilevoter.model._

import spray.json.DefaultJsonProtocol

trait JsonMappings extends DefaultJsonProtocol {
  implicit val multiMediaJs = jsonFormat4(MultiMediaEvent)
  implicit val textJs  = jsonFormat4(TextEvent)
}
