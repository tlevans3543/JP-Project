/**
 * Author: Trevor Evans
 * Date: 03-Oct-18/n
 * Time: 4:27 PM/n
 * Description:
 */
public class Main {

    public static void main(String[] args){

        AudioPlayer myPlayer = new AudioPlayer("Evan's Player","MP3");
        MoviePlayer myMovie = new MoviePlayer("Evan's Movie", new Screen(), MonitorType.LCD);

        myMovie.screen.refreshrate = 60;
        myMovie.screen.resolution = "1920x1080";
        myMovie.screen.responsetime = 5;

        System.out.println(myMovie.toString());

        System.out.println();
        System.out.println(myPlayer.toString());

    }

}
