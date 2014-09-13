// MyGameGrid.java

import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class MyGameGrid extends GameGrid
{
  public MyGameGrid()
  {
    super(10, 10, 60, Color.blue);
    show();
  }

  public static void main(String[] args)
  {
    new MyGameGrid();
  }
}