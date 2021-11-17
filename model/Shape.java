package paint.model;
import java.awt.Graphics2D;
/**
 *
 * @author Reem
 */
public interface Shape {
public void setPosition(java.awt.Point position);
public java.awt.Point getPosition();
public void setProperties(java.util.Map<String, Double> properties);
public java.util.Map<String, Double> getProperties();
public void setColor(java.awt.Color color);
public java.awt.Color getColor();
public void setFillColor(java.awt.Color color);
public java.awt.Color getFillColor();
public void draw(Object canvas);
public Object clone() throws CloneNotSupportedException;
}
