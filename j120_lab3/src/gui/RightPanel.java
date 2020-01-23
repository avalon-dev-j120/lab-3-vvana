
package gui;

import java.awt.*;
import javax.swing.*;

public class RightPanel extends JPanel{
    public final static int WIDTH = 300;
    public final static int HEIGHT = 180;
    public RightPanel() {
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(new Color(235,235,235));                            
        
        JSlider sliderRed = new JSlider(0,255,125);                             // min, max, initial
        sliderRed.setName("Red");
        sliderRed.setMajorTickSpacing(50);                                      // разметка
        sliderRed.setPaintTicks(true);                                          // разметка
        sliderRed.setPaintLabels(true);                                         // разметка
        sliderRed.addChangeListener(Okno.okno);
        
        JSlider sliderGreen = new JSlider(0,255,125);
        sliderGreen.setName("Green");
        sliderGreen.setMajorTickSpacing(50);
        sliderGreen.setPaintTicks(true);
        sliderGreen.setPaintLabels(true);
        sliderGreen.addChangeListener(Okno.okno);
               
        JSlider sliderBlue = new JSlider(0,255,125);
        sliderBlue.setName("Blue");
        sliderBlue.setMajorTickSpacing(50);
        sliderBlue.setPaintTicks(true);
        sliderBlue.setPaintLabels(true);
        sliderBlue.addChangeListener(Okno.okno);
         
        setLayout (new BorderLayout());                                         // установка разметки
        add(sliderRed, BorderLayout.NORTH);
        add(sliderGreen, BorderLayout.CENTER);
        add(sliderBlue, BorderLayout.SOUTH);
        this.setVisible(true);
        
    }
    
}
