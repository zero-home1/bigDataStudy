package day07

object PreviewNote {
  def main(args: Array[String]): Unit = {
    // 1.将 列表中的数据 按照单词首字母进行排序
//    val strings: List[String] = List("hello world", "hello scala", "hello java", "we study")
//    //  将 Strings 进行扁平化处理
//    val mapResult = strings.flatMap((str) => {str.split(" ")})
//    // 分组
//    val groupResult = mapResult.groupBy((elem) => {elem.charAt(0)})
//    println(groupResult)


    // 2. WordCount:将集合中出现的单词，进行计数，取计数排名前三的结果
    val strings1: List[String] = List(
      "hello python",
      "hello java",
      "hello scala",
      "hello spark from scala",
      "hello scala"
    )
    // step1: 将 数据strings 进行扁平化处理
    val flatMap: List[String] = strings1.flatMap(_.split(" "))
    // step2: 相同单词放到一组
    val groupMap = flatMap.groupBy(word => word)
//    println(groupMap)
    // step3: 根据分组将数组转为 map 映射   ##### 如何根据 分组 将数据一一映射？？？
    val mapResult = groupMap.map(elem => (elem._1,elem._2.length))
    // step4: map 没有排序方法，需要转为列表 list
    val listResult = mapResult.toList
//    println(listResult)
    // step5: 按照元组类型进行排序,获取前3个
    val listResult1 = listResult.sortBy((elem1) => {elem1._2}).reverse
//    println(listResult1.take(3))

    // 3.复杂的 wordCount
    val strings2: List[(String,Int)] = List(
      ("hello python",1),
      ("hello java",2),
      ("hello scala",3),
      ("hello spark from scala",1),
      ("hello scala",2)
    )
    // 思路1: 将 string2 打散,然后 根据后面 的数字进行计算
    val newString2 = strings2.map((elem) => {
      (elem._1.trim + " ") * elem._2
    })
    val mapResult1 = newString2
      .flatMap((elem2) => {elem2.split(" ")})
      .groupBy((word) => {word})
      .map((kv) => {(kv._1,kv._2.size)})
      .toList
      .sortBy((a) => {a._2})(Ordering[Int].reverse)
      .take(3)
//    println(mapResult1)

    // 思路2: 基于原来的数据进行操作
    // step1: 将string2 中第一个元素按照空格切分，并且跟 第二个元素 合并成一个 map
    val mapR1 = strings2.flatMap(
      elem3 => {
      val str = elem3._1.split(" ")
      str.map(str => (str,elem3._2))
    }
    )
//    println(mapR1)
    // step2: 根据 mapR1 中第一个单词进行分组
    val preCountMap = mapR1.groupBy(_._1)
    // --------------------------------------- 重点 -----------------------------
    // step3: 叠加每个单词统计的个数
    // key 不变 可以直接修改 values
    val countMap = preCountMap.mapValues(
      tupleList =>
        tupleList.map(_._2).sum)

    val result2 = countMap
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)
    println(result2)
  }
}
