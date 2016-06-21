package models.definitions

import models.{PostId, Post, UserId}
import slick.driver.MySQLDriver.api._

class PostsTable(tag: Tag) extends Table[Post](tag, "posts"){

  def id = column[PostId]("id", O.PrimaryKey, O.AutoInc)
  def userId = column[UserId]("id_user")
  def title = column[String]("title")
  def content = column[String]("content")
  def * = (id.?, userId, title, content) <> ((Post.apply _).tupled, Post.unapply)

  def author = foreignKey("user_fk", userId, TableQuery[UsersTable])(_.id)
}
