package models.definitions

import models.{Entity, EntityId}
import slick.driver.MySQLDriver.api._


class EntitiesTable(tag: Tag) extends Table[Entity](tag, "entities"){

  def id = column[EntityId]("entityID", O.PrimaryKey, O.AutoInc)
  def data = column[String]("data")
  def * = (id, data) <> ((Entity.apply _).tupled, Entity.unapply)

}


/*

  def id = column[PostId]("id", O.PrimaryKey, O.AutoInc)
  def userId = column[UserId]("id_user")
  def title = column[String]("title")
  def content = column[String]("content")
  def * = (id.?, userId, title, content) <> ((Post.apply _).tupled, Post.unapply)

  def author = foreignKey("user_fk", userId, TableQuery[UsersTable])(_.id)


 */
