object session {
  /*1 + 3

  def sqrIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) : Boolean =
    Math.abs(guess * guess - x) < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def sqrt(x: Double) = sqrIter(1.0, x)*/

  def abs(x:Double) = if (x < 0) -x else x

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
    Math.abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x: Double) =(guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)

  sqrt(225)
  sqrt(0.001)
  sqrt(0.1e-20)
  sqrt(1.0e20)
  sqrt(1.0e50)
}