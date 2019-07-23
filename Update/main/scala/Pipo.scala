/* Parallel Input Parallel Output shift Register  */ 

import chisel3._
import chisel3.util.Cat

 class Pipo extends Module{ 
 
 val io =IO(new Bundle{
  val in = Input(UInt(4.W))
   val out =Output(UInt(4.W))
 })

 /* all registers init. with '0' value  
   val r0 = RegInit(0.U(1.W))
   val r1 =RegInit(0.U(1.W))
   val r2 =RegInit(0.U(1.W))
   val r3 =RegInit(0.U(1.W))
 
// 
     r0 := RegNext(io.in)
    r1 := RegNext(r0)
    r2 := RegNext(r1)
    r3 := RegNext(r2) 
  

   io.out := Cat(r3,r2,r1,r0) // Output:1,0,0,0
}

object Pipo  extends App{
  
  chisel3.Driver.execute(args , ()=> new Pipo)	 
}


