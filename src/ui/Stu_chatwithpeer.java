/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author manish
 */
public class Stu_chatwithpeer extends javax.swing.JPanel {

    /**
     * Creates new form stu_chatwithpeer
     */
    private Student_details_list students;
    private Professor_details_list professors;
    private Course_details_list  courses;
    private JPanel bottom_panel;
    private Student_details student_details;
    private ArrayList<ArrayList<Object>> courses_registered = new ArrayList<>(); 
    private ArrayList<Object> coursePair;
    private String chat;
    private Course_details Course;
    
    public Stu_chatwithpeer(JPanel bottom_panel, Student_details_list students, Professor_details_list professors, Course_details_list courses,Student_details student_details,ArrayList<Object> coursePair) {
        initComponents();
        this.bottom_panel = bottom_panel;
        this.students = students;
        this.professors = professors;
        this.courses = courses;
        this.student_details = student_details;
        this.courses_registered = student_details.getCourses_registered();
        this.coursePair = coursePair;
        
        Course_details Course = (Course_details) coursePair.get(0);
        this.Course = Course;
        String Exam = (String) coursePair.get(1);
        this.chat = Course.getChats();
        if (chat != null && !chat.trim().isEmpty()){
            jTextArea1.setText(this.chat);
        }
        else{
            this.chat="";
        }
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txt_chat = new javax.swing.JTextField();
        btn_sendchat = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Student Portal");
        add(jLabel8);
        jLabel8.setBounds(6, 6, 1494, 44);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1);
        jScrollPane1.setBounds(540, 188, 464, 170);
        add(txt_chat);
        txt_chat.setBounds(574, 460, 363, 39);

        btn_sendchat.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_sendchat.setText("Send");
        btn_sendchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendchatActionPerformed(evt);
            }
        });
        add(btn_sendchat);
        btn_sendchat.setBounds(981, 459, 83, 37);

        btn_back.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_back.setText("<Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        add(btn_back);
        btn_back.setBounds(722, 580, 86, 41);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Enter your message");
        add(jLabel1);
        jLabel1.setBounds(355, 459, 207, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/agash/Documents/The Boys/Student.png")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(2, -3, 1500, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        bottom_panel.remove(this);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.previous(bottom_panel);        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_sendchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendchatActionPerformed
        // TODO add your handling code here:
        LocalDate myObj = LocalDate.now();
        
        this.chat = this.chat+String.valueOf(myObj)+" - "+student_details.getName()+": "+txt_chat.getText()+"\r\n" ;
        jTextArea1.setText(this.chat);
        this.Course.setChats(this.chat);
    }//GEN-LAST:event_btn_sendchatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_sendchat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txt_chat;
    // End of variables declaration//GEN-END:variables
}
