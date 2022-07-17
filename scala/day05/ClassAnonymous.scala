package day05

/* 抽象类--匿名子类 */
// 无需单独去创建一个子类,而是在声明的时候继承抽象类
object ClassAnonymous {
  def main(args: Array[String]): Unit = {

    // 创建匿名子类,后面跟的时抽象类的内容,这个类是匿名的,只能使用一次
    val stu1 = new PersonAnnoyAbs {
      override val name: String = "killy"

      override def eat(): Unit = println("eat.....")
    }
    println(stu1.name)
    println(stu1.eat())

  }

}

// 定义抽象类
abstract class PersonAnnoyAbs {
  val name: String
  def eat(): Unit
}