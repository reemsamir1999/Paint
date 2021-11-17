
package paint.view;

import paint.model.Mouse;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.paint.Color.color;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import paint.model.*;
import paint.controller.*;
import paint.model.Circle;
import paint.model.Shape;
/**
 *
 * @author Reem
 */

public class GUI extends javax.swing.JFrame {
public static PaintControl controller;

    int count=0;
    GUI pf;
    Graphics x;
    boolean h=false;
    public Color color;
    private Graphics2D canvas;
    public void color (Color color){
    this.color=color;}
    
    
    public void setController(PaintControl controller){
        this.controller=controller;
    }
    
    public MyCanvas getCanvas(){
        return (MyCanvas)jPanel1;
    }
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel1 = new MyCanvas();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton20 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/square-icon (1).png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(25, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Actions-fill-color-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/circle-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Reem\\Desktop\\New folder\\Undo-icon.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Redo-icon.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/elipse-icon.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Editing-Line-icon.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Rounded-rectangle-tool-icon.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Triangle-icon.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Eraser-2-icon.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        jButton13.setText("Copy");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Button-Next-icon (1).png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Button-Download-icon.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Button-Previous-icon.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Button-Up.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Select All");

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/open-file-icon.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/view/Floppy-red-icon.png"))); // NOI18N
        jButton12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton12StateChanged(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jMenu1.setText("Save");

        jMenuItem1.setText("Save in XML file ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save in JSON file");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Undo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Redo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("View");

        jMenuItem5.setText("ToolBox");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem7.setText("Shapes");
        jMenu6.add(jMenuItem7);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton18)
                                        .addGap(31, 31, 31)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton16, jButton17, jButton18, jButton19});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton10, jButton3, jButton7, jButton8, jButton9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton11, jButton12, jButton13, jButton2, jButton20, jButton4, jButton6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton16, jButton17, jButton18, jButton19});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton10, jButton3, jButton7, jButton8, jButton9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton11, jButton12, jButton13, jButton2, jButton20, jButton4, jButton6});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      square c = new square();
      count++;
      jPanel1.add(c);
      jComboBox1.addItem("Square" + count);
      c.setVisible(true);   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       circle c = new circle();
       count++;
       jPanel1.add(c);
       jComboBox1.addItem("circle" + count);
       c.setVisible(true); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        rectangle r = new rectangle();
        count++;
        jComboBox1.addItem("rectangle" + count);
        jPanel1.add(r);
        r.setVisible(true); 
       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ellipse first = new ellipse();
        count++;
        jComboBox1.addItem("ellipse" + count);
        jPanel1.add(first);
        first.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
          line first = new line();
          count++;
          jComboBox1.addItem("line" + count);
          jPanel1.add(first);
          first.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      triangle first = new triangle();
      count++;
      jComboBox1.addItem("Triangle" + count);
      jPanel1.add(first);
      first.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                 ChooseColor first = new ChooseColor();
                 jPanel1.add(first);
                 first.setVisible(true);               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
      Graphics g = this.jPanel1.getGraphics();
      int x = evt.getX();
      int y = evt.getY();
      
      
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     controller.undo();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     controller.redo();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    if (jRadioButton1.isSelected()){
        controller.moveAllUp(); return;
        }
        else {
            Shape [] currentShape ;
            currentShape = new Shape [100];
        int i=jComboBox1.getSelectedIndex();
        currentShape=controller.getShapes();
        
        Point newposition= new Point (currentShape[i].getPosition().x,currentShape[i].getPosition().y-10);
        currentShape[i].setPosition(newposition);
        } 
        repaint();
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      if (jRadioButton1.isSelected()){
        controller.moveAllDown(); return;
        }
         else{
        Shape [] currentShape ;
            currentShape = new Shape [100];
        int i=jComboBox1.getSelectedIndex();
        currentShape=controller.getShapes();
        
        Point newposition= new Point (currentShape[i].getPosition().x,currentShape[i].getPosition().y+10);
        currentShape[i].setPosition(newposition);
        } 
        repaint();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (jRadioButton1.isSelected()){
        controller.moveAllRight(); return;
        }
         else{
        Shape [] currentShape ;
            currentShape = new Shape [100];
        int i=jComboBox1.getSelectedIndex();
        currentShape=controller.getShapes();
        
        Point newposition= new Point (currentShape[i].getPosition().x+10,currentShape[i].getPosition().y);
        currentShape[i].setPosition(newposition);
        } 
        repaint();

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       if (jRadioButton1.isSelected()){
        controller.moveAllLeft(); return;
        }
         else{
        Shape [] currentShape ;
            currentShape = new Shape [100];
        int i=jComboBox1.getSelectedIndex();
        currentShape=controller.getShapes();
        
        Point newposition= new Point (currentShape[i].getPosition().x-10,currentShape[i].getPosition().y);
        currentShape[i].setPosition(newposition);
        } 
        repaint();

    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
   Shape[] anArray;
    anArray = new Shape[100];
    anArray= controller.getShapes();
    int x=jComboBox1.getItemCount();
   
        System.out.println(x);

        if(jRadioButton1.isSelected())
           
    { 
        for (int i=0;i<x;++i)
    { 
       controller.removeShape(anArray[i]);
       jComboBox1.removeAllItems();
       //jComboBox1.removeItemAt(i);
       
    repaint();
      
            } repaint();
            //jComboBox1.removeAllItems();
    }
    else {
    
    int y= jComboBox1.getSelectedIndex();
    controller.removeShape(anArray[y]);
    jComboBox1.removeItemAt(y);
    repaint();   
    
    }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
          openmenu first = new openmenu();
                 jPanel1.add(first);
                 first.setVisible(true);  
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       controller.undo();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       controller.redo();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
 JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
             int count = jComboBox1.getItemCount();
             String[] shapesNames = new String[count];
             
             for(int i =0; i<count; i++){
                 shapesNames[i]= jComboBox1.getItemAt(i);
            }
           //controller.setShapesName(shapesNames);
         
            controller.save(chooser.getSelectedFile().getPath());
        }      
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    Shape[] anArray;
    anArray = new Shape[100];
    anArray= controller.getShapes();
    int y = jComboBox1.getSelectedIndex();
    String shapeType = jComboBox1.getItemAt(y);
    System.out.println(shapeType);
    String str; 
    if(y>9){
     str = shapeType.substring(0, shapeType.length() - 2);}
    else{
    str=shapeType.substring(0, shapeType.length() - 1);}
    if(str.equalsIgnoreCase("circle")){
    Circle c = new Circle();
    count ++;
    try {c.clone();
    controller.addShape(c);
    repaint();
    y++;
    } 
    catch (CloneNotSupportedException ex) {}  }
    else if (str.equalsIgnoreCase("Rectangle")){
    Rectangle r = new Rectangle();
    count ++;
    try {r.clone();
    controller.addShape(r);
    repaint();
    y++;
    }catch (CloneNotSupportedException ex) {} 
    }
    else if (str.equalsIgnoreCase("Square")){
    Square s = new Square();
    count ++;
    try {s.clone();
    controller.addShape(s);
    repaint();
    y++;
    } 
    catch (CloneNotSupportedException ex) {} 
    }  
    else if (str.equalsIgnoreCase("Triangle")){
    Triangle r = new Triangle();
    count ++;
    try {r.clone();
    controller.addShape(r);
    repaint();
    y++;} 
    catch (CloneNotSupportedException ex) {} 
    }
    else if (str.equalsIgnoreCase("Ellipse")){
    Ellipse r = new Ellipse();
    count ++;
    try {r.clone();
    controller.addShape(r);
    repaint();
    y++;} 
    catch (CloneNotSupportedException ex) {} }
    else if (str.equalsIgnoreCase("Line")){
    Line r = new Line();
    count ++;
    try {r.clone();
    controller.addShape(r);
    repaint();
    y++;} 
    catch (CloneNotSupportedException ex) {} }
    jComboBox1.addItem(str + count);    
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 openmenu first = new openmenu();
 jPanel1.add(first);
 first.setVisible(true); 
//String path = .showInputDialog(frame,"Enter file name");
     // controller.save(.getSelectedFile().getPath());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton12StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton12StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12StateChanged
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI x = new GUI();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
                MyCanvas canvas = x.getCanvas();
                PaintControl controller = new PaintControl(canvas);
                x.setController(controller);
               }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
