package day06

import scala.collection.mutable.ListBuffer

/* 简单的计算函数 */
// Iterable类型本身是没有排序方法的，List、Array等都是自己实现的sort方法，
// 如果需要对Iterable类型集合进行排序，需要先将其转换为特定类型的集合（调用toList或toArray方法）
object SimpleFunc {
  def main(args: Array[String]): Unit = {
    val list1 = ListBuffer(1,2,3,4,5)
    val list2 = List(("a", 5), ("b", 1), ("c", 8), ("d", 2), ("e", -3), ("f", 4))
    // 1.求和
    println(list1.sum)
    // 2.求乘积
    println(list1.product)   //////
    // 3.求最大值
    println(list1.max)
    // 若集合中的元素是一个元组,可以通过maxBy来指定比较元组中的哪一个数据
    println(list2.maxBy((tuple99: (String, Int)) => tuple99._2 ) )
    // 4.求最小值
    println(list1.min)
    println(list2.minBy((tuple88:(String,Int)) => tuple88._2))
    // 5.排序
    // 5.1 sorted
    println(list1.sorted)   // 从小到大
    println(list1.sorted.reverse)  // 从大到小

    // 5.2 sortBy
    println(list2.sortBy((tuple77:(String,Int))=>{tuple77._2}).reverse)











  }
}
