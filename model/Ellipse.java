/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.model;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.HashMap;
import java.util.Random;
import paint.view.ChooseColor;
import paint.view.ellipse;
/**
 *
 * @author Reem
 */
public class Ellipse extends EllipticalShapes {
 public Ellipse() {
        ChooseColor p = new ChooseColor();  
        ellipse ell = new ellipse();
        Random rand = new Random();
        int x=rand.nextInt(300),y=rand.nextInt(300);
        position = new Point(x,y);
        properties = new HashMap<String, Double>();
        properties.put("Width",ell.getellwidth());
        properties.put("Height",ell.getellheight());
        color = new Color(0, 0, 0); // black
        fillColor = p.getColoor();
    }
    @Override
    public Shape clone() throws CloneNotSupportedException {
Ellipse clone = new Ellipse();
        clone.setColor(this.color);
        clone.setFillColor(this.fillColor);
        clone.setPosition(this.position);
        clone.setProperties(new HashMap<String, Double>(properties));
        return clone;
    
}
    public void draw(Object g) {
         Graphics newCanvas = (Graphics) g;
        newCanvas.setColor(color);
        newCanvas.drawOval(position.x, position.y, properties.get("Width")
                .intValue(), properties.get("Height").intValue());
        newCanvas.setColor(fillColor);
        newCanvas.fillOval(position.x, position.y, properties.get("Width")
                .intValue(), properties.get("Height").intValue());
    }

    

}
