package day01

import scala.io.StdIn

object CInput {
  def main(args: Array[String]): Unit = {
    println("请输入你的姓名:")
    val name: String = StdIn.readLine()
    println("请输入你的年龄:")
    val age: Int = StdIn.readInt()
    println(s"欢迎${age}岁的${name}使用此系统！")
  }
}
