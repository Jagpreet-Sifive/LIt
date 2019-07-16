import chisel3._
import chisel3.util._



class Cube extends Module{

   val io =IO(new Bundle {
    val a =Input(UInt(4.W))
    val out =Output(UInt(4.W))

  })
    
   
   io.out := io.a*io.a*io.a
 
}

object Cube extends App {

 chisel3.Driver.execute(args, ()=>new Cube) 
   
  }


