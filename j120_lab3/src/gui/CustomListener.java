/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author vvana
 */
public class CustomListener implements MouseListener {
 
          public void mouseClicked(MouseEvent e) {
          }
 
          public void mouseEntered(MouseEvent e) {
               ColorBox clr = (ColorBox) e.getSource();
               Color color = clr.getBackground();
               int r = color.getRed();
               int g = color.getGreen();
               int b = color.getBlue();
               
               String s = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
               clr.setToolTipText(s);
               
               
          }
 
          public void mouseExited(MouseEvent e) {
          }
 
          public void mousePressed(MouseEvent e) {
          }
 
          public void mouseReleased(MouseEvent e) {
          }
     }
