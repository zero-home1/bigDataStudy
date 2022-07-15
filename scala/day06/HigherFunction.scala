package day06


/* 高级函数 */

object HigherFunction {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4,5,6,7,8,9)

    // 1.过滤 filter(函数判断式)  true 留下，false 丢失
    val evenList = list1.filter((elem:Int) => {elem % 2 == 0})
    val oddList = list1.filter(_ % 2 == 1)
    println("获取到的偶数为:"+evenList)
    println("获取到的奇数为:"+oddList)

    // 2.map 将每个元素经过指定函数转换为另一个新的元素
//    val newList1 = list1.map((elem) => {elem * 2})
    val newList1 = list1.map( _ * 2)
    println(newList1)


    // 3.扁平化(flatten)  将集合分组打散，生成一个新的集合
    val list2: List[List[Int]] = List(List(1,2,3),List(4,2,5))
    println(list2.flatten)

    // 4.扁平化 + 映射 (flatmap)
    // 方式1:
    // 将一组字符串分词，并保存成单词的列表
    val strings: List[String] = List("hello world", "hello scala", "hello java", "we study")
    // 将列表中的每个元素切割
    val splitList = strings.map((string: String) => {string.split(" ")})
    // 对 splitList 打散扁平化
    val result = splitList.flatten
    println(result)

    // 方式2:
    println(strings.flatMap(_.split(" ")))

    // 5.分组 groupBy   ################
    // 将集合中的元素进行指定函数的计算，通过计算结果对元素进行分组，相同计算结果的元素放在一组。
    // groupBy得到的是一个Map，map的元素就是一个组，组的key就是函数返回结果，value就是组中所有元素的集合
    val groupMap = list1.groupBy((elem) => {elem % 2 == 0})
    println(groupMap)
    val groupMap1 = strings.groupBy(_.charAt(0))
    println(groupMap1)

    // 6.归约 (reduce)   通过指定的逻辑将集合中的数据进行聚合,从而减少数据,最终获取结果
    val list22 = List(3,4,5,8,10)
    // 将数据两两结合，实现运算规则
    val i: Int = list22.reduce( (x,y) => x-y )
    //简化
    println(list22.reduce(_ - _))    // -24
    // 从源码的角度，reduce 底层调用的其实就是 reduceLeft
    //从左到右按照规则逐个聚合
    println(list22.reduceLeft(_ - _))
    //从右到左聚合,源码中用的递归操作
    println(list22.reduceRight(_ - _))    // 3- (4 - (5 - (8 - 10))) = 6


    // 7.折叠 fold
    //  fold可以理解为就是有初始值的reduce，
    //  fold接收两个参数，第一个参数为聚合初始值，第二参数为聚合规则
    println(list22.fold(10)(_ - _))











  }

}
