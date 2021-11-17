/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.model;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.util.*;
import javax.swing.*;
import paint.view.MyCanvas;
/**
 *
 * @author Reem
 */
public class Mouse extends MyCanvas {
 private final ArrayList<Point> point = new ArrayList<>();
   public Mouse() {
       
    addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent event) {
            point.add(event.getPoint());
            repaint();
            System.out.println(point);
        }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
        public void mouseDragged(MouseEvent event) {
            point.add(event.getPoint());
            repaint();
        }
    });
}



   
    //public void draw(Object g) {
   // System.out.println("paint.model.Mouse.draw()");
   // Graphics newCanvas = (Graphics) g; 
    //super.paintComponent(canvas);
    //Graphics2D g2 = (Graphics2D) g;
    //canvas.setColor(new Color(0, 0, 128));
    //canvas.setStroke(new BasicStroke(1f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
    //for (int i = 1; i < point.size(); i++)
      //  g2.draw(new Line2D.Float(point.get(i-1), point.get(i)));
   
    

    @Override
    public paint.model.Shape clone() throws CloneNotSupportedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}