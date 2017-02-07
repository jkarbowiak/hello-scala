package com.aksoft.scala.hello.set

trait IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(set: IntSet) : IntSet
  def intersection(set: IntSet) : IntSet
  def isEmpty : Boolean
}
