package de.exxcellent.challenge;

/**
 * @author Siim Kaupmees
 *
 */
public class Football extends CSVReadable {
  String smallestSpreadTeam;
  int smallestSpread;
  
  public Football() {
    this.smallestSpreadTeam = "";
    this.smallestSpread = Integer.MAX_VALUE;
  }
  
  public Football(String filename) {
    super(filename);
    this.smallestSpreadTeam = "";
    this.smallestSpread = Integer.MAX_VALUE;
  }
  
  public String determineSmallestSpread() {
    super.readCSV();
    return this.smallestSpreadTeam;
  }

  public void parseLine(String line) {
    String[] split = line.split(",");
    try {
    String team = split[0];
    int goalsScored = new Integer(split[5]);
    int goalsAllowed = new Integer(split[6]);
    int spread = Math.abs(goalsScored - goalsAllowed);
    if (spread < this.smallestSpread) {
      this.smallestSpreadTeam = team;
      this.smallestSpread = spread;
    }
    }catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Error in Data on Line with: " + line);
      e.printStackTrace();
      return;
    }
  }
  
}
