
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI Laptop
 */
public class Patient extends javax.swing.JFrame {

    /**
     * Creates new form Patient
     */
    String gender;
    public Patient() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PatientMale = new javax.swing.JRadioButton();
        PatientFemale = new javax.swing.JRadioButton();
        PatientDoctorId = new javax.swing.JTextField();
        PatientName = new javax.swing.JTextField();
        PatientDelete = new javax.swing.JButton();
        PatientUpdate = new javax.swing.JButton();
        PatientAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ShowTable = new javax.swing.JButton();
        PatientAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PatientID = new javax.swing.JTextField();
        Patient_Phone = new javax.swing.JTextField();
        Patient_Age = new javax.swing.JTextField();
        Patient_Disease = new javax.swing.JTextField();
        DoctorShow = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ShowDocotor = new javax.swing.JTable();
        printButton = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Disease");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Patient Panel");

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Patient Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Phone No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Disease");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Doctor ID");

        buttonGroup1.add(PatientMale);
        PatientMale.setText("Male");
        PatientMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(PatientFemale);
        PatientFemale.setText("Female");
        PatientFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientFemaleActionPerformed(evt);
            }
        });

        PatientDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientDelete.setText("Delete");
        PatientDelete.setToolTipText("");
        PatientDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientDeleteActionPerformed(evt);
            }
        });

        PatientUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientUpdate.setText("Update");
        PatientUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientUpdateActionPerformed(evt);
            }
        });

        PatientAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientAdd.setText("Add");
        PatientAdd.setToolTipText("");
        PatientAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientAddActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatientID", "PatientName", "Phone Number", "Age", "Adress", "Disease", "Gender", "DoctorID"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        ShowTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowTable.setText("Show Patient");
        ShowTable.setToolTipText("");
        ShowTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTableActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Patient ID");

        Patient_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patient_PhoneActionPerformed(evt);
            }
        });

        DoctorShow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DoctorShow.setText("Show Doctor");
        DoctorShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorShowActionPerformed(evt);
            }
        });

        ShowDocotor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DoctorId", "Doctor_Name", "Department", "Visit"
            }
        ));
        jScrollPane3.setViewportView(ShowDocotor);

        printButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        printButton.setText("Print A Copy");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PatientMale)
                                        .addGap(37, 37, 37)
                                        .addComponent(PatientFemale))
                                    .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PatientDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Patient_Disease, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DoctorShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ShowTable, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(printButton, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PatientDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PatientAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PatientUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Patient_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Patient_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(PatientDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back)
                            .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(PatientUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Patient_Phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Patient_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Patient_Disease, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(PatientMale)
                                    .addComponent(PatientFemale))
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PatientDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PatientAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(DoctorShow, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ShowTable, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(printButton)))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Patient_Type().show();
    }//GEN-LAST:event_BackActionPerformed

    private void PatientDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientDeleteActionPerformed
        // TODO add your handling code here:
         try {
              
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            int row = jTable2.getSelectedRow();
            String value = (jTable2.getModel().getValueAt(row, 0).toString());
            String  sql = "DELETE FROM patient WHERE PatientID ="+value;
            PreparedStatement ps = connection.prepareStatement(sql);
        
         ps.executeUpdate();
          DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
          model.setRowCount(0);
         JOptionPane.showMessageDialog(null, "DELETE Complete");
            } catch (Exception e) {
            e.printStackTrace();
        }  
    }//GEN-LAST:event_PatientDeleteActionPerformed

    private void PatientMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientMaleActionPerformed

    private void PatientFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientFemaleActionPerformed

    private void ShowTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTableActionPerformed
       
        
      DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
      model.setRowCount(0);
        
        
        
        try{
              
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
   
   
 
       Statement st = connection.createStatement();
       String sql = "select *from patient";
       
       ResultSet rs = st.executeQuery(sql);
           
       while(rs.next()){
           
           String P_Id = String.valueOf(rs.getInt("PatientID"));
           String P_name = String.valueOf(rs.getString("Patient_Name"));
           String Phone_No = String.valueOf(rs.getString("Phone_no"));
           String Age =  String.valueOf(rs.getInt("Age"));
           String Address = String.valueOf(rs.getString("Áddress"));
           String Disease = String.valueOf(rs.getString("Disease"));
           String Gender = String.valueOf(rs.getString("Gender"));
           String DoctorId =  String.valueOf(rs.getInt("DoctorID"));
              
          
           String tbData[] = {P_Id ,P_name,Phone_No, Age,Address,Disease,Gender,DoctorId};
           
           DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
           
           tblModel.addRow(tbData);
           
       }
       
       
        
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
                      
       
        
    }//GEN-LAST:event_ShowTableActionPerformed

    private void Patient_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patient_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Patient_PhoneActionPerformed

    private void PatientUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientUpdateActionPerformed
      
        
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            int row = jTable2.getSelectedRow();
            String value = (jTable2.getModel().getValueAt(row, 0).toString());
            String sql = "UPDATE patient SET Patient_Name =?,Phone_no =?,Age=?,Áddress=?,Disease=?,Gender=?,DoctorID=? WHERE PatientID =" + value;
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, PatientName.getText());
            ps.setString(2, Patient_Phone.getText());
            ps.setString(3, Patient_Age.getText());
            ps.setString(4, PatientAddress.getText());
            ps.setString(5, Patient_Disease.getText());

            if (PatientMale.isSelected()) {
                gender = "Male";
            }
            if (PatientFemale.isSelected()) {
                gender = "Female";
            }

            ps.setString(6, gender);
            ps.setString(7, PatientDoctorId.getText());

            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            
            JOptionPane.showMessageDialog(null, "UPDATE Complete");
        } catch (Exception e) {
            e.printStackTrace();
        }


                    
        PatientID.setText("");
        PatientName.setText("");
        Patient_Phone.setText("");
        Patient_Age.setText("");
        PatientAddress.setText("");
        Patient_Disease.setText("");
        buttonGroup1.clearSelection();
        PatientDoctorId.setText("");
 

            // TODO add your handling code here:
    }//GEN-LAST:event_PatientUpdateActionPerformed

    private void PatientAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientAddActionPerformed
          
        
        
              String P_Id = PatientID.getText();
              String P_name= PatientName.getText();
              String Phone_No = Patient_Phone.getText();
              String Age = Patient_Age.getText();
              String Address = PatientAddress.getText();
              String Disease = Patient_Disease.getText();
              //String Gender = PatientMale.getText();
              
              if (PatientMale.isSelected()) {
                gender = "Male";
            }
            if (PatientFemale.isSelected()) {
                gender = "Female";
            }
              String DoctorId= PatientDoctorId.getText();
                 
               try {
              
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
   
   
         
             
         String  sqlquery = "INSERT INTO patient(PatientID,Patient_Name,Phone_no,Age,Áddress,Disease,Gender,DoctorID) VALUES ('"+P_Id+"','"+P_name+"','"+Phone_No+"','"+Age+"','"+Address+"','"+Disease+"','"+gender+"','"+DoctorId+"')";
         
         PreparedStatement pst = connection.prepareStatement(sqlquery);
        
         pst.execute();
         JOptionPane.showMessageDialog(null, "Patient Added For Check-Up");
        
      
        
         
        
       ////////////////Clear The Text Field
       
        PatientID.setText("");
        PatientName.setText("");
        Patient_Phone.setText("");
        Patient_Age.setText("");
        PatientAddress.setText("");
        Patient_Disease.setText("");
        buttonGroup1.clearSelection();
        PatientDoctorId.setText("");
       
       
         // this.hide();
       // new login().show();     
             
       
        } catch (Exception e) {
            e.printStackTrace();
        }  
                     
        
    }//GEN-LAST:event_PatientAddActionPerformed

    private void DoctorShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorShowActionPerformed
        // TODO add your handling code here:
      DefaultTableModel model = (DefaultTableModel) ShowDocotor.getModel();
      model.setRowCount(0);
        
         try{
              
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
   
   
 
       Statement st = connection.createStatement();
       String sql = "select *from Doctor";
       
       ResultSet rs = st.executeQuery(sql);
           
       while(rs.next()){
           
           String D_Id = String.valueOf(rs.getInt("DoctorID"));
           String D_name = String.valueOf(rs.getString("Doctor_Name"));
           String department= String.valueOf(rs.getString("Department"));
           String visit =  String.valueOf(rs.getInt("Visit"));
          
              
          
           String tbData[] = {D_Id ,D_name,department, visit};
           
           DefaultTableModel tblModel = (DefaultTableModel)ShowDocotor.getModel();
           
           tblModel.addRow(tbData);
           
       }
       
       
        
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
    }//GEN-LAST:event_DoctorShowActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:

        MessageFormat m = new MessageFormat ("Patient List");
        MessageFormat f = new MessageFormat ("Thankyou");

        try {
            jTable2.print(JTable.PrintMode.NORMAL,m,f);
        } catch (PrinterException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton DoctorShow;
    private javax.swing.JButton PatientAdd;
    private javax.swing.JTextField PatientAddress;
    private javax.swing.JButton PatientDelete;
    private javax.swing.JTextField PatientDoctorId;
    private javax.swing.JRadioButton PatientFemale;
    private javax.swing.JTextField PatientID;
    private javax.swing.JRadioButton PatientMale;
    private javax.swing.JTextField PatientName;
    private javax.swing.JButton PatientUpdate;
    private javax.swing.JTextField Patient_Age;
    private javax.swing.JTextField Patient_Disease;
    private javax.swing.JTextField Patient_Phone;
    private javax.swing.JTable ShowDocotor;
    private javax.swing.JButton ShowTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton printButton;
    // End of variables declaration//GEN-END:variables
}
