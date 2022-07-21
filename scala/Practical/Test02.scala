package Practical

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object Test02 {
  def main(args: Array[String]): Unit = {
    // 1.编写一个过程countdown(n:Int),打印从n到0的数字
    def countDown(n: Int) = {
      for (i <- n to 0 by -1){
        println(i)
      }
    }
//    countDown(10)

    // 2.编写一段代码,将a设置为一个n个随机整数的数组,要求随机数介于0和n之间。
    def setArray(m: Int): Unit ={
      var a: ArrayBuffer[Random] = ArrayBuffer()
      for (i <- 0 until m){
        val rand = new scala.util.Random();
        a.append(rand)
      }
    }
//    setArray(5)

    // 3.在一个有8个整数（18,25,7,36,13,2,89,63）的数组中找出其中最大的数及其下标。  indexOf(内容)
    val arr1 = Array(18,25,7,36,13,2,89,63)
    println(arr1.max)
    println(arr1.indexOf(arr1.max))

    // 4."hell tom hello jerry","hello jerry","hello kitty"先按空格拆分，在压平 。统计单词出现的频次
    val string: List[String] = List("hello tom hello jerry","hello jerry","hello kitty")
    val flatMap4 = string.flatMap(_.split(" "))
//    println(flatMap4)
    val groupMap = flatMap4.groupBy(word => word)
//    println(groupMap)
    val resultList = groupMap.map(elem => (elem._1,elem._2.size))
    println(resultList)

  }
}
