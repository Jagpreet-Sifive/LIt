import chisel3._
import chisel3.util._



class OneHot extends Module{
 val io = IO(new Bundle{
    val in0 =Input(UInt(1.W))
    val in1 =Input(UInt(1.W))
    val in2 =Input(UInt(1.W))
    val in3 =Input(UInt(1.W))
    val q0 =Output(UInt(1.W))
   val q1 = Output(UInt(1.W))
  })
       
    io.q0 := io.in3|io.in1
    io.q1 := io.in3|io.in2
    
 

}

object OneHot extends App{

  chisel3.Driver.execute(args,()=>new OneHot)

}

 
