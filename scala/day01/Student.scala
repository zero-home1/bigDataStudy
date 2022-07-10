package day01

class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " +Student.school)
  }

}

object Student {
  // 将全局仅有一份的变量 放在 object 中
  val school: String = "itheima"

  def main(args: Array[String]): Unit = {
    // 声明对象
    val hch = new Student(name = "hch", age = 18)
    val killy = new Student(name = "killy", age = 20)
    hch.printInfo()
    killy.printInfo()

  }
}