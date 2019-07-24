/* Serial in parallel out data shift register  */ 


import chisel3._
import chisel3.util.Cat


class Sipo extends Module {

val io =IO(new Bundle{ 
    val in = Input(UInt(1.W))

    val out =Output(UInt(1.W))
}) 
    val r0 = RegInit(0.U(1.W)) 
    val r1 =RegInit(0.U(1.W))
    val r2 =RegInit(0.U(1.W)) 
    val r3 =RegInit(0.U(1.W))
    /* RegNext is used to update clock during shift value from rn to rn-1 0 */
    r0 := RegNext(io.in)   // every time clock edge will change high to low or low to high
    r1 := RegNext(r0) 
    r2 := RegNext(r1)
    r3 := RegNext(r2)

io.out :=Cat(r3 ,r2,r1,r0)   // parallel output:1,0,0,0 Like 

}


object  Sipo extends  App{
  chisel3.Driver.execute(args , ()=>new Sipo)

}



