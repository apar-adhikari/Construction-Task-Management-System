/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Bikash
 */
public class Table_1 extends javax.swing.JFrame {
    
    

    String uname,date;
    public Table_1(String a,String b) {
        uname=a;
        date=b;
        initComponents();
        setResizable(false);
        setLocation(275,150);
        setSize(870,450);
        setTitle("MANPOWER EXPENSES ENTRY");
        
        Dbconnect db= new Dbconnect();
        db.connect();
        Connection con=db.con;
        try{
            Statement stmt;
            stmt= con.createStatement();
            
            String sql="select m_id, a_name,contact,address,date,m_type,m_no,p_amount from manpower where username='"+uname+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
                
            
            
            table_data.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
            
        }
        catch(Exception e){
            System.out.println(e);
        
        }
        table_data.removeColumn(table_data.getColumnModel().getColumn(0));
        
       
}
    public void close(){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_data = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dan = new javax.swing.JTextField();
        dcon = new javax.swing.JTextField();
        dadd = new javax.swing.JTextField();
        ddate = new javax.swing.JTextField();
        dmpt = new javax.swing.JTextField();
        dmn = new javax.swing.JTextField();
        dpa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "agent name", "contact", "address", "date", "manpower type", "manpower no", "paid amount"
            }
        ));
        table_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_data);

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EXPORT TO EXCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        dan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                danKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                danKeyTyped(evt);
            }
        });

        dcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dconKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dconKeyTyped(evt);
            }
        });

        dadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                daddKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                daddKeyTyped(evt);
            }
        });

        dmpt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dmptKeyTyped(evt);
            }
        });

        dmn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dmnKeyTyped(evt);
            }
        });

        dpa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dpaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dan, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dcon, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dadd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ddate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dmpt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dmn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dmpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dmn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Dbentry1 en = new Dbentry1 (uname,date);
       en.setVisible(true);
       close();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
            
           ExcelExporter exp = new ExcelExporter();
           
           String filename;
           
           filename = JOptionPane.showInputDialog("Enter the file name");
           if(filename==null){
               table_data.setVisible(true);
           //exp.exportTable(table_data,new File("C:/Users/Bikash/Documents/"+filename+".xls"));
           }
           else{
               exp.exportTable(table_data,new File("C:/Users/Bikash/Documents/"+filename+".xls"));
           }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);  
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dbconnect fb = new Dbconnect();
        fb.connect();
        Connection con = fb.con;
        
        try{
             Statement stmt;
            stmt= con.createStatement();
             
       
            
            String value1=dan.getText();
            String value2=dcon.getText();
            String value3=dadd.getText();
            String value4=dmpt.getText();
            String value5=dmn.getText();
            String value6=dpa.getText();
            String value7=ddate.getText();
            
            int row=table_data.getSelectedRow();
            
            String Table_click=(table_data.getModel().getValueAt(row,0).toString());
            
            String sql="update manpower set a_name='"+value1+"',contact='"+value2+"',address='"+value3+"',date='"+value7+"',m_type='"+value4+"',m_no='"+value5+"',p_amount='"+value6+"' where m_id='"+Table_click+"' ";
            stmt.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "updated"); 
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
        
        close();
        Table_1 tb = new Table_1(uname,date);
        tb.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void table_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_dataMouseClicked
         Dbconnect fb = new Dbconnect();
        fb.connect();
        Connection con = fb.con;
        try{
            Statement stmt;
            stmt= con.createStatement();
             int row=table_data.getSelectedRow();
             String Table_click=(table_data.getModel().getValueAt(row,0).toString());
             String sql="select a_name,contact,address,date,m_type,m_no,p_amount from manpower where m_id='"+Table_click+"'";
             ResultSet rs;
             rs=stmt.executeQuery(sql);
             if(rs.next()){
                 String add1=rs.getString("a_name");
                 dan.setText(add1);
                 
                  String add2=rs.getString("contact");
                 dcon.setText(add2);
                 
                  String add3=rs.getString("address");
                 dadd.setText(add3);
                 
                  String add4=rs.getString("date");
                 ddate.setText(add4);
                 
                  String add5=rs.getString("m_type");
                 dmpt.setText(add5);
                 
                  String add6=rs.getString("m_no");
                 dmn.setText(add6);
                 
                  String add7=rs.getString("p_amount");
                 dpa.setText(add7);
                 
             }
            
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_table_dataMouseClicked

    private void danKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_danKeyPressed
         
    }//GEN-LAST:event_danKeyPressed

    private void dconKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dconKeyPressed
        
    }//GEN-LAST:event_dconKeyPressed

    private void daddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daddKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_daddKeyPressed

    private void danKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_danKeyTyped
    char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)|| Character.isSpace(c)  || (c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID ENTRY");
        }
    }//GEN-LAST:event_danKeyTyped

    private void dconKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dconKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID ENTRY");
        }
    }//GEN-LAST:event_dconKeyTyped

    private void daddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daddKeyTyped
       
    }//GEN-LAST:event_daddKeyTyped

    private void dmptKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dmptKeyTyped
          char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)|| Character.isSpace(c)  || (c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID ENTRY");
        }
    }//GEN-LAST:event_dmptKeyTyped

    private void dmnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dmnKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID ENTRY");
        }
    }//GEN-LAST:event_dmnKeyTyped

    private void dpaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dpaKeyTyped
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INVALID ENTRY");
        }
    }//GEN-LAST:event_dpaKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Dbconnect fb = new Dbconnect();
        fb.connect();
        Connection con = fb.con;
        
        try{
             Statement stmt;
            stmt= con.createStatement();
             
       
            
           /* String value1=dsp.getText();
            String value2=dcon.getText();
            String value3=dadd.getText();
            String value4=dmp.getText();
            String value5=dcost.getText();
            String value6=dqty.getText();
            String value7=drate.getText();
            */
            int row=table_data.getSelectedRow();
            
            String Table_click=(table_data.getModel().getValueAt(row,0).toString());
            int p=JOptionPane.showConfirmDialog(null,"Do You Really Want To Delete","DELETE",JOptionPane.YES_NO_OPTION);
            if(p==0){
            String sql=("DELETE FROM manpower where m_id="+Table_click);
            stmt.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "deleted");
            
           close();
           Table_1 tb =new Table_1(uname,date);
           tb.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dadd;
    private javax.swing.JTextField dan;
    private javax.swing.JTextField dcon;
    private javax.swing.JTextField ddate;
    private javax.swing.JTextField dmn;
    private javax.swing.JTextField dmpt;
    private javax.swing.JTextField dpa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_data;
    // End of variables declaration//GEN-END:variables
}
