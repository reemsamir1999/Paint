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
import paint.view.square;

public class Square extends Polygon implements Shape {
     public Square() {
        Random rand = new Random();
        square sqr = new square();
        ChooseColor p = new ChooseColor(); 
        int x=rand.nextInt(300),y=rand.nextInt(300);
        position = new Point(x,y);
        properties = new HashMap<String, Double>();
        properties.put("Side",sqr.getsqrside());
        color = new Color(0, 0, 0); // black
        fillColor = p.getColoor();
        
    }

    @Override
    public void draw(Object g) {
         Graphics newCanvas = (Graphics)g; 
        
        newCanvas.setColor(color);
        newCanvas.drawRect(position.x, position.y, properties.get("Side")
                .intValue(), properties.get("Side").intValue());
        newCanvas.setColor(fillColor);
        newCanvas.fillRect(position.x, position.y, properties.get("Side")
                .intValue(), properties.get("Side").intValue()); 
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Square clone = new Square();
        clone.setColor(this.color);
        clone.setFillColor(this.fillColor);
        clone.setPosition(this.position);
        clone.setProperties(new HashMap<String, Double>(properties));
        return (Shape) clone;
    }

    

   

}
