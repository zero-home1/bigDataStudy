// 1.用嵌套的方式定义包 (不常用)  嵌套方式的包对象
/*
用嵌套方式定义包优点:1.一个源文件中可以声明多个包.
                 2.内部包调用外部包的内容时,不需要导入外部的包.但是如果外部的包想要调用内部包的数据,则必须导包
*/
package com{
  object Outer{
    var comName: String = "我是外部包1111"
  }

  package killy{

    package hch{
      object Inner{
        def main(args: Array[String]): Unit = {
          println(Outer.comName)
          Outer.comName = "我是外部包2222"
          println(Outer.comName)
          shareValue1
        }
      }


    }
  }
}

// 包对象定义在包外面
package object com {
  val shareValue1 = ""
}

