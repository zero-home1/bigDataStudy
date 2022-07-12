package day03

object Function3Test {
  def main(args: Array[String]): Unit = {
    // 对数组进行处理,将操作抽象出来,处理完毕之后的结果返回一个新的数组
    def arrayOp(arr: Array[Int],option: Int=>Int): Array[Int] = {
        for (elem <- arr) yield option(elem)
    }
    def option(elem: Int): Int= {
      elem + 1
    }
    val arr: Array[Int] = Array(12,13,14)

    // 方式1.把函数当作 一个整体传入
    val newArray: Array[Int] = arrayOp(arr,option)
    println(newArray.mkString(","))

    // 方式2.传入匿名函数,实现元素翻倍
    val newArray2: Array[Int] = arrayOp(arr,elem => elem * 2)
    println(newArray2.mkString(","))

  }
}
