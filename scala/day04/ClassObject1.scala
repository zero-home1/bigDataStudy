package day04

/* 构造器 */
class Person() { // 主构造器没有参数
  private var idCard: String = ""
  private var name: String = _
  private var age: Int = _ // 子类 伴生类可以访问
  protected val address: String = "武汉黄陂" // 子类 同类 可以访问,同包不可以
  private[day04] val tel: String = "123456" // 增加包权限,可以在该包下面的任何类调用
  val admin: String = "killy"

  // 声明辅助构造方法,必须直接或间接的调用主构造器    类似于python 中的 __init__
  def this(name: String) {
    this() // 直接调用主构造器
    this.name = name
    println(s"name:$name age:$age")
  }

  def this(name: String, age: Int) {
    this(name) // 间接调用主构造器
    this.age = age
    println(s"name:$name age:$age")
  }

}


object ClassObject1 {
  def main(args: Array[String]): Unit = {
    val stu = new Person(name = "killy")
    val stu1 = new Person("hch", 18)
  }
}
