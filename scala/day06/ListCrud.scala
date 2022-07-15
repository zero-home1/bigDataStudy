package day06

import scala.collection.mutable.ListBuffer

/* 列表 */
object ListCrud {
  def main(args: Array[String]): Unit = {
    // ############################### 不可变列表 #########################################
    // 1.创建列表
    var list33 = Nil   // 定义一个空列表
    val list1 = List(1,2,3)
    val list2 = Nil.::(1,2,3)
    val list3 = 13 :: 15 :: 16 :: Nil
    // 2.通过下标查找列表的某个值
    println(list1(0))
    // 3.遍历列表(类似于数组)
    list1.foreach(println)
    // 4.合并列表
    val list4 = list2 ::: list3
    val list5 = list2 ++ list3


    // ############################### 可变列表 #########################################
    // 1.创建可变列表
    val listBuffer1 = new ListBuffer[Int]()
    val listBuffer2 = ListBuffer(1,2,3)
    println(listBuffer1)
    println(listBuffer2)

    // 2.查询
    println(listBuffer2(0))
    // 3.增加
    listBuffer2.append(4)
    listBuffer2.prepend(0)
    listBuffer2.insert(1,7)
    // 4.删除
//    listBuffer2.remove(index)
    listBuffer2 -= 1
    // 5.修改
//    listBuffer2(index) = value
    // 6.合并
    val newListBuffer = listBuffer1 ++ listBuffer2
    println(newListBuffer)
    listBuffer1 ++ listBuffer2  // listBuffer1 改变 listBuffer2 不改变





  }
}
