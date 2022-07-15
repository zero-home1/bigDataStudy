package day06
/* 集合通用操作 */
/*
* length:length 是针对数组而言的，如果你想知道一个数组的长度则可以 length
* length():length()是针对字符串String说的,如果想看这个字符串的长度则用到length()这个方法
* size():size()方法是针对泛型集合说的,如果想看这个泛型有多少个元素,就调用此方法来查看
*
* 当为string时 使用 length() 其他都可以
*  */

object CommonOp {
  def main(args: Array[String]): Unit = {
//    val a: String = "xiaoxiaoxiaodadada"
//    println(a.length())
    val list1 = List(1,3,2,5)
    val set1 = Set(22,11,33,44)  // 无序，不关心长度
    // 1.获取集合长度
    println(list1.length)
//    println("*"*20)
//    // 2.获取集合大小
    println(list1.size)
//    println(set1.size)
//    println("*"*20)
//    // 3.循环遍历
//    for (elem <- list1) println(elem)
//    println("----------------------------------")
//    list1.foreach((elem) => {println(elem)})
//    list1.foreach(println _)
//    // 4.迭代器
//    for (elem <- set1.iterator) println(elem)
//    println("*"*20)
//    // 5.生成字符串
//    println(set1.mkString(","))
//    println(list1.mkString("--"))
//    println("*"*20)
//    // 6.是否包含
//    println(list1.contains(0))
//    println(set1.contains(11))






  }
}
