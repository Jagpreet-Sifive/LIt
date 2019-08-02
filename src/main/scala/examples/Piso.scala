/*Parallel in Serial Out Shift Register */

package examples

import chisel3._
import chisel3.util


class Piso extends Module{

 val io =IO(new Bundle{
   val in = Input(UInt(1.W))
   val enable  = Input(Bool())     // enable block which helps to update reg. value  change of mode (H to L) oR (L to H))
   val out =Output(UInt(1.W))
 })
/* all register's wil init. with 0 value */
   val r0 = RegInit(0.U(1.W))
   val r1 =RegInit(0.U(1.W))
   val r2 =RegInit(0.U(1.W))
   val r3 =RegInit(0.U(1.W))

  when(io.enable) 
  {
          r0 := io.in    
          r1 :=r0     // r0(output) assign to r1(input)
      r2 := r1     // r1(output) assign to r2(input)
      r3 := r2     // r2(output) assign to r3(input)
  }

   io.out := r3  
}




object Piso extends App{
chisel3.Driver.execute(args , ()=> new Piso)
}


