package day02

object AllTest {

  def main(args: Array[String]): Unit = {
    // 打印 9 层 妖塔
    for (i <- 1 to 9){
      print(" "*(9-i)+"*"*(i*2-1) + " "*(9-i))
      println()
    }
  }
}
