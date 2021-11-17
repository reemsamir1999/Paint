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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;
import paint.model.Shape;

public class XML {
    public void write(LinkedList<Shape> shapes, String fileName)
            throws Exception {
        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(
        new FileOutputStream(fileName)));
        encoder.writeObject(shapes);
        encoder.close();
    }

    @SuppressWarnings("unchecked")
    public LinkedList<Shape> read(String fileName) throws Exception {
    XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(
    new FileInputStream(fileName)), null, null, this.getClass().getClassLoader());
    LinkedList<Shape> shapes = (LinkedList<Shape>) decoder.readObject();
    decoder.close();
    return shapes;
    }
}