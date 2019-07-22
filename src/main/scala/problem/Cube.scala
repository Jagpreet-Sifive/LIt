/* Calculate  LSA = Lateral Surface Area of a Cube, SA = Surface Area  And Volume */ \
/* LSA= 6*a*a ; SA = 4*a*a ; Volume = a*a*a */ 


import chisel3._
import chisel3.util._



class Cube extends Module{

   val io =IO(new Bundle {
    val in_a =Input(UInt(4.W))
    val LSA =Outtput(UInt(8.W))
    val SA =Output(UInt(12.W))
    val Volume = Output(UInt(8.W))

  })
    
   
   io.LAS := 4*(in_a*in_a)
   io.SA := 6*(in_a*in_a)
   io.Volume := (in_a*in_a*in_a)

 
}

object Cube extends App {

 chisel3.Driver.execute(args, ()=>new Cube) 
   
  }


