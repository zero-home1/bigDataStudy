package day01

/*
   object: 关键字，声明一个单例对象(伴生对象,伴生类 )
* */
object AVariable {
  /*
  * main 方法: 从外部可以直接调用执行的方法
  * def 方法名称(参数名称: 参数类型): 返回值类型 = { 方法体 }
  * Unit
  * */
  def main(args: Array[String]): Unit = {
    // 能使用常量的地方尽量不使用变量
    var i: Int = 10
    val j: Int = 10
    // (1) 声明变量时，类型可以省略
    var a = 10
    // (2) 类型确定后，就不能修改，说明 scala 是强数据类型语言
    // a = "hello"  不能对确定的类型 进行修改

    val xiaohei = new Student("小黑", 18)
//    xiaohei.printInfo()
    // xiaohei = new Student("xiaobai",age = 20)   // 定义的小黑对象是常量,不能修改,但可以在声明属性的地方加入属性变量 var 即可进行 属性修改
    xiaohei.age = 20
//    xiaohei.printInfo()



    /* 标识符
    * (1) 以字母下划线开头,后面跟着字母数字下划线
    * (2) 以操作符开头,且只能包含操作符(+ - / * # !)
    * (3) 当引用关键字时,必须用 反引号 括起来
    * */
    val `def` = "xiaodada"
    println(`def`)

  }
}
