import java.awt.*;

public class Die {
  private int currentValue;
  private int size;
  private int xCord;
  private int yCord;
  
  public Die() {
    reRoll();
  }
  public Die(int xCord, int yCord) {
    super();
    this.xCord = xCord;
    this.yCord = yCord;
  }
  
  private void reRoll() {
  currentValue = (int) (Math.random() * 6) + 1;
//  could add another hint for using more math methods
  }
  
  public void roll(Graphics g) {
    reRoll();
    paint(g);
  }
  
  public void paint(Graphics g) {
    if(g == null) { return; } // Be a bit more descriptive of how it works/what you want?
    g.drawRect(0,0,50,50);
    g.setColor(Color.white);
    g.fillRect(1,1,49,49);
    g.setColor(Color.black);
    g.drawString(Integer.toString(currentValue), 20, 20);
  }
  
//  Didnt specify you return something / nothing
  private void drawSpot(int xCord, int yCord, Graphics g) {
    g.fillOval(xCord, yCord, 10, 10);
  }
  
  public void setSize(int newSize) {
    this.size = newSize;
  }
  
  public int getSize() { return 0; }
  
  public int getCurrentValue() { return 0; }
}