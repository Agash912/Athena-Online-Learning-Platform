/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import model.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author agash
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Student_details_list students;
    private Professor_details_list professors;
    private Course_details_list courses;
    private Student_details student;
    private Professor_details professor;
    private Course_details course;
    
    private ArrayList<String> Region = new ArrayList<>(Arrays.asList("","United States", "Canada", "United Kingdom", "Germany", "France", "Australia", "Japan", "Brazil", "India", "China"));
    private ArrayList<String> Language = new ArrayList<>(Arrays.asList("","English", "Spanish", "French", "German", "Chinese", "Japanese", "Russian", "Arabic", "Hindi", "Portuguese"));
    private ArrayList<String> Schedule = new ArrayList<>(Arrays.asList("","Monday 9am to 10am", "Tuesday 11am to 12pm", "Wednesday 1pm to 2pm", "Thursday 3pm to 4pm", "Friday 5pm to 6pm", "Saturday 7pm to 8pm", "Monday 10am to 11am", "Tuesday 2pm to 3pm", "Wednesday 4pm to 5pm", "Thursday 6pm to 7pm"));
    
    
            
    public MainJFrame() {
        initComponents();
        this.students = new Student_details_list();
        this.professors = new Professor_details_list();
        this.courses = new Course_details_list();
        populateProfessors();
        populateStudents();
        populateCourses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        bottom_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton1.setText("Athena Edu.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        bottom_panel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(bottom_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LandingPage landing = new LandingPage(bottom_panel, students, professors, courses);
        bottom_panel.add("Landing Panel",landing);
        CardLayout layout = (CardLayout) bottom_panel.getLayout();
        layout.next(bottom_panel);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    private void populateStudents(){
        
        for (int i = 1; i <= 10; i++) {
            student = students.add_student();
            student.setName("Student"+String.valueOf(i));
            student.setMailid("agash912@gmail.com");
            student.setRegion("Region"+String.valueOf(i));
            student.setAspire("Data Scientist");
            student.setUser_id(i);
            student.setPassword("Student"+String.valueOf(i));
            
            
        }
    }
    
    private void populateProfessors(){
        
        for (int i = 1; i <= 10; i++) {
            professor = professors.add_professor();
            professor.setName("Professor"+String.valueOf(i));
            professor.setMailid("professor"+String.valueOf(i)+"@mail.com");
            professor.setRegion("Region"+String.valueOf(i));
            professor.setSpeciality("Data Science");
            professor.setUserid(i);
            professor.setPassword("Professor"+String.valueOf(i));            
        }
    }
    
    private void populateCourses(){
        
        for (int i = 1; i <= 10; i++) {
            course = courses.add_course();
            course.setTopic("Topic"+String.valueOf(i));
            course.setTerm("Spring 2024");
            course.setSyllabus("Syllabus"+String.valueOf(i));
            course.setCourse_schedule(Schedule.get(i));
            course.setUseful_for("DS");
            course.setLanguage(Language.get(i)); 
            course.setProf("Professor"+String.valueOf(i));
            course.setRegion(Region.get(i));
            course.setExam_set(false);
        }
        
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottom_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
