package day07

/* 模式匹配对象实例 */
// 判断对象实例的内容是否符合要求    例如 管理员属性
object MatchObject {
  def main(args: Array[String]): Unit = {

    // 通过伴生对象声明 user 对象实例
    val user = Admin("hch",18)

    // 针对对象内容实例进行匹配
    val result = user match {
        // 此时如果没有实现 unapply 方法, 相当于匹配对象引用,不符合 我们匹配内容的需求
      case Admin("hch",18) => println("hch",18)
      case _ => println("else obj")
    }
    println(result)
  }
}

class Admin private(name: String,age: Int){}
// 定义 admin 的伴生对象
object Admin {
  def apply(name: String,age: Int): Admin = new Admin(name,age)

  def unapply(user: Admin): Option[(String, Int)] = {
    if (user== null){
      None
    } else {
      Some((user.name,user.age))
    }
  }
}
