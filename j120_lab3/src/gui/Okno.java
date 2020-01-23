
package gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Okno extends JFrame implements ChangeListener {                   
    
    public static Okno okno = null;                                             
    private static int colorRed = 127;
    private static int colorGreen = 127;
    private static int colorBlue = 127;
    public static ColorBox colorBox = null;                                     
    public static RightPanel rightPanel = null;
    
    public Okno() {
        okno = this;
        setTitle("Color Picker");                                               // заголовк
        setSize(800, 400);                                                      // размеры окна
        this.setLayout(new GridLayout(1, 2));                                   // менеджер компоновки (таблица 1*2)
        colorBox = new ColorBox();
        rightPanel = new RightPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                         // действие при нажатии на крестик
        
        add(colorBox);                                                          // добавление цвет.области
        add(rightPanel);                                                        // добавление правой панели
        setVisible(true);
    }

    public static Okno getInstance() {
        return new Okno();
    }
    
    @Override
    public void stateChanged(ChangeEvent ce) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
       JSlider slider = ((JSlider) ce.getSource());
       String name = slider.getName();
     
        switch (name) {
            case "Red":
                colorRed = slider.getValue();
                break;
            case "Green":
                colorGreen = slider.getValue();
                break;
            case "Blue":
                colorBlue = slider.getValue();
                break;
        }
        Color c = new Color(colorRed, colorGreen, colorBlue);
        colorBox.setBackground(c);
    }
    
 }
