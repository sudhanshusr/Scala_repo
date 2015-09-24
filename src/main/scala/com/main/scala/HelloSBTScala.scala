package com.main.scala

//import scala.xml.Null
class HelloSBTScala(val name:String){
  
  def hello() : String = "Hello "+name
  def add(a:Int, b:Int) : Int = a+b
  def addz(a:Int, b:Int) : Int = a+b
  def test1()={
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    }
  
  def test2()={
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    println("hello")
    }
  
}
class HelloSBTScalabug(val name:String){}


object HelloSBTScala {
  def main(args: Array[String]): Unit = {
    val obj = new HelloSBTScala("World")
    
    println(obj.hello())
    println("hello")
    println("world")
    println("hello")
    println("world")
    println("hello")
  }
}
