package day03

import scala.io.StdIn

/* 练习题 */
object Function5 {
  def main(args: Array[String]): Unit = {
    // 1.一个数字如果为正数，则它的signum为1;如果是负数,则signum为-1;
    // 如果为0,则signum为0.编写一个函数来计算这个值
    def isPositive(): Int = {
      println("请输入你要判断的数字:")
      val testNum = StdIn.readInt()
      var signum = 0
      if (testNum > 0) signum = 1 else if(testNum < 0) signum = -1 else signum = 0
      signum
    }
    val res = isPositive()
    println(res)

    // 2.循环遍历输出 10 - 0
    // 方式1:
    for (i <- 10 to 0 by -1){
      println(i)
    }
    // 方式2:
    for (i <- 10 to 0 reverse){
      println(i)
    }
    // 3.编写一个过程countdown(n:Int)，打印从n到0的数字
    def countdown(n: Int): Unit = {
      for (i <- 0 to n)yield i
    }
    println("请输入你要判断的数字:")
    val testNum3 = StdIn.readInt()
    countdown(testNum3)






  }
}
