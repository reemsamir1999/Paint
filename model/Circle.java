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
import java.util.Map;
import java.util.Random;
import paint.view.ChooseColor;
import paint.view.circle;

public class Circle extends EllipticalShapes implements Shape {
     public Circle() {
        ChooseColor p = new ChooseColor(); 
        circle c = new circle();
        Random rand = new Random();
        int x=rand.nextInt(300),y=rand.nextInt(300);
        //int x= 300;
        //int y= -400;
        position = new Point(x,y);
        properties = new HashMap<String, Double>();
        properties.put("Radius",c.getcircradius());
         
        color = new Color(0, 0, 0);// black
        
        fillColor = p.getColoor();
        System.out.println(fillColor);  
    }

   public Circle(Point position, Color fillColor, Color color, Map<String, Double>  properties) {
        this.properties = properties;
        this.position = position;
        this.color = color;
        this.fillColor = fillColor;
    }

    

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Circle clone = new Circle();
        clone.setColor(this.color);
        clone.setFillColor(this.fillColor);
        clone.setPosition(this.position);
        clone.setProperties(new HashMap<String, Double>(properties));
        return clone;    }

     @Override
    public void draw(Object g) {
        Graphics newCanvas = (Graphics) g; 
       
        
        newCanvas.setColor(color);
           
        newCanvas.drawOval(position.x, position.y,properties.get("Radius").intValue(), properties.get("Radius").intValue());
      //  System.out.println("NAAAAAAADAAAAAAAA");  
        newCanvas.setColor(fillColor);
        newCanvas.fillOval(position.x, position.y, properties.get("Radius").intValue(), properties.get("Radius").intValue());
       
    }


   
    

   }
