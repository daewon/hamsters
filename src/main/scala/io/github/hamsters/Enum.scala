package io.github.hamsters

trait Enumerable[A] {

  def name(a: A): String = a.toString.toLowerCase

  def parse(s: String): Option[A] = list.find(a => name(a) == s)

  def list: List[A]
}

object Enumeration {
  def name[A, T >: A](a: A)(implicit ev: Enumerable[T]) = ev.name(a)

  def parse[A, T >: A](s: String)(implicit ev: Enumerable[T]) = ev.parse(s)

  def list[T](implicit ev: Enumerable[T]) = ev.list
}
