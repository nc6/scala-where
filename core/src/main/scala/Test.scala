import uk.org.topos.scalaWhere.Macros.where

object Test extends App {

  val result = where (f1(1) * f2(2)) {
  	def f1(x : Int) = x + 1
  	def f2(x : Int) = x + 2
  }

  println(result)
}