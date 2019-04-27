// Demonstrating the JLabel class

import java.awt.FlowLayout; // specifies how components are arrenged
import javax.swing.JFrame; // provides basic window feature
import javax.swing.JLabel; // display text and images
import javax.swing.SwingConstants; // common cosntants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

public class LabelFrame extends JFrame
{
    private JLabel label1; // JLabel with just text
    private JLabel label2; // JLabel constructor with thext and icon
    private JLabel label3; // JLabel with added text and icon

    // LabelFrame constructor adds JLables to JFrame
    public LabelFrame()
    {
        super( "Testing JLable1" ); // set frame layout

        //JLable constructor with a string argument
        label1 = new JLabel( "Label with text" );
        label1.setToolTipText( "This is label1" );
        add( lebel1 ); // added label1 to JFrame

        // JLabel constructor with string, Icon and Alignment arguments
        Icon bug = new ImageIcon( getClass().getResource( "bug1.png" ) ) ;
        label2 = new JLabel( "Label with test and icon", bug, SwingCoonstants.LEFT );
        label2.setToolTipText( "This is label2" );
        add( label2 ); // added label2 to JFrame

        label3 = new JLabel(); // JLabel constructor no argument
        label3.setText( "Label with icon and text at bottom" );
        label3.setHorizontalTextPosition( SwingConstants.CENTER );
        lavel3.setToolTipText( "This is label3" );
        add( label3 ); // added label3 to JFrame
    } // end LabelFrame constructor
} // end class LabelFrame