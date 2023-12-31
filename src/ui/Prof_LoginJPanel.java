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
public class Prof_LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Prof_LandingJPanel
     */
    private Student_details_list students;
    private Professor_details_list professors;
    private Course_details_list  courses;
    private JPanel bottom_panel;
    private Professor_details prof_details;    
    
    public Prof_LoginJPanel(JPanel bottom_panel, Student_details_list students, Professor_details_list professors, Course_details_list courses) {
        initComponents();
        this.bottom_panel = bottom_panel;
        this.students = students;
        this.professors = professors;
        this.courses = courses;        
        
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
        txtfield_username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Professor Portal");
        add(jLabel1);
        jLabel1.setBounds(6, 6, 1494, 50);

        txtfield_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_usernameActionPerformed(evt);
            }
        });
        add(txtfield_username);
        txtfield_username.setBounds(743, 227, 200, 35);

        btn_login.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        add(btn_login);
        btn_login.setBounds(717, 478, 87, 34);

        btn_back.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_back.setText("< Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        add(btn_back);
        btn_back.setBounds(717, 589, 87, 34);

        lbl_username.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        lbl_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_username.setText("User ID");
        add(lbl_username);
        lbl_username.setBounds(630, 225, 89, 35);

        lbl_password.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        lbl_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_password.setText("Password");
        add(lbl_password);
        lbl_password.setBounds(630, 354, 89, 35);
        add(jPasswordField1);
        jPasswordField1.setBounds(743, 356, 200, 35);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/agash/Documents/The Boys/Student.png")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(2, -3, 1500, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfield_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_usernameActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        try{
        for (Professor_details prof_details: professors.getProfessor_list()){
            if ( Integer.parseInt(txtfield_username.getText())==prof_details.getUserid() && prof_details.getPassword().equals(String.valueOf(jPasswordField1.getPassword()))){
                this.prof_details = prof_details;
                Prof_panel prof_panel = new Prof_panel(bottom_panel, students, professors, courses, prof_details);
                bottom_panel.add("prof_panel",prof_panel);
                CardLayout layout = (CardLayout) bottom_panel.getLayout();
                layout.next(bottom_panel);             
            }
        }
      
        if (this.prof_details == null)
        {
            JOptionPane.showMessageDialog(this, "Unable to find the user/ Incorrect credentials");
        }
        }
catch(Exception e){
    JOptionPane.showMessageDialog(null, "Kindly Refill with appropriate details");
}      

    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        bottom_panel.remove(this);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.previous(bottom_panel);          
    }//GEN-LAST:event_btn_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JTextField txtfield_username;
    // End of variables declaration//GEN-END:variables
}
