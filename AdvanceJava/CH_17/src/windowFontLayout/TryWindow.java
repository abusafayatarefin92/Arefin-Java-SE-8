package windowFontLayout;


import javax.swing.JFrame;

public class TryWindow {

    static JFrame aWindow = new JFrame("This is the Window Title");
    
    public static void main(String[] args) {
        int windowWidth = 400;
        int windowHeight = 150;
        aWindow.setBounds(50, 100, windowWidth, windowHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
