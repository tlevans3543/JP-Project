/**
 * Author(s): Trevor Evans
 * Date: 29-09-2018
 * Description: Type subclass of class Product, allows creation of object Product during creation of object
 * AudioPlayer through calling superclass.
 */

/**
 * We require a concrete class that will allow us to capture the details of an audio player. Create a class
 * called AudioPlayer that is a subclass of Product and implements the MultimediaControl interface
 * The class will have 2 fields
 *  String audioSpecification
 *  ItemType mediaType
 */
public class AudioPlayer extends Product implements MultimediaControl{

  String audioSpecification;
  ItemType mediaType;

  //Default Constructor
  public AudioPlayer(){
  }

  //A constructor that will take in 2 parameters – name and audioSpecification.
  //The constructor should call its parents constructor and also setup the media type.
  public AudioPlayer(String name, String audioSpecification){
    super(name);
    this.audioSpecification = audioSpecification;
  }

  /**
   * Implement the methods from the MultimediaControl interface by simply writing the action to the console.
   * E.g. in play System.out.println("Playing"); Normally we would have code that would instruct the media
   * player to play, but we will simply display a message.
   */
  public void play() {
    System.out.print("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  /**
   * Create a toString method that will display the superclasses toString method, but also add rows for Audio
   * Spec and Type.
   */
  public String toString(){
    return super.toString() +
        "\nAudio Spec     : " + audioSpecification +
        "\nMedia Type     : " + mediaType;
  }

}
