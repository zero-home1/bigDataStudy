package day02

import scala.collection.immutable
import scala.util.control.Breaks._

object Test {
  def main(args: Array[String]): Unit = {
    // 1.Range 生成 0-20 的数字，循环打印0-19这些数字
    def test1(): Unit = {
      breakable(
        for (i <- Range(0, 21)) {
          if (i == 20) break()
          print(i + " ")
        }
      )
      println()
    }
    test1()
    println("*" * 20)

    // 2.Range生成 0-20 的数字，循环打印出0-20内的奇数
    def test2(): Unit = {
      for (i <- Range(0, 21)) {
        if (i % 2 != 0) print(i + " ")
      }
      println()
    }

    test2()
    println("*" * 20)

    // 3.Range生成 0-20 的数字，循环打印出0-20内的偶数,不包括20
    def test3(): Unit = {
      breakable(
        for (i <- Range(0, 21) if (i % 2 == 0)) {
          if (i == 20) break()
          print(i + " ")
        }
      )
      println()
    }
    test3()
    println("*" * 20)
    // 4.Until 方式生成 0-20 的数字，循环打印出0-20的奇数
    def test4(): Unit = {
      breakable(
        for (i <- 1 until 20 if (i % 2 != 0)){
          print(i+" ")
        }
      )
      println()
    }
    test4()
    println("*"*20)
    // 5.使用嵌套的 for 循环打印出3行3列的内容全为0的矩阵
    def test5(): Unit = {
      for (i <- 1 to 3;j <- 1 to 3){
        print("0")
        if (j == 3){
          println()
        }
      }
    }
    test5()
    println("*"*20)
    // 6.循环生成 0-10 的数字，使用yield把生生的数字变为原来的5倍
    val test6: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i * 5
    println(test6)
    println("*"*20)
    // 7.编写一个method()方法,要求能够输出一个大于0的数字，能够打印 1 到该数字范围内的全部偶数
    def test7(a: Int): Unit = {
      if (a > 0){
        for (i <- 1 to a){
          if (i % 2 == 0){
            print(i+" ")
          }
        }
      }
      else {
        println("输入不符合要求!!!")
      }
    }
    test7(5)
  }
}
