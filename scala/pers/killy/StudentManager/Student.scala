package pers.killy.StudentManager
/*
* 声明学生类
* */
class Student {
  // 定义学生信息
  var sid: Int = _
  var name: String = _
  var age: Int = _
  var gender: Char = _
  var phone: String = _


  def this(sid: Int,name: String,age: Int,gender: Char,phone: String) {
    /* 声明辅助构造器 */
    this      // 直接调用主构造器
    this.sid = sid
    this.name = name
    this.age = age
    this.gender = gender
    this.phone = phone

  }
}
