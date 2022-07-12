package day03

/* 函数的参数类型 */
object Function1 {
  def main(args: Array[String]): Unit = {
    // (1) 可变参数,返回的是个数组类型
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("aaa")
    f1("aaa", "bbb", "ccc")

    // (2) 如果参数列表中存在多个参数，那么可变参数一般放置到最后
    def f2(str1: String, str2: String*): Unit = {
      println(str1, str2)
    }

    f2("aaa")
    f2("aaa", "bbb", "ccc")

    // (3) 默认值参数
    def f3(str: String = "killy"): Unit = {
      println(str)
    }

    f3()
    f3("hch")

    // (4) 带名参数(实参传递)
    def f4(name: String, str2: String, str3: String*): Unit = {
      println(name, str2, str3)
    }

    f4(name = "aaa",str2 = "bbb",str3 = "ccc","ddd")
  }
}
