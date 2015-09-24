package scalatest
import org.scalatest.FunSuite
import com.main.scala.HelloSBTScala
class TestHelloSBTScala extends FunSuite {
  
  var obj = new HelloSBTScala("check")
  test("Very Basic : Check of equality 1==1") {
    assert(1 == 1)
  }
  test("Another Very Basic : Check of equality HelloWorld") {
    assert("Hello World" == "Hello World")
  }
  test("test case"){assert( obj.hello() == "Hello check")}
  
  println("hello")
    println("world")
    println("hello")
    println("world")
    println("hello")
}
