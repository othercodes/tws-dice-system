import es.othercode.tws.narrative.dice.Dice

object Main {
  def main(args: Array[String]): Unit = {

    val dice = new Dice(10)

    println("Rolling: " + dice.roll())
  }
}