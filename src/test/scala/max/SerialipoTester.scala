import chisel3._
import chisel3.util._
import chisel3.iotesters.{ChiselFlatSpec, Driver, PeekPokeTester}
  
class SerialipoTester (c:Serialipo) extends PeekPokeTester(c){
      for (i <- 0 until 9) {
          val in = Random.nextInt(1)
        }

      var  reg0 =0
      var reg1 =0
      var reg2 =0


   var temp =reg0
             reg0 =reg1
            reg1 =temp

       var temp2 =reg1
             reg1 =reg2
             reg2=temp2

      poke(c.io.in,reg0)
      poke(c.io.in,reg1)
      poke(c.io.in,reg2)


       step(1)

       expect(c.io.out , reg2)
  assert (Driver(()=> new Serialipo) {c => new SerialipoTester (c)}
}


      

object SerialipoTester extends App {

  iotesters.Driver.execute(Array[String]("get-verilog"), Serialipo()) {
    c => new Serialipo(c)
  }
}

