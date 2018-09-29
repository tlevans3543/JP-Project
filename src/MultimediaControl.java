/**
 * Author(s): Trevor Evans
 * Date: 29-09-2018
 * Description: Interface "MultimediaControl", affects class AudioPlayer.
 */

/**
 * All of the items on this production line will have basic media controls. Create an interface called
 * MultimediaControl that will define the following methods.
 *  public void play();
 *  public void stop();
 *  public void previous();
 *  public void next();
 */
public interface MultimediaControl {

  void play();
  void stop();
  void previous();
  void next();

}
