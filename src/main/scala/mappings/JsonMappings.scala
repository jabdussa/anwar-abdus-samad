package mappings

import spray.json.DefaultJsonProtocol

import models.PermRequest
import models.{Comment, Post, User}


trait JsonMappings extends DefaultJsonProtocol {
  implicit val permRequestFormat = jsonFormat2(PermRequest)
  implicit val userFormat = jsonFormat5(User)
  implicit val postFormat = jsonFormat4(Post)
  implicit val commentFormat = jsonFormat4(Comment)
}