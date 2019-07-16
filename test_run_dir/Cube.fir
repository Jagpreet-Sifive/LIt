;buildInfoPackage: chisel3, version: 3.1.8, scalaVersion: 2.11.12, sbtVersion: 1.1.1, builtAtString: 2019-07-08 17:44:42.884, builtAtMillis: 1562607882884
circuit Cube : 
  module Cube : 
    input clock : Clock
    input reset : UInt<1>
    output io : {flip a : UInt<4>, out : UInt<4>}
    
    node _T_9 = mul(io.a, io.a) @[Cube.scala 15:18]
    node _T_10 = mul(_T_9, io.a) @[Cube.scala 15:23]
    io.out <= _T_10 @[Cube.scala 15:11]
    
