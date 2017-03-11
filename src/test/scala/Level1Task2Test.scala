import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.Matchers._

class Level1Task2Test extends FunSuite with BeforeAndAfter {

  val years = Table(
    ("year", "century"),
    (1905, 20),
    (1700, 17),
    (1988, 20),
    (2000, 20),
    (2001, 21),
    (200, 2),
    (374, 4)
  )

  var l1t2: Level1Task2 = _

  before {
    l1t2 = new Level1Task2
  }

  test("validate centuryFromYear") {
    forAll(years) { (year: Int, century: Int) =>
      val result = l1t2.centuryFromYear(year)

      result should be(century)
    }
  }
}
