package com.jpreddy.scala

import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ScalaCookBookStringsDriver extends App{

val logger = LoggerFactory.getLogger("com.jpreddy.scala");

logger.debug("ScalaCookBookDriver starting")

val s1="Hello"
val s2= new String("Hello")
println(s1==s2)
println(s1 == null)

logger.debug("ScalaCookBookDriver starting")

}