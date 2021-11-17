/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.PieChart.Data;
import paint.model.Shape;
import static paint.view.GUI.controller;
import paint.view.MyCanvas;

/**
 *
 * @author Reem
 */
public class xmll extends JSONSaveAndLoad{
Load load=Load.getInstance();
MyCanvas l=new MyCanvas();


    @Override
    public void load(File filetoLoadfrom) {
 XMLDecoder e;
 try{
  e=new XMLDecoder (new BufferedInputStream (new FileInputStream(filetoLoadfrom)));
  l.setListOfShapes((ArrayList<Shape>)e.readObject());
  
  e.close();
 }catch (FileNotFoundException e1){e1.printStackTrace();}
    }

    @Override
    public void save(File filetoSaveto, ArrayList<Shape> ListOfShapes, String[] shapeIdentifiers) {
    Shape[] arr = controller.getShapes();
    XMLEncoder e;
    try{
        
        e = new XMLEncoder(new BufferedOutputStream (new FileOutputStream(filetoSaveto)));
        e.writeObject(arr);
        e.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(xmll.class.getName()).log(Level.SEVERE, null, ex);
    }}
    
    
}
