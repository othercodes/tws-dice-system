package es.othercode.tws.narrative.dice

/**
 * Class Dice
 *
 * @param faces Int
 */
case class Dice(val faces: Int = 6) {

  require(faces >= 2, "Dice faces must be greater than 1.")

  /**
   * Return the dice sign i.e: d6 or d10
   *
   * @return String
   */
  def signature(): String = "d" + faces

  /**
   * Roll the dice!
   *
   * @return Int
   */
  def roll(): Int = scala.util.Random.nextInt(faces)

  /**
   * Return the string representation of the dice
   *
   * @return String
   */
  override def toString: String = signature()
}
