package day02

import scala.io.StdIn

object IfLoop {
  def main(args: Array[String]): Unit = {
    println("请输入你的年龄:")
    val age: Int = StdIn.readInt()

    /* 分支语句的返回值为 每个代码块的最后一句话
    *  如若各个分支的返回值类型 不同 ，则应该寻找他们的公共父类
    */
    val result: Any =
      if (age < 10) {
        println("幼儿")
        "幼儿"
      } else if (age < 18) {
        println("青年")
        age
      }else {
        println("中年")
        "中年"
      }
    println("result:"+result)
  }
}
