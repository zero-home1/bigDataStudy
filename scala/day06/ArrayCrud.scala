package day06

import scala.collection.mutable.ArrayBuffer


/* 数组 */

/* 迭代器:不是一个集合，而是一种访问集合的方法
* iterator.hasNext() 用于检测 集合中是否还存在数据
* iterator.Next()  返回迭代器的下一个元素
* */
object ArrayCrud {
  def main(args: Array[String]): Unit = {
// ####################### 不可变数组 #################################
    // 1.创建不可变数组
    // 方式1: 创建一个长度为5类型为 Int 的数组
    val arr1 = new Array[Int](5)
    println(arr1.length)
    // 方式2: 利用 Array 中的 apply 方法
    val arr2 = Array.apply(5,10)
    val arr3 = Array(1,2,3,4)

    // 2.通过下标查询
    println(arr3(0))
    // 3.修改数组,对于不可变数组,只能修改存在的数据
    arr2(1) = 50


    // 4.遍历数组
    // 方式1: 通过下标
    for (i <- 0 until arr2.length) {
      println(arr2(i))
    }
    println("=====================")
    // 方式2: 通过下标
    for (i <- arr2.indices) {
      println(arr2(i))
    }
    println("=====================")
    // 方式3: 直接遍历数组
    for (elem <- arr2) {
      println(elem)
    }
    println("=====================")
    // 方式4:遍历元素执行某个函数，调用foreach方法   不会用
    arr2.foreach(println _)
    // 将数组中的数据按照 -- 连接起来
    println(arr2.mkString("--"))
    println("=====================")
    // 方式5: 迭代器
    val it: Iterator[Int] = arr2.iterator
      while (it.hasNext){
        println(it.next())
      }

    println("=====================")
    // 4. 不可变数组添加元素,添加完成后变成一个新的数组   :+ 在后面加   +: 在左边加
    val newArr1 = 11 +: 12 +: arr2 :+ 15 :+ 16
    println(newArr1.mkString(","))



// ############################### 可变数组 ######################################
    // 1.创建可变数组
    val arr5 = new ArrayBuffer[Int]()
//    val arr4 = ArrayBuffer.apply(15,16,17)
    val arr4 = ArrayBuffer(15,16,17)
      // 2.查询
      println(arr4(1))
      // 3. 修改
      arr4(1) = 15


    // 4.增加
      arr5.append(18)  // 在末尾追加
      arr5.prepend(14)  // 在最前面添加
//      arr5.insert(index,elem)  // 在指定位置添加

      arr5.appendAll(arr4)
      arr5.prependAll(arr4)
      arr5.insertAll(1,arr4)
    // 5.删除
//      arr5.remove(index,count)   // 下标 连续删除的个数
      arr5 -= 18    // 根据值删除数据


// ############################### 可变与不可变数组转换 ######################################
      // 能用不可变就用不可变
      // 1.可变类型转为不可变类型
      val arr7 = ArrayBuffer(1,2,3)
      val newArr8 = arr7.toArray
      println(newArr8.mkString(","))
      println(arr7)

      // 2.不可变类型转为可变类型
      val arr8 = newArr1.toBuffer
      println(arr8)
      println(newArr1.mkString(","))
// ############################## 多维数组 #################################
      val mulArr = Array.ofDim[Int](2,3)
      mulArr(0)(0) = 22
      mulArr(1)(1) = 11
      mulArr(1)(2) = 12
      println(mulArr.length,mulArr(1).length) // 2行
//      for (i <- 0 until mulArr.length; j <- 0 until mulArr(i).length-1) {
//          println(mulArr(i)(j))
//      }
      // 遍历多维数组
      for (i <- mulArr.indices; j <- mulArr(i).indices) {

          print(mulArr(i)(j)+"\t")
          if (j == mulArr(i).length - 1) println()
      }

  }
}
