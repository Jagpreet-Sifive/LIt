
import chisel3._
import chisel3.util._
import chisel3.iotesters.{ChiselFlatSpec, Driver, PeekPokeTester}


class ParallipoTester(c:Parallelipo) extends PeekPokeTester(c){
     for(i<- 0 to 10 ){
    val r0 =Random.nextInt()
    val r0 =Random.nextInt()
    val r2 =Random.nextInt()
   
   poke(c.io.q0,r0)
  poke(c.io.q1,r1)
  poke(c.io.q2,r2)
  
step(1)
 expect(c.io.out,r0,r1,r2)
}
 
object Parallipo extends App{
