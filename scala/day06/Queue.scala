package day06

import scala.collection.immutable.Queue
import scala.collection.mutable

/* 队列:先进先出 */
object Queue {

  def main(args: Array[String]): Unit = {
    // 1.创建可变队列
    val queue1: mutable.Queue[String] = new mutable.Queue[String]()
    // 入队
    queue1.enqueue("a","b","c")
    // 出队
    queue1.dequeue()

    // 2.创建不可变队列

  }
}
