package windowFontLayout;


import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class TryBoxLayout {

    static JFrame aWindow = new JFrame("This is a Box Layout");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();
        Dimension wndSize = theKit.getScreenSize();

        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Box left = Box.createVerticalBox();
        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton rButton;

        radioGroup.add(rButton = new JRadioButton("RED"));
        left.add(rButton);
        radioGroup.add(rButton = new JRadioButton("GREEN"));
        left.add(rButton);
        radioGroup.add(rButton = new JRadioButton("BLUE"));
        left.add(rButton);
        radioGroup.add(rButton = new JRadioButton("YELLOW"));
        left.add(rButton);

        Box right = Box.createVerticalBox();
        right.add(new JCheckBox("DASHED"));
        right.add(new JCheckBox("THICK"));
        right.add(new JCheckBox("ROUNDED"));

        Box top = Box.createHorizontalBox();
        top.add(left);
        top.add(right);

        JPanel bottomPanel = new JPanel();
        Border edge = BorderFactory.createRaisedBevelBorder();
        JButton button;
        Dimension size = new Dimension(80, 20);

        bottomPanel.add(button = new JButton("DEFAULTS"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("OK"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("CANCEL"));
        button.setBorder(edge);
        button.setPreferredSize(size);

        Container content = aWindow.getContentPane();

        content.setLayout(new BorderLayout());
        content.add(top, BorderLayout.CENTER);
        content.add(bottomPanel, BorderLayout.SOUTH);
        aWindow.pack();
        aWindow.setVisible(true);
    }
}
