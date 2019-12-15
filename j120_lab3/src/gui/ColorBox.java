
package gui;

import java.awt.*;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class ColorBox extends JPanel{
    public final static int SQUARE_SIZE = 300;
    public ColorBox() {
        setSize(180,180);
        setMinimumSize(new Dimension(SQUARE_SIZE, SQUARE_SIZE));
        setBackground(new Color(255,20,20));                                    // фоновый цвет колорбокса
        setVisible(true);
        this.addMouseListener((MouseListener) new CustomListener());
        
    }
    
    
        
}
