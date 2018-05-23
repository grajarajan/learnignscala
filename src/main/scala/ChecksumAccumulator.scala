import scala.collection.mutable

class ChecksumAccumulator {

  private var sum = 0

  def add(b: Byte) = sum += b

  def checksum() = ~(sum & 0xFF) + 1

  // companion object. If a method has same name as a class then it is called companion method
  object ChecksumAccumulator {
    private val cache = mutable.Map.empty[String, Int]


    def calculate(s: String): Int =
      if (cache.contains(s))
        cache(s)
      else {
        val acc = new ChecksumAccumulator
        for (c <- s) {   // for each character in the string
          println(s"Character : $c")
          acc.add(c.toByte)
        }
        val cs = acc.checksum()
        cache += (s -> cs)   // add key as s and value as cs to cache map
        cs  // return checksum
      }
  }
}
