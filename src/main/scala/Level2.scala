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
