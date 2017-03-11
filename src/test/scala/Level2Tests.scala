import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.Matchers._

class Level2Tests extends FunSuite with BeforeAndAfter {

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
