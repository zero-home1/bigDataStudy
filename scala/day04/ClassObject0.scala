package day04

import scala.beans.BeanProperty
/* 访问权限 */
/*
* 在 Java 中，访问权限分为：public，private，protected 和默认。在 Scala 中，你可以通过类似的修饰符达到同样的效果。但是使用上有区别。
（1）Scala 中属性和方法的默认访问权限为 public，但 Scala 中无 public 关键字。
（2）private 为私有权限，只在类的内部和伴生对象中可用。
（3）protected 为受保护权限，Scala 中受保护权限比 Java 中更严格，同类、子类可以访问，同包无法访问。
（4）private[包名]增加包访问权限，包名下的其他类也可以使用。
* */

class Student {
  // val 修饰的属性不能赋默认值，必须显示指定
  private var name: String = _
  private var age: Int = _
  @BeanProperty   // 为 Scala 的属性设置 getXXX 和 setXXX 方法（通过@BeanProperty 注解实现）
  val sex: String = "男"
  protected val email: String = "119@qq.com"
  private[day04] val tel: String = "123456"

}
//object Student {
//  def main(args: Array[String]): Unit = {
//    val stu = new Student()
//    // 私有权限,在类的伴生对象中可以使用
//    println("name:"+stu.name)
//    println("age:"+stu.age)
//
//  }
//}
object ClassObject0 {
  def main(args: Array[String]): Unit = {
    // 创建对象
    var stu1 = new Student()
    println(stu1.sex)
    println(stu1.tel)  // 增加包访问权限,包下其他类可以使用
//    println(stu1.name)  // 不是类的伴生对象 无法获取类的私有属性
  }


}

