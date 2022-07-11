package day02

import scala.collection.immutable
import scala.util.control.Breaks._

object ForLoopReturn {
  /*
  * for 循环默认返回值为*
  * while 、 do while 不推荐使用
  * */
  def main(args: Array[String]): Unit = {
    // 默认返回值
    val a: Unit = for (i <- 1 to 5) {
    println(i)
  }
  println("a:",a)
  // 可以使用 yield 将 for 循环的返回值作为一个变量存储。
  val b: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i
  println(b)


  breakable(
  for (i <- 1 to 10){
    if (i == 3){
      break()
    }
    println(i)
  }
  )
  println("这是循环终止外面的语句")

  }
}
