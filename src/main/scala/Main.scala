
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._

object Main extends App{


    implicit val actorSystem = ActorSystem("system")
    implicit val actorMaterializer = ActorMaterializer()


    val route =
      pathSingleSlash {
        get {
          complete {
            "Hello world "+System.currentTimeMillis()
          }
        }
      }
    Http().bindAndHandle(route,"localhost",8080)

    println("server started at 8080")

	println("Version 3.0")
	while(true){
		println(".")
		Thread.sleep(1000)
	}
}
