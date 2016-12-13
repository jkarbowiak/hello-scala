package com.aksoft.scala.hello

/**
  * Created by jkarbowi on 06.12.2016.
  */
object Functions {

  def factorial(n: Int): Int = {
    def factorialWithAccumulator(m: Int, acc: Int) : Int = {
      if (m == 1) acc else factorialWithAccumulator(m - 1, acc * m)
    }

    factorialWithAccumulator(n, 1)
  }

  def powerOfTwo(n: Int): Int = {
    if (n == 0) 1 else 2 * powerOfTwo(n - 1)
  }

  def powerOfTwo2(n: Int): Int = {
    def powerOfTwo2Accumulate(m: Int, accumulator: Int): Int = {
      if (m == 0) accumulator else powerOfTwo2Accumulate(m - 1, 2 * accumulator)
    }

    powerOfTwo2Accumulate(n, 1)
  }

}
