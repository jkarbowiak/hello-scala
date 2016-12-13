package com.aksoft.scala.hello

/**
  * Created by jkarbowi on 23.11.2016.
  */
object HelloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello World\n")
    println(Functions.factorial(5))
    println()
    println(Functions.powerOfTwoNotTail(5))
    println(Functions.powerOfTwo(5))
  }
}
