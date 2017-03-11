class Level1Task1 {
  def add(param1: Int, param2: Int): Int = param1 + param2
}

class Level1Task2 {
  val century = 100

  def centuryFromYear(year: Int): Int = {
    if (year % century == 0) quotientOf(year) else quotientOf(year) + 1
  }

  private def quotientOf(year: Int) = {
    year / 100
  }
}

class Level1Task3 {
  def checkPalindromeFor(text: String): Boolean = text == text.reverse
}

