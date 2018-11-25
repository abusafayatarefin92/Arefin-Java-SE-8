package windowFontLayout;


import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryCardLayout extends JApplet implements ActionListener {

    CardLayout card = new CardLayout(50, 50);
    
    public void init() {
        Container content = getContentPane();
        
        content.setLayout(card);
        
        JButton button;
        
        for (int i = 1; i <= 6; i++) {
            content.add(button = new JButton("Press " + i), "Card" + i);
            button.addActionListener(this);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        card.next(getContentPane());
    }
}
