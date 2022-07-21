package Practical

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
import scala.util.control.Breaks._

/* 习题 */
object Test01 {
  def main(args: Array[String]): Unit = {
    /* 统计三个班级成绩情况，每个班有5名同学，求出每个班级的平均分和所有班级的平均分[学生的成绩从键盘输入] */
    // 创建可变数组,分别存储每个班级的分数
    val arrayBuffer1:ArrayBuffer[Int] = ArrayBuffer()
    val arrayBuffer2:ArrayBuffer[Int] = ArrayBuffer()
    val arrayBuffer3:ArrayBuffer[Int] = ArrayBuffer()
    breakable{
    while (true) {
      println("请输入所在的班级:   1 --> 1班,   2 --> 2班,  3 --> 3班,  4 --> 退出")
      val choiceNum = StdIn.readInt()
      if (choiceNum == 1){
        println("请输入成绩:")
        val oneClassScore = StdIn.readInt()
        arrayBuffer1.append(oneClassScore)
      }else if (choiceNum == 2){
        println("请输入成绩:")
        val twoClassScore = StdIn.readInt()
        arrayBuffer2.append(twoClassScore)
      }else if (choiceNum == 3){
        println("请输入成绩:")
        val threeClassScore = StdIn.readInt()
        arrayBuffer2.append(threeClassScore)
      } else{
        println("哇退出了!!")
        break()
      }
    }
    }
    // 求出每个班的平均分
    val oneAvgScore = arrayBuffer1.sum / arrayBuffer1.length
    val twoAvgScore = arrayBuffer2.sum / arrayBuffer2.length
    val threeAvgScore = arrayBuffer3.sum / arrayBuffer3.length
    // 所有班级的平均分
    val allAvgScore: Double = (oneAvgScore + twoAvgScore + threeAvgScore) / 3
    println(s"1班的平均成绩为:${oneAvgScore}")
    println(s"2班的平均成绩为:${twoAvgScore}")
    println(s"3班的平均成绩为:${threeAvgScore}")
    println(s"所有班的平均成绩为:${allAvgScore}")
  }
}
