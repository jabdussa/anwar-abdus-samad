package me.anwar_abdus_samad.examples.akka_rest_api.api


import spray.json._
import scala.concurrent.ExecutionContext.Implicits.global
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import akka.http.scaladsl.server.Directives._

import me.anwar_abdus_samad.examples.akka_rest_api.model._
import me.anwar_abdus_samad.examples.akka_rest_api.mapping._


trait EchoApi extends JsonMappings{
  val usersApi =
    (path("echo") & get ) {
       complete (UsersDao.findAll.map(_.toJson))
    }~
    (path("users"/IntNumber) & get) { id =>
        complete (UsersDao.findById(id).map(_.toJson))
    }~
    (path("users") & post) { entity(as[User]) { user =>
        complete (UsersDao.create(user).map(_.toJson))
      }
    }~
    (path("users"/IntNumber) & put) { id => entity(as[User]) { user =>
        complete (UsersDao.update(user, id).map(_.toJson))
      }
    }~
    (path("users"/IntNumber) & delete) { userId =>
      complete (UsersDao.delete(userId).map(_.toJson))
    }
}
