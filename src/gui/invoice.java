package gui;

import gui.Customer;
import gui.Sign_in;
import gui.Stock;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.MySQL;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;


public class invoice extends javax.swing.JFrame {

  
    DecimalFormat df = new DecimalFormat("0.00");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public void updateTotal() {
        double total = 0;

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String t = jTable1.getValueAt(i, 7).toString();
            total = total + Double.parseDouble(t);

        }

        jLabel19.setText(df.format(total));
    }

    public void loadPaymentType() {
        try {
            ResultSet rs = MySQL.search("SELECT * FROM `payment_type`");

            Vector v = new Vector();
            v.add("Select");
            while (rs.next()) {

                v.add(rs.getString("name"));
            }

            jComboBox1.setModel(new DefaultComboBoxModel(v));
            jTable1.getTableHeader().setFont(new Font("Bookman Old Style", Font.BOLD, 14));
            jTable1.getTableHeader().setForeground(new Color(0,0,0));
            jTable1.setRowHeight(25);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetFields() {
        jLabel10.setText("None");
        jLabel11.setText("None");
        jLabel14.setText("None");
        jLabel15.setText("None");
        jLabel28.setText("None");

        jTextField2.setText("");
        jTextField2.grabFocus();

    }

    public invoice() {
        initComponents();
        loadPaymentType();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton1.setText("Select Customer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel1.setText("Id");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel2.setText("0");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel4.setText("None");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel5.setText("Contatc Number");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel6.setText("None");

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel7.setText("City");

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel8.setText("None");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 260, 180));

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel9.setText("Sid");

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel10.setText("None");

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel12.setText("Pid");

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel11.setText("None");

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel13.setText("Brand");

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel14.setText("None");

        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel15.setText("None");

        jLabel16.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel16.setText("Category");

        jLabel17.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel17.setText("Quantity");

        jLabel20.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel20.setText("Selling Price");

        jTextField2.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton2.setText("Select Product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton3.setText("Add To Invoice");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel28.setText("None");

        jLabel31.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel31.setText("None");

        jLabel32.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel32.setText("Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(3, 3, 3)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel28))))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 760, 180));

        jLabel19.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel19.setText("0.00");

        jLabel21.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel21.setText("Payment Method");

        jLabel18.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel18.setText("Total Payment");

        jComboBox1.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel23.setText("Balance");

        jLabel22.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel22.setText("Payment");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel24.setText("None");

        jButton4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton4.setText("Print Invoice");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Stock Id", "Product Id", "Brand", "Name", "Quantity", "Selling Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 1030, 290));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg-main-5000.png"))); // NOI18N
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 60, 60));

        jButton5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 580, 102, 33));

        jLabel25.setBackground(new java.awt.Color(255, 153, 0));
        jLabel25.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Invoice");
        jLabel25.setOpaque(true);
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, 1036, 50));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/3.png"))); // NOI18N
        jLabel26.setText("jLabel26");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Customer c = new Customer(this);
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount() == 2) {
            int r = jTable1.getSelectedRow();
            if (r == -1) {
                JOptionPane.showMessageDialog(this, "Please Select a grn item", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {

                int option = JOptionPane.showConfirmDialog(this, "Do you want to remove this item?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

                if (option == JOptionPane.YES_OPTION) {
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.removeRow(r);

                    updateTotal();
                    //Payment
                    jLabel24.setText("0.00");
                    jTextField3.setText("");
                    jTextField3.setEditable(false);
                    jComboBox1.setSelectedItem(0);
                    //jLabel19.setText("0.00");
                    updateTotal();
                    //Payment
                    JOptionPane.showMessageDialog(this, "Grn item removed", "Warning", JOptionPane.INFORMATION_MESSAGE);

                }
            }

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        String price = jTextField2.getText();
        String text = price + evt.getKeyChar();

        if (!Pattern.compile("[1-9][0-9]*").matcher(text).matches()) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   Stock s = new Stock(this);
        s.setVisible(true);       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String sid = jLabel10.getText();
        String pid = jLabel11.getText();
        String qty = jTextField2.getText();
        String selling_price = jLabel28.getText();
        String category = jLabel15.getText();
        String brand = jLabel14.getText();
        String product = jLabel31.getText();


        if (sid.equals("None")) {
            JOptionPane.showMessageDialog(this, "Please select Product", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the Quantity", "Warning", JOptionPane.WARNING_MESSAGE);

        } //        Update
        else {

            try {

                ResultSet rs = MySQL.search("SELECT * FROM `stock` WHERE `stock`.`id` = '" + sid + "'");
                rs.next();

                String availableQty = rs.getString("quantity");

                if (Integer.parseInt(availableQty) < Integer.parseInt(qty)) {
                    JOptionPane.showConfirmDialog(this, "Quantity out of stock", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

                    boolean isFound = false;
                    int x = -1;

                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        String id = jTable1.getValueAt(i, 2).toString();

                        if (id.equals(pid)) {
                            isFound = true;
                            x = i;
                            break;

                        }
                    }
                    if (isFound) {

                        int option = JOptionPane.showConfirmDialog(this, "This product is already added. Do you want to update?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

                        if (option == JOptionPane.YES_OPTION) {
                            int oldQty = Integer.parseInt(jTable1.getValueAt(x, 5).toString());
                            int finalQty = oldQty + Integer.parseInt(qty);

                            //check stock
                            if (Integer.parseInt(availableQty) < finalQty) {
                                JOptionPane.showConfirmDialog(this, "Quantity out of stock", "Warning", JOptionPane.WARNING_MESSAGE);

                            } else {
                                jTable1.setValueAt(String.valueOf(finalQty), x, 5);
                                //++++---
                                double UpdatedItemTotal = finalQty * Double.parseDouble(selling_price);
                                jTable1.setValueAt(String.valueOf(UpdatedItemTotal), x, 7);
                                updateTotal();
                            }

                        }

                        resetFields();

                    } else {
                        Vector v = new Vector();
                        v.add(category);
                        v.add(sid);
                        v.add(pid);
                        v.add(brand);
                        v.add(product);
                        v.add(qty);
                        v.add(selling_price);

                        double itemtotal = Integer.parseInt(qty) * Double.parseDouble(selling_price);
                        v.add(df.format(itemtotal));

                        dtm.addRow(v);

                        updateTotal();
                        resetFields();

                        JOptionPane.showMessageDialog(this, "Product added to Invoice", "Success", JOptionPane.INFORMATION_MESSAGE);

                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (evt.getClickCount() == 2) {
            jButton1.setEnabled(true);
            jButton1.setText("Select Customer");

            jLabel2.setText("None");
            jLabel4.setText("None");
            jLabel6.setText("None");
            jLabel8.setText("None");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        if (jTextField3.getText().isEmpty()) {
            jLabel24.setText("0.00");
            jLabel24.setForeground(Color.BLACK);
        } else {
            String total = jLabel19.getText();
            String payment = jTextField3.getText();

            double balance = Double.parseDouble(payment) - Double.parseDouble(total);

            if (balance < 0) {
                jLabel24.setForeground(Color.RED);
            } else {
                jLabel24.setForeground(Color.BLACK);
            }
            jLabel24.setText(df.format(balance));
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String text = jComboBox1.getSelectedItem().toString();

        if (text.equals("Select")) {
            jTextField3.setEditable(false);
            jTextField3.setText("");
            jLabel24.setText("0.00");
            jLabel24.setForeground(Color.BLACK);

        } else {
            jTextField3.setEditable(true);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String paymentType = jComboBox1.getSelectedItem().toString();
        String payment = jTextField3.getText();

        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please add product", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (paymentType.equals("None")) {
            JOptionPane.showMessageDialog(this, "Please select payment method", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (!Pattern.compile("(0)|([1-9][0-9]*)|(([1-9][0-9]*)[.]([0]*[1-9][0-9]*))|([0][.]([0]*[1-9][0-9]*))").matcher(payment).matches()) {
            JOptionPane.showMessageDialog(this, "Invalid Payment", "Warning", JOptionPane.WARNING_MESSAGE);
        }

//        Invoice Insert
        long mTime = System.currentTimeMillis();
        String uniqueId = mTime + "-" + Sign_in.userId;
        String cid = jLabel2.getText();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dNow = sdf.format(new Date());

        try {
            MySQL.iud("INSERT INTO `invoice` (`customer_id`,`date_time`,`user_id`,`unique_id`) VALUES('" + cid + "','" + dNow + "','" + Sign_in.userId + "','" + uniqueId + "')");

//            Invoice Payment Insert
            ResultSet rs = MySQL.search("SELECT * FROM `invoice` WHERE `unique_id` = '" + uniqueId + "'");
            rs.next();
            String Id = rs.getString("id");

            ResultSet rs2 = MySQL.search("SELECT * FROM `payment_type` WHERE `name` = '" + paymentType + "'");
            rs2.next();
            String paymentTypeId = rs2.getString("id");

            String balance = jLabel24.getText();

            MySQL.iud("INSERT INTO `invoice_payment` (`invoice_id`,`payment_type_id`,`payment`,`balance`) VALUES('" + Id + "','" + paymentTypeId + "','" + payment + "','" + balance + "')");
//            Invoice Payment Insert

//            Invoice Item Insert & Stock Insert or Update
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String sid = jTable1.getValueAt(i, 1).toString();
                String qty = jTable1.getValueAt(i, 5).toString();

                ResultSet rs3 = MySQL.search("SELECT * FROM `stock` WHERE `id` = '" + sid + "'");
                rs3.next();

                String availableQty = rs3.getString("quantity");
                int updatedQty = Integer.parseInt(availableQty) - Integer.parseInt(qty);

                MySQL.iud("UPDATE `stock` SET `quantity`='" + updatedQty + "' WHERE `id` = '" + sid + "'");

                MySQL.iud("INSERT INTO `invoice_item` (`invoice_id`,`stock_id`,`qty`) VALUES ('" + Id + "','" + sid + "','" + qty + "')");
                
                 BufferedInputStream filePath = new BufferedInputStream( new FileInputStream("src//reports//Invoice//RDS_Invoice.jasper"));
                
                HashMap parameters = new HashMap();
                parameters.put("Name",jLabel4.getText().toString());
                parameters.put("Contact_no",jLabel6.getText().toString());
                parameters.put("City",jLabel8.getText().toString());

                parameters.put("payment", payment);
                parameters.put("balance", balance);
                parameters.put("grand_total",jLabel19.getText());
                parameters.put("payment_type",jComboBox1.getSelectedItem().toString());
                
                
                TableModel tm = jTable1.getModel();
                JRTableModelDataSource dataSource = new JRTableModelDataSource(tm);
       
                JasperPrint jp = JasperFillManager.fillReport(filePath,parameters, dataSource);
                //JasperViewer.viewReport(jp);
                 JasperViewer jv = new JasperViewer( jp, false );
                jv.viewReport( jp, false );

            }
            resetFields();
            //Supplier
            jButton1.setEnabled(true);
            jButton1.setText("Select Customer");
            jLabel4.setText("None");
            jLabel6.setText("None");
            jLabel8.setText("None");
            //Supplier

            //Payment
            jLabel19.setText("0.00");
            jLabel24.setText("0.00");
            jTextField3.setText("");
            jTextField3.setEditable(false);
            jComboBox1.setSelectedIndex(0);
            //Payment

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            JOptionPane.showMessageDialog(this, "New Invoice created", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        String price = jTextField3.getText();
        String text = price + evt.getKeyChar();

        if (!Pattern.compile("(0|0[.]|0[.][0-9]*)|[1-9]|[1-9][0-9]*|[1-9][0-9]*[.]|[1-9][0-9]*[.][0-9]*").matcher(text).matches()) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped
Frame frame;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Do You Want To go back?","Invoice",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        setVisible(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public final javax.swing.JTextField jTextField2 = new javax.swing.JTextField();
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
