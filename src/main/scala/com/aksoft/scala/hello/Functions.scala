package com.aksoft.scala.hello

/**
  * Created by jkarbowi on 06.12.2016.
  */
object Functions {

  def factorial(n: Int): Int = {
    def factorialWithAccumulator(m: Int, acc: Int): Int = {
      if (m == 0 || m == 1) acc else factorialWithAccumulator(m - 1, acc * m)
    }

    factorialWithAccumulator(n, 1)
  }

  def powerOfTwoNotTail(n: Int): Int = {
    if (n == 0) 1 else 2 * powerOfTwoNotTail(n - 1)
  }

  def powerOfTwo(n: Int): Int = {
    def powerOfTwoAccumulate(m: Int, accumulator: Int): Int = {
      if (m == 0) accumulator else powerOfTwoAccumulate(m - 1, 2 * accumulator)
    }

    powerOfTwoAccumulate(n, 1)
  }

  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0 else a + sumInts(a + 1, b)
  }

  def sumPowersOf2 = sumReturningFunction(powerOfTwo)

  def sumWithFunctionParameter(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sumWithFunctionParameter(f, a + 1, b)
  }

  def sumReturningFunction(f: Int => Int): (Int, Int) => Int = {
    def sumUsingPredifinedFunction(a: Int, b: Int) : Int = {
      if (a > b) 0 else f(a) + sumUsingPredifinedFunction(a + 1, b)
    }
    sumUsingPredifinedFunction
  }

  def curriedSum(f: Int => Int)(a: Int, b:Int) : Int = {
    if (a > b) 0 else f (a) + curriedSum(f)(a + 1, b)
  }

  def curriedTailSum(f: Int => Int)(a: Int, b:Int) : Int = {
    def iter(a: Int, result: Int) : Int = {
      if (a > b) result
      else iter(a + 1, result + f(a))
    }
    iter(a, 0)
  }
}
