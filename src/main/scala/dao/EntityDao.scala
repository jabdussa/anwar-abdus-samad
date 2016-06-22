package dao

import scala.concurrent.Future
import slick.driver.MySQLDriver.api._

import models.{Entity, EntityId}


object EntityDao extends BaseDao {

  def findAll: Future[Seq[Entity]] = entitiesTable.result

  def findById(entityId: EntityId): Future[Entity] = entitiesTable.filter(_.id === entityId).result.head

  def create(entity: Entity): Future[EntityId] = entitiesTable returning entitiesTable.map(_.id) += entity

  def delete(entityId: EntityId): Future[Int] = entitiesTable.filter(_.id === entityId).delete

  //def upsert(entityId: Int) = (entitiesTable returning entitiesTable).insertOrUpdate(entityId)


}
