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

class Level1Task3Test extends FunSuite with BeforeAndAfter {

  val texts = Table(
    ("text", "palindrome"),
    ("aabaa", true),
    ("abac", false),
    ("a", true),
    ("az", false)

  )

  var l1t3: Level1Task3 = _

  before {
    l1t3 = new Level1Task3
  }

  test("validate check palindrome") {
    forAll(texts) { (text: String, expected: Boolean) =>
      val result = l1t3.checkPalindromeFor(text)

      result should be(expected)
    }
  }
}


