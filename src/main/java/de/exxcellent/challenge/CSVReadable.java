/**
 * @author skaupmee
 *
 */
package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Siim Kaupmees
 *
 */
public abstract class CSVReadable {
  String filename;
  
  public CSVReadable() {
    
  }
  
  public CSVReadable(String filename) {
    this.filename = filename;
  }
  
  public void readCSV() {
    try {
      BufferedReader file = new BufferedReader(new FileReader(this.filename));
      //header line
      String line = file.readLine();
      try {
        while((line = file.readLine()) != null) {
          this.parseLine(line);
        }
      } catch (IOException e) {
        System.err.println("Error while reading file.");
        e.printStackTrace();
      } finally {
        file.close();
      }
    } catch (IOException e) {
      System.err.println("Error opening file, does the file exist?");
      e.printStackTrace();
    }
  }
  
  public abstract void parseLine(String line);
  
}
