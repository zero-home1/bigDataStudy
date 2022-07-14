package day05

/* 特质的构造是有顺序的，从左到右依次构造,并且父类构造器不重复构造
构造器按如下顺序构造:
（1）超类
（2）父特质
（3）第一个特质
（4）第二个特质(父特质不重复构造)
（5）类
* */
object TraitMixin {
  def main(args: Array[String]): Unit = {
    val child1 = new Child()
  }
}

class TraitMixin {
  println("我是 class")
}


trait trait1 extends TraitMixin {
  println("我是 trait1")
}

trait trait2 extends TraitMixin {
  println("我是 trait2")
}

class Child extends TraitMixin with trait1 with trait2 {
  println("我是孩子")
}

