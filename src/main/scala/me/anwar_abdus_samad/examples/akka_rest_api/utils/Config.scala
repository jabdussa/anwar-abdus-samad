package me.anwar_abdus_samad.examples.akka_rest_api.utils

import com.typesafe.config.ConfigFactory
import me.anwar_abdus_samad.examples.akka_rest_api.Main._

trait Config {
  private val conf = ConfigFactory.load()
  val serverHost = conf.getString("server.host")
  val serverPort = conf.getString("server.port")
}
