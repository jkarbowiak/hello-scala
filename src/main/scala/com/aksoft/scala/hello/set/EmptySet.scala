package com.aksoft.scala.hello.set

class EmptySet extends IntSet {

  override def incl(x: Int): IntSet = {
    new NonEmptySet(x, new EmptySet, new EmptySet)
  }

  override def contains(x: Int): Boolean = false

  override def union(set: IntSet): IntSet = set

  override def intersection(set: IntSet): IntSet = this

  override def isEmpty: Boolean = true
}
