
package paint.controller;

import paint.model.Shape;

public interface DrawingEngine {
public void refresh(Object Canvas);
public void addShape(Shape shape);
public void removeShape(Shape shape);
public void updateShape(Shape oldShape, Shape newShape);
public Shape[] getShapes();
public void undo();
public void redo();
public void save(String path);
public void load(String path);
}
