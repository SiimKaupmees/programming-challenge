package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Siim Kaupmees
 *
 */
import org.junit.*;

class WeatherTest {

  /**
   * @author Siim Kaupmees
   *
   * @throws java.lang.Exception
   */


  /**
   * Test method for {@link de.exxcellent.challenge.Weather#determineMinSpread(java.lang.String)}.
   */
  @Test
  void testDetermineMinSpread() {
    
  }

  /**
   * Test method for {@link de.exxcellent.challenge.Weather#parseLine(java.lang.String)}.
   */
  @Test
  void testParseLine() {
    Weather w = new Weather();
    w.parseLine("1,2,0");
    assertEquals(1, w.minSpreadDay);
    assertEquals(2, w.minSpreadTemp);
    
    w.parseLine("3,6,0");
    assertEquals(1, w.minSpreadDay);
    assertEquals(2, w.minSpreadTemp);
    
    w.parseLine("10,0,0");
    assertEquals(10, w.minSpreadDay);
    assertEquals(0, w.minSpreadTemp);
    
  }

}
