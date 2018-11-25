package windowFontLayout;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class TryGridBagLayout {
    static JFrame aWindow = new JFrame("This is a Gridbag Layout");
    
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();

        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints contraints = new GridBagConstraints();
        
        aWindow.getContentPane().setLayout(gridbag);
        
        contraints.weightx = contraints.weighty = 10.0;
        contraints.fill = contraints.BOTH;
        
        addbutton(" Press ", contraints, gridbag);
        
        contraints.gridwidth = contraints.REMAINDER;
        
        addbutton("GO", contraints, gridbag);
        
        aWindow.setVisible(true);
    }
    
    static void addbutton(String label, GridBagConstraints contraints, GridBagLayout layout){
        Border edge = BorderFactory.createRaisedBevelBorder();
        JButton button = new JButton(label);
        
        button.setBorder(edge);
        layout.setConstraints(button, contraints);
        aWindow.getContentPane().add(button);
    }
}
