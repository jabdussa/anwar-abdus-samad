package me.anwar_abdus_samad.examples.akka_rest_api.utils

import com.typesafe.config.ConfigFactory


trait Config {
  private val conf = ConfigFactory.load()

  val host = conf.getString("server.host")
  val port = conf.getString("server.port")


}
