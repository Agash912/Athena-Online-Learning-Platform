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
public class Prof_newcourse extends javax.swing.JPanel {

    /**
     * Creates new form Prof_newcourse
     */
    private Student_details_list students;
    private Professor_details_list professors;
    private Course_details_list  courses;
    private JPanel bottom_panel;
    private Course_details course_details;
    private Professor_details prof_details;
    private boolean found;
    
    public Prof_newcourse(JPanel bottom_panel, Student_details_list students, Professor_details_list professors, Course_details_list courses, Professor_details prof_details) {
        initComponents();
        this.bottom_panel = bottom_panel;
        this.students = students;
        this.professors = professors;
        this.courses = courses;
        this.prof_details = prof_details;
        
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
        btn_add = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        txtfield_topic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfield_term = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_usefulfor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_schedule = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_syllabus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_language = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Course");
        add(jLabel1);
        jLabel1.setBounds(0, 6, 1454, 18);

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        add(btn_add);
        btn_add.setBounds(709, 707, 121, 35);

        btn_back.setText("< Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        add(btn_back);
        btn_back.setBounds(709, 779, 121, 34);
        add(txtfield_topic);
        txtfield_topic.setBounds(709, 145, 280, 23);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Topic");
        add(jLabel2);
        jLabel2.setBounds(571, 148, 99, 17);
        add(txtfield_term);
        txtfield_term.setBounds(709, 218, 280, 23);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Term");
        add(jLabel3);
        jLabel3.setBounds(571, 221, 99, 17);
        add(txt_usefulfor);
        txt_usefulfor.setBounds(709, 364, 280, 23);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Useful for");
        add(jLabel4);
        jLabel4.setBounds(571, 367, 99, 17);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Course Schedule");
        add(jLabel5);
        jLabel5.setBounds(571, 294, 99, 17);

        txt_schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_scheduleActionPerformed(evt);
            }
        });
        add(txt_schedule);
        txt_schedule.setBounds(709, 291, 280, 23);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Syllabus");
        add(jLabel6);
        jLabel6.setBounds(571, 426, 99, 17);
        add(txt_syllabus);
        txt_syllabus.setBounds(709, 437, 280, 103);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Language");
        add(jLabel7);
        jLabel7.setBounds(571, 593, 99, 17);
        add(txt_language);
        txt_language.setBounds(709, 590, 280, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/agash/Documents/The Boys/Student.png")); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(2, -3, 1500, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here
        
        found = false; 
        
        for (Course_details course_details: courses.getCourse_details_list()){
            if(course_details.getProf().equals(prof_details.getName()) && txtfield_topic.getText().equals(course_details.getTopic()) && txtfield_term.getText().equals(course_details.getTerm())){
                found = true;
            }
        }
        
        if (found==false && !txtfield_topic.getText().trim().isEmpty() && !txtfield_term.getText().trim().isEmpty() && !txt_syllabus.getText().trim().isEmpty() && !txt_schedule.getText().trim().isEmpty() && !txt_usefulfor.getText().trim().isEmpty() && !txt_language.getText().trim().isEmpty()){
        
            
        Course_details course_details = courses.add_course();
        course_details.setTopic(txtfield_topic.getText());
        course_details.setTerm(txtfield_term.getText());
        course_details.setSyllabus(txt_syllabus.getText());
        course_details.setCourse_schedule(txt_schedule.getText());
        course_details.setUseful_for(txt_usefulfor.getText());
        course_details.setLanguage(txt_language.getText());
        course_details.setProf(prof_details.getName());
        course_details.setRegion(prof_details.getRegion());
        course_details.setExam_set(false);
        
        
        JOptionPane.showMessageDialog(null, "Added Successfully!!");
        
        txtfield_topic.setText("");
        txtfield_term.setText("");
        txt_syllabus.setText("");
        txt_schedule.setText("");
        txt_usefulfor.setText("");
        txt_language.setText("");
        
        bottom_panel.remove(this);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.previous(bottom_panel);         
        
        }
        else {
            JOptionPane.showMessageDialog(null, "Kindly refill with appropriate details");
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        bottom_panel.remove(this);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.previous(bottom_panel);          
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_scheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_scheduleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_language;
    private javax.swing.JTextField txt_schedule;
    private javax.swing.JTextField txt_syllabus;
    private javax.swing.JTextField txt_usefulfor;
    private javax.swing.JTextField txtfield_term;
    private javax.swing.JTextField txtfield_topic;
    // End of variables declaration//GEN-END:variables
}
