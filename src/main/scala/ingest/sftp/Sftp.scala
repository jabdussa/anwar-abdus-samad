import scala.trace.Debug
import org.apache.camel.{CamelContext, Exchange}
import org.apache.camel.scala.dsl.builder.ScalaRouteBuilder

/**
 * A Camel Router using the Scala DSL and sFTP
 */

class Sftp(override val context : CamelContext) 
	extends ScalaRouteBuilder(context) {

    // an example of a Processor method
   val myProcessorMethod = (exchange: Exchange) => {
     exchange.getIn.setBody("block test")
   }

//  val user = "anwarabdus-samad"
//  val pass = ""
//  val host = "127.0.0.1"
//  val port = "22"
//
//  val srcDir = "/var/tmp/sftp_test"
//  val srcFile = "access.log"

//  val dst = "/var/tmp/sftp_test/access.log.mmddyyhhmmss"

   
//  from(s"sftp://$host:$port$srcDir?fileName=$srcFile&username=$user&password=$pass&preferredAuthentications=password&move=done").to(s"file://$dst")

}
