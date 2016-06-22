package mappings

import spray.json.DefaultJsonProtocol
import models.{Comment, Post, User, Entity}

trait JsonMappings extends DefaultJsonProtocol {
  implicit val entityFormat = jsonFormat2(Entity)
  implicit val userFormat = jsonFormat5(User)
  implicit val postFormat = jsonFormat4(Post)
  implicit val commentFormat = jsonFormat4(Comment)
}