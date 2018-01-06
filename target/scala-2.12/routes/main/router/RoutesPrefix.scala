
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play-java-seed/conf/routes
// @DATE:Sat Jan 06 15:19:54 GMT 2018


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
