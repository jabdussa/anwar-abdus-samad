package mappings

import spray.json.DefaultJsonProtocol
import models.{Comment, Post, User, Entity}

trait JsonMappings extends DefaultJsonProtocol {
  implicit val entityFormat = jsonFormat2(Entity)
}
