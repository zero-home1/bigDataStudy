package Practical

/* 更高的练习题 */
object Test08 {
  def main(args: Array[String]): Unit = {
    // 30
    var arr0 = Array(11,5,7,2,1,2,3,4,5,6)
    var arr1 = Array("1,2,3,4","6,7,8,9","1,2,3,4")

    // 1.现有一个数组arr0，请将每个元素乘以10，只保留大于40的数并打印。
    val arr2 = arr0.map(_*10).filter(_ > 40)
    println(arr2.mkString(" "))
    // 2.将arr1中每个字符串用","切分,组成一个新的集合，并且求出数组的长度
    val arr3 = arr1.flatMap(_.split(","))
    println(arr3.mkString(" "))

    // 3.将arr0进行奇数偶数分区，奇数分区进行正序排序，偶数部分倒序排序   ################################
    val groupMap = arr0.groupBy(elem => if (elem % 2 ==0) "偶数" else "奇数")
    println(groupMap)  // Map(奇数 -> [I@1efbd816, 偶数 -> [I@6a2bcfcb)

    val resultMap = groupMap.map(elem =>{
      if (elem._1.equals("偶数")){
//        "偶数" -> elem._2.toList.sorted.reverse
        "偶数" -> elem._2.toList.sortWith(_ > _)
      }else{
        "奇数" -> elem._2.toList.sorted
      }
    })
    println(resultMap)

    // 31
    var A1 = Array(6, 7, 8, 9, 10, 1, 2, 3, 4, 5)
    var A2 = Array("11,22,33", "44,55,66", "77,88,99")

    // 1.遍历输出A1,并将每个数2且输出
    // 2.A1升序
    println(A1.sortWith(_ < _).mkString(" "))
    // 3.A1降序
    println(A1.sorted(Ordering[Int].reverse).mkString(" "))
    // 4.A1奇数偶数分开
    // 5.将A2中每个字符串用","切分,组成一个新的集合，并且求出数组的长度
    val A2flatMap = A2.flatMap(_.split(","))
    println(A2flatMap.mkString(" "),"切割后数组长度" + A2flatMap.length)
    // 6.将A2中每个字符串用","切分,组成一个新的集合，并且将每个数除11把大于5的数输出

  }
}
