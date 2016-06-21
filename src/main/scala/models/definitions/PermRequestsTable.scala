package models.definitions

import slick.driver.MySQLDriver.api._
import models.{PermRequest, PermRequestId}

class PermRequestsTable(tag: Tag) extends Table[PermRequest](tag, "users"){
  def id = column[PermRequestId]("id", O.PrimaryKey, O.AutoInc)
  def request = column[String]("request")
  def response = column[String]("response")
  def createdAt = column[Int]("age")
  def updatedAt = column[Int]("gender")
  def * = (id.?, request, response, createdAt, updatedAt) <> ((PermRequest.apply _).tupled, PermRequest.unapply)
}

