import chisel3._
improt chisel3.util

class Piso extends Module{
	 val io =IO(new Bundle{
	   val in= Input(UInt(4.W))
	   val out =Output(UInt(4.W))
	 })

}

object Piso extends App{
chisel3.Driver.execute(args , ()=>Piso)
}


+++++++++++++++++++++++++++++++

improt chisle3._
import chisel3.iotesters.{ ChiselFlatSpec,  Driver, PeekPokeTester}
import scala.util.Random


class PisoTester(c: Piso) extends PeekPokeTester(c){
	  
	  val cycle = 100
    for( i <- 0 to cycle){

        val in  =Random.nextInt(1)

        poke(c.io.in ,in )
         step(2) 
         expect(c.io.out ,in)

    }
}

object PisoTester extends App{
	 chisel3.iotesters.execute(Array[String] ,Driver(()=> Piso))
	  {c => new PisoTester(c)}


}
