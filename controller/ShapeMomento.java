/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint.controller;

import java.util.ArrayList;
import paint.model.Shape;

/**
 *
 * @author Reem
 */
public class ShapeMomento {
    ArrayList <Shape> ListOfShapes;
    public ShapeMomento (ArrayList <Shape> state){
        
        this.ListOfShapes=new ArrayList <>();
        try {
        for (Shape s:state){
        ListOfShapes.add((Shape)s.clone());
        }
            
        }
        catch (Exception e){
        System.out.println(e.toString());}
}
    public ArrayList <Shape> getState() {
    return ListOfShapes;
    }
}
