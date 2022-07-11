package day02

object TransformType {
  def main(args: Array[String]): Unit = {
    // 1.自动类型转换
    //（1）自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数据类型，然后再进行计算。
    //（2）把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换。
    //（3）（byte，short）和 char 之间不会相互自动转换。byte，short，char 他们三者可以计算，在计算时首先转换为 int 类型。
    val a1: Byte = 10
    val a2: Short = 20
    val c1: Char = '9' // 转换为 ascII计算
    val res: Int = a1 + a2 + c1
    println(res)

    // 2.强制类型转换 .toInt  .toLong  .toChar  .toDouble .....
    // 类似于 Python 强制转换


    // 3.题目(溢出问题)
    /*
    * int:130     4个字节      32位
    * 原码  0000 0000 0000 0000 0000 0000 1000 0010
    * 强转后 byte 截取最后一个字节
    *         1000 0010   1 表示 －,取反
    * 对于原码 1111 1101 + 1 ---- 1111 1110 ==》 -126
    * */

    val b = 130
    val b1: Byte = b.toByte
    println(b1)


    // 4.判断一个字符串是否为空   equals() 方法 用于判断 Number 对象与方法的参数是否相等
    def isSpace(str: String): Boolean = {
      return str != null && ("".equals(str.trim))
    }

//    val res1 = isSpace("null")
//    val res1 = isSpace("")
    val res1 = isSpace("123")
    println(res1)

  }
}
