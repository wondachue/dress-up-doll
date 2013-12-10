/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doll;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;  
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Megan
 */
public class Layout extends javax.swing.JFrame 
{
   
    /**
     * Creates new form layout
     */
    public Layout() 
    {
        //disables fullscreen
        this.setResizable(false);
        //initializes project
        initComponents();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        faceDownButton = new javax.swing.JButton();
        faceUpButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hairDownButton = new javax.swing.JButton();
        hairUpButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        topsDownButton = new javax.swing.JButton();
        topsUpButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 246, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4 = new Panel2();
        jPanel4.setBackground(new java.awt.Color(150, 240, 240));
        //dollie goes here
        jPanel4.setForeground(new java.awt.Color(30, 0, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setText(" Eyes");

        faceDownButton = new ButtonDesign(1,time);
        faceDownButton.setBackground(new java.awt.Color(240, 140, 240));
        faceDownButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/one_1.png"))); // NOI18N
        faceDownButton.setOpaque(false);
        faceDownButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/oneb.png"))); // NOI18N
        faceDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faceDownButtonActionPerformed(evt);
            }
        });

        faceUpButton = new ButtonDesign(2,time);
        faceUpButton.setBackground(new java.awt.Color(240, 140, 240));
        faceUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/two_1.png"))); // NOI18N
        faceUpButton.setOpaque(false);
        faceUpButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/two_1.png"))); // NOI18N
        faceUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faceUpButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("  Hair");

