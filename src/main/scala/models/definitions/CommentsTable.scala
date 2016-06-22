package models.definitions

import models.{CommentId, Comment}
import slick.driver.MySQLDriver.api._

class CommentsTable(tag: Tag) extends Table[Comment](tag, "comments"){

  def id = column[CommentId]("id", O.PrimaryKey, O.AutoInc)
  def userId = column[Long]("id_user")
  def postId = column[Long]("id_post")
  def content = column[String]("content")
  def * = (id.?, userId, postId, content) <> ((Comment.apply _).tupled, Comment.unapply)

  def author = foreignKey("comment_user_fk", userId, TableQuery[UsersTable])(_.id)
  def post = foreignKey("comment_post_fk", postId, TableQuery[PostsTable])(_.id)

}
