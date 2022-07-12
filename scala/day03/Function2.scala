package day03


/* 函数至简原则 */
object Function2 {
  def main(args: Array[String]): Unit = {
    // (1)return可以省略，Scala会使用函数体的最后一行代码作为返回值
    def f0(name: String): String = {
//      println(name)
      "最后一行当作返回值"
    }

    val res = f0("killy")
//    println(res)

    // (2)如果函数体只有一行代码，可以省略花括号
    // (3)返回值类型如果能够推断出来，那么可以省略(:和返回值类型一起省略)
    // (4)如果有return，则不能省略返回值类型，必须指定
    // (5)如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
    def f1(name: String): Unit = {
//      println(name)
      return "最后一行当作返回值"
    }

    val res1 = f1("killy")
//    println(res1)
    // (6)Scala如果期望是无返回值类型，可以省略等号
    // (7)如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    // (8)如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    // (9)如果不关心名称，只关心逻辑处理，那么函数名和 (def)可以省略
//    (name: String) => { println(name) }

    //  匿名函数，lambda表达式,返回值是一个函数,可以将其当作参数传递给其他函数
//    val name1 = "hch"
    val f9 = (name1: String) => { println(name1) }
    println(f9("hch"))



  }
}
