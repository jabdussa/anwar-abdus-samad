package models.definitions

import slick.driver.MySQLDriver.api._
import models.{PermRequest, PermRequestId}

class PermRequestsTable(tag: Tag) extends Table[PermRequest](tag, "perm_requests"){
  def id = column[PermRequestId]("id", O.PrimaryKey, O.AutoInc)
  def entityId = column[Int]("entity_id")
  def request = column[String]("request")
  def response = column[String]("response")
  def * = (id.?, entityId, request, response) <> ((PermRequest.apply _).tupled, PermRequest.unapply)
}

