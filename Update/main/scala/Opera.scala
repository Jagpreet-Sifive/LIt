import chisel3.util._
import chisel3._


class Opera extends Module{
  val io =IO(new Bundle{
  val a_x = Input(UInt(4.W))
  val b_x = Input(UInt(4.W))
  val c_x = Input(UInt(4.W))
  val out =Output(UInt(4.W))
  })
   io.out := (io.a_x *io.c_x)/io.b_x
}

object Opera extends App{
  chisel3.Driver.execute(args , ()=>new  Opera)
}



