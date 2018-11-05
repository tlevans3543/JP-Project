/**
 * Author(s): Trevor Evans
 * Date: 29-09-2018
 * Description: Global ENUM for project dictates media type of product for audioPlayer.
 */

/** All items will have a pre-set type. Currently there are 4 types. Create an enum called ItemType
 *  that will store the following information:
 //
 //  Type          :: Code
 //  Audio         :: AU
 //  Visual        :: VI
 //  AudioMobile   :: AM
 //  VisualMobile  :: VM
 */
public enum ItemType {

  AU("AUDIO"),
  VI("Visual"),
  AM("AUDIOMOBILE"),
  VM("VisualMobile");

  //Handles abbreviations of ItemTypes.
  //enum constant
  private final String code;


  /* Constructor is private by default
   *  Allows me to use strings in the parenthesis above
   */
  ItemType(String code) {
    this.code = code;
  }

  /* Overrides toString and allows the programmer to use the enum
   */
  @Override
  public String toString() {
    return code;
  }
}
