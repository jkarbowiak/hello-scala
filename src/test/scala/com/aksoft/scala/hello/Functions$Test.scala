package com.aksoft.scala.hello

import org.scalatest.FunSpec

/**
  * Created by jkarbowi on 13.12.2016.
  */
class Functions$Test extends FunSpec {

  describe("powerOfTwo") {
    it("should return 1 for 0") {
      assert(Functions.powerOfTwo(0) == 1)
    }

    it("should return 2 for 1") {
      assert(Functions.powerOfTwo(1) == 2)
    }

    it("should return 4 for 2") {
      assert(Functions.powerOfTwo(2) == 4)
    }

    it("should return 8 for 3") {
      assert(Functions.powerOfTwo(3) == 8)
    }
  }

  describe("factorial") {
    it("should return 1 for 0") {
      assert(Functions.factorial(0) == 1)
    }

    it("should return 1 for 1") {
      assert(Functions.factorial(1) == 1)
    }

    it("should return 2 for 2") {
      assert(Functions.factorial(2) == 2)
    }

    it("should return 6 for 3") {
      assert(Functions.factorial(3) == 6)
    }
  }


}
