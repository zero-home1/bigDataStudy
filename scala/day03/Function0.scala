package day03


/* 函数式编程 */
object Function0 {
  def main(args: Array[String]): Unit = {
    def sayHello(name: String): Unit = {
      println("hello",name)
    }
    sayHello("zs")
    // 通过对象调用对象方法
    Function0.sayHello("lisi")
    // 获取对象方法的返回值
    val result = Function0.sayHi("wangwu")
    println(result)
  }


  // 定义对象方法
  def sayHello(name: String): Unit = {
    println("hello",name)
  }
  // 带返回值的对象方法(函数)
  // 函数默认返回值为最后一行,return可以省略
  def sayHi(name: String): String = {
    println("hi",name)
    "hello"
  }

}
