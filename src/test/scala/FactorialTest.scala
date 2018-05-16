import org.scalatest.FunSuite

class FactorialTest extends FunSuite{
  test("FactorialTest.30") {
    assertResult(BigInt("265252859812191058636308480000000"))(Factorial.getFactorial(30))
  }
  test("FactorialTest.0") {
    assertResult(1)(Factorial.getFactorial(0))
  }
  test("FactorialTest.1") {
    assertResult(1)(Factorial.getFactorial(0))
  }
  test("FactorialTest.2") {
    assertResult(2)(Factorial.getFactorial(2))
  }
  test("FactorialTest.3") {
    assertResult(6)(Factorial.getFactorial(3))
  }
}
