package test.se.gigurra.sandbox

import org.junit.Test

class test_return {

  /*
    // Does not compile
    val f: String => Boolean = {
      return true
    }
  */
  @Test
  def test(): Unit = {

    val items = List("a", "c")

    def lambda_return(): Boolean = {
      items.exists { item =>
        if (item == "c") {
          return true
        } else {
          return false
        }
      }
    }

    assert(!lambda_return())

    def lambda_result(): Boolean = {
      items.exists { item =>
        if (item == "c") {
          true
        } else {
          false
        }
      }
    }
    assert(lambda_result())

  }
}
