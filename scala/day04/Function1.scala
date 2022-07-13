package day04


/* 柯里化: 把一个参数列表的多个参数，变成多个参数列表 */
object Function1 {
  def main(args: Array[String]): Unit = {
      // 闭包
    def addByAny(a: Int): Int => Int = {
      a + _
    }

    // 柯里化
    def addByTwo(a: Int,b: Int): Int = {
      a + b
    }
    println(addByTwo(3, 5))
    // ######################## 柯里化 ################################
    println("*"*40)
    def addByTwo1(a: Int)(b: Int): Int = {
      a + b
    }

    println(addByTwo1(3)(5))
  }
}
