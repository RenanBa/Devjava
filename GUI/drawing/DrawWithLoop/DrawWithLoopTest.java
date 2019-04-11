// Application to display a DrawWithLoop
import javax.swing.JFrame;

public class DrawWithLoopTest
{
    public static void main( String[] args )
    {
        // create a panel that contains our drawing
        DrawWithLoop panel = new DrawWithLoop();

        // create a frame to hold the panel
        JFrame application = new JFrame();

        // set the frame to exit when it is closed
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        application.add( panel ); // add the panel to the frame
        application.setSize( 250, 250 ); // set the size of the frame
        application.setVisible( true ); // make the frame visible
    } // end main
} // end DrawWithLoopTest
