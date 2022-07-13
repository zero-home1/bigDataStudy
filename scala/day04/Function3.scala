package day04


/* 传值参数 传名参数 惰性加载*/
object Function3 {
  def main(args: Array[String]): Unit = {
    // 1.传值参数
    def f0(a: Int): Unit = {
      println("a:"+ a)
      println("a:"+ a)
    }

    def f1(): Int = {
      println("我是f1我被调用了")
      return 5
    }
    f0(12)
    f0(f1())  // 相当于 a --> 5

    // 2.传名参数,传递的不再是具体的值,而是代码块(可以是一个函数、一个常量)
    // 区别传入函数   传入函数 func: Int => Int
    //      代码块返回值类型
    def f2(a: =>Int): Unit = {
      println("a:"+ a)
      println("a:"+ a)
    }
    f2(12)
    f2(f1())  // 相当于 a --> f1()
    f2({
      println("我是一个代码块")
      12
    })

    // 3.惰性加载:当函数的返回值被声明为 lazy 时,函数的执行将被推迟,直到我们首次对此取值,该函数才会执行
    //   这种函数被称之为惰性函数
    // 程序执行顺序 1 3 2
    lazy val sumTest = sum(12,18)
    println("1.程序开始")
    println("2.result:"+ sumTest)
    def sum(a: Int,b: Int): Int ={
      println("3.sum被调用")
      return a + b
    }


  }
}
