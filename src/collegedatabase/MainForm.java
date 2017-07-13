package collegedatabase;
import java.sql.*;
import javax.swing.JOptionPane;
public class MainForm extends javax.swing.JFrame 
{
    Connection cn;
    PreparedStatement st;
    ResultSet rs;
    String url,sql;
    
    int rl;
    int i=0;
    String name,address;
    
    public void MakeConnection()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            url="jdbc:sqlserver://localhost;instanceName=vkunal1996;databaseName=CollegeDb;user=Kunal;password=123";                
            cn=DriverManager.getConnection(url);
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(this,e);   
        }
        
    }    
    public void Close()
    {
        try
        {
            cn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
  
    public MainForm() {
        initComponents();
        MakeConnection();
        P1.setVisible(false);
        P2.setVisible(false);
        P3.setVisible(false);
        P4.setVisible(false);
        P5.setVisible(false);
        P6.setVisible(false);
        P7.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        P1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        P2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        P3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        P4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        P5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        P6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        P7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Searching Record");
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1.add(jRadioButton1);
        jRadioButton1.setText("Show All");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        B1.add(jRadioButton2);
        jRadioButton2.setText("Roll Number ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        B1.add(jRadioButton3);
        jRadioButton3.setText("Namewise");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 20, -1, -1));

        B1.add(jRadioButton4);
        jRadioButton4.setText("AddressWise");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Roll Number", "Name", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        getContentPane().add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 360, 230));

        P2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enter the Roll Number ");
        P2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, -1));
        P2.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 150, 30));

        jButton1.setText("Show Result");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        P2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "RollNumber", "Name", "Address"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        P2.add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 320, -1));

        getContentPane().add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 360, 230));

        P4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Enter the Name :");
        P4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        P4.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 150, 30));

        jButton2.setText("Show Result");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        P4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RollNumber", "Name", "Address"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        P4.add(P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 340, 90));

        getContentPane().add(P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 360, 230));

        P6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Enter the Address :");
        P6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        P6.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 150, 30));

        jButton3.setText("Show Result");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        P6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Roll Number", "Name", "Address"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout P7Layout = new javax.swing.GroupLayout(P7);
        P7.setLayout(P7Layout);
        P7Layout.setHorizontalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
            .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P7Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        P7Layout.setVerticalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P7Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        P6.add(P7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 330, 100));

        getContentPane().add(P6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 360, 230));

        jButton4.setText("Close Connection");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
        P2.setVisible(false);
        P4.setVisible(false);
        P6.setVisible(false);
        i=0;
        sql="SELECT * FROM Student ";
        st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        rs=st.executeQuery();
        rs.last();
            if(rs.getRow()==0)
            {
                JOptionPane.showMessageDialog(this,"Record Not Found");
            }
                else
                {
                    P1.setVisible(true);
                    sql="SELECT * FROM Student ";
                    st=cn.prepareStatement(sql);
                    rs=st.executeQuery();
                        while(rs.next())
                        {
                            jTable1.getModel().setValueAt(rs.getInt("RollNumber"),i,0);
                            jTable1.getModel().setValueAt(rs.getString("StudentName"),i,1);
                            jTable1.getModel().setValueAt(rs.getString("Address"),i,2);
                            i++;
                        }
                        rs.close();
                        st.close();
                       i=0;
                }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
       
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            P1.setVisible(false);
            P2.setVisible(true);
            P3.setVisible(false);
            tf1.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            i=0;
            rl=Integer.parseInt(tf1.getText());
            sql="Select * from Student where RollNumber=?";
            st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            st.setInt(1,rl);
            rs=st.executeQuery();
            rs.last();
                if(rs.getRow()==0)
                {
                    JOptionPane.showMessageDialog(this,"No Record Corrosponding to the Roll Number Found");
                    tf1.setText("");
                }
                    else
                    {
                     P3.setVisible(true);
                     sql="Select * from Student where RollNumber=?";
                     st=cn.prepareStatement(sql);
                     st.setInt(1,rl);
                     rs=st.executeQuery();
                        while(rs.next())
                        {
                            jTable2.getModel().setValueAt(rs.getInt("RollNumber"),i,0);
                            jTable2.getModel().setValueAt(rs.getString("StudentName"),i,1);
                            jTable2.getModel().setValueAt(rs.getString("Address"),i,2);
                            i++;
                        }
                        rs.close();
                        st.close();
                        
                        i=0;
                    }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            tf2.getText();
            name=tf2.getText();
            sql="Select * from Student where StudentName=?";
            st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            st.setString(1,name);
            rs=st.executeQuery();
            rs.last();
                if(rs.getRow()==0)
                {
                    JOptionPane.showMessageDialog(this,"No Reord Found for "+name);
                    tf2.setText("");
                }
                    else
                    {
                        P5.setVisible(true);
                        sql="Select * from Student where StudentName=?";
                        st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                        st.setString(1,name);
                        rs=st.executeQuery();
                        while(rs.next())
                        {
                            jTable3.getModel().setValueAt(rs.getInt("RollNumber"),i,0);
                            jTable3.getModel().setValueAt(rs.getString("StudentName"),i,1);
                            jTable3.getModel().setValueAt(rs.getString("Address"),i,2);
                            i++;
                        }
                        rs.close();
                        st.close();
                        i=0;
                    }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
        P1.setVisible(false);
        P2.setVisible(false);
        P4.setVisible(true);
        P5.setVisible(false);
        tf2.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        try
        {
            P1.setVisible(false);
            P2.setVisible(false);
            P4.setVisible(false);
            P6.setVisible(true);
            P7.setVisible(false);
            tf3.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
            tf2.getText();
            address=tf3.getText();
            sql="Select * from Student where Address=?";
            st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            st.setString(1,address);
            rs=st.executeQuery();
            rs.last();
                if(rs.getRow()==0)
                {
                    JOptionPane.showMessageDialog(this,"No Reord Found for "+address);
                    tf3.setText("");
                }
                    else
                    {
                        P7.setVisible(true);
                        sql="Select * from Student where Address=?";
                        st=cn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                        st.setString(1,address);
                        rs=st.executeQuery();
                        while(rs.next())
                        {
                            jTable4.getModel().setValueAt(rs.getInt("RollNumber"),i,0);
                            jTable4.getModel().setValueAt(rs.getString("StudentName"),i,1);
                            jTable4.getModel().setValueAt(rs.getString("Address"),i,2);
                            i++;
                        }
                        rs.close();
                        st.close();
                       i=0;
                       
                    }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Close();
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup B1;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JPanel P4;
    private javax.swing.JPanel P5;
    private javax.swing.JPanel P6;
    private javax.swing.JPanel P7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
