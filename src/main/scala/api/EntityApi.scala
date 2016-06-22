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
    path("entity" / "all") {
      complete(EntityDao.findAll.map(_.toJson))
    } ~
    path("entity" / IntNumber) { id =>
      complete(EntityDao.findById(id).map(_.toJson))
    } ~
    (path("addEntity") & post) {
      entity(as[Entity]) { e =>
        complete {
          EntityDao.create(e).map(_.toJson)
          //EntityDao.upsert(entity)
         //Map("status" -> "SUCCESS", "message" -> s"Entity Data Received").toJson
        }
      }
    }

  /*
    (path("addEntity") & post) { entity(as[Entity]) { entity =>
      complete(EntityDao.create(entity).map(_.toJson))
      }
      }


  (path("addEntity"/IntNumber/"posts") & post) { userId => entity(as[Post]) { post =>
    complete (PostsDao.create(post).map(_.toJson))
  }}~

  */


}


/*


    (path("users") & post) { entity(as[User]) { user =>
        complete (UsersDao.create(user).map(_.toJson))
      }


  def create(user: User): Future[UserId] = usersTable returning usersTable.map(_.id) += user


  val entityApi =

    (path("addEntity") & post) { entityId => entity(as[PermRequest]) { post =>
      complete (PermsRequest.create(post).map(_.toJson))
    }

    }
Map("status" -> "SUCCESS", "message" -> s"Entity Data Received").toJson
        }

 */