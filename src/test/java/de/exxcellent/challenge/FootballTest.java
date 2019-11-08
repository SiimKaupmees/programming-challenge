/**
 * @author skaupmee
 *
 */
package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Siim Kaupmees
 *
 */
class FootballTest {

  /**
   * Test method for {@link de.exxcellent.challenge.Football#parseLine(java.lang.String)}.
   */
  @Test
  void testParseLine() {
    Football f = new Football();

    f.parseLine("Team1,0,0,3,0,0,10");
    assertEquals("Team1", f.smallestSpreadTeam);
    assertEquals(10, f.smallestSpread);

    f.parseLine("Team2,0,2,3,5,9,0");
    assertEquals("Team2", f.smallestSpreadTeam);
    assertEquals(9, f.smallestSpread);
    
    f.parseLine("Team3,3,9,7,6,11,0");
    assertEquals("Team2", f.smallestSpreadTeam);
    assertEquals(9, f.smallestSpread);
    
    f.parseLine("Team4,3,9,7,6,11,11");
    assertEquals("Team4", f.smallestSpreadTeam);
    assertEquals(0, f.smallestSpread);
  }

}
