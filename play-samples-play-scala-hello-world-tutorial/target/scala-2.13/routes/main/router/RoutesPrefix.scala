// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Naveen/Downloads/play-samples-play-scala-hello-world-tutorial/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Thu Mar 12 12:03:12 MST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
