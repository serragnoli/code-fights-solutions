class Level2Task1 {
  def adjacentElementProduct(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map(_.product).max
  }
}
