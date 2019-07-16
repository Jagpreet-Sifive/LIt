
import chisel3._
import chisel3.util
import chisel3.util.Cat



class Serialipo extends Module{
    val io =IO(new Bundle{

    val in =Input(UInt(1.W))
    val out =Output(UInt(3.W))
   })

   val q0 = RegNext(io.in)
   val q1 =RegNext(q0)
   val q2 =RegNext(q1)
   
    io.out := (Cat(q2,q1,q0))

}
object Serialipo  extends App{
   chisel3.Driver.execute(args,()=> new Serialipo)
}


