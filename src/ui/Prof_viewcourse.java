/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.*;

/**
 *
 * @author agash
 */
public class Prof_viewcourse extends javax.swing.JPanel {

    /**
     * Creates new form Prof_viewcourse
     */
    private Student_details_list students;
    private Professor_details_list professors;
    private Course_details_list  courses;
    private JPanel bottom_panel;
    private Professor_details prof_details; 
    private Course_details chosen;
    
    public Prof_viewcourse(JPanel bottom_panel, Student_details_list students, Professor_details_list professors, Course_details_list courses, Course_details chosen) {
        initComponents();
        this.bottom_panel = bottom_panel;
        this.students = students;
        this.professors = professors;
        this.courses = courses;  
        this.chosen = chosen;
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
        btn_content = new javax.swing.JButton();
        btn_exam = new javax.swing.JButton();
        btn_Announcements = new javax.swing.JButton();
        btn_students = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        btn_feedback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Course");
        add(jLabel1);
        jLabel1.setBounds(0, 6, 1506, 45);

        btn_content.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_content.setText("Add Content");
        btn_content.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contentActionPerformed(evt);
            }
        });
        add(btn_content);
        btn_content.setBounds(660, 140, 196, 29);

        btn_exam.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_exam.setText("Exam");
        btn_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_examActionPerformed(evt);
            }
        });
        add(btn_exam);
        btn_exam.setBounds(660, 310, 196, 29);

        btn_Announcements.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Announcements.setText("Announcements");
        btn_Announcements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnnouncementsActionPerformed(evt);
            }
        });
        add(btn_Announcements);
        btn_Announcements.setBounds(660, 220, 196, 29);

        btn_students.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_students.setText("Students");
        btn_students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentsActionPerformed(evt);
            }
        });
        add(btn_students);
        btn_students.setBounds(660, 400, 196, 29);

        jToggleButton1.setText("<Back");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1);
        jToggleButton1.setBounds(730, 620, 68, 35);

        btn_feedback.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_feedback.setText("View Feedback");
        btn_feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_feedbackActionPerformed(evt);
            }
        });
        add(btn_feedback);
        btn_feedback.setBounds(660, 500, 196, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/agash/Documents/The Boys/Student.png")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(2, -3, 1500, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_contentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contentActionPerformed
        // TODO add your handling code here:
        Prof_add_content prof_add_content = new Prof_add_content(bottom_panel, chosen);
        bottom_panel.add("prof_add_content",prof_add_content);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.next(bottom_panel);         
    }//GEN-LAST:event_btn_contentActionPerformed

    private void btn_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_examActionPerformed
        // TODO add your handling code here:
        Prof_exam prof_exam = new Prof_exam(bottom_panel,chosen);
        bottom_panel.add("prof_exam",prof_exam);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.next(bottom_panel);         
    }//GEN-LAST:event_btn_examActionPerformed

    private void btn_AnnouncementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnnouncementsActionPerformed
        // TODO add your handling code here:
        Prof_announcement prof_announcement = new Prof_announcement(bottom_panel,chosen);
        bottom_panel.add("prof_announcement",prof_announcement);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.next(bottom_panel);        
    }//GEN-LAST:event_btn_AnnouncementsActionPerformed

    private void btn_studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentsActionPerformed
        // TODO add your handling code here:
        Prof_students prof_students = new Prof_students(bottom_panel, students, chosen);
        bottom_panel.add("prof_students",prof_students);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.next(bottom_panel);         
    }//GEN-LAST:event_btn_studentsActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        bottom_panel.remove(this);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.previous(bottom_panel);        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btn_feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_feedbackActionPerformed
        // TODO add your handling code here:
        Prof_view_feedback prof_view_feedback = new Prof_view_feedback(bottom_panel, chosen);
        bottom_panel.add("prof_view_feedback",prof_view_feedback);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.next(bottom_panel);         
    }//GEN-LAST:event_btn_feedbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Announcements;
    private javax.swing.JButton btn_content;
    private javax.swing.JButton btn_exam;
    private javax.swing.JButton btn_feedback;
    private javax.swing.JButton btn_students;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
