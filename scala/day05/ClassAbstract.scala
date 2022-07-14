package day05

/*  抽象类
* 1. 如果父类为抽象类,那么子类需要将抽象的属性和方法全部实现，否则子类也需要声明为抽象类
* 2. 子类重写非抽象方法时需要用 override 修饰,重写抽象方法则可以不加override
* 3. 子类调用父类的方法使用super 关键字
* 4. 子类对抽象属性的实现，父类抽象属性可以用 var 修饰
*    子类对非抽象属性的重写,父类非抽象属性只支持 val 类型,而不支持 var
*   因为 var 修饰的为可变变量,子类继承之后就可以直接使用，没必要重写,要是定义为 var 可以直接修改，不需要重写.
* */
object ClassAbstract {

  def main(args: Array[String]): Unit = {
    val stu1 = new stuChile()
    println(stu1.name,stu1.age)
    stu1.eat()
    stu1.run()
  }
}

// 定义抽象类
abstract class PersonAbstract {
  // 定义非抽象属性
  val name: String = "hch"

  // 定义抽象属性
  val age: Int

  // 定义非抽象方法
  def eat(): Unit ={
    println("person eat")
  }

  // 定义抽象方法
  def run()

}

// 定义子类继承于抽象类
class stuChile extends PersonAbstract {
  override val name: String = "killy"
  // 重写父类的抽象属性 / 方法
  val age: Int = 18

  def run(): Unit = {
    println("我会跑")
  }

  override def eat(): Unit = {
    super.eat()
    println("我会吃")
  }
}