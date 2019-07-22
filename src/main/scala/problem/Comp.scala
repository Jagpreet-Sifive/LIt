/* Compare two sign Integer using when & otherwise block */
/*a= 10, b = 32   ex => when(a>b){ output= a} .otherwise{ output = b}  */

import chisel3.util._
import chisel3._


class Compare extends Module{
 val io =IO(new Bundle{
 val in_a =Input(SInt(4.W))
 val in_b =Input(SInt(4.W))
 val out = Output(SInt(4.W))
})
  when(io.in_a>io.in_b){
    io.out := io.in_a
  }.otherwise{
      io.out := io.in_b
}

}
 object Compare extends App{
  chisel3.Driver.execute(args, ()=>new Compare)
}

