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

// Applying first refactoring: "Rename Class"
// Name of file changed from PersonClass.java -> Person.java
public class Person {
    // Apply Refactor 2: Change Signature. 
    // Someone's name is final, since it does not mutate.
  private final String name = "Bob";
  
  // As part of Refactor 3: move these variables
  // to the new class, as they are attributes
  // of a telephone number.
  private String officeAreaCode = "403";
  private String officeNumber = "2071307";

  public String getName() {
    return name;
  }
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
