/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.model;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public abstract class EllipticalShapes implements Shape {
    
    protected Point position;
    protected Map<String, Double> properties;
    protected Color color;
    protected Color fillColor;

    @Override
    public void setPosition(java.awt.Point position) {
        this.position = position;
    }

    @Override
    public java.awt.Point getPosition() {
        return position;
    }

    /* update shape specific properties (e.g., radius) */
    @Override
    public void setProperties(java.util.Map<String, Double> properties) {
        this.properties = new HashMap<String, Double>(properties);
    }

    @Override
    public java.util.Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void setColor(java.awt.Color color) {
        this.color = color;
    }

    @Override
    public java.awt.Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(java.awt.Color color) {
        this.fillColor = color;
    }

    @Override
    public java.awt.Color getFillColor() {
        return fillColor;
    }

    /* redraw the shape on the canvas */
     public abstract void draw(Object canvas);
  

    /* create a deep clone of the shape */
    public abstract Shape clone() throws CloneNotSupportedException;
    }

 