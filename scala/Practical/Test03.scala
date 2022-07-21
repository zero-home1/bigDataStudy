package Practical

object Test03 {
  def main(args: Array[String]): Unit = {
    val stu = new student3()
    stu.printInfo()
  }
}


class student3(name: String = "张无忌", age: Int = 13){ // 在主构造器中声明参数
  def printInfo(): Unit ={
    println(s"${name}--${age}")
  }
}