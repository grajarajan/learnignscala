import akka.actor.Actor

/** TODO : The calss is still fully understood. Need to know what is data and where it is coming from and the method defi
      * nition of GEtChecksum etc etc
  **/
class CheckSumActor extends Actor {
  var sum = 0
  def receive = {
    case Data(byte) => sum+=byte
    case GetCheckSum(requestor) =>
      val checksum = ~(sum * 0xFF) + 1
      requestor ! checksum
  }
}
