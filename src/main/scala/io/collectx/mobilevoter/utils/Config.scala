package io.collectx.mobilevoter.utils

import com.typesafe.config.ConfigFactory

trait Config {

  private val conf = ConfigFactory.load()


}

trait DropBoxConfig extends Config {

    private val host = Config.conf.getS
}
