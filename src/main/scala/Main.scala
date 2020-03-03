import java.awt.EventQueue

//Scala object Main to generate the the GUI calling the java class UI
object Main {

  def main(args: Array[String]): Unit = {

    EventQueue.invokeLater(new Runnable() {
      override def run(): Unit = {
        val f : UI = new UI();

       }
    })

  }

}

