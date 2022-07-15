package day06

import scala.collection.mutable


/* Map 映射: 是一种键值对（k - v）*/
object MapCrud {
  def main(args: Array[String]): Unit = {
    // ######################## 不可变Map集合 ##########################
    // 1.创建 map 集合
    val map1: Map[String, Int] = Map("a" -> 1, "hello" -> 5)
    println(map1)
    // 2.遍历 map 集合
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv))
    // 3.获取 map 集合的keys/values
    for (k <- map1.keys) {
      println(k)
    }

    for (v <- map1.values) {
      println(v)
    }
    println("*************************")
    // 4.访问某一个 key 的 value
    println(map1.get("a"))
    println(map1.get("a").get)
    println(map1.getOrElse("a", 0))

    println(map1("a"))


    // ######################## 可变Map集合 ##########################
    // 1.创建可变 map 集合
    val mapBuffer1: mutable.Map[String, Int] = mutable.Map("a" -> 1, "hello" -> 5)
    println(mapBuffer1)
    println(mapBuffer1.getClass)
    // 2.增加
    mapBuffer1.put("c", 1)
    // 3.删除
    //    mapBuffer1.remove(key)
    // 4.修改 update 相同则修改，不同则添加
    mapBuffer1.update("d", 1)
    mapBuffer1.update("hello", 8)
    // 5.查找
    mapBuffer1.get("a").get
    mapBuffer1.getOrElse("a", 0)
    // 6.合并   map1中的元素都添加到mapBuffer1中，相同key则覆盖mapBuffer1的value
    mapBuffer1 ++ map1
    println(mapBuffer1)
  }
}

