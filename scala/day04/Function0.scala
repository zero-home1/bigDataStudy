package day04


/* 闭包(closure): 如果一个函数，内部使用了外部函数的变量，外部函数返回了内部函数的调用 */
object Function0 {
  def main(args: Array[String]): Unit = {
    // 闭包
    def addBy(a: Int): Int => Int = {
      def inner(b: Int): Int = {
        a + b
      }
      inner
    }

    println(addBy(3)(5))

    // 闭包简写 --> lambda
    def addByLambda(a: Int): Int => Int = {
      (b: Int) => {a + b}
    }
    // 参数类型可以省略,如果只有一个参数,小括号也可以省略
    def addByLambda1(a: Int): Int => Int = {
      b => { a + b}
    }
    //
    def addByLambda2(a: Int): Int => Int = a + _

    println(addByLambda2(3)(5))

  }

}
