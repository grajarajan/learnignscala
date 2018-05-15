import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCaluculator.cube.with.zero") {
    assert(CubeCalculator.cube(0) === 0)
  }

  test("CubeCaluculator.cube.with.positive") {
    assert(CubeCalculator.cube(3) === 27)
  }
}
