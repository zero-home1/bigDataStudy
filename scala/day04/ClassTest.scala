package day04

import scala.beans.BeanProperty
import scala.io.StdIn

object ClassTest {
  def main(args: Array[String]): Unit = {
    // 声明时间类对象
    val timeObj = new Time(15,13)
    timeObj.before(16)
    // 声明学生类对象
    val stuObj = new Student1()
    println(stuObj.getName)
  }
}

// 1.编写一个 Time 类,加入只读属性 hours 和 minutes
//   和一个检查某时刻是否早于另一时刻的方法 before(Other:Time):Boolean
class Time(val hour:Int,val minutes:Int) {
  def before(Other: Int):Boolean = {
    if (Other >= hour) return false else true
  }
}

// 2.创建一个 Student 类,加入可读写的 javaBeans 属性 name 和 id.
//   你可以在Scala中调用javaBeans的getter 和 setter 方法吗？
class Student1 {
  @BeanProperty
  var name: String = _
  @BeanProperty
  var id: Int = _
}


