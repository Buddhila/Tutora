
package view;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static view.lec_course.pst;
import static view.lec_course.rs;


public class emp_issus extends javax.swing.JFrame {

    /**
     * Creates new form emp_issus
     */
    public emp_issus() {
        initComponents();
        
         JT1.setModel(new DefaultTableModel(null, new String[]{"Registration no", "Name", "E-mail", "Description"}));

        Connection con;
        try {
            String url = "jdbc:mysql://localhost/tutora";
                String user1 = "root";
                String pass = "";
                con = DriverManager.getConnection(url, user1, pass);

                System.out.println("CONNECTED!");
                

            String sql2 = "SELECT * FROM regissus";

            pst = con.prepareStatement(sql2);

            rs = pst.executeQuery();
            while (rs.next()) {
                String ID = rs.getString("s_id");
                String name = rs.getString("S_name");
                String s1 = rs.getString("email");
                String s2 = rs.getString("discription");

                String arr[] = {ID, name, s1, s2};
                DefaultTableModel table = (DefaultTableModel) JT1.getModel();

                table.addRow(arr);

            }

        } catch (Exception ex) {
            System.err.println("Error" + ex.getMessage());
        }

        
         JT2.setModel(new DefaultTableModel(null, new String[]{"Registration no", "Course ID", "Exam ID","E-mail", "Description"}));

      
        try {
            String url = "jdbc:mysql://localhost/tutora";
                String user1 = "root";
                String pass = "";
                con = DriverManager.getConnection(url, user1, pass);

                System.out.println("CONNECTED!");
                

            String sql2 = "SELECT * FROM exissues";

            pst = con.prepareStatement(sql2);

            rs = pst.executeQuery();
            while (rs.next()) {
                String ID = rs.getString("s_id");
                String name = rs.getString("C_id");
                String s1 = rs.getString("E_id");
                String s3 = rs.getString("email");
                String s2 = rs.getString("dis");

                String arr[] = {ID, name, s1,s3, s2};
                DefaultTableModel table = (DefaultTableModel) JT2.getModel();

                table.addRow(arr);

            }

        } catch (Exception ex) {
            System.err.println("Error" + ex.getMessage());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Cpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SFpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SHpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        inpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        stpanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT2 = new javax.swing.JTable();
        exabutton = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        regbutton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tutora Institute");

        jPanel1.setBackground(new java.awt.Color(17, 36, 88));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\sliit\\sem2\\OOP\\project\\logo\\logo v3.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\sliit\\sem2\\OOP\\project\\logo\\students-cap v2.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Cpanel.setBackground(new java.awt.Color(255, 255, 255));
        Cpanel.setPreferredSize(new java.awt.Dimension(0, 30));
        Cpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CpanelMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel4.setText("course");
        jLabel4.setPreferredSize(new java.awt.Dimension(61, 30));

        javax.swing.GroupLayout CpanelLayout = new javax.swing.GroupLayout(Cpanel);
        Cpanel.setLayout(CpanelLayout);
        CpanelLayout.setHorizontalGroup(
            CpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CpanelLayout.setVerticalGroup(
            CpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CpanelLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SFpanel.setBackground(new java.awt.Color(255, 255, 255));
        SFpanel.setPreferredSize(new java.awt.Dimension(0, 30));
        SFpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SFpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SFpanelMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel5.setText("save Files");
        jLabel5.setPreferredSize(new java.awt.Dimension(61, 30));

        javax.swing.GroupLayout SFpanelLayout = new javax.swing.GroupLayout(SFpanel);
        SFpanel.setLayout(SFpanelLayout);
        SFpanelLayout.setHorizontalGroup(
            SFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        SFpanelLayout.setVerticalGroup(
            SFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFpanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SHpanel.setBackground(new java.awt.Color(255, 255, 255));
        SHpanel.setPreferredSize(new java.awt.Dimension(0, 30));
        SHpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SHpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SHpanelMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel6.setText("Site Home");
        jLabel6.setPreferredSize(new java.awt.Dimension(61, 30));

        javax.swing.GroupLayout SHpanelLayout = new javax.swing.GroupLayout(SHpanel);
        SHpanel.setLayout(SHpanelLayout);
        SHpanelLayout.setHorizontalGroup(
            SHpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SHpanelLayout.setVerticalGroup(
            SHpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHpanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        inpanel.setBackground(new java.awt.Color(255, 255, 255));
        inpanel.setPreferredSize(new java.awt.Dimension(0, 30));
        inpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inpanelMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel7.setText("Inquires");
        jLabel7.setPreferredSize(new java.awt.Dimension(61, 30));

        javax.swing.GroupLayout inpanelLayout = new javax.swing.GroupLayout(inpanel);
        inpanel.setLayout(inpanelLayout);
        inpanelLayout.setHorizontalGroup(
            inpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        inpanelLayout.setVerticalGroup(
            inpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inpanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        stpanel.setBackground(new java.awt.Color(17, 36, 88));
        stpanel.setForeground(new java.awt.Color(17, 36, 88));
        stpanel.setPreferredSize(new java.awt.Dimension(0, 30));
        stpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stpanelMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Issues ");
        jLabel8.setPreferredSize(new java.awt.Dimension(61, 30));

        javax.swing.GroupLayout stpanelLayout = new javax.swing.GroupLayout(stpanel);
        stpanel.setLayout(stpanelLayout);
        stpanelLayout.setHorizontalGroup(
            stpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        stpanelLayout.setVerticalGroup(
            stpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stpanelLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(SFpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(SHpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(inpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Cpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SFpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SHpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        JT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration no", "Name", "E-mail", "Description"
            }
        ));
        jScrollPane1.setViewportView(JT1);

        JT2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration no", "Course ID", "Exam ID", "E-mail", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JT2);

        exabutton.setBackground(new java.awt.Color(17, 36, 88));
        exabutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exabuttonMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Exam Related Issues");

        javax.swing.GroupLayout exabuttonLayout = new javax.swing.GroupLayout(exabutton);
        exabutton.setLayout(exabuttonLayout);
        exabuttonLayout.setHorizontalGroup(
            exabuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exabuttonLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        exabuttonLayout.setVerticalGroup(
            exabuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        regbutton.setBackground(new java.awt.Color(17, 36, 88));
        regbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regbuttonMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Open Sans Semibold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Registration Related issues");

        javax.swing.GroupLayout regbuttonLayout = new javax.swing.GroupLayout(regbutton);
        regbutton.setLayout(regbuttonLayout);
        regbuttonLayout.setHorizontalGroup(
            regbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regbuttonLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        regbuttonLayout.setVerticalGroup(
            regbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exabutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(regbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exabutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void changecolor(JPanel hover,Color rand){
        hover.setBackground(rand);
    }
    
    
    
    private void CpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CpanelMouseClicked
        emp_course box = new  emp_course();
        box.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CpanelMouseClicked

    private void CpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CpanelMouseEntered
        changecolor(Cpanel,new Color(151,215, 212));
    }//GEN-LAST:event_CpanelMouseEntered

    private void CpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CpanelMouseExited
        changecolor(Cpanel,new Color(255, 255, 255));
    }//GEN-LAST:event_CpanelMouseExited

    private void inpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inpanelMouseClicked
        emp_inqu box = new emp_inqu();
        box.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inpanelMouseClicked

    private void inpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inpanelMouseEntered
        changecolor(inpanel,new Color(151,215, 212));
    }//GEN-LAST:event_inpanelMouseEntered

    private void inpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inpanelMouseExited
        changecolor(inpanel,new Color(255, 255, 255));
    }//GEN-LAST:event_inpanelMouseExited

    private void stpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stpanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_stpanelMouseClicked

    private void stpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stpanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_stpanelMouseEntered

    private void stpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stpanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_stpanelMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void exabuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exabuttonMouseClicked
       
    }//GEN-LAST:event_exabuttonMouseClicked

    private void regbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regbuttonMouseClicked
        
    }//GEN-LAST:event_regbuttonMouseClicked

    private void SHpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHpanelMouseClicked
        emp_home box = new emp_home();
        box.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SHpanelMouseClicked

    private void SHpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHpanelMouseEntered
        changecolor(SHpanel, new Color(151,215, 212));
    }//GEN-LAST:event_SHpanelMouseEntered

    private void SHpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHpanelMouseExited
        changecolor(SHpanel, new Color(255, 255, 255));
    }//GEN-LAST:event_SHpanelMouseExited

    private void SFpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SFpanelMouseEntered
        changecolor(SFpanel, new Color(151,215, 212));
    }//GEN-LAST:event_SFpanelMouseEntered

    private void SFpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SFpanelMouseExited
       changecolor(SFpanel, new Color(255, 255, 255));
    }//GEN-LAST:event_SFpanelMouseExited

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
            java.util.logging.Logger.getLogger(emp_issus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_issus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_issus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_issus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_issus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cpanel;
    private javax.swing.JTable JT1;
    private javax.swing.JTable JT2;
    private javax.swing.JPanel SFpanel;
    private javax.swing.JPanel SHpanel;
    private javax.swing.JPanel exabutton;
    private javax.swing.JPanel inpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel regbutton;
    private javax.swing.JPanel stpanel;
    // End of variables declaration//GEN-END:variables
}
