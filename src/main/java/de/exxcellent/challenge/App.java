package de.exxcellent.challenge;

import java.io.IOException;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

  /**
   * This is the main entry method of your program.
   * @param args The CLI arguments passed
   * @throws IOException 
   */
  public static void main(String... args) throws IOException {

    // Your preparation code …
    Weather w = new Weather("./src/main/resources/de/exxcellent/challenge/weather.csv");

    // Your day analysis function call …
    int dayWithSmallestTempSpread = w.determineMinSpread();     
    System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
    
    // Your goal analysis function call …
    Football f = new Football("./src/main/resources/de/exxcellent/challenge/football.csv");
    String teamWithSmallestGoalSpread = f.determineSmallestSpread();
    System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
  }
}
