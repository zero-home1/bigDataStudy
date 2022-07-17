// 个人项目包的命名规范 me.个人名.项目名.模块名
package object day04 {
  /*
  包对象: 必须是位于同一个包下的才可以调用
  在 Scala 中可以为每个包定义一个同名的包对象，定义在包对象中的成员，作为其对应包下所有 class 和 object 的共享变量，可以被直接访问。
  包对象主要用于将常量、工具函数封装,使用时直接通过包名引用
  */
  val shareValue = "itheima"
  val  PT = 3.14159

  def shareMethod(): Unit = {}
}