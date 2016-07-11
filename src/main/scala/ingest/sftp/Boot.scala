import scala.trace.Debug
import org.apache.camel.main.Main
import org.apache.camel.scala.dsl.builder.RouteBuilderSupport
import com.typesafe.config.ConfigFactory

/**
 * Main/Boot class for SFTP Camel Route
 */

object Boot 
  extends RouteBuilderSupport {

  val conf = ConfigFactory.load()

  def main(args: Array[String]) {
    val main = new Main()

    // camel context
    val context = main.getOrCreateCamelContext()

    // add our route
    main.addRouteBuilder(new Sftp(context))

    // start the application
    main.run()
  }

}
