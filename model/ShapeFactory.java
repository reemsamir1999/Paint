/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.model;

/**
 *
 * @author Reem
 */
public class ShapeFactory {
  public static Shape createShape (String shapeType){
  if(shapeType == null){
   return null;}
  if(shapeType.equalsIgnoreCase("Circle")){
  return (Shape) new Circle();
  }
  else if (shapeType.equalsIgnoreCase("Rectangle")){
  return (Shape) new Rectangle();
  }
else if (shapeType.equalsIgnoreCase("Square")){
  return (Shape) new Square();
  }  
  else if (shapeType.equalsIgnoreCase("Triangle")){
  return (Shape) new Triangle();
  }
  else if (shapeType.equalsIgnoreCase("Ellipse")){
  return (Shape) new Ellipse();
  }
  else if (shapeType.equalsIgnoreCase("Line")){
  return (Shape) new Line();
  }
  return null;
}}
