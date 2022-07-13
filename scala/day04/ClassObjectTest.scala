package day04

import scala.io.StdIn
import scala.util.control.Breaks._

object ClassObjectTest {
  def main(args: Array[String]): Unit = {
    // 1.100以内的数求和，求当和第一次大于20的当前数，使用for循环
//    var result: Int = 0
//    breakable(
//      for (i <- 1 to 100) {
//        result += i
//
//        if (result > 20) {
//          println(s"当前 i 为:${i}")
//          break()
//        }
//      }
//    )

    // 2.实现登录验证，有三次机会，如果用户名为“张无忌”，密码为“888”，提示登录成功，否则提示还有几次机会，使用for循环
//    breakable {
//      for (i <- 1 to 3) {
//        print("请输入用户名:")
//        val admin = StdIn.readLine()
//        print("请输入密码:")
//        val pwd = StdIn.readLine()
//        if (admin == "张无忌" && pwd == "888") {
//          println("登录成功")
//          break()
//        } else
//          println(s"你还有${3 - i}次机会")
//      }
//    }

    // 3.某人有100000元，每经过一次路口，需要交费，规则如下:
    //   1）当现金大于50000时，每次交5%
    //   2）当现金小于等于50000时，每次交1000
    //   编程计算该人可以经过多少次路口，使用for循环
    var salary: Double = 100000
    breakable{
    for (i <- 0 to 1000) {
      if (salary >= 50000) {
        salary *= 0.95
      } else if (salary >= 0) {
        salary -= 1000
      } else {
        if (salary > 0){
        println(s"可以经过${i}次路口")
        } else {
          println(s"可以经过${i-1}次路口")
        }
        println(salary)
        break()
      }
    }

    }

  }
}


