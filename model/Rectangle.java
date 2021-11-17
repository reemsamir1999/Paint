/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.model;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Random;
import paint.view.ChooseColor;
import paint.view.rectangle;

public class Rectangle extends Polygon implements Shape {

    public Rectangle() {
        ChooseColor p = new ChooseColor();
        rectangle r = new rectangle();
        System.out.println("adam" + r.getrectheight());
        System.out.println("adamm" + r.getrectwidth());
        
        Random rand = new Random();
        int x=rand.nextInt(300),y=rand.nextInt(300);
        position = new Point(x,y);
        
        properties = new HashMap<String, Double>();
        properties.put("Width", r.getrectwidth());
        properties.put("Height", r.getrectheight());
        color = new Color(0, 0, 0); // black
        fillColor = p.getColoor();
    }

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
        Rectangle clone = new Rectangle();
        clone.setColor(this.color);
        clone.setFillColor(this.fillColor);
        clone.setPosition(this.position);
        clone.setProperties(new HashMap<String, Double>(properties));
        return (Shape) clone;
    }

    

}