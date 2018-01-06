
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Products Page")/*1.23*/ {_display_(Seq[Any](format.raw/*1.25*/("""
  
  """),format.raw/*3.3*/("""<p class="lead">Membership Information</p>
  
  <table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>
  
  <th>Address</th>
  
  <th>Join-Date</th>
  
  <th>Expiry-Date</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  
  <tr>
  
  <td>1</td>
  
  <td>Joe Bloggs</td>
  
  <td>2 Tallaght Road</td>
  
  <td>21.12.17</td>
  
  <td>21.12.18</td>
  
  </tr>
  
  </tbody>
  
  </table>

<p>

  <a href=""""),_display_(/*51.13*/routes/*51.19*/.HomeController.addMember()),format.raw/*51.46*/("""">
    <button class="btn btn-primary">Add a Member</button>
  </a>
  </p>
  """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jan 06 15:19:54 GMT 2018
                  SOURCE: /home/wdd/webapps/play-java-seed/app/views/index.scala.html
                  HASH: abc94ded3d2787360453a3a52dd5c29b8d8a3d76
                  MATRIX: 1030->1|1059->22|1098->24|1130->30|1680->553|1695->559|1743->586
                  LINES: 33->1|33->1|33->1|35->3|83->51|83->51|83->51
                  -- GENERATED --
              */
          