/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc501_a1.pkg0;

/**
 *
 * @author shshunda
 */
public class TelephoneNumber {
    
    // Refactor 4: "Move Field" applied following
    // Refactor 3. In this case, the attribute "name"
    // should remain in the Person class, so moving
    // attributes corresponding to TelephoneNumber
    // constitures a new refactoring.
    private String officeAreaCode = "403";
    private String officeNumber = "2071307";
    
    // Refactor 5: Mutators and accessors moved from Person.java ("Move Method")
    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") " + officeNumber);
    }
    public String getOfficeAreaCode() {
        return officeAreaCode;
    }
    public void setOfficeAreaCode(String arg) {
        officeAreaCode = arg;
    }
    public String getOfficeNumber() {
        return officeNumber;
    }
    public void setOfficeNumber(String arg) {
        officeNumber = arg;
    }
    
}
