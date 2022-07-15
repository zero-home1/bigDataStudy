package day06

object TupleCrud {

  def main(args: Array[String]): Unit = {
    // 1.定义元组
    val tuple1 = ("hello",1,true)
    println(tuple1)
    // 2.查询
    println(tuple1._1)
    // 3.遍历元组
//    for (elem <- tuple1.productIterator){
//      println(elem)
//    }
    // 4.元组嵌套元组
    val tuple2 = (1,2,("hello","scala"))

  }
}
