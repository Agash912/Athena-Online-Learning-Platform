/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.*;

/**
 *
 * @author agash
 */
public class Prof_add_content extends javax.swing.JPanel {

    /**
     * Creates new form Prof_viewcourse1
     */

    private JPanel bottom_panel;
    private Course_details chosen;   
    
    public Prof_add_content(JPanel bottom_panel,Course_details chosen) {
        initComponents();
        this.bottom_panel = bottom_panel; 
        this.chosen = chosen; 
        txtfield.setText(chosen.getContent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtfield = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Content");
        add(jLabel1);
        jLabel1.setBounds(6, 6, 1494, 40);
        add(txtfield);
        txtfield.setBounds(540, 120, 456, 223);

        btn_add.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        add(btn_add);
        btn_add.setBounds(700, 390, 127, 33);

        jToggleButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jToggleButton1.setText("<Back");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1);
        jToggleButton1.setBounds(700, 520, 127, 33);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/agash/Documents/The Boys/Student.png")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(2, -3, 1500, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        bottom_panel.remove(this);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.previous(bottom_panel);        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        chosen.setContent(txtfield.getText());
        JOptionPane.showMessageDialog(null, "Success!");
        bottom_panel.remove(this);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.previous(bottom_panel);  
    }//GEN-LAST:event_btn_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtfield;
    // End of variables declaration//GEN-END:variables
}