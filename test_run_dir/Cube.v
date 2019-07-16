module Cube( // @[:@3.2]
  input        clock, // @[:@4.4]
  input        reset, // @[:@5.4]
  input  [3:0] io_a, // @[:@6.4]
  output [3:0] io_out // @[:@6.4]
);
  wire [7:0] _T_9; // @[Cube.scala 15:18:@8.4]
  wire [7:0] _GEN_0; // @[Cube.scala 15:23:@9.4]
  wire [11:0] _T_10; // @[Cube.scala 15:23:@9.4]
  assign _T_9 = io_a * io_a; // @[Cube.scala 15:18:@8.4]
  assign _GEN_0 = {{4'd0}, io_a}; // @[Cube.scala 15:23:@9.4]
  assign _T_10 = _T_9 * _GEN_0; // @[Cube.scala 15:23:@9.4]
  assign io_out = _T_10[3:0]; // @[Cube.scala 15:11:@10.4]
endmodule
