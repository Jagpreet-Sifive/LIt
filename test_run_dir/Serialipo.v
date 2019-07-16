module Serialipo( // @[:@3.2]
  input        clock, // @[:@4.4]
  input        reset, // @[:@5.4]
  input        io_in, // @[:@6.4]
  output [2:0] io_out // @[:@6.4]
);
  reg  q0; // @[Serialipo.scala 15:20:@8.4]
  reg [31:0] _RAND_0;
  reg  q1; // @[Serialipo.scala 16:19:@10.4]
  reg [31:0] _RAND_1;
  reg  q2; // @[Serialipo.scala 17:19:@12.4]
  reg [31:0] _RAND_2;
  wire [1:0] _T_12; // @[Cat.scala 30:58:@14.4]
  assign _T_12 = {q2,q1}; // @[Cat.scala 30:58:@14.4]
  assign io_out = {_T_12,q0}; // @[Serialipo.scala 19:12:@16.4]
`ifdef RANDOMIZE_GARBAGE_ASSIGN
`define RANDOMIZE
`endif
`ifdef RANDOMIZE_INVALID_ASSIGN
`define RANDOMIZE
`endif
`ifdef RANDOMIZE_REG_INIT
`define RANDOMIZE
`endif
`ifdef RANDOMIZE_MEM_INIT
`define RANDOMIZE
`endif
`ifndef RANDOM
`define RANDOM $random
`endif
`ifdef RANDOMIZE
  integer initvar;
  initial begin
    `ifdef INIT_RANDOM
      `INIT_RANDOM
    `endif
    `ifndef VERILATOR
      #0.002 begin end
    `endif
  `ifdef RANDOMIZE_REG_INIT
  _RAND_0 = {1{`RANDOM}};
  q0 = _RAND_0[0:0];
  `endif // RANDOMIZE_REG_INIT
  `ifdef RANDOMIZE_REG_INIT
  _RAND_1 = {1{`RANDOM}};
  q1 = _RAND_1[0:0];
  `endif // RANDOMIZE_REG_INIT
  `ifdef RANDOMIZE_REG_INIT
  _RAND_2 = {1{`RANDOM}};
  q2 = _RAND_2[0:0];
  `endif // RANDOMIZE_REG_INIT
  end
`endif // RANDOMIZE
  always @(posedge clock) begin
    q0 <= io_in;
    q1 <= q0;
    q2 <= q1;
  end
endmodule
