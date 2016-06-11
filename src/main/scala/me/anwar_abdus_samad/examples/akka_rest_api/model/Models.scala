package me.anwar_abdus_samad.examples.akka_rest_api.model


// POST https:\\mysite.com\my-powerful-burner-events -d '{ "type": "inboundMedia", "payload": "<picture url>", "fromNumber": "+12222222222", "toNumber": "+ 13333333333" }'
case class MultiMediaEvent(kind: String, payload: String, fromNumber: String, toNumber: String)

// POST https:\\mysite.com\my-powerful-burner-events -d '{ "type": "inboundText", "payload": "Hello", "fromNumber": "+12222222222", "toNumber": "+13333333333" }'
case class TextEvent(kind: String, payload: String, fromNumber: String, toNumber: String)
