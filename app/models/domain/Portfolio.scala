package models.domain

import java.util.UUID
import play.api.libs.json._

case class Portfolio (
    id: UUID,
    name: String,
    holdings: String,
    quantity: Int
)

object Portfolio {
    val tupled = (apply: (UUID, String, String, Int) => Portfolio).tupled
    def apply (name: String, holdings: String, quantity: Int): Portfolio = apply(UUID.randomUUID(), name, holdings, quantity)
    implicit val writer: Writes[Portfolio] = Json.writes[Portfolio]
}