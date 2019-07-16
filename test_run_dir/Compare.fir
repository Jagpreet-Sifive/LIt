;buildInfoPackage: chisel3, version: 3.1.8, scalaVersion: 2.11.12, sbtVersion: 1.1.1, builtAtString: 2019-07-08 17:44:42.884, builtAtMillis: 1562607882884
circuit Compare : 
  module Compare : 
    input clock : Clock
    input reset : UInt<1>
    output io : {flip in_a : SInt<4>, flip in_b : SInt<4>, out : SInt<4>}
    
    node _T_11 = gt(io.in_a, io.in_b) @[Comp.scala 11:15]
    when _T_11 : @[Comp.scala 11:24]
      io.out <= io.in_a @[Comp.scala 12:12]
      skip @[Comp.scala 11:24]
    else : @[Comp.scala 13:14]
      io.out <= io.in_b @[Comp.scala 14:14]
      skip @[Comp.scala 13:14]
    