        hairDownButton.setBackground(new java.awt.Color(204, 204, 255));
        hairDownButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/one_1.png"))); // NOI18N
        hairDownButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/oneb.png"))); // NOI18N
        hairDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hairDownButtonActionPerformed(evt);
            }
        });

        hairUpButton.setBackground(new java.awt.Color(204, 204, 255));
        hairUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/two_1.png"))); // NOI18N
        hairUpButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/twob.png"))); // NOI18N
        hairUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hairUpButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("  Tops");

        topsDownButton.setBackground(new java.awt.Color(204, 255, 204));
        topsDownButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/oneaa1.png"))); // NOI18N
        topsDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topsDownButtonActionPerformed(evt);
            }
        });

        topsUpButton.setBackground(new java.awt.Color(204, 255, 204));
        topsUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/twoaa2.png"))); // NOI18N
        topsUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topsUpButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Bottoms");

        jButton8.setBackground(new java.awt.Color(204, 255, 204));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/oneaa1.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 255, 204));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/twoaa2.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(153, 204, 255));
        jButton10.setText("Save");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel5.setText(" Shoes");

        jButton11.setBackground(new java.awt.Color(204, 255, 204));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/oneaa1.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(204, 255, 204));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/twoaa2.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/one_1.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/oneb.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/two_1.png"))); // NOI18N
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/twob.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/two_1.png"))); // NOI18N
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/twob.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/one_1.png"))); // NOI18N
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/oneb.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nose");

        jLabel7.setText("Mouth");

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/one_1.png"))); // NOI18N
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/oneb.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/two_1.png"))); // NOI18N
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/twob.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(102, 204, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/one_1.png"))); // NOI18N
        jButton13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/oneb.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(153, 204, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/two_1.png"))); // NOI18N
        jButton14.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/twob.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel8.setText("Brows");

        jLabel9.setText("Liner");

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/one_1.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/two_1.png"))); // NOI18N
        jButton16.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/two_1.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel10.setText(" Cheeks");

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/one_1.png"))); // NOI18N
        jButton17.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/oneb.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/two_1.png"))); // NOI18N
        jButton18.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/doll/twob.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel11.setText("Lashes");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topsUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(topsDownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(51, 51, 51))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(faceDownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(faceUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(hairDownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hairUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton10)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))))
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel11)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(83, 83, 83)
                .addComponent(jLabel7)
                .addGap(43, 43, 43))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(faceUpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(faceDownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(hairUpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hairDownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topsDownButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topsUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//button listeners
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         //shoes Down
        
        shoesInt--;
        if(shoesInt < 0)
        {
            shoesInt = 1;
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //save
        saveInt = 1;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void topsUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topsUpButtonActionPerformed
        // TODO add your handling code here:
        topsInt++;
        if(topsInt > 2)
        {
            topsInt = 0;
        }
    }//GEN-LAST:event_topsUpButtonActionPerformed

    private void topsDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topsDownButtonActionPerformed
        // TODO add your handling code here:
        topsInt--;
        if(topsInt < 0)
        {
            topsInt = 2;
        }
    }//GEN-LAST:event_topsDownButtonActionPerformed

    private void hairUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hairUpButtonActionPerformed
        // TODO add your handling code here:
        hairInt++;
        if(hairInt > 2)
        {
            hairInt = 0;
        }
    }//GEN-LAST:event_hairUpButtonActionPerformed

    private void hairDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hairDownButtonActionPerformed
        // TODO add your handling code here:
        hairInt--;
        if(hairInt < 0)
        {
            hairInt = 2;
        }
    }//GEN-LAST:event_hairDownButtonActionPerformed

    private void faceUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faceUpButtonActionPerformed
        // TODO add your handling code here:
        eyeInt++;
        if(eyeInt > 6)
        {
            eyeInt = 0;
        }
    }//GEN-LAST:event_faceUpButtonActionPerformed

    private void faceDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faceDownButtonActionPerformed
        // eye down
        eyeInt--;
        if(eyeInt < 0)
        {
            eyeInt = 6;
        }
    }//GEN-LAST:event_faceDownButtonActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // Cheek Button
        cheekInt--;
        if(cheekInt < 0)
        {
            cheekInt = 2;
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // Cheek up button
        cheekInt++;
        if(cheekInt > 2)
        {
            cheekInt = 0;
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Nose down
        noseInt--;
        if(noseInt < 0)
        {
            noseInt = 1;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Nose up
        noseInt++;
        if(noseInt > 1)
        {
            noseInt = 0;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Mouth down
        mouthInt--;
        if(mouthInt < 0)
        {
            mouthInt = 8;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Mouth up
        mouthInt++;
        if(mouthInt > 8)
        {
            mouthInt = 0;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Brows Down
        browInt--;
        if(browInt < 0)
        {
            browInt = 5;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Brows Up
        browInt++;
        if(browInt > 5)
        {
            browInt = 0;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // Liner down
        linerInt--;
        if(linerInt < 0)
        {
            linerInt = 4;
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // Liner up
        linerInt++;
        if(linerInt > 4)
        {
            linerInt = 0;
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // Lashes Up
        
        lashesInt++;
        if(lashesInt > 3)
        {
            lashesInt = 0;
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // Lashes Down
        
        lashesInt--;
        if(lashesInt < 0)
        {
            lashesInt = 3;
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         // bottoms Down
        
        bottomsInt--;
        if(bottomsInt < 0)
        {
            bottomsInt = 3;
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //Bottoms Up
        
        bottomsInt++;
        if(bottomsInt > 3)
        {
            bottomsInt = 0;
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // shoes Up
        
        shoesInt++;
        if(shoesInt > 1)
        {
            shoesInt = 0;
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    
    /**
     * running the code
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Layout().setVisible(true);
                
            }
        });
    }
    
    private JPanel jPanel2;
    // Dressup doll starts here
    class Panel2 extends JPanel implements ActionListener
    {
        //gets all the images used
        Image head;
        Image hairBelow;
        Image hairAbove;
        Image star, star2;
        Image bg;
        Image face1, face2;
        Image hair1, hair2a, hair2b, hair3a, hair3b;
        Image shirt1, shirt2, shirt3;
        Image bottom1, bottom2, bottom3;
        Image shoe1, shoe2;
        Image eye1, eye2, eye3, eye4, eye5, eye6, eye7;
        Image brows1, brows2, brows3, brows4, brows5, brows6;
        Image cheek0, cheek1, cheek2, cheek3, cheek4;
        Image nose1, nose2;
        Image mouth1, mouth2, mouth3, mouth4, mouth5, mouth6, mouth7, mouth8, mouth9;
        Image liner0, liner1, liner2, liner3;
        Image lashes0, lashes1, lashes2, lashes3, lashes4;
        Image blink;
        Image flake, flakebg;
       
        //create timer and variables
        Timer timer;
        //position of sun/moon
        float x, y;
        //paramtetric t for sun/moon position
        float t = 0;
        //color red, green, and blue for background of sky
        int r = 150;
        int gr = 240;
        int b = 240;
        
        //tells if the sun has set
        int setting = 0;
        
        //counts the frame
        int count = 0;
        
        //checks the interval time for blink animation
        int checkBlink = 0;
        
        
        //arraylists to create scroll through for buttons, so can chose clothes
        ArrayList<Image> face = new ArrayList<Image>();
        ArrayList<Image> hairAboves = new ArrayList<Image>();
        ArrayList<Image> hairBelows = new ArrayList<Image>();
        ArrayList<Image> tops = new ArrayList<Image>();
        ArrayList<Image> bottoms = new ArrayList<Image>();
        ArrayList<Image> shoes = new ArrayList<Image>();
        ArrayList<Image> eyes = new ArrayList<Image>();
        ArrayList<Image> cheeks = new ArrayList<Image>();
        ArrayList<Image> nose = new ArrayList<Image>();
        ArrayList<Image> mouths = new ArrayList<Image>();
        ArrayList<Image> brows = new ArrayList<Image>();
        ArrayList<Image> liners = new ArrayList<Image>();
        ArrayList<Image> lashes = new ArrayList<Image>();
        
        
        
        //creates the panel the doll is in
        Panel2() 
        {
            // set a preferred size for the custom panel.
            setPreferredSize(new Dimension(420,420));
            
            //sets up the images
            setupImages();
            
            //initializes the sun's position
            x = -300;
            y = 0;
            
            //set up timer
            timer = new Timer(500, this);
            timer.start();
            
            //checks if save file is pressed
            if(saveInt == 1)
            {
                saveFile();
            }
        }
       
       //get all of the doll clothes
       public void setupImages()
       {
           ImageIcon ii =
                new ImageIcon(this.getClass().getResource("doll.png"));
            
            star = ii.getImage();
            
            ImageIcon ii3 =
                new ImageIcon(this.getClass().getResource("bg_1.png"));
            bg = ii3.getImage();
            
            ImageIcon ii4 =
                new ImageIcon(this.getClass().getResource("face1.png"));
            face1 = ii4.getImage();
            
            ImageIcon ii5 =
                new ImageIcon(this.getClass().getResource("face2.png"));
            face2 = ii5.getImage();
            
            ImageIcon ii6 =
                new ImageIcon(this.getClass().getResource("clothes/1/hair2a.png"));
            hair2a = ii6.getImage();
            
            ImageIcon ii7 =
                new ImageIcon(this.getClass().getResource("clothes/1/hair2_1.png"));
            hair2b = ii7.getImage();
            
            ImageIcon ii8 =
                new ImageIcon(this.getClass().getResource("hair3.png"));
            hair3a = ii8.getImage();
            
            ImageIcon it8 =
                new ImageIcon(this.getClass().getResource("hair3.png"));
            hair3b = it8.getImage();
            
            ImageIcon ii9 =
                new ImageIcon(this.getClass().getResource("dress1.png"));
            shirt1 = ii9.getImage();
            
            ImageIcon ii10 =
                new ImageIcon(this.getClass().getResource("dress2.png"));
            shirt2 = ii10.getImage();
            
            
            ImageIcon ii12 =
                new ImageIcon(this.getClass().getResource("faceFIND.png"));
            head = ii12.getImage();
            
            ImageIcon ii13 =
                new ImageIcon(this.getClass().getResource("hairb1.png"));
            hairBelow = ii13.getImage();
            
            ImageIcon ii14 =
                new ImageIcon(this.getClass().getResource("haira1.png"));
            hairAbove = ii14.getImage();
            
            ImageIcon ii15 =
                new ImageIcon(this.getClass().getResource("clothes/7/eyes1.png"));
            eye1 = ii15.getImage();
            
            ImageIcon ii16 =
                new ImageIcon(this.getClass().getResource("clothes/7/eyes2.png"));
            eye2 = ii16.getImage();
            
            ImageIcon ii17 =
                new ImageIcon(this.getClass().getResource("clothes/7/eyes3.png"));
            eye3 = ii17.getImage();
            
            ImageIcon ii18 =
                new ImageIcon(this.getClass().getResource("clothes/7/eyes4.png"));
            eye4 = ii18.getImage();
            
            ImageIcon ii19 =
                new ImageIcon(this.getClass().getResource("clothes/7/eyes5.png"));
            eye5 = ii19.getImage();
            
            ImageIcon ii20 =
                new ImageIcon(this.getClass().getResource("clothes/7/eyes6.png"));
            eye6 = ii20.getImage();
            
            ImageIcon ii21 =
                new ImageIcon(this.getClass().getResource("clothes/7/eyes7.png"));
            eye7 = ii21.getImage();
            
            ImageIcon ii22 =
                new ImageIcon(this.getClass().getResource("clothes/5/nose1.png"));
            nose1 = ii22.getImage();
            
            ImageIcon ii23 =
                new ImageIcon(this.getClass().getResource("clothes/5/nose2.png"));
            nose2 = ii23.getImage();
            
            ImageIcon ii24 =
                new ImageIcon(this.getClass().getResource("clothes/6/mouth1.png"));
            mouth1 = ii24.getImage();
            
            ImageIcon ii25 =
                new ImageIcon(this.getClass().getResource("clothes/6/mouth2.png"));
            mouth2 = ii25.getImage();
            
            ImageIcon ii26 =
                new ImageIcon(this.getClass().getResource("clothes/6/mouth3.png"));
            mouth3 = ii26.getImage();
            
            ImageIcon ii27 =
                new ImageIcon(this.getClass().getResource("clothes/6/mouth4.png"));
            mouth4 = ii27.getImage();
            
            ImageIcon ii28 =
                new ImageIcon(this.getClass().getResource("clothes/6/mouth5.png"));
            mouth5 = ii28.getImage();
            
            ImageIcon ii29 =
                new ImageIcon(this.getClass().getResource("clothes/6/mouth6.png"));
            mouth6 = ii29.getImage();
            
            ImageIcon ii30 =
                new ImageIcon(this.getClass().getResource("clothes/6/mouth7.png"));
            mouth7 = ii30.getImage();
            
            ImageIcon ii31 =
                new ImageIcon(this.getClass().getResource("clothes/6/mouth8.png"));
            mouth8 = ii31.getImage();
            
            ImageIcon ii32 =
                new ImageIcon(this.getClass().getResource("clothes/6/mouth9.png"));
            mouth9 = ii32.getImage();
            
            ImageIcon ii33 =
                new ImageIcon(this.getClass().getResource("clothes/4/brows1.png"));
            brows1 = ii33.getImage();
            
            ImageIcon ii34 =
                new ImageIcon(this.getClass().getResource("clothes/4/brows2.png"));
            brows2 = ii34.getImage();
            
            ImageIcon ii35 =
                new ImageIcon(this.getClass().getResource("clothes/4/brows3.png"));
            brows3 = ii35.getImage();
            
            ImageIcon ii36 =
                new ImageIcon(this.getClass().getResource("clothes/4/brows4.png"));
            brows4 = ii36.getImage();
            
            ImageIcon ii37 =
                new ImageIcon(this.getClass().getResource("clothes/4/brows5.png"));
            brows5 = ii37.getImage();
            
            ImageIcon ii38 =
                new ImageIcon(this.getClass().getResource("clothes/10/eyelashes1.png"));
            lashes1 = ii38.getImage();
            
            ImageIcon ii39 =
                new ImageIcon(this.getClass().getResource("clothes/10/eyelashes2.png"));
            lashes2 = ii39.getImage();
            
            ImageIcon ii40 =
                new ImageIcon(this.getClass().getResource("clothes/10/eyelashes3.png"));
            lashes3 = ii40.getImage();
            
            ImageIcon ii41 =
                new ImageIcon(this.getClass().getResource("clothes/10/eyelashes4.png"));
            lashes4 = ii41.getImage();
            
            ImageIcon ii42 =
                new ImageIcon(this.getClass().getResource("clothes/11/eyeliner1.png"));
            liner1 = ii42.getImage();
            
            ImageIcon ii43 =
                new ImageIcon(this.getClass().getResource("clothes/11/eyeliner2.png"));
            liner2 = ii43.getImage();
            
            ImageIcon ii44 =
                new ImageIcon(this.getClass().getResource("clothes/11/eyeliner3.png"));
            liner3 = ii44.getImage();
            
            ImageIcon ii45 =
                new ImageIcon(this.getClass().getResource("clothes/8/cheek.png"));
            cheek0 = ii45.getImage();
            
            ImageIcon ii46 =
                new ImageIcon(this.getClass().getResource("clothes/9/blush1.png"));
            cheek1 = ii46.getImage();
            
            ImageIcon ii47 =
                new ImageIcon(this.getClass().getResource("clothes/9/blush2.png"));
            cheek2 = ii47.getImage();
            
            ImageIcon ii48 =
                new ImageIcon(this.getClass().getResource("clothes/9/blush3.png"));
            cheek3 = ii48.getImage();
            
            ImageIcon ii49 =
                new ImageIcon(this.getClass().getResource("clothes/12/blink1.png"));
            blink = ii49.getImage();
            
            ImageIcon ii50 =
                new ImageIcon(this.getClass().getResource("pants1.png"));
            bottom1 = ii50.getImage();
            
            ImageIcon ii51 =
                new ImageIcon(this.getClass().getResource("pants2.png"));
            bottom2 = ii51.getImage();
            
            ImageIcon ii52 =
                new ImageIcon(this.getClass().getResource("shoes1.png"));
            shoe2 = ii52.getImage();
            
            ImageIcon ii53 =
                    new ImageIcon(this.getClass().getResource("flake.png"));
            flake = ii53.getImage();
            
            ImageIcon ii54 =
                    new ImageIcon(this.getClass().getResource("flakebg.png"));
            flakebg = ii54.getImage();
                    
            
            //add the clothes to arraylists
            face.add(face1);
            face.add(face2);
            hairAboves.add(hairAbove);
            hairAboves.add(hair2a);
            hairAboves.add(hair3a);
            hairBelows.add(hairBelow);
            hairBelows.add(hair2b);
            hairBelows.add(hair3b);
            tops.add(shirt1);
            tops.add(shirt2);
            tops.add(shirt3);
            eyes.add(eye1);
            eyes.add(eye2);
            eyes.add(eye3);
            eyes.add(eye4);
            eyes.add(eye5);
            eyes.add(eye6);
            eyes.add(eye7);
            nose.add(nose1);
            nose.add(nose2);
            mouths.add(mouth1);
            mouths.add(mouth2);
            mouths.add(mouth3);
            mouths.add(mouth4);
            mouths.add(mouth5);
            mouths.add(mouth6);
            mouths.add(mouth7);
            mouths.add(mouth8);
            mouths.add(mouth9);
            brows.add(brows1);
            brows.add(brows2);
            brows.add(brows3);
            brows.add(brows4);
            brows.add(brows5);
            brows.add(brows6);
            lashes.add(lashes0);
            lashes.add(lashes1);
            lashes.add(lashes2);
            lashes.add(lashes3);
            lashes.add(lashes4);
            liners.add(liner0);
            liners.add(liner1);
            liners.add(liner2);
            liners.add(liner3);
            cheeks.add(cheek4);
            cheeks.add(cheek0);
            cheeks.add(cheek1);
            cheeks.add(cheek2);
            cheeks.add(cheek3);
            tops.add(shirt3);
            tops.add(shirt1);
            tops.add(shirt2);
            bottoms.add(bottom1);
            bottoms.add(bottom2);
            bottoms.add(bottom3);
            shoes.add(shoe1);
            shoes.add(shoe2);
            
            
            setDoubleBuffered(true);
       }
       //paints the panel
       public void paintComponent(final Graphics g) 
       {
           super.paintComponent(g);

            
            Toolkit.getDefaultToolkit().sync();
            
            //paints the sun/moon position
            g.setColor(Color.yellow);
            g.fillOval((int)x + 300, (int)y + 300, 150, 150);
            
            
            //night
            if(setting % 2 != 0)
            {
                //sunset colors: adjusts red, green and blue values
                    if(r > 0)
                    {
                        r--;
                    }
                    if(gr > 0)
                    {
                         gr = gr - 1;
                         b = b - 1;
                    }
                    //moon cycle
                    Color sky = new Color(r,gr,b);
                    if(count >= 300)
                    {
                        count = 0;
                    }
                    if(count >= 150)
                    {
                       this.setBackground(sky);
                       this.setForeground(sky);
                       g.setColor(sky);
                       g.fillOval((int)x + 300 - 150 + count, (int)y + 300, 150, 150); 
                    }
                    else
                    {
                        this.setBackground(sky);
                        this.setForeground(sky);
                        g.setColor(sky);
                        g.fillOval((int)x + 300 - count, (int)y + 300, 150, 150);
                    }
                
            }
            //sun
            if(setting % 2 == 0)
            {
                //sunrise colors: : adjusts red, green and blue values 
                    if(r < 150)
                    {
                        r+=1;
                    }
                    if(gr < 250)
                    {
                        gr = gr + 5;
                        b = b + 5;
                    }
                 //draws the sky
                    Color sky = new Color(r,gr,b);
                    this.setBackground(sky);
                    this.setForeground(sky);
                
            }
             
            
            //draw on the clothes and background
            
            g.drawImage(bg, -150, -250, this);
            
            
            
            g.drawImage(hairBelows.get(hairInt), -150, -300, this);
            g.drawImage(head, -150, -300, this);
            
            //checks if blink animation, if yes, doll blinks
            if(checkBlink == 0)
            {
                g.drawImage(eyes.get(eyeInt), 24, -77, this);
                g.drawImage(lashes.get(lashesInt), 24, -77, this);
            }
            else
            {
                g.drawImage(blink, 24, -77, this);
                g.drawImage(lashes.get(0), 24, -77, this);
            }
            
            g.drawImage(nose.get(noseInt), 24, -79, this);
            g.drawImage(mouths.get(mouthInt), 28, -78, this);
            g.drawImage(cheeks.get(cheekInt), 22, -78, this);
            g.drawImage(brows.get(browInt), 22, -81, this);
            g.drawImage(liners.get(linerInt), 22, -81, this);
            g.drawImage(hairAboves.get(hairInt), -150, -300, this);
            g.drawImage(shoes.get(shoesInt), -151, -303, this);
            g.drawImage(bottoms.get(bottomsInt), -150, -300, this);
            
            g.drawImage(tops.get(topsInt), -150, -300, this);
            
            //if save, pauses timer to save
            if(saveInt == 1)
            {
               saveInt = 0;
               timer.stop();
               saveFile(); 
            }
            g.dispose();
          
            
            
        }
       
       
       //updates the movements, frame count
        public void actionPerformed(ActionEvent e) {
 
            
            count++;
            
            if(count % 7 == 0)
            {
                checkBlink = 1;
            }
            else
            {
                checkBlink = 0;
            }
            
            //resets the parametric t for sun's path
            if(t > 2*Math.PI)
            {
                t = 0;
            }
            //adjusts the path
            t+= .3;
            x = (float)(-300*Math.cos(t));
            y = (float)(-300*Math.sin(t));
            
            //checks if sunset to change to night/day
            if(y >= -6 && y <= 0)
            {
                setting++;
            }

            
            repaint();  
        }
       

    //-----------------------------


   

            //save
    public void saveFile()
    {
        saveInt = 0;
        timer.stop();
            String inputName = (String)JOptionPane.showInputDialog(null,"Name file","Start Game",JOptionPane.PLAIN_MESSAGE,null,null,"Enter Name Here");
            inputName += ".png";

            File outputFile = new File(inputName);
             try
                {
                    BufferedImage imageSave = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
                    Graphics2D graphics2D = imageSave.createGraphics();
                    this.paint(graphics2D);
                    ImageIO.write(imageSave,"png", outputFile);
                    
                }
       
            catch ( IOException e )
            {
               JOptionPane.showMessageDialog( this,
                                          "Error saving file",
                                              "oops!",
                                              JOptionPane.ERROR_MESSAGE );
            }
             saveInt = 0;
             
             //restarts timer
             timer.restart();
             
    }

        
        
    }

    
    //Creates variables
    
    public static int time = -1;
    public static int timeSea = -2;
    public static int eyeInt = 0;
    public static int browInt = 0;
    public static int cheekInt = 0;
    public static int noseInt = 0;
    public static int mouthInt = 0;
    public static int hairInt = 0;
    public static int linerInt = 0;
    public static int topsInt = 0;
    public static int bottomsInt = 0;
    public static int shoesInt = 0;
    public static int lashesInt = 0;
    public static int saveInt = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton faceDownButton;
    private javax.swing.JButton faceUpButton;
    private javax.swing.JButton hairDownButton;
    private javax.swing.JButton hairUpButton;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton topsDownButton;
    private javax.swing.JButton topsUpButton;
    // End of variables declaration//GEN-END:variables

    
    
 


}
