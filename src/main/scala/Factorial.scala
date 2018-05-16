object Factorial {
  def getFactorial(i: Int): BigInt =
    if(i == 0) 1 else i * getFactorial(i-1)
}
