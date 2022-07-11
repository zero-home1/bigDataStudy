package day02

object Operation {
  /*
  * 运算符的本质: scala 是完全的面向对象语言，其运算符的操作 本质都是调用 底层的方法来实现的。
  *   + --> .+    * --> .*
  * */

  def main(args: Array[String]): Unit = {
    var a = 60    // 60 = 0011 1100
    // << 左移运算符 (左移一位 扩大2倍)
    var a1 = a >> 2   // a1 = 1111 0000
    println(a1)
    // << 右移运算符 (右移一位 缩小2倍)
    var a2 = a >> 2   // a2 = 0000 1111
    println(a2)
    // >>> 无符号右移 (不区分 正负)
    var a3 = a >>> 2
    println(a3)

  }

}
