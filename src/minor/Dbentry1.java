/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import com.sun.glass.events.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Bikash
 */
public class Dbentry1 extends javax.swing.JFrame {

    /**
     * Creates new form Dbentry1
     */
    String uname,date;
    public Dbentry1(String a,String b) {
        initComponents();
        setResizable(false);
        setLocation(275,150);
        setSize(870,450);
        setTitle("MANPOWER EXPENSES ENTRY");
        uname=a;
        date=b;
        date_txt.setText(date);
        
         Icon icon0 = new ImageIcon(getClass().getResource("save_1.png"));
        jButton1.setIcon(icon0);
    }
    private void close() {
        WindowEvent winClosingEvent =new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dbads = new javax.swing.JTextField();
        dbmno = new javax.swing.JTextField();
        dbpaid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dba_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dbcon = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        dbmtype = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Manpower Type");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Manpower Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Paid ammount");

        dbads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbadsActionPerformed(evt);
            }
        });

        dbmno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbmnoActionPerformed(evt);
            }
        });
        dbmno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dbmnoKeyTyped(evt);
            }
        });

        dbpaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dbpaidKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("PREVIOUS ENTRY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Agent Name");

        dba_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dba_nameActionPerformed(evt);
            }
        });
        dba_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dba_nameKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Contact");

        dbcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbconActionPerformed(evt);
            }
        });
        dbcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dbconKeyTyped(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("MY DATA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        dbmtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbmtypeActionPerformed(evt);
            }
        });
        dbmtype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dbmtypeKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Agent Address");

        jLabel6.setText("RS");

        date_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(65, 65, 65)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dbpaid, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dbmtype, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dbmno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dba_name, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dbcon)
                                    .addComponent(dbads, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dba_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(dbcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dbads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dbmtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dbmno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dbpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dbmnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbmnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbmnoActionPerformed

    private void dbconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbconActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dbconnect db= new Dbconnect();
        db.connect();
        Connection con=db.con;
        try{
            
            Statement stmt;
            stmt=con.createStatement();
            String log,a_name,contact,address,m_type,m_no,paid;
            a_name=dba_name.getText();
            contact=dbcon.getText();
            address=dbads.getText();
            m_type=dbmtype.getText();
            m_no=dbmno.getText();
            paid=dbpaid.getText(); 
            
            if(a_name.isEmpty()||contact.isEmpty()||address.isEmpty()||m_type.isEmpty()||m_no.isEmpty()||paid.isEmpty()){
             
                JOptionPane.showMessageDialog(null, "emplty field");
            
            }
            else {
                
            
            
            String x="insert into `manpower`(`username`,`a_name`,`contact`,`address`,`date`,`m_type`,`m_no`,`p_amount`) values('"+uname+"','"+a_name+"','"+contact+"','"+address+"','"+date+"','"+m_type+"','"+m_no+"','"+paid+"')";
            stmt.executeUpdate(x);
            JOptionPane.showMessageDialog(null, "ADDED");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Dbentry db= new Dbentry(uname);
        db.setVisible(true);
        close();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dbadsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbadsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbadsActionPerformed

    private void dbmtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbmtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbmtypeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Table_1 tb =new Table_1(uname,date);
        tb.setVisible(true);
        close();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void dba_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dba_nameKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)|| Character.isSpace(c)  || (c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID ENTRY");
        }
    }//GEN-LAST:event_dba_nameKeyTyped

    private void dbconKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbconKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID ENTRY");
        }
    }//GEN-LAST:event_dbconKeyTyped

    private void dbmtypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbmtypeKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)|| Character.isSpace(c)  || (c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID ENTRY");
        }
    }//GEN-LAST:event_dbmtypeKeyTyped

    private void dbmnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbmnoKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID ENTRY");
        }
    }//GEN-LAST:event_dbmnoKeyTyped

    private void dbpaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbpaidKeyTyped
       char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID ENTRY");
        }
    }//GEN-LAST:event_dbpaidKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         dba_name.setText(null);
        dbads.setText(null);
        dbcon.setText(null);
        dbmno.setText(null);
        dbmtype.setText(null);
        dbpaid.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dba_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dba_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dba_nameActionPerformed

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
            java.util.logging.Logger.getLogger(Dbentry1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dbentry1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dbentry1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dbentry1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_txt;
    private javax.swing.JTextField dba_name;
    private javax.swing.JTextField dbads;
    private javax.swing.JTextField dbcon;
    private javax.swing.JTextField dbmno;
    private javax.swing.JTextField dbmtype;
    private javax.swing.JTextField dbpaid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}