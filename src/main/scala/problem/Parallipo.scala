import chisel3._

import chisel3.util.Cat


class Parallipo extends Module{

  val io =IO(new Bundle {
     val q0 =Input(UInt(4.W))
     val q1  =Input(UInt(4.W))
     val q2  =Input(UInt(4.W))

   val out=Output(UInt(4.W))
})

       val r0 =RegInit(0.U(io.q0))
       val r1 =RegInit(1.U(io.q1))
       val r2 =RegInit(0.U(io.q2))
      io.out := (Cat(r1,r2,r0))
}
 object Parallipo extends App{
  chisel3.Driver.execute(args, ()=>new Parallip)

