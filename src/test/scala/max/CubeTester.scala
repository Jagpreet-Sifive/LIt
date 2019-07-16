package max
import chisel3._
import chisel3.util._
import chisel3.iotesters.{ChiselFlatSpec, Driver, PeekPokeTester}
import scala.util.Random


class CubeTester(c:Cube) extends PeekPokeTester(c){
  for(i <-0 to 10){
  val a =Random.nextInt(3)
 
 
 

 poke(c.io.a ,a)

	step(1)

expect(c.io.out ,(a*a*a))

assert(Driver(() => new Cube) {c => new CubeTester(c)})
// aprintln(getVeirlog(new Pip)



object CubeTester exteands App {
  
  iotesters.Driver.execute(Array[String]("get-verilog"), Cube()) {
    c => new CubeTester(c)
  }
}

}
}




