
package paint.view;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JPanel;
import paint.model.Shape;
import paint.controller.*;


/**
 *
 * @author Reem
 */
public class MyCanvas extends JPanel{
    ArrayList<Shape> listOfShapes;
    private Shape ShapeToDraw;
    public PaintControl controllerRR;

    int x1=0,x2=0,y1=0,y2=0;
    int width,height;
    public ArrayList<Shape> getListofShapes(){
        return listOfShapes;
    }
        public void setShapeToDraw(Shape ShapeToDraw)
{
     this.ShapeToDraw=ShapeToDraw;    
}
         public Shape getShapeToDraw()
{ 
  return ShapeToDraw;  
}

    public MyCanvas(){
        listOfShapes = new ArrayList<>();}
        //MyCanvas c = this;   
      /*  addMouseListener(new MouseAdapter() {
        
        @Override
        public void mousePressed(MouseEvent event) {
           //Int mouseX = MouseInfo.getPointerInfo().getLocation.x;
           //int mouseY = MouseInfo.getPointerInfo().getLocation.y;
            x1 = event.getX();
            y1 = event.getY();
         }
        @Override
        public void mouseReleased(MouseEvent event){
            if(ShapeToDraw==null)
                return;
             x2 = event.getX();
             y2 = event.getY();
             
             ShapeToDraw.setPosition(new Point(x1,y1));
             width = x2-x1;
             height = y2-y1;
             HashMap<String,Double> properties = new HashMap<>();
             properties.put("Width",new Double(width));
             properties.put("Height",new Double(height));
             int minimum = Math.min(height,width);
             properties.put("Diameter",new Double(minimum));
             properties.put("Side Length",new Double(minimum));
             ShapeToDraw.setProperties(properties);
             ShapeToDraw = null;
             controllerRR.setMomento();
             c.repaint();
             
             }
    });*/
    
    public void setListOfShapes(ArrayList<Shape> newList)
{
     this.listOfShapes=newList;    
}
   
    public ArrayList<Shape> getListOfShapes(){
        return listOfShapes;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Shape s : listOfShapes){
           
            s.draw(g);
            
        }
    }
 
}
