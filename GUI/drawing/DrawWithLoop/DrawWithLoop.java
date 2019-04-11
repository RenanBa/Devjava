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

        // draw a line from the upper-left to the lower-right
        g.drawLine( 0, 0, width, height );

        // draw a line from the upper-left to the lower-right
        g.drawLine( 7, 0, width, height );

        // draw a line from the lower-left to the upper-right
        g.drawLine( 0, height, width, 0 );

        // draw a line from the lower-left to the upper-right
        g.drawLine( 7, height, width, 0 );

    } // end method paintComponent
} // end class DrawWithLoop
