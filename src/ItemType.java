/**
 * Author(s): Trevor Evans
 * Date: 29-09-2018
 * Description: Global ENUM for project dictates media type of product for audioPlayer.
 */

import java.util.ArrayList;

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

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  //Handles abbreviations of ItemTypes.
  public String abbreviation;

  public String getAbbreviation() {
    return this.abbreviation;
  }

  ItemType(String abbreviation) {
    this.abbreviation = abbreviation;
  }
}

