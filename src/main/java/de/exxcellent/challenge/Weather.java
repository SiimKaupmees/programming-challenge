package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Integer;

/**
 * @author Siim Kaupmees
 *
 */

public class Weather extends CSVReadable{
  int minSpreadDay;
  int minSpreadTemp;

  public Weather() {
    this.minSpreadDay = -1;
    this.minSpreadTemp = Integer.MAX_VALUE;
  }

  public Weather(String filename) {
    super(filename);
    this.minSpreadDay = -1;
    this.minSpreadTemp = Integer.MAX_VALUE;
  }
  
  public int determineMinSpread() {
    super.readCSV();
    return this.minSpreadDay;
  }

  public void parseLine(String line) {
    String[] split = line.split(",");
    int day = new Integer(split[0]);
    int maxTemp = new Integer(split[1]);
    int minTemp = new Integer(split[2]);
    this.determineIfBetterSpread(day, maxTemp, minTemp);

  }
  
  public void determineIfBetterSpread(int day, int maxTemp, int minTemp) {
    //throw error if day is not between 0 and 31 (day of month)
    if (31 < day || day < 0) {
      throw new IllegalArgumentException("Day is invalid value");
    }
    
    if (maxTemp - minTemp < minSpreadTemp) {
      this.minSpreadTemp = maxTemp - minTemp;
      this.minSpreadDay = day;
      
      //throw error if spread is negative
      if (this.minSpreadTemp < 0) {
        throw new IllegalArgumentException("MaxTemp is smaller than MinTemp:\tMaxtemp: "+ 
            maxTemp + " MinTemp: " + minTemp);
      }
    }
  }
}
