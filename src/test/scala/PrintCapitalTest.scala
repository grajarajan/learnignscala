import org.scalatest.FunSuite

class PrintCapitalTest extends FunSuite {
  test("PrintCapital.test.US") {
    assert(PrintCapital.getCapital("US").contains("Washington"))
  }

  test("PrintCapital.test.India") {
    assert(PrintCapital.getCapital("India").contains("Delhi"))
  }
}

