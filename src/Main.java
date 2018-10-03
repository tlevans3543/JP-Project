/**
 * Author: Trevor Evans
 * Date: 03-Oct-18/n
 * Time: 4:27 PM/n
 * Description:
 */
public class Main {

    public static void main(String[] args){

        AudioPlayer myPlayer = new AudioPlayer("Evan's Player","AUDIO");

        System.out.println(myPlayer.mediaType);

        myPlayer.play();

        myPlayer.next();

        myPlayer.previous();

        myPlayer.stop();

        Screen myScreen = new Screen();

        System.out.println(myScreen.toString());



    }

}
