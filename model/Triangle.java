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
import paint.view.triangle;

public class Triangle extends Polygon implements Shape{

    public Triangle() {
        Random rand = new Random();
        triangle tri = new triangle();
        ChooseColor p = new ChooseColor(); 
        int x=rand.nextInt(300),y=rand.nextInt(300);
        position = new Point(x,y);
        properties = new HashMap<String, Double>();
        properties.put("Side", tri.gettrside());
        color = new Color(0, 0, 0); // black
        fillColor = p.getColoor();
        
    }

    @Override
    public void draw(Object g) {
         Graphics newCanvas = (Graphics) g;
        newCanvas.setColor(color);

        Point pos = new Point();
        Integer sideLength = properties.get("Side").intValue();
        pos.x = position.x + sideLength / 2;
        Double bottomY = position.y + (sideLength * ((Math.sqrt(3)) / 2.0));
        pos.y = bottomY.intValue();

        int[] x = new int[] { pos.x, pos.x - (sideLength / 2),
                pos.x + (sideLength / 2) };
        Double topY = (pos.y - (sideLength * ((Math.sqrt(3)) / 2.0)));
        int[] y = new int[] { topY.intValue(), pos.y, pos.y };
        newCanvas.drawPolygon(x, y, 3);
        newCanvas.setColor(fillColor);
        newCanvas.fillPolygon(x, y, 3);

    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Triangle clone = new Triangle();
        clone.setColor(this.color);
        clone.setFillColor(this.fillColor);
        clone.setPosition(this.position);
        clone.setProperties(new HashMap<String, Double>(properties));
        return (Shape) clone;
    }

}