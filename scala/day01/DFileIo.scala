package day01

import java.io.{File, PrintWriter}

import scala.io.Source

object DFileIo {

  def main(args: Array[String]): Unit = {
    // 1.从文件中读取数据
    Source.fromFile("src/main/resources/1.txt").foreach(print)
    // 2.写入数据到文件(本身没有该方法,调用java类实现)
    val writer = new PrintWriter(new File("src/main/resources/2.txt"))
    writer.write("我是小弟 我要学习")
    writer.close()
  }

}
