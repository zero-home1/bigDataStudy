package day04

import scala.annotation.tailrec
import scala.io.StdIn


/* 递归:一个函数/方法再函数/方法体内又调用了本身，我们称之为递归调用 */
object Function2 {
  def main(args: Array[String]): Unit = {
    // 实现递归阶乘
    // 方式1: 循环遍历
    println("请输入递归数字:")
    val numTest = StdIn.readInt()
    var result = 1
    for (i <- 1 to numTest){
      result = result * i
    }
//    println(result)

    // 方式2: 函数递归
    def recursion(a: Int): Int = {
      // 设置基准,跳出递归
      if (a == 0)
        return 1
      return recursion(a-1)*a
    }
//    println(recursion(5))

    // 传统递归 是依靠大量的栈内存来实现的,对于计算机来说不友好,因为需要保存每一次递归后的数据
    // 解决方法:尾递归实现
    // 尾递归实现
    @tailrec
    def tailRecursion(a: Int,res: Int): Int = {
      // 设置基准,跳出递归
      if (a == 0)
        return res
      return tailRecursion(a - 1,res * a)
    }

  }
}
