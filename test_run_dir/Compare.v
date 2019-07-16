module Compare( // @[:@3.2]
  input        clock, // @[:@4.4]
  input        reset, // @[:@5.4]
  input  [3:0] io_in_a, // @[:@6.4]
  input  [3:0] io_in_b, // @[:@6.4]
  output [3:0] io_out // @[:@6.4]
);
  wire  _T_11; // @[Comp.scala 11:15:@8.4]
  assign _T_11 = $signed(io_in_a) > $signed(io_in_b); // @[Comp.scala 11:15:@8.4]
  assign io_out = _T_11 ? $signed(io_in_a) : $signed(io_in_b); // @[Comp.scala 12:12:@10.6 Comp.scala 14:14:@13.6]
endmodule
