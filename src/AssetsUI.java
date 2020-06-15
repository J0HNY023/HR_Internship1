


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.Timer;



/**
 *
 * @author ideapad 520
 */
public class AssetsUI extends javax.swing.JFrame {

    /**
     * Creates new form mainUI
     */

    public AssetsUI() {
        initComponents();
        
        
        date();
        time();
        
        //getting the name of the user
        jLabel_firstname.setText(String.valueOf(Name.firstName));
        jLabellastname.setText(String.valueOf(Name.lastName));
        
        
    }
    //DATE AND TIME
    void date(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
         jLabel_date.setText(sdf.format(d));
}
    void time(){
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
            jLabel_time.setText(sdf.format(d));            
            }
        }).start();
    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_firstname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_date = new javax.swing.JLabel();
        jLabel_time = new javax.swing.JLabel();
        jLabel_lastname = new javax.swing.JLabel();
        jLabellastname = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem_absentForm = new javax.swing.JMenuItem();
        jMenuItem_CompensatoryForm = new javax.swing.JMenuItem();
        jMenuItem_dayoffForm = new javax.swing.JMenuItem();
        jMenuItem_memoForm = new javax.swing.JMenuItem();
        jMenuItem_travelPassForm = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IMAGE");

        jLabel_firstname.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel_firstname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_firstname.setText("fn");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Time:");

        jLabel_date.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_date.setText("Date");

        jLabel_time.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_time.setText("Time");

        jLabel_lastname.setForeground(new java.awt.Color(255, 255, 255));

        jLabellastname.setForeground(new java.awt.Color(255, 255, 255));
        jLabellastname.setText("ln");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_date)
                    .addComponent(jLabel_time))
                .addGap(134, 134, 134))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel_lastname))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabellastname, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1079, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_lastname)
                        .addComponent(jLabellastname))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 701, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_time))
                .addGap(3, 3, 3)
                .addComponent(jLabel_date)
                .addContainerGap())
        );

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu10.setText("HR Forms");
        jMenu10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu10ItemStateChanged(evt);
            }
        });
        jMenu10.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu10MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });

        jMenuItem_absentForm.setText("Absent Form");
        jMenuItem_absentForm.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenuItem_absentFormMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenuItem_absentForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_absentFormMouseClicked(evt);
            }
        });
        jMenuItem_absentForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_absentFormActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem_absentForm);

        jMenuItem_CompensatoryForm.setText("Compensatory Form");
        jMenuItem_CompensatoryForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_CompensatoryFormMouseClicked(evt);
            }
        });
        jMenuItem_CompensatoryForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CompensatoryFormActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem_CompensatoryForm);

        jMenuItem_dayoffForm.setText("Day-off Form");
        jMenuItem_dayoffForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_dayoffFormMouseClicked(evt);
            }
        });
        jMenuItem_dayoffForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_dayoffFormActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem_dayoffForm);

        jMenuItem_memoForm.setText("Memo Form");
        jMenuItem_memoForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_memoFormMouseClicked(evt);
            }
        });
        jMenuItem_memoForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_memoFormActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem_memoForm);

        jMenuItem_travelPassForm.setText("Travel Pass Form");
        jMenuItem_travelPassForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_travelPassFormMouseClicked(evt);
            }
        });
        jMenuItem_travelPassForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_travelPassFormActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem_travelPassForm);

        jMenuBar1.add(jMenu10);

        jMenu17.setText("Assets & Amenities Mgmt. Unit");
        jMenuBar1.add(jMenu17);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_absentFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_absentFormMouseClicked
     
    }//GEN-LAST:event_jMenuItem_absentFormMouseClicked

    private void jMenuItem_CompensatoryFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_CompensatoryFormMouseClicked
       
    }//GEN-LAST:event_jMenuItem_CompensatoryFormMouseClicked

    private void jMenuItem_dayoffFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_dayoffFormActionPerformed
        dayoffForm1 rf = new dayoffForm1();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_dayoffFormActionPerformed

    private void jMenuItem_absentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_absentFormActionPerformed
      
        
        
        
        AbsentForms as = new AbsentForms();
        as.setVisible(true);
        as.pack();
        as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_absentFormActionPerformed

    private void jMenuItem_dayoffFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_dayoffFormMouseClicked
    
    }//GEN-LAST:event_jMenuItem_dayoffFormMouseClicked

    private void jMenuItem_memoFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_memoFormMouseClicked
       
    }//GEN-LAST:event_jMenuItem_memoFormMouseClicked

    private void jMenuItem_travelPassFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_travelPassFormMouseClicked
        
    }//GEN-LAST:event_jMenuItem_travelPassFormMouseClicked

    private void jMenuItem_absentFormMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenuItem_absentFormMenuKeyPressed
       
    }//GEN-LAST:event_jMenuItem_absentFormMenuKeyPressed

    private void jMenu10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu10ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu10ItemStateChanged

    private void jMenu10MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu10MenuKeyPressed

    }//GEN-LAST:event_jMenu10MenuKeyPressed

    private void jMenuItem_CompensatoryFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CompensatoryFormActionPerformed
        CompensatoryForm1 rf = new CompensatoryForm1();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_CompensatoryFormActionPerformed

    private void jMenuItem_travelPassFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_travelPassFormActionPerformed
        travelPassform1 rf = new travelPassform1();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_travelPassFormActionPerformed

    private void jMenuItem_memoFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_memoFormActionPerformed
        memoForm rf = new memoForm();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_memoFormActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChiefUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiefUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiefUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiefUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiefUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_firstname;
    private javax.swing.JLabel jLabel_lastname;
    private javax.swing.JLabel jLabel_time;
    private javax.swing.JLabel jLabellastname;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_CompensatoryForm;
    private javax.swing.JMenuItem jMenuItem_absentForm;
    private javax.swing.JMenuItem jMenuItem_dayoffForm;
    private javax.swing.JMenuItem jMenuItem_memoForm;
    private javax.swing.JMenuItem jMenuItem_travelPassForm;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
