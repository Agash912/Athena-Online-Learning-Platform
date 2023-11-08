/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author agash
 */
public class Employer_students extends javax.swing.JPanel {

    /**
     * Creates new form graduate
     */
    private Student_details_list students;
    private JPanel bottom_panel;
    private Student_details student;
    private String name;
    private String chat;
    
    public Employer_students(JPanel bottom_panel, Student_details_list students) {
        initComponents();
        this.bottom_panel = bottom_panel;
        this.students = students;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        btn_back = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Students");
        add(jLabel1);
        jLabel1.setBounds(6, 6, 1502, 39);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "GPA", "Aspiring to be"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(188, 114, 1192, 169);

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(757, 315, 72, 23);
        add(jTextField1);
        jTextField1.setBounds(682, 621, 227, 23);

        jToggleButton1.setText("Send Message");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1);
        jToggleButton1.setBounds(927, 621, 146, 23);

        btn_back.setText("<Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        add(btn_back);
        btn_back.setBounds(779, 691, 72, 34);

        jTextField2.setEditable(false);
        add(jTextField2);
        jTextField2.setBounds(503, 621, 145, 23);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        add(jScrollPane2);
        jScrollPane2.setBounds(570, 463, 454, 140);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/agash/Documents/The Boys/Student.png")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(2, -3, 1500, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void populateTable(){
    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
    dtm.setRowCount(0);
    for (Student_details student: students.getStudents_list()){
        if (student.isGraduated()==true){
            Object[] row = new Object[3];
            row[0] = student.getName();
            row[1] = student.calculateAverage(student.getGPA());
            row[2] = student.getAspire();
            dtm.addRow(row);
        }    
    }}
        
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        bottom_panel.remove(this);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.previous(bottom_panel);          
    }//GEN-LAST:event_btn_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selected = jTable1.getSelectedRow();
        
        if (selected<0){
            JOptionPane.showMessageDialog(this, "No student selected");
            return;
        }
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        name = (String)dtm.getValueAt(selected, 0);
        
        for (Student_details student:students.getStudents_list()){
            if(name.equals(student.getName())){
                this.student = student;
            }
        }
        
        jTextField2.setText("Messaging: "+student.getName());
        this.chat = student.getChats();
        if (chat != null && !chat.trim().isEmpty()) {
            jTextArea1.setText(chat);
        }
        else{
            this.chat ="";
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        LocalDate myObj = LocalDate.now();
        this.chat = this.chat+String.valueOf(myObj)+" - "+"Employer: "+jTextField1.getText()+"\r\n" ;
        student.setChats(chat);
        JOptionPane.showMessageDialog(this, "Message Sent!");
        jTextArea1.setText(chat);
        
               
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
