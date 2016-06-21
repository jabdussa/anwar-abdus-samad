package models

case class PermRequest(id: Option[PermRequestId], entityId: Int, request: String, response: String )