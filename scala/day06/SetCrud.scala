package day06

import scala.collection.mutable

/* 集合:无序且数据不重复 */
object SetCrud {
  def main(args: Array[String]): Unit = {
    // ############################## 不可变集合 #####################################
    // 1.创建集合
    val set1 = Set(1,2,1,3,5,6,8)
    println(set1)
    // 2.添加集合数据
    val set2 = set1 + 6
    println(set2)
    // 3.删除集合元素
    val set3 = set1 - 1
    println(set3)
    // 4.合并集合
    val set4 = set1 ++ set3
    println(set4)

    println("**********************")
    // ############################### 可变集合 #####################################
    // 1.创建可变集合
    val setBuffer1 = mutable.Set(1,2,1,3,5,6,8)
    println(setBuffer1)
    // 2.增加
    setBuffer1.add(10)
    println(setBuffer1)
    // 3.删除
    setBuffer1 -= 2
    println(setBuffer1)
    // remove 以元素删除元素
    setBuffer1.remove(5)
    println(setBuffer1)



  }
}
