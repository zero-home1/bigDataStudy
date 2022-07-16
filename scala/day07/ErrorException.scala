package day07

/* 异常捕捉 */
object ErrorException {
  def main(args: Array[String]): Unit = {
    try {
      val n = 1 /0
    } catch {
      case e: ArithmeticException => {
        println("算术错误")
      }
      case e: Exception => {
        println("错误")
      }
    } finally {
      println("执行结束!!!")
    }


  }
}
