package com.twitter.birdname

import org.specs.Specification
import com.twitter.admin._

class BirdNameServiceSpec extends Specification {
  // If you do multiple integration tests, you might want to factor this 
  // into a superclass.
  val env = RuntimeEnvironment(this, Array("-f", "config/test.scala"))
  val impl = env.loadRuntimeConfig[BirdNameService]
  
  // You don't really want the thrift server active, particularly if you
  // are running repetitively via ~test
  ServiceTracker.shutdown // all services

  "BirdNameService" should {

    // TODO: Please implement your own tests

    "hello world" in {
      impl.hello.get() mustEqual "world"
    }
  }
}