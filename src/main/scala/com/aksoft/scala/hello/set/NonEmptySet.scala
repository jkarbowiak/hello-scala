package com.aksoft.scala.hello.set

class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this

  override def union(set: IntSet): IntSet = {
    val result = union(left).union(right)
    result.incl(elem)
  }

  override def intersection(set: IntSet): IntSet = {
    val a = set.intersection(left)
    val b = set.intersection(right)

    val sum = a.union(b)
    if (set.contains(elem)) sum.incl(elem) else sum
  }

  override def isEmpty: Boolean = false
}

