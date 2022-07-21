package Practical

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

/* 习题 */
object Test06 {
  def main(args: Array[String]): Unit = {
    // match 模式常量
    //    print("请输入匹配的数值:")
    //    val matchNum = StdIn.readInt()
    //    matchNum match {
    //      case 1 => println("孙悟空")
    //      case 2 => println("猪八戒")
    //      case 3 => println("沙和尚")
    //      case 0 => println("孙悟空")
    //      case _ => println("")
    //    }

    // match 匹配数组
    for (elem <- List(
      Array(0, 2, 3, 4),
      Array(10, 15, 48, 0),
      Array(6),
      Array("a", 1, "c", false)
    )) {
      elem match {
        case Array(10, x, y, z) => println("Array" + x + y + z)
        case Array(6) => println("Array" + 6)
        case Array(0, _*) => println("以0开头 任意数量")
        case _ => println("没有匹配上的")
      }
    }

    // Option 无返回值是为None  有返回值是Some    ###########################
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    // 23 24 用 Option 封装结果 ????????????????????????
    def twoNumberDivision(a: Int, b: Int): Unit= {
      b match {
        case 0 => println("除数不能为0")
        case _ => println(a / b)
      }
    }
    twoNumberDivision(6,2)
    twoNumberDivision(1,0)


    // try catch finally
    try {
      val a = 100/0
    } catch {
      case e: ArithmeticException =>{
        println("算数错误")
      }
      case e: Exception => {
        println("其他错误")
      }
    } finally {
      println("执行结束!!!")
    }


  }
}
