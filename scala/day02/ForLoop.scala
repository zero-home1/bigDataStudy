package day02

object ForLoop {
  def main(args: Array[String]): Unit = {
    // 1.范围遍历 to 包含左右边界值
    // for (i <- 1.to(10))
    for (i <- 1 to 10) {
      //      println(i + ".hello world")
    }
    println("*" * 50)
    // 2.范围遍历 until 不包含右边界
    for (i <- 1 until 10) {
      //      println(i + ".hello world")
    }
    println("*" * 50)
    // 3.集合遍历
    for (i <- Array(12, 13, 14)) {
      //      println(i)
    }
    for (i <- List(12, 13, 14)) {
      //      println(i)
    }
    for (i <- Set(12, 13, 14)) {
      //      println(i)
    }
    println("*" * 50)
    // 4.循环守卫 在 for 循环中添加了 判断式当作守卫
    // 需求：循环遍历1-100的数字，是5的倍数不输出打印数字
    for (i <- 1 to 100 if i % 5 != 0) {
      //      println(i)
    }
    // 5.循环步长 (看源码)
    for (i <- 1 to 10 by 2) {
      //      println(i)
    }
    // 如下直接设置步长为 0.5 报错
    //    for (i <- 1 to 5 by 0.5.toInt){
    //      println(i)
    //    }
    //    for (i <- 1.0 to 5.0 by 0.5) {
    //      //      println(i)
    //    }
    // 6.嵌套循环
    for (i <- 1 to 10) {
      for (j <- 3 to 5) {
        //        println("i" + i, "j" + j)
      }
    }
    for (i <- 1 to 10; j <- 3 to 5) {
      //      println("i" + i, "j" + j)
    }
    // 需求：打印99乘法表
        for (i <- 1 to 9) {
          for (j <- 1 to i) {
            print(s"${j}*${i}=${i * j}\t")
          }
          println()
        }
    // 简写
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"${j}*${i}=${i * j} \t")
      if (j == i){
        println()
      }
    }
    // 循环引入变量
    for (i <- 1 to 10){
      var j = 10 - i
      println(j)
    }
    // 简写1:
    for (i <- 1 to 10 ; j = 10 - i){
      println(j)
    }
    // 简写2:
    for {
      i <- 1 to 10
      j = 10 - i
    }
    {
      println(j)
    }

  }

}
