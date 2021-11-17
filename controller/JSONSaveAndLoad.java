/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import java.io.File;
import java.util.ArrayList;
import paint.model.Shape;

/**
 *
 * @author Reem
 */
public abstract class JSONSaveAndLoad {

    
    ArrayList <String> ShapesName;
    ArrayList <Shape> ListOfShapes;
    public abstract void load (File filetoLoadfrom);
    public abstract void save (File filetoSaveto ,ArrayList <Shape>ListOfShapes, String[] shapeIdentifiers);
    public ArrayList<Shape> getListOfShapes(){
    return ListOfShapes;
    }
    
   
}
