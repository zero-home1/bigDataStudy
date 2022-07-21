package Practical

import scala.collection.mutable.ListBuffer
import scala.collection.mutable

/* 更高的习题 */
object Test07 {
  def main(args: Array[String]): Unit = {
    val list26 = List(
      ("xiaoming1","男",18),
      ("xiaohua1","女",20),
      ("xiaomeng","男",18),
      ("xiaoli1","女",19),
      ("xiaoming2","男",22),
      ("xiaoli2","女",17),
      ("xiaoming4","男",28)
    )
    // 26.1 把每个人的年龄改为原来的3倍
    val list26_1 = list26.map(elem => (elem._1,elem._2,elem._3*3))
    println(list26_1)
    // 26.2 把每个人的年龄改成之前的2倍，之后再这个基础上进行减一
    val list26_2 = list26.map(elem => (elem._1,elem._2,elem._3*3-1))
    println(list26_2)
    // 26.3 年龄小于20的过滤掉  filter 将满足条件的保留
    val list26_3 = list26.filter(_._3 >= 20)
    println(list26_3)
    // 26.4 性别是女的过滤掉
    val list26_4 = list26.filter(_._2.equals("男"))
    println(list26_4)
    // 26.5 计算一下所有人的总年龄
    val ageList = list26.map(_._3)
    println(ageList.sum)

    // 26.7 请按照年龄从小到大排序
    println(ageList.sorted)
    // 26.8 请按照年龄从大到小排序
    println(ageList.sorted(Ordering[Int].reverse))
    // 26.9 把每个人的姓名性别年龄合成一个输出  打散 拼接 flatMap   elem -> 三元组
//    val oneInput = list26.map(elem => elem._1 + elem._2 + elem._3)
//    println(oneInput)
    println("-----------------------------------")
    val onePut = list26.map(elem => elem._1 + " " + elem._2 + " " + elem._3)
    val onePut1 = onePut.map(_.split(","))
    println(onePut1.flatten)

    // 26.10 把年龄为奇数和偶数的人分开  key 为返回结果
    val ageGroup = list26.groupBy( elem => if (elem._3 % 2 == 0) "偶数" else "奇数")
    println(ageGroup)



    // 27
    val list27 = List(1,2,3,4,5,6,7,8,9,10)
    // 27.1 reduce 计算list27所有数的和 和 乘积
    val resultSum = list27.reduce(_ + _)
    println(resultSum)
    val resultMul = list27.reduce(_ * _)
    println(resultMul)
    // 27.2 将list27中的数据进行翻转
    val list27Reverse = list27.reverse
    println(list27Reverse)

println("**********"*10)


    // 28
    val list28= ListBuffer(
      ("Tom","DataBase",80),
      ("Tom","Algorithm",50),
      ("Tom","DataStructure",60),
      ("Jim","DataBase",90),
      ("Jim","Algorithm",60),
      ("Jim","DataStructure",80))
//    （1）该系总共有多少学生；
    var count = 0
    for (elem <- list28){
      count += 1
    }
    println(count)
//    （2）该系共开设了多少门课程；
    val set1:mutable.Set[String]  = mutable.Set()
    for (elem <- list28){
      set1.add(elem._2)
    }
    println(set1.size)

//    （3）求每名同学的选修的课程门数；
    val mapNameCurse = mutable.Map[String,Int]()
    for (elem <- list28){
      val name = elem._1
      if  (mapNameCurse.contains(name)){
        // 如果存在已有的名字，则相应的 value + 1
        mapNameCurse(name) += 1
      }else{
        // 如果不存在，则创建
        mapNameCurse += (name -> 1)
      }
    }

//    （5）各门课程的平均分是多少；
    val groupCurse = list28.groupBy(_._2)
//    println(groupCurse)
    for (elem <- groupCurse){
      println(s"课程名字:" + elem._1,"课程总分:" + elem._2.map(_._3).sum,s"${elem._1}课程平均分:" +
        elem._2.map(_._3).sum / elem._2.size )
    }

  }
}
