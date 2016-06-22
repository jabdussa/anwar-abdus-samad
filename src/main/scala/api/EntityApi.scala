package api

import spray.json._
import scala.concurrent.ExecutionContext.Implicits.global
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import akka.http.scaladsl.server.Directives._

import dao.EntityDao
import models.Entity
import mappings.JsonMappings


trait EntityApi extends JsonMappings {

  val entityApi =

    (path("entities") & get) {
      complete(EntityDao.findAll.map(_.toJson))
    } ~
    path("entity" /  "all" ) {
      complete(EntityDao.findAll.map(_.toJson))
    } ~
    path("entity" /  IntNumber ) { id  =>
      complete(EntityDao.findById(id).map(_.toJson))
    } ~
    ( path("addEntity") & post ) {
        entity(as[Entity]) {
          entity => complete(EntityDao.create(entity).map(_.toJson))
      }
    }

}
