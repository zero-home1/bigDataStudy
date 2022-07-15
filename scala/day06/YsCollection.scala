package day06

/* 衍生 集合 */
object YsCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4,5,6)
    val list2 = List(3,4,5,6,8,9)
    // ###################### 单一集合操作 ###############################
    // 1.获取集合的头
    println(list1.head)
    // 2.获取集合的尾(除去头其余的全是尾)
    println(list1.tail)

    // 3.获取集合最后一个数据
    println(list1.last)
    // 4.集合初始化(除去最后一个其他的全部)
    println(list1.init)

    // 5.反转
    println(list2.reverse)

    // 6.取出前(后) n 个元素
    println(list2.take(3))   // 取前三个
    println(list2.takeRight(3))  // 去后三个

    // 7.去掉前(后) n 个元素
    println(list2.drop(3))     // 去掉前三个
    println(list2.dropRight(3))  // 去掉后三个

    // ###################### 单一集合操作 ###############################
    val set1 = Set(1,2,3,4,5,6)
    val set2 = Set(3,4,5,6,8,9)

    // 1.并集
    println(set1.union(set2))

    // 2.交集   ////    inter
    println(set1.intersect(set2))

    // 3.差集
    println(set1.diff(set2))

    // 4.拉链 zip   将元素一一结合成为 一个二元组 不够的截取
    println(set1.zip(set2))

    // 5.滑动窗口  滑窗方法可以接收两个参数，第二个参数代表一次滑动的步长，默认值为1
    println(set1.sliding(3))       // 每3个数组成为一个窗口
    println(set1.sliding(3,2))     // 每 3 个数组成为一个窗口 ，下个窗口从间隔 2 的位置开始
    println(set1.sliding(3,3))     // 滚动窗口







  }

}
