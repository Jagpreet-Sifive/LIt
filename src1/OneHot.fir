;buildInfoPackage: chisel3, version: 3.1.8, scalaVersion: 2.11.12, sbtVersion: 1.1.1, builtAtString: 2019-07-08 17:44:42.884, builtAtMillis: 1562607882884
circuit OneHot : 
  module OneHot : 
    input clock : Clock
    input reset : UInt<1>
    output io : {flip in0 : UInt<4>, flip in1 : UInt<4>, flip in2 : UInt<4>, flip in3 : UInt<4>, q0 : UInt<2>, q1 : UInt<2>}
    
    node _T_17 = or(io.in3, io.in1) @[One_hot.scala 16:20]
    io.q0 <= _T_17 @[One_hot.scala 16:11]
    node _T_18 = or(io.in3, io.in2) @[One_hot.scala 17:20]
    io.q1 <= _T_18 @[One_hot.scala 17:11]
    
