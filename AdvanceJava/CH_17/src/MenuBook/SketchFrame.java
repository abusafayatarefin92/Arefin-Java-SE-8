
package MenuBook;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class SketchFrame extends JFrame{
    private JMenuBar menubar = new JMenuBar();

    public SketchFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menubar);
        
        JMenu fileMenu = new JMenu("File");
        JMenu elementMenu = new JMenu("Elements");
        
        menubar.add(fileMenu);
        menubar.add(elementMenu);
    }
    
}
