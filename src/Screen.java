/**
 * Author: Trevor Evans
 * Date: 03-Oct-18/n
 * Time: 4:59 PM/n
 * Description:
 */
public class Screen implements ScreenSpec {

    private String resolution;
    private int refreshrate;
    private int responsetime;

    //Complete the methods from the ScreenSpec interface.
    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshrate;
    }

    @Override
    public int getResponseTime() {
        return responsetime;
    }

    //A toString method that will return the details of the 3 field in the same format as the Product Class.
    public String toString(){
        return "Resolution: " + resolution +
                "\nRefresh Rate: " + refreshrate +
                "\nResponse Time: " + responsetime;
    }
}
