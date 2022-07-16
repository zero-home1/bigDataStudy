package day07

import scala.collection.mutable.ArrayBuffer

/* 模式匹配 */
object PatternMatchBase {
  def main(args: Array[String]): Unit = {
    // 1.基本写法
    val a = 1
    val b = 2
//    val (a,b) = (1,2)

    def twoOp(c: Char) = c match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => -1
    }

    val res = twoOp('+')
    println(res)

    // 2.模式守卫 类似于 for 的守卫
    val array1 = Array(1, 2, 3, 4, 6)
    val array2: ArrayBuffer[Int] = ArrayBuffer()
    val array3: ArrayBuffer[Int] = ArrayBuffer()

    def oneArrayOp(array1: Array[Int]) = array1 match {
      case array: Array[Int] if array1.length > 0 => for (elem <- array1) {
        if (elem % 2 == 0) array2.append(elem) else array3.append(elem)
      }
      case a => println("***" + a)
    }

//    oneArrayOp(array1)

    // 3.匹配数组/列表/元组
    val list1 = List(1,2,3,4,5,6)
    for (elem <- list1){
      val result = elem match {
        case 1 => println(1)
        case 2 => println(2)
        case 3 => println(3)
        case 4 => println(4)
        case _ => ""
      }
      println(result)
    }

    // 4.匹配元组的 快捷操作
    val tuple1 = List(("a",1),("b",2),("c",3),("d",4),("a",5))
    // 常规操作
    for (elem <- tuple1){
      println(elem._1 + " " + elem._2)
    }
    // 对确定变量名字
    for ((word,count) <- tuple1){
      println(word + " " + count)
    }
    // 通配符站位
    for ((_,count) <- tuple1){
      println(" " + count)
    }
    // 可以指定某个位置的值必须是多少
    for (("a",count) <- tuple1){
      println(count)
    }

  }
}
