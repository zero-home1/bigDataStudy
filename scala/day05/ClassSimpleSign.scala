package day05

/* 单例设计模式 */
// 在它的核心结构中只包含一个被称为单例的特殊类。
// 通过单例模式可以保证系统中，应用该模式的类一个类只有一个实例。即一个类只有一个对象实例。
object ClassSimpleSign {
  def main(args: Array[String]): Unit = {
    val stu1 = Student11.getInstance()
    println(stu1.printInfo())

    val stu2 = Student11.getInstance()
    println(stu2.printInfo())

    println(stu1)
    println(stu2)

  }
}


/*
（1）将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
（2）在该类内部产生一个唯一的实例化对象
（3）定义一个静态方法返回这个唯一对象。
* */

// 定义一个伴生类将其构造方法私有化
class Student11 private(name: String, age: Int) {
  def printInfo(): Unit = {
    println(s"${name}--${age}--${Student.school}")
  }
}

object Student11 {
  private var stu11: Student11 = _

  def getInstance(): Student11 = {
    if (stu11 == null) {
      // 如果没有对象实例,就创建一个
      stu11 = new Student11("killy", 18)
    }
    return stu11
  }
}