package Practical

import scala.collection.mutable.ListBuffer

/* 习题 */
object Test05 {
  def main(args: Array[String]): Unit = {
    val student11_obj = studentTest11("xiaoming",20)
//    println(student11_obj)

    // 修改对象的值
    val student12_obj = studentTest11("xiaoming",20)
    student12_obj.age = 25
//    println(student12_obj)

    // toString 方法
    val student13_obj = studentTest11.apply("xiaoming",18)
//    println(student13_obj.toString)   // studentTest11(xiaoming,18)

    // == 和 equals 的用法    一会查看    #################################################
    val student14a_obj = studentTest11("xiaoming",18)
    val student14b_obj = studentTest11("xiaoming",18)
//    println(student14a_obj == student14b_obj)    // true
//    println(student14a_obj.equals(student14b_obj))  // true


    // 输出对象的 hashcode
    val student15a_obj = studentTest11("xiaoming",18)
    val student15b_obj = studentTest11("xiaoming",19)
    val student15c_obj = studentTest11("xiaoming",20)
//    println(student15a_obj.hashCode() + " " + student15b_obj.hashCode() + " " + student15c_obj.hashCode())

    // copy() 方法拷贝对象             ################################################
    // copy 是深拷贝,相当于 copy 对象的引用
    val student16_obj = studentTest11("xiaoming",18)
    val student16Copy_obj = student16_obj.copy()
//    println(student16_obj.hashCode())
//    println(student16Copy_obj.hashCode())

    // trait 特质
    // trait 动态混入
    val student17_obj = new studentTest12("xiaoming",Male) with Sex
    println(student17_obj)

    // match 匹配对象
    val listObj: ListBuffer[studentTest11] = ListBuffer()
    val student18a_obj = studentTest11("zhangsan",10)
    val student18b_obj = studentTest11("lisi",20)
    val student18c_obj = studentTest11("wangwu",30)
    listObj.append(student18a_obj)
    listObj.append(student18b_obj)
    listObj.append(student18c_obj)

    for (obj <- listObj){
      obj match {
        case studentTest11("zhangsan",10) => println("zhangsan")
        case studentTest11("lisi",20) => println("lisi")
        case studentTest11("wangwu",30) => println("wangwu")
        case _ => println("没有相应的对象，匹配失败!")
      }
    }

  }
}
//  创建样例对象
case object Male extends Sex{}
case object Female extends Sex{}

// 创建样例类
case class studentTest11(var name: String,var age: Int){}
case class studentTest12(var name: String,var sex: Sex){}

// 创建特质
trait Sex{}