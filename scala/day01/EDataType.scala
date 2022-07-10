package day01

/*
*        Byte                     Short                  Int                    Long
* 字节数   1个                       2个                    4个                    4个
*         8位                      16位                   32位                    64位
*     -2^7--2^7-1              -2^15--2^15-1          -2^31--2^31-1         -2^63--2^63-1
*  原因:因为 0 被计算2次
* */

object EDataType {
  def main(args: Array[String]): Unit = {
    // 1.整数类型
    val a1: Byte = 127
    val a2: Byte = -128
    //  val a2: Byte = 128  // error 超出 Byte 范围

    val a3: Byte = 10 + 20      //这个报错是编译器的问题
//    println(a3)
    /*  下面会报错,默认把 10 当作 int 类型*/
    val a4: Byte = 20
//    val a5: Byte = a4 + 10   // error
    val a5: Byte = (a4 + 10).toByte
    println(a5)

    // 2.浮点类型  Float 4个字节  Double 8个字节
    // Scala 的浮点型常量默认为 Double 型，声明 Float 型常量，须后加‘f’或‘F’
    val b1 = 2.36454  // 默认是 Double
    val b2: Float = 2.35454f

    // 3.字符型(单个字符)
    // 4.布尔类型  占一个字节

    // 5.空类型
    /*
    * Unit : 表示无值，用作不返回任何结果的方法的结果类型。 Unit 返回值为 ()
    * Null : 空引用,对于 基本值类型(AnyVal)来讲,不能赋值；对于任意引用类型(AnyRef)来讲，可以赋值
    * Nothing : 表示返回值不正常,可以作为没有正常返回值的方法的返回类型
    * */
    def sayHello(): Unit = {
      println("hello scala!!")
    }
    // 获取 sayHello() 的返回值
    val m1 = sayHello()
    println(m1)

    /*
    * 下述例子会报错, else 返回值 为Int if 返回值 为nothing
    * 修改:可以将Nothing 改为 any，但尽量改为离得最近的 Int
    * */
    def sayHi(a: Int): Int = {
      if (a == 0)
        throw new NullPointerException
      else
        return a

    }
    val m2 = sayHi(3)
    println(m2)


  }


}
