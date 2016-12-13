package com.aksoft.scala.hello

/**
  * Created by jkarbowi on 06.12.2016.
  */
object Functions {

  def factorial(n: Int): Int = {
    def factorialWithAccumulator(m: Int, acc: Int) : Int = {
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

}
