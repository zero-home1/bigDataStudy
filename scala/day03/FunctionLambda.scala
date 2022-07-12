package day03

object FunctionLambda {
  def main(args: Array[String]): Unit = {
    // lambda 表达式返回值是一个函数
    (name: String) => { println(name) }
    // 使用 lambda 表达式
    val lambda_name1 = (name: String) => { println(name) }
//    lambda_name1("killy")

    println("*"*50)
    // 将 lambda 当作参数传递给函数
                // 参数类型    返回值类型
    def func(fun: String => Unit): Unit = {
      fun("killy")
    }
    func(lambda_name1)
    println("*"*50)

    // 匿名函数的简化原则
    //（1）参数的类型可以省略，会根据形参进行自动的推导。
    func( (name) => { println(name) } )
    //（2）类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况：没有参数和参数超过1的永远不能省略圆括号。
    func( name => { println(name) } )
    //（3）匿名函数如果只有一行，则大括号也可以省略
    func( name => println(name)  )
    //（4）如果参数只出现一次，则参数省略且后面参数可以用_代替
    func(println(_))
    // (5) 如果可以推断出，当前传入的println是一个函数体，而不是调用语句，可以直接省略下划线
  }
}
