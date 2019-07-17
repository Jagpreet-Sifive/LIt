import chisel3._
import scala.util.Random

import chisel3.iotester.{PeekPokeTester, Driver, ChiselFlatSpec}
import chisel3.util.Cat

class OneHotTester(c:OneHo) extends PeekPokeTester(c){
  val Cycle =100
   for(i <- until Cycle){
   val in0= Random.nextInt(1)
   val in1 =Random.nextInt(3)
   val in2 =Random.nextInt(5)
   val int3 =Random.nextInt(9)
 
 
poke(c.io.in0,in0)    
poke(c.io.in1 ,in1)
poke(c.io.in2,in2)
poke(c.io.in3,in3)
step(1)
    
    
          
  expect(c.io.q0, in3|in1)
  expect(c.io.q1 ,in3|in2)
 
 object OneHotTester extends App {

  iotesters.Driver.execute(Array[String]("get-verilog"), OneHot()) {
    c => new OneHotTester(c)
      }
    }
   }
 }

 
