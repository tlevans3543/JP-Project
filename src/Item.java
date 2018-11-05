/**
 * Author(s): Trevor Evans
 * Date: 29-09-2018
 * Description: Interface "Item", technically a masterclass that affects all other classes in project.
 */

import java.util.Date;

/** An interface called Item that will force all classes to implement the following functions. */
public interface Item {

  //  A constant called manufacturer that would be set to “OracleProduction”.
  String manufacturer = "OracleProduction";

  //  A method setProductionNumber that would have one integer parameter
  void setProductionNumber(int productionNumber);

  //  A method setName that would have one String parameter
  void setName(String itemName);

  //  A method getName that would return a String
  String getName();

  //  A method getManufactureDate that would return a Date
  Date getManufactureDate();

  //  A method getSerialNumber that would return an int
  int getSerialNumber();

}