
/* Serial in parallel out data shift register ( only Right Shifting) */ 


import chisel3.
import chisel3.util._

class Sipo extends Module {
 
 val io =IO(new Bundle{
   vai in = Input(Uint())
   val enable  = Input(Bool())
   val out -Output(Uint(4.w))
 })
   val r0 = RegInit(0.U())
   val r1 =RegInit(0.U()))
   val r2 =RegInit(0.U()))
   val r3 =RegInit(0.U()))

  when(io.enable)
  {
  	  r0 := io.in
  	  r1 :=r0
      r2 := r1 
      r3 := r2 
  }
	 

}

Sipo extends  App{
  chisel3.Driver.execute(args , ()=> Sipo)

}



++++++++++++++++++++++++++++++++++++++++++++++

improt chisel3._
import scala.util
import chisel3.iotesters.(ChiselFlatSpec , Driver ,PeekPokeTester)


class SipoTester(c: Sipo) extends PeekPokeTester{
	 
	 val cycle = 100
  
     val in_a = Random.nextInt(1)

    poke(c.io.in_a, a)

    step(1)

    expect(c.io.out , a)
 }