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
        int x = 250;
        int y = 1;

        // creates 14 lines in an angle
        while ( lines > 1 )
        {
          g.drawLine( 0, 0, x , y );

          y = y + 17;
          x = x - 17;
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
