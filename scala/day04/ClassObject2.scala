package day04

// 构造器参数
/* Scala 类的主构造器函数的形参包括三种类型:未用任何修饰、var 修饰、val 修饰
  （1）未用任何修饰符修饰，这个参数就是一个局部变量，如果在构造器形参中不使用修饰符，则表示该参数只是一个局部变量，而不是类的属性。
  （2）var 修饰参数，作为类的成员属性使用，可以修改
  （3）val 修饰参数，作为类只读属性使用，不能修改   (不常用)
*/
object ClassObject2 {

  def main(args: Array[String]): Unit = {
    val stu1 = new Person1("hch",18)
    stu1.printInfo()
    val stu2 = new Person2("hch",18)
    stu2.printInfo()
    val stu3 = new Person3("hch",18)
    stu3.printInfo()
  }
}

// var 修饰参数
class Person1(var name: String,var age: Int){
  def printInfo(): Unit = {
    println(s"name:${name}--age:${age}")
  }
}

// val 修饰参数
class Person2(val name: String,val age: Int){
  def printInfo(): Unit = {
    println(s"name:${name}--age:${age}")
  }
}

// 未用任何修饰
class Person3(name: String,age: Int){
  def printInfo(): Unit = {
    println(s"name:${name}--age:${age}")
  }
}