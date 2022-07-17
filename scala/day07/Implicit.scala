package day07

/* 隐式转换:当编译器第一次编译失败的时候，会在当前的环境中查找能让代码编译通过的方法，
          用于将类型进行转换，实现二次编译  */
// 隐式函数    隐式类    隐式方法

class MyRichInt(val self: Int) {
  def myMax(i: Int): Int = {
    if (self < i) i else self
  }
  def myMin(i: Int): Int = {
    if (self < i) self else i
  }
}

object Implicit {
  // 1.隐式类
  // 隐式类所带的 主构造器只能有一个参数,隐式类只能被声明在 类/伴生对象/包对象中
//  implicit class MyRichInt1(val self: Int) {
//    def myMax(i: Int): Int = {
//      if (self < i) i else self
//    }
//    def myMin(i: Int): Int = {
//      if (self < i) self else i
//    }
//  }


  def main(args: Array[String]): Unit = {
      // 2.隐式函数
      // 使用 implicit 关键字声明的函数称之为隐式函数
      // 将一个Int类型对象转换为MyRichInt类型
      implicit def convert(arg: Int): MyRichInt = {
        new MyRichInt(arg)
      }
      // 这个3会被上面 convert 函数隐式转换为 MyRichInt
      println(3.myMax(5))



    // 3.隐式参数
    // 隐式参数不考虑名称，且相同类型的隐式参数只能存在一个
    // 隐式参数优于默认参数
    implicit val name: String = "killy"
//    implicit val name1: String = "hch"  // 出现多个相同类型的隐式参数 error
    def sayHello()(implicit name: String = "hch"): Unit ={
      println("hello" +" " + name)
    }
    sayHello()

    // 简便写法  利用 implicitly[泛型] 方法
    def sayHello1(): Unit ={
      println("hello" +" " + implicitly[String])
    }
    sayHello1()
  }

}
