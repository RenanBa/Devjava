// Draw a Panel using loop using 15 lines from left-top to left bottom and going to right-top accordingly

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawWithLoop extends JPanel
{
    // draws an X from the corners of the panel
    public void paintComponent( Graphics g )
    {
        // call paintComponent to ensure the panel displaus correctly
        super.paintComponent( g );

        int width = getWidth(); // total width
        int height = getHeight(); // total height
        int lines = 15; // total numbers of lines
        int x = height; // to draw from top-left to lower-right
        int y = 0; // to draw from top-left to lower-right
        int angles = height / lines; // create angles


        // creates 14 lines in an angle from upper-left to righg and bottom
        while ( lines >= 1 )
        {
          y = y + angles; // add angles to y
          x = x - angles; // subtract angles from x

          // draw a line frm the upper-left to the lower-right
          g.drawLine( 0, 0, x , y );

          // draw a curve grid
          // g.drawLine( 0, x, y, 0 );

          lines -= 1;
        }

        // draw a line from the lower-left to the upper-right
        // g.drawLine( 0, height, width, 0 );

    } // end method paintComponent
} // end class DrawWithLoop



// // draw a line from the upper-left to the lower-right
// g.drawLine( 0, 0, ( width ), ( height / y ) ); // horizontal line
// g.drawLine( 0, 0, ( width / 2 ), ( height / 2 ) ); // diagonal line (half)
// g.drawLine( 0, 0, ( width / x ), ( height ) ); // vertival line
