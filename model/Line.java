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
import paint.view.line;

public class Line extends Polygon implements Shape {

    public Line() {
        ChooseColor o = new ChooseColor(); 
        line n = new line();
        Random rand = new Random();
        int x=rand.nextInt(300),y=rand.nextInt(300);
        position = new Point(x,y);
        properties = new HashMap<String, Double>();
        properties.put("Width",n.getlinelength());
        properties.put("Height", 1.0);
         // black
        fillColor = o.getColoor();
        color = fillColor;
        //System.out.println(fillColor);
    }

    //public Line(int x, int y) {
      //  position = new Point(x,y);
    //}

    @Override
    public void draw(Object g) {
        Graphics newCanvas = (Graphics) g;
        newCanvas.setColor(color);
         newCanvas.drawRect(position.x, position.y, properties.get("Width")
                .intValue(), properties.get("Height").intValue());
        newCanvas.setColor(fillColor);
        newCanvas.fillRect(position.x, position.y, properties.get("Width")
                .intValue(), properties.get("Height").intValue());
        
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Line clone = new Line();
        clone.setColor(this.color);
        clone.setFillColor(this.fillColor);
        clone.setPosition(this.position);
        clone.setProperties(new HashMap<String, Double>(properties));
        return (Shape) clone;
    }



   
   
}