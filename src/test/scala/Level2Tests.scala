import org.scalatest.Matchers._
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.{BeforeAndAfter, FunSuite}

class Level2Task1Test extends FunSuite with BeforeAndAfter {

  val myArrays = Table(
    ("arrays", "expected"),
    (Array[Int](3, 6, -2, -5, 7, 3), 21),
    (Array[Int](-1, -2), 2),
    (Array[Int](5, 1, 2, 3, 1, 4), 6),
    (Array[Int](1, 2, 3, 0), 6),
    (Array[Int](9, 5, 10, 2, 24, -1, -48), 50),
    (Array[Int](5, 6, -4, 2, 3, 2, -23), 30),
    (Array[Int](4, 1, 2, 3, 1, 5), 6),
    (Array[Int](-23, 4, -3, 8, -12), -12)
  )

  var l2t1: Level2Task1 = _

  before {
    l2t1 = new Level2Task1
  }

  test("verify adjacent elements products") {
    forAll(myArrays) { (array, expected) =>
      val result = l2t1.adjacentElementProduct(array)

      result should be(expected)
    }
  }
}

class Level2Task3Test extends FunSuite with BeforeAndAfter {

  val arrays = Table(
    ("statues", "expected"),
    (Array[Int](6, 2, 3, 8), 3),
    (Array[Int](0, 3), 2),
    (Array[Int](5, 4, 6), 0),
    (Array[Int](6, 3), 2),
    (Array[Int](1), 0)
  )

  var l2t3: Level2Task3 = _

  before {
    l2t3 = new Level2Task3
  }

  test("validate make array consecutive") {
    forAll(arrays) { (statues: Array[Int], expected: Int) =>
      val result = l2t3.makeArrayConsecutive(statues)

      result should be(expected)
    }
  }
}