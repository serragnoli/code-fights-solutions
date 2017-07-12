import scala.collection.mutable

class Level2Task1 {
  def adjacentElementProduct(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map(_.product).max
  }
}

class Level2Task3 {
  def makeArrayConsecutive(statues: Array[Int]): Int = {
    (statues.min to statues.max).toSet.diff(statues.toSet).size
  }
}

class Level2Task4 {
  def almostIncreasingSequence(sequence: Array[Int]): Boolean = {
    var result: Boolean = isSorted(sequence.toList)
    var partialResult: Boolean = false

    if (!result)
      for (x <- sequence.indices
      if !partialResult) {
        val tesr = mutable.ListBuffer(sequence)
        tesr.remove(x)
        partialResult = isSorted(List())
      }
    result || partialResult
  }

  def isSorted(l: List[Int]): Boolean = {
    val list = l.view
    !list.zip(list.tail).exists {
      case (x, y) => x > y
    }
  }
}