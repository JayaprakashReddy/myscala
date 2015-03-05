package com.jpreddy.scala

import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ScalaCookBookStringsDriver extends App{

val logger = LoggerFactory.getLogger("com.jpreddy.scala");

logger.debug("ScalaCookBookDriver starting")
//In Scala, the == method defined in the AnyRef class first checks for null values, 
//and then calls the equals method on the first object (i.e., this) to see if the two objects are equal. 
val s1="Hello"
val s2= new String("Hello")
println(s1==s2)
println(s1 == null)



logger.debug("ScalaCookBookDriver starting")

}