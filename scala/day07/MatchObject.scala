package day07

/* 模式匹配对象实例 */
// 判断对象实例的内容是否符合要求    例如 管理员属性


/* val stu = Student(name,age)  -- 自动调用 apply 方法
*  val Student(name,age) = stu  -- 自动调用 unapply 方法
* */

object MatchObject {
  def main(args: Array[String]): Unit = {

    val user = Admin("hch",18)

    // 针对对象内容实例进行匹配
//    val result = user match {
//        // 此时如果没有实现 unapply 方法, 相当于匹配对象引用,不符合 我们匹配内容的需求
//      case Admin("hch",18) => println("hch",18)
//      case _ => println("else obj")
//    }
//    println(result)
  }
}

class Admin private(name: String,age: Int){}
// 定义 admin 的伴生对象
object Admin {
  def apply(name: String,age: Int): Admin = new Admin(name,age)
  // unapply 接受一个对象，然后从对象中提取值
  // option 表示当无返回值 时 返回 None 有返回值 返回
//  def unapply(user: Admin): Option[(String, Int)] = {
//    if (user== null){
//      None
//    } else {
//      Some(user.name)
//      Some(user.age)
//    }
//  }
}
