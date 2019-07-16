;buildInfoPackage: chisel3, version: 3.1.8, scalaVersion: 2.11.12, sbtVersion: 1.1.1, builtAtString: 2019-07-08 17:44:42.884, builtAtMillis: 1562607882884
circuit Serialipo : 
  module Serialipo : 
    input clock : Clock
    input reset : UInt<1>
    output io : {flip in : UInt<1>, out : UInt<3>}
    
    reg q0 : UInt, clock @[Serialipo.scala 15:20]
    q0 <= io.in @[Serialipo.scala 15:20]
    reg q1 : UInt, clock @[Serialipo.scala 16:19]
    q1 <= q0 @[Serialipo.scala 16:19]
    reg q2 : UInt, clock @[Serialipo.scala 17:19]
    q2 <= q1 @[Serialipo.scala 17:19]
    node _T_12 = cat(q2, q1) @[Cat.scala 30:58]
    node _T_13 = cat(_T_12, q0) @[Cat.scala 30:58]
    io.out <= _T_13 @[Serialipo.scala 19:12]
    
