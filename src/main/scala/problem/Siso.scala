import chisle3._
import chisel3.util 

class Siso extends Module{
	 in io =IO(new Bundle{


	 })
}

object Siso extends App{
	  
	  chisel3.Driver.expect(args, ()=>Siso)

}


+++++++++++++++++++++++++++++++++++++

import chisel3.
import chisel3.iostesters.(ChiselFlatSpec ,Driver ,PeekPokeTester)
improt scala.util.Random

class SisoTester(c:Siso) extends PeekPokeTester{
	 val cycle =100

	 for(i <-0 until cycle)
	  {
	    val in = Random.nextInt(2)
 
      poke(c.io.in , in)
	    step(1)
       
        expect(c.io.out ,in)
	  }
}


object SisoTester extends App{
	
	chisel3.iotesters.execute(Array[String] , ()=> Siso)
    {c = new SisoTester(c)}
}