
package paint.controller;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import paint.model.Shape;
import paint.view.MyCanvas;

public class PaintControl implements DrawingEngine{
    MyCanvas canvas;
    int counter;
    String [] shapeIdentifiers;
    String[] ShapesName;
    public void setShapesName(String[] ShapesName){
    this.ShapesName=ShapesName;}
   // public String getShapesName(){return ShapesName[];}
    ArrayList<ShapeMomento> momentolist;
    public PaintControl(MyCanvas canvas) {
    this.canvas = canvas;
    momentolist=new ArrayList<>();
    momentolist.add(new ShapeMomento(new ArrayList<>()));
    counter=0;}
    
    @Override
    public void refresh(Object Canvas) {
    canvas.repaint();
    }

    @Override
    public void addShape(Shape shape) {
    ChangeCheck();
    canvas.getListOfShapes().add(shape);
        //canvas.setShapeToDraw(shape);
        //canvas.controllerRR=this;
    canvas.repaint();
    ShapeMomento newMomento = new ShapeMomento(canvas.getListofShapes());
    momentolist.add(newMomento);
    counter = momentolist.size()-1;
    }
      
    public void setMomento(){
    ShapeMomento newMom = new ShapeMomento (canvas.getListOfShapes());
    momentolist.add(newMom);
    counter = momentolist.size()-1;
    }
     

    @Override
    public void removeShape(Shape shape) {
    ChangeCheck();
    canvas.getListofShapes().remove(shape);
    ShapeMomento newMomento = new ShapeMomento(canvas.getListOfShapes());
    momentolist.add(newMomento);
    counter = momentolist.size()-1;
    }

    @Override
    public void updateShape(Shape oldShape, Shape newShape) {
    ChangeCheck();
    int i = canvas.getListOfShapes().indexOf(oldShape);
    canvas.getListofShapes().remove(oldShape);
    canvas.getListofShapes().add(i, newShape);
    ShapeMomento newMomento = new ShapeMomento(canvas.getListOfShapes() );
    momentolist.add(newMomento);
    }

    @Override
    public Shape[] getShapes() {
    int length = canvas.getListOfShapes().size();
    Shape[] shapeArray = canvas.getListOfShapes().toArray(new Shape[length]);
    return shapeArray;
    }

    @Override
    public void undo() {
    if(counter < 0) 
    return;
    System.out.println("undoing mementos : " + momentolist.size());
    System.out.println("counter : " +counter);
    ArrayList<Shape> previousState = momentolist.get(counter--).getState();
    canvas.setListOfShapes(previousState);
    canvas.repaint();
    }

    @Override
    public void redo() {
    if (counter>=momentolist.size()-1)return;
    ArrayList <Shape> previousState=momentolist.get(++counter).getState();
    canvas.setListOfShapes(previousState);
    canvas.repaint();
    }

    @Override
    public void save(String path) {
    File filetosaveTo =new File (path);
    jsonsave saver = jsonsave.getInstance();
    saver.save(filetosaveTo, canvas.getListOfShapes(), shapeIdentifiers);
        //(filetosaveTo,canvas.getListOfShapes(),ShapesName);
    }

    
    @Override
    public void load(String path) {
        File filetosaveTo =new File (path);
    jsonsave loader = jsonsave.getInstance();
    loader.load(filetosaveTo);
    ShapesName =loader.ShapesName.toArray(new String [loader.ShapesName.size()]);
    canvas.setListOfShapes(loader.getListOfShapes());
    canvas.repaint();
    ShapeMomento newMomento=new ShapeMomento(canvas.getListOfShapes());
    momentolist.add(newMomento);
    counter=momentolist.size()-1;
    }
   /* @override
    public void installPluginShape(String jarPath){
    try {
    URL[] paths={new File (jarPath).toURL().toURI()};
    URLClassLoader child =new URLClassLoader(paths,this.ge)
    
    }catch (Exception e){}
    }*/
    private void ChangeCheck(){
    if(counter < momentolist.size()-1){
    momentolist = new ArrayList<>();
    counter = 0;
    }
    }

    public void moveAllUp() {
    for (Shape s:canvas.getListOfShapes()){
    Point newPosition=new Point (s.getPosition().x,s.getPosition().y-10);
    s.setPosition(newPosition);
    }
    canvas.repaint();
    ShapeMomento newMomento =new ShapeMomento(canvas.getListOfShapes());
    momentolist.add(newMomento);
    counter=momentolist.size()-1;
    }
    public void moveAllDown() {
    for (Shape s:canvas.getListOfShapes()){
    Point newPosition=new Point (s.getPosition().x,s.getPosition().y+10);
    s.setPosition(newPosition);
    }
    canvas.repaint();
    ShapeMomento newMomento =new ShapeMomento(canvas.getListOfShapes());
    momentolist.add(newMomento);
    counter=momentolist.size()-1;
    }

    public void moveAllRight() {
    for (Shape s:canvas.getListOfShapes()){
    Point newPosition=new Point (s.getPosition().x+10,s.getPosition().y);
    s.setPosition(newPosition);
    }
    canvas.repaint();
    ShapeMomento newMomento =new ShapeMomento(canvas.getListOfShapes());
    momentolist.add(newMomento);
    counter=momentolist.size()-1;    
    }

    public void moveAllLeft() {
    for (Shape s:canvas.getListOfShapes()){
    Point newPosition=new Point (s.getPosition().x-10,s.getPosition().y);
    s.setPosition(newPosition);
    }
    canvas.repaint();
    ShapeMomento newMomento =new ShapeMomento(canvas.getListOfShapes());
    momentolist.add(newMomento);
    counter=momentolist.size()-1;    
    }
    }
