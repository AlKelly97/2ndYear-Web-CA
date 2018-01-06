
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

object addMember extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main),format.raw/*1.6*/(""" """),format.raw/*1.7*/("""("Add Member")"""),format.raw/*1.21*/("""{"""),format.raw/*1.22*/("""
"""),format.raw/*2.1*/("""<p> class="lead">Add a new Member</p>

"""),format.raw/*4.1*/("""}"""))
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
                  SOURCE: /home/wdd/webapps/play-java-seed/app/views/addMember.scala.html
                  HASH: 0108a2d8aaa966e5007562758f87b47e1ac30b16
                  MATRIX: 1034->1|1057->5|1084->6|1125->20|1153->21|1180->22|1245->61
                  LINES: 33->1|33->1|33->1|33->1|33->1|34->2|36->4
                  -- GENERATED --
              */
          