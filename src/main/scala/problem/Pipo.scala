improt chisel3._
improt chisel3.util
{
 class Pipo extends Module{ 
 
 val io =IO(new Bundle{
   val r0 = RegInit(0.U(1.W))
   val r1 =RegInit(0.U(1.W)))
   val r2 =RegInit(0.U(1.W)))
   val r3 =RegInit(0.U(1.W)))
 
   val out -Output(UInt(4.w))
 })
  
    io.r1 := RegNext(io.r0)
    io.r2 := RegNext(io.r1)
    io.r3 := RegNext(io.r2) 
  

   io.out := Cat(io.r3,io.r2,io,r1, io.r0)
}

object Pipo  Extends App{
  
  chisel3.iotesters.execute(args , ()=> Pipo)	 
}



++++++++++++++++++++++++++++++++++++++
improt chisel3._
improt chisel3.util
import scala.util.Random 
import chisel3.iotesters(ChiselFlatSpec, Driver, PeekPokeTester)
 

 class PipoTester(c:Pipo) extends PeekPokeTester(c){
    for(i <- 0 to 50)
    {
       val in = Random.nextInt(2)
       poke(c.io.in ,in)
        step(1)
        except(c.io.out , in)
    }
 }


object PipoTester extends App{
	 chisel3.iotesters.execute(Array[String] , Driver(()=> Pipo))
	 {c=> new PipoTester(c)}
}
