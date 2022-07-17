package day07

/* 样例类 */
object Supplement {
  def main(args: Array[String]): Unit = {
    val hch = Person("hch",18)
    val killy = Person("killy",19)
    for (person <- List(hch,killy)) {
      person match {
        case Person("hch",18) => println("hello hch!!")
        case Person("killy",19) => println("hello killy!!")
        case _ => println("")
      }
    }

  }
}


// 声明样例类
// 样例类特点: 1.声明时参数不需要带参数 2.会自动添加 apply 和 unapply 方法
case class Person private(name: String,age: Int)

