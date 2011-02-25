package com.twitter.addressbook

import org.specs.Specification
import com.twitter.admin._

class BirdNameServiceSpec extends Specification {
  System.setProperty("stage", "test")  
  val env = RuntimeEnvironment(this, Array())
  val impl = env.loadRuntimeConfig[BirdNameService]

  "BirdNameService" should {

    // TODO: Please implement

    "hello world" in {
      impl.hello.get mustEqual "world"
    }
  }
}