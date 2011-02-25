package com.twitter.birdname

import org.specs.Specification
import com.twitter.admin._

class BirdNameServiceSpec extends Specification {
  val env = RuntimeEnvironment(this, Array("-f", "config/test.scala"))
  val impl = env.loadRuntimeConfig[BirdNameService]
  ServiceTracker.shutdown

  "BirdNameService" should {

    // TODO: Please implement

    "hello world" in {
      impl.hello.get() mustEqual "world"
    }
  }
}