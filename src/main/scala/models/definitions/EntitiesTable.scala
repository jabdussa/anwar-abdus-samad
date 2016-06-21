package models.definitions

import models.{EntityId, Entity}
import slick.driver.MySQLDriver.api._


class EntitiesTable(tag: Tag) extends Table[Entity](tag, "entities"){

  def id = column[EntityId]("id", O.PrimaryKey, O.AutoInc)
  def request = column[String] ("request")
  def response = column[String]("response")

  def * = (id.?, request, response) <> ((Entity.apply _).tupled, Entity.unapply)


}
