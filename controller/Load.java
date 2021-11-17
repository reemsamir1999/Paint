/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paint.controller;
import java.awt.Shape;
import paint.model.*;
import paint.view.*;
import java.util.HashMap;
import java.util.Map;

public class Load {

    private Map<String, Class<?>> shapes = new HashMap<String, Class<?>>();

    private static Load instance;
   
    
    
    
    public static Load getInstance() {
        if (instance == null) {
            instance = new Load();
        }
        return instance;
    }
    

    public void putClass(String x, Class<?> c) {
        shapes.put(x, c);
    }

    public Class<?> getClass(String x) {
        return shapes.get(x);
    }

}
