package examples

import scala.util.Random

import chisel3._
import chisel3.util._
import chisel3.iotesters.{ChiselFlatSpec, Driver, PeekPokeTester}


class CompareTester(c:Compare) extends PeekPokeTester(c){
   for (i<- 0 until 10){
     val a =Random.nextInt(7)
     val b =Random.nextInt(7)
     
 poke(c.io.in_a ,a)
 poke(c.io.in_b,b)
  step(1)
  
expect(c.io.out, if(a>b) a  else b)


assert(Driver(() => new Compare) {c => new CompareTester(c)})




object CompareTester exteands App {

  iotesters.Driver.execute(Array[String]("get-verilog"), Compare()) {
    c => new CompareTester(c)
   }
  }
 }
}

