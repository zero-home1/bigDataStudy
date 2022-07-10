package day01

object BString {
  def main(args: Array[String]): Unit = {
    // 字符串格式化输出
    val name = "killy"
    val age = 18
    printf("%d岁的%s在黑马学习",age,name)
    // 字符串模板(插值字符串)
    println(s"${age}岁的${name}在黑马学习")

    val num: Double = 2.3456
    println(f"this is num ${num}%.2f")

  }
}
