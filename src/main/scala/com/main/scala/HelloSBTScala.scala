package com.main.scala
class HelloSBTScala(val name:String){
  def hello() : String = "Hello "+name
}
object HelloSBTScala {
  def main(args: Array[String]): Unit = {
    val obj = new HelloSBTScala("World")
    println(obj.hello())
  }
}
