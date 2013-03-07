package uk.org.topos.scalaWhere

import language.experimental.macros
import scala.reflect.macros.Context

object Macros {

	def where(exp : _)(block : Unit) = macro where_impl

	def where_impl(c : Context)(exp : c.Tree)(block : c.Expr[Unit]) = {
		import c.universe._

		val Expr(Block((inner, _))) = block
		val newinner = inner :+ exp
		Block(newinner : _*)
	}
}