package day05

/* 面向对象 -- 继承 */
// 继承的调用顺序：父类构造器 -> 子类构造器，创建子类对象时层层依次调用
// 继承相当于直接调用父类的主构造器，当父类的主构造器需要传参时，继承时就要传参

object ClassExtendsParents {
  def main(args: Array[String]): Unit = {
    val stu1 = new stuChild("killy",18)
    val stu2 = new stuChild("hch",19,"001")
    stu2.printInfo()

    val stu3 = new stuChild1("killy",18)
    val stu4 = new stuChild1("killy",18,"001")
    stu4.printInfo()
  }
}


// 定义父类
class PersonExtends() { // 主构造器无参
  var name: String = _
  var age: Int = _
  println("1.父类的主构造器被调用")

  // 定义辅助构造器
  def this(name: String, age: Int) {
    this
    this.name = name
    this.age = age
    println("2.父类的子构造器被调用")
  }

  def printInfo(): Unit = {
    println(s"${name}--${age}")
  }
}

// 定义子类,继承父类的主构造器
class stuChild(name: String, age: Int) extends PersonExtends {
  var stdId: String = _
  println("3.子类的主构造器被调用")

  def this(name: String, age: Int,stdId: String) {
    this(name, age)
    this.stdId = stdId
    println("4.子类的辅助构造器被调用")
  }

  // 重写父类的方法
  override def printInfo(): Unit = {
    println(s"${name}--${age}--${stdId}")
  }
}

// 定义子类,继承父类的辅助构造器
class stuChild1(name: String, age: Int) extends PersonExtends(name,age) {
  var stdId: String = _
  println("5.子类的主构造器被调用")

  def this(name: String, age: Int,stdId: String) {
    this(name, age)
    this.stdId = stdId
    println("6.子类的辅助构造器被调用")
  }

  // 重写父类的方法
  override def printInfo(): Unit = {
    println(s"${name}--${age}--${stdId}")
  }
}