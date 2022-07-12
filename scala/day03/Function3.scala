package day03


/* 高阶函数 */
object Function3 {
  def main(args: Array[String]): Unit = {
    def func(): Int = {
      println("func调用!!")
      1
    }
    // 1.函数作为值(整体)传递,即函数对象
    // 方式1: 在被调用函数后面 加上 _  相当于把函数当作一个整体，传递给变量
    val a = func _ // day03.Function3$$$Lambda$1/1149319664@1fbc7afb
    // 方式2: 如果明确说明函数参数类型 和 返回值类型 ，可以直接将函数传递给变量
    val a1: () => Int = func // day03.Function3$$$Lambda$2/1828972342@45c8e616
    //    println(a)
    //    println(a())
    //    println(a1)
    //    println(a1())
    // 2.函数作为参数进行传递
    // 需求:通过一个函数计算两个数的和
    def add(a: Int, b: Int): Int = {
      return a + b
    }

    def func2(fun: (Int, Int) => Int, a: Int, b: Int): Int = {
      fun(a, b)
    }

    //    println(func2(add, 10, 20))

    // 3. 函数作为函数的返回值返回(闭包)
    def func3(a: Int): () => Unit = {
      def func4(): Unit = {
        printf("a:%d", a)
      }

      return func4
    }

    func3(15)()

  }
}
