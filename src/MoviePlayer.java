/**
 * Author: Trevor Evans
 * Date: 03-Oct-18/n
 * Time: 5:03 PM/n
 * Description:
 */

//a class called MoviePlayer that extends Product and implements MultimediaControl.
public class MoviePlayer extends Product implements MultimediaControl {

    //Add 2 fields to this class called screen and monitor type and assign appropriate types to them
    Screen screen;
    MonitorType monitorType;

    //Complete the methods from the MultimediaControl interface in a similar fashion to the audio player.
    @Override
    public void play() {
        System.out.println("Playing.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping.");
    }

    @Override
    public void previous() {
        System.out.println("Previous.");
    }

    @Override
    public void next() {
        System.out.println("Next.");
    }

    //Create a toString method that calls the product toString, displays the monitor and the screen details.
    public String toString(){
        return super.toString() + screen + monitorType;
    }
}
