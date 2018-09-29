/**
 * Author(s): Trevor Evans
 * Date: 29-09-2018
 * Description: Type superclass extended by class AudioPlayer, creates and prints information of type "Product".
 */

import java.util.Date;

/** An abstract type called Product that will implement the Item interface. Product will implement
    the basic functionality that all items on a production line should have. */
public class Product implements Item{

  private int serialNumber;
  private String manufacturer = Item.manufacturer;
  private Date manufacturedOn;
  private String name;

  // An integer class variable called currentProductionNumber. This will store the next number to be
  //  assigned to serialNumber.
  private int currentProductionNumber = 1;

  //Complete the methods from the interface Item.
  public void setProductionNumber(int productionNumber){
    currentProductionNumber = productionNumber;
  }

  public void setName(String itemName){
    name = itemName;
  }

  public String getName(){
    return name;
  }

  public Date getManufactureDate(){
    return new Date();
  }

  public int getSerialNumber(){
    return serialNumber;
  }

  //Default Constructor
  public Product(){
  }

  /**
   * Add a constructor that will take in the name of the product and set this to the field variable name. You
   * will also assign a serial number from the currentProductionNumber. The currentProductionNumber
   * should be incremented in readiness for the next instance.
   * Set manufacturedOn as the current date and time.
   */
  public Product(String nameIn) {
    name = nameIn;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = getManufactureDate();
  }

  /**
   *  A toString method that will return the following: (example data shown).
   * Manufacturer   : OracleProduction
   * Serial Number  : 1
   * Date           : Thu May 14 15:18:43 BST 2015
   * Name           : Product Name
   */
  public String toString(){
    return "Manufacturer   : " + manufacturer +
           "\nSerial Number  : " + serialNumber +
           "\nDate           : " + manufacturedOn +
           "\nName           : " + name;
  }

}
