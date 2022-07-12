package day03

/* 高阶练习 */
object Function4 {

  def main(args: Array[String]): Unit = {
    // 1.定义匿名函数,并将它作为值赋值给变量 fun. 函数有三个参数，类型分别为 Int，Sting，Char，返回值类型为Boolean
    // 要求调用函数fun(0,"",'0')得到返回值为false,其他情况均返回 true
    val fun = (id: Int, name: String, age: Char) => {
      if (id == 0 && name == "" && age == '0')
        return false
      else
        return true
    }
    println(fun(0, "", '0'))

    // 函数返回值练习
    // 2.定义一个函数 func，他接受一个Int类型的参数，返回一个函数（f1）. 它返回的函数f1接收一个 String 类型参数
    // 同样返回一个函数（f2）.函数f2接收一个char类型的参数，返回一个 boolean 的值
    // 要求调用函数 func(0)("")('0')得到返回值 false,其他情况均返回 true

    def func(a: Int): String => (Char => Boolean) = {

      def f1(b: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (a == 0 && b == "" && c == '0') false else true
        }
        // f1的返回值
        f2
      }
      // func的返回值
      f1
    }

    println(func(0)("")('0'))


    // ------------ 改为匿名函数 -----------(真不想写下去了)
    def func2(a: Int): String => (Char => Boolean) = {
        (b: String) => {
            (c: Char) => {
                if (a == 0 && b == "" && c == '0') false else true
        }
      }

    }




  }
}
