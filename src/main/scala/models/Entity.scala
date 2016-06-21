package models

//case class Entity(id: Option[EntityId], request: com.mysql.jdbc.Blob, response: com.mysql.jdbc.Blob)

case class Entity(id: Option[EntityId], request: String, response: String)