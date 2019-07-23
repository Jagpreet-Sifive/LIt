import chisel3._
import chisel3.util._
import chisel3.iotesters.{ChiselFlatSpec, Driver, PeekPokeTester}


class OperaTester (c:Opera) extends PeekPokeTester(c){
 
   for (i <- 0 until 100) {

   val a_x =Random.nextInt(16)
   val b_x =Random.nextInt(16)
   val c_x =Random.nextInt(16)
 
	poke(c.io.a_x ,a_x)
	poke(c.io.b_x, b_x)
	poke(c.io.c_x, c_x)
 expect(c.io.out ,(a_x*c_x)/b_x)
}


}

object OperaTester extends App{

  iotesters.Driver.execute(Array[String]("get-verilog"),  Opera())
{ c=>new OperaTester(c)}

}

