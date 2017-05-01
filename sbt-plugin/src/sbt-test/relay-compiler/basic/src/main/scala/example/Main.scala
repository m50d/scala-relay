package example

import scala.scalajs.js
import scala.scalajs.js.JSApp
import scala.scalajs.js.Dynamic.literal
import com.dispalt.relay.gql
import org.scalajs.dom.document

import scala.scalajs.js.annotation.JSImport

@gql("""
    query ExampleQuery($pageID: ID!) {
      defaultSettings {
        notificationSounds
      }
    }
  """)
object foo extends js.Object

object Main extends JSApp {
  def main(): Unit = {

    foo

    val someFn = () => println("someFn")
  }
}