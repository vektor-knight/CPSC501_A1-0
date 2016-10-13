/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc501_a1.pkg0;

/**
 *
 * @author Sartaj Hundal
 */

// Applying first refactoring: "Rename Class"
// Name of file changed from PersonClass.java -> Person.java
public class Person {
    // Apply Refactor 2: Change Signature. 
    // Someone's name is final, since it does not mutate.
  private final String name = "Bob";

  public String getName() {
    return name;
  }
}