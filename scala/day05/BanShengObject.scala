package day05

import day05.Student.school

/* 伴生对象 */
// 若单例对象名与类名一致，则称该单例对象这个类的伴生对象，
// 这个类的所有“静态”内容都可以放置在它的伴生对象中声明
object BanShengObject {
  def main(args: Array[String]): Unit = {
    // 直接通过类声明一个对象
//    val stu = new Student("killy",18)
//    stu.printInfo()


    // 通过伴生对象方法创建对象实例
//    val stu1 = Student.newObject("killy",18)
//    stu1.printInfo()

    val stu1 = Student.apply("killy",18)
    stu1.printInfo()
    // ##################### 简写 #####################
    val stu2 = Student("killy",18)
    stu2.printInfo()

  }
}


// 定义伴生类,加上private 关键字将构造器私有化
class Student private(name: String,age: Int){
  def printInfo(): Unit ={
    println(s"${name}--${age}--${Student.school}")
  }
}

// 定义伴生对象,该类中所有的静态内容都可以存放到此
object Student {
  val school: String = "yyyy"
  // 定义了一个类的对象实例创建方法
//  def newObject(name: String,age: Int):Student = new Student(name,age)
  def apply(name: String, age: Int): Student = new Student(name, age)

}