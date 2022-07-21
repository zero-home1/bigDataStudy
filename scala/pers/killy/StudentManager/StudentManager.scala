package pers.killy.StudentManager

import scala.collection.mutable.ListBuffer
import scala.io.StdIn
import scala.util.control.Breaks._

object StudentManager {
  def main(args: Array[String]): Unit = {
    // 声明对象,执行程序开始
    val stu_obj = new StudentManager
    stu_obj.start()

  }
}

/*
* 创建管理系统类
* */
class StudentManager {
  var listDate1: ListBuffer[Student] = ListBuffer()

  // 声明程序入口
  def start(): Unit = {
    breakable {
      while (true) {
        println("请输入选择的编号(1,2,3,4):")
        println("1.添加学生")
        println("2.删除学生")
        println("3.查询学生")
        println("4.修改学生信息")
        println("5.按任意键退出")
        val choice_num = StdIn.readInt()
        choice_num match {
          case 1 => addStudent()
          case 2 => deleteStudent()
          case 3 => searchStudent()
          case 4 => updateStudent()
          case _ => break()
        }
      }
    }
  }

  // 打印学生列表
  def printInfo(): Unit = {
    println(Console.RED + "学生列表")
    println("学号\t\t姓名\t\t年龄\t\t性别\t\t电话号\t\t")
    for (elem <- listDate1) {
      println(elem.sid + "\t\t" + elem.name + "\t\t" + elem.age + "\t\t" + elem.gender + "\t\t" + elem.phone)
    }
  }

  // 根据 ID 查找学生对应的下标
  def findIndex(uid: Int): Int = {
    val index = -1
    breakable {
      for (i <- listDate1.indices) {
        if (listDate1(i).sid == uid) {
          val index = i
          break()
        }
      }
    }
    index
  }

  // 添加学生信息
  def addStudent(): Unit = {
    println(Console.YELLOW + "#" * 20 + "添加学生" + "#" * 20)
    println("请输入学生ID:")
    val sid = StdIn.readInt()
    println("请输入学生姓名")
    val name = StdIn.readLine()
    println("请输入学生年龄:")
    val age = StdIn.readInt()
    println("请输入学生性别:")
    val gender = StdIn.readChar()
    println("请输入学生电话号:")
    val phone = StdIn.readLine()
    val newStudent = new Student(sid, name, age, gender, phone)
    listDate1.append(newStudent)
    printInfo()
    println(Console.BLUE + "学生添加成功")
  }

  // 删除学生信息
  def deleteStudent(): Unit = {
    println(Console.RED + "#" * 20 + "删除学生" + "#" * 20)
    println("请输入删除学生的ID:")
    val delete_id = StdIn.readInt()
    for (person <- listDate1) {
      if (person.sid == delete_id) {
        listDate1 -= person
        printInfo()
      } else {
        println("未找到该学生,无法删除")
      }
    }
  }

  // 查询学生信息
  def searchStudent(): Unit = {
    println(Console.BLUE + "#" * 20 + "查询学生信息" + "#" * 20)
    println("请输入查询学生的ID:")
    val search_id = StdIn.readInt()
    for (person <- listDate1) {
      if (person.sid == search_id) {
        println(s"学号:${person.sid} - 姓名:${person.name} - 性别:${person.gender} " +
          s"- 年龄:${person.age} - 电话号码:${person.phone} ")
      } else {
        println("未查询到该学生的信息!")
      }
    }
  }

  // 修改学生信息
  def updateStudent(): Unit = {
    println(Console.RED + "#" * 20 + "修改学生信息" + "#" * 20)
    println("请输入修改学生的ID:")
    val update_id = StdIn.readInt()
    breakable{
    for (elem <- listDate1) {
//      println("表中学生的id:" + elem.sid)
      if (update_id == elem.sid) {
//        println("修改学生的id:" + update_id)
        println(Console.RED + "请依次输入新的用户信息:")
        println("姓名:")
        val uname = StdIn.readLine()
        println("年龄:")
        val uage = StdIn.readInt()
        println("性别:")
        val ugender = StdIn.readChar()
        println("电话号:")
        val uphone = StdIn.readLine()
        elem.sid = update_id
        elem.name = uname
        elem.age = uage
        elem.gender = ugender
        elem.phone = uphone
        println("修改后的学生信息:"+elem.sid + "\t\t" + elem.name + "\t\t" +
          elem.age + "\t\t" + elem.gender + "\t\t" + elem.phone)
        break()
      }else{
        println("学生不存在,无法修改!")
      }


    }
    }

  }
}

