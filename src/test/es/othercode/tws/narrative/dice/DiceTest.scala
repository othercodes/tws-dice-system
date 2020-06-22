package es.othercode.tws.narrative.dice

import org.scalatest._
import flatspec._
import matchers._


final class DiceTest extends AnyFlatSpec with should.Matchers {
  "Dice" should "return a number between 0 and the face number" in {
    val dice = new Dice(10)
    for (n <- 0 to 100) {
      assert(dice.roll() <= 10 && dice.roll() >= 0)
    }
  }
}