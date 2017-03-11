import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.Matchers._

class Level1Task1Test extends FunSuite with BeforeAndAfter {

  val parameters =
    Table(
      ("param1", "param2", "expected"),
      (1, 2, 3),
      (0, 1000, 1000),
      (-1, 1, 0),
      (-1, -1, -2)
    )

  var l1t1: Level1Task1 = _

  before {
    l1t1 = new Level1Task1
  }

  test("validate add") {
    forAll(parameters) {
      (param1: Int, param2: Int, expected: Int) =>
        val result = l1t1.add(param1, param2)

        result should be(expected)
    }
  }
}
