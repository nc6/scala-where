This is an attempt to create the equivalent of Haskell's `where` binding
in Scala using untyped macros.

For example (Haskell):

    foo x y = a - b
        where 
          a = x + y
          b = x * y

Currently, the best I can achieve in Scala is the following:

	  val result = where ( f1(1) * f2(2), {
	  	def f1(x : Int) = x + 1
	  	def f2(x : Int) = x + 2
	  })