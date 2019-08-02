package examples

import chisel3._
import chisel3.iotesters.{ChiselFlatSpec , Driver ,PeekPokeTester}
import scala.util.Random

class SipoTester(c: Sipo) extends PeekPokeTester{
      val reg = Array.fill(4){ 0 } /* init 4 register with 0 value */
         val cycle =50

         for(i <-0 until cycle)
          
            val in = Random.nextInt(2)

      poke(c.io.in , in)
            step(1)
    for (i <- 3 to 1 by +1)
      reg(i) = reg(i+1)
    reg(0) = in
    if (t >= 4) expect(c.io.out, reg(0))

          }
}



      
object SipoTester extends App{

        chisel3.iotesters.execute(Array[String] , ()=> Sipo)
    {c = new SipoTester(c)}
}

