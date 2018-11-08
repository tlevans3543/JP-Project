import java.util.Scanner;

/**
 * Author: Trevor Evans
 * Date: 08-Nov-18
 * Time: 11:26 AM
 * Description: WIP
 */
public class EmployeeInfo {

    Scanner in = new Scanner(System.in);

    public EmployeeInfo(){
        setName();
    }

    //The class will have 2 fields
    StringBuilder name;
    String code;

    //The class will have the following methods defined:
    //   public StringBuilder getName()
    public StringBuilder getName(){
        return this.name;
    }

    //   public String getCode()
    public String getCode(){
        return this.code;
    }

    //   private void setName()
    private void setName(){
        this.name.append(inputName());
        createEmployeeCode(this.name);
    }

    //   private void createEmployeeCode(StringBuilder name)
    private void createEmployeeCode(StringBuilder name){

        this.name = name;
        char initial = this.name.charAt(1);

        if(checkName(this.name)){
            this.code += initial;
            for(int i =0; i < this.name.length(); i++) {
                if(this.name.charAt(i) == '\n'){
                    this.code += this.name.charAt(i+1);
                }
            }
        }
        else{
            this.code += initial + "guest";
        }
    }

    //   private String inputName()
    private String inputName(){
        System.out.println("Please enter your first and last name: ");
        String nameIn = "";
        while(in.next() != "\n"){
            nameIn += in.next();
        }
        in.close();
        System.out.println(nameIn);
        return nameIn;
    }

    //   private boolean checkName(StringBuilder name)
    private boolean checkName(StringBuilder name){
        boolean valid = false;
        this.name = name;
        for(int i =0; i < this.name.length(); i++){
            if(this.name.charAt(i) == '\n'){
                valid = true;
            }
        }
        return valid;
    }

}
