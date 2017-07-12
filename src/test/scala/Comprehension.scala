object ComprehensionTest1 extends App {
  def even(from: Int, to: Int): List[Int] = for (i <- List.range(from, to) if i % 2 == 0) yield i

  println(even(0, 30))
}

object ComprehensionTest2 extends App {
  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i until n if i + j == v) yield
      (i, j, v)

  foo(20, 32) foreach {
    case (i, j, v) =>
      println(s"($i, $j = $v)")
  }
}

