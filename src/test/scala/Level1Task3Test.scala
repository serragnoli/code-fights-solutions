import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.Matchers._

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
