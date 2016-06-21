package api

import dao.PermsDao

import scala.concurrent.ExecutionContext.Implicits.global
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import mappings.JsonMappings
import models.Post
import akka.http.scaladsl.server.Directives._
import spray.json._

trait PermsApi extends JsonMappings {

  val permsApi =
    (path("users"/IntNumber/"posts") & get){ userId =>
      complete (PostsDao.findUserPosts(userId).map(_.toJson))
    }~
    (path("users"/IntNumber/"posts"/IntNumber) & get) { (userId,postId) =>
      complete (PostsDao.findByUserIdAndId(userId, postId).map(_.toJson))
    }~
    (path("addEntity") & post) { entityId => entity(as[PermRequest]) { post =>
      complete (PermsRequest.create(post).map(_.toJson))
    }}~
    (path("users"/IntNumber/"posts"/IntNumber) & put) { (userId, id) => entity(as[Post]) { post =>
      complete (PostsDao.update(post, id).map(_.toJson))
    }}~
    (path("users"/IntNumber/"posts"/IntNumber) & delete) { (userId, postId) =>
      complete (PostsDao.delete(postId).map(_.toJson))
    }

}
