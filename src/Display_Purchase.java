import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Display_Purchase extends javax.swing.JFrame {
    private DefaultTableModel tableModel;



    public Display_Purchase() {
        initComponents();
        tableModel = new DefaultTableModel();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsTBL = new javax.swing.JTable();
        displayBTN = new javax.swing.JButton();
        jTabbedPanel1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTBL = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        item_numFIELD = new javax.swing.JTextField();
        tenderedFIELD = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        totalpriceFIELD = new javax.swing.JTextField();
        changeFIELD = new javax.swing.JTextField();
        payBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        indexFIELD = new javax.swing.JTextField();
        qtyFIELD = new javax.swing.JTextField();
        cartBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        itemIDFIELD = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        updateItemNameFIELD = new javax.swing.JTextField();
        stockFIELD = new javax.swing.JTextField();
        updatePriceFIELD = new javax.swing.JTextField();
        itemID = new javax.swing.JLabel();
        saveChangesBTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        delBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addItemFIELD = new javax.swing.JTextField();
        addStockFIELD = new javax.swing.JTextField();
        setPriceFIELD = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        updateClearBTN = new javax.swing.JButton();
        deleteItemFIELD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel4.setText("jLabel4");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Display_Add/Dlete_Update_Purchase");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        itemsTBL.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        itemsTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Stock", "Unit Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemsTBL.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(itemsTBL);
        if (itemsTBL.getColumnModel().getColumnCount() > 0) {
            itemsTBL.getColumnModel().getColumn(0).setPreferredWidth(10);
            itemsTBL.getColumnModel().getColumn(1).setPreferredWidth(150);
            itemsTBL.getColumnModel().getColumn(2).setResizable(false);
            itemsTBL.getColumnModel().getColumn(2).setPreferredWidth(10);
            itemsTBL.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        displayBTN.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        displayBTN.setText("Display");
        displayBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 153, 255), null));
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        jTabbedPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jTabbedPanel1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        cartTBL.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        cartTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index No.", "Item", "Qty.", "Unit Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTBL.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(cartTBL);
        if (cartTBL.getColumnModel().getColumnCount() > 0) {
            cartTBL.getColumnModel().getColumn(0).setPreferredWidth(10);
            cartTBL.getColumnModel().getColumn(1).setPreferredWidth(150);
            cartTBL.getColumnModel().getColumn(2).setPreferredWidth(10);
            cartTBL.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jButton12.setText("No. of items");

        jButton13.setText("Tendered");

        item_numFIELD.setEditable(false);
        item_numFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_numFIELDActionPerformed(evt);
            }
        });

        tenderedFIELD.setEditable(false);
        tenderedFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenderedFIELDActionPerformed(evt);
            }
        });

        jButton14.setText("Total Price");

        jButton15.setText("Change");

        totalpriceFIELD.setEditable(false);
        totalpriceFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpriceFIELDActionPerformed(evt);
            }
        });

        changeFIELD.setEditable(false);
        changeFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFIELDActionPerformed(evt);
            }
        });

        payBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        payBTN.setText("Pay");
        payBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBTNActionPerformed(evt);
            }
        });

        clearBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearBTN.setText("Clear");
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Vani", 1, 10)); // NOI18N
        jButton3.setText("Index No.");
        jButton3.setBorder(null);

        jButton4.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jButton4.setText("Quantity:");
        jButton4.setBorder(null);

        indexFIELD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        qtyFIELD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        qtyFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyFIELDActionPerformed(evt);
            }
        });

        cartBTN.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        cartBTN.setText("Add to Cart");
        cartBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        cartBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBTNActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel6.setText("Item's Purchased");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(item_numFIELD)
                    .addComponent(tenderedFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(totalpriceFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(changeFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(payBTN)
                        .addGap(119, 119, 119)
                        .addComponent(clearBTN)
                        .addGap(98, 98, 98))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(indexFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtyFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cartBTN)
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_numFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12)
                    .addComponent(jButton14)
                    .addComponent(totalpriceFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(tenderedFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15)
                    .addComponent(changeFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payBTN)
                    .addComponent(clearBTN))
                .addGap(35, 35, 35))
        );

        jTabbedPanel1.addTab("Cart", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        itemIDFIELD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        itemIDFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIDFIELDActionPerformed(evt);
            }
        });

        jButton9.setText("Change Item Name");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jButton10.setText("Qty.");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jButton11.setText("Price");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        updateItemNameFIELD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        updateItemNameFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemNameFIELDActionPerformed(evt);
            }
        });

        stockFIELD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        stockFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockFIELDActionPerformed(evt);
            }
        });

        updatePriceFIELD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        updatePriceFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePriceFIELDActionPerformed(evt);
            }
        });

        itemID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemID.setText("Item ID");
        itemID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        saveChangesBTN.setText("Save Changes");
        saveChangesBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        saveChangesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesBTNActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("UPDATE ITEM'S");

        delBTN.setText("CLEAR");
        delBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveChangesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(itemID, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemIDFIELD)
                            .addComponent(stockFIELD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatePriceFIELD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateItemNameFIELD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delBTN)
                        .addGap(96, 96, 96))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemIDFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(updateItemNameFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(stockFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(updatePriceFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveChangesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBTN))
                .addGap(50, 50, 50))
        );

        jTabbedPanel1.addTab("Update", jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Item");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Stock");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(51, 153, 255));
        jLabel3.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Price");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        addItemFIELD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        addItemFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemFIELDActionPerformed(evt);
            }
        });

        addStockFIELD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        addStockFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockFIELDActionPerformed(evt);
            }
        });

        setPriceFIELD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        setPriceFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPriceFIELDActionPerformed(evt);
            }
        });

        addBTN.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        addBTN.setText("Add");
        addBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 153, 255)));
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        deleteBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        updateClearBTN.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        updateClearBTN.setText("Clear");
        updateClearBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 153, 255)));
        updateClearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateClearBTNActionPerformed(evt);
            }
        });

        deleteItemFIELD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        deleteItemFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemFIELDActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 153, 255));
        jLabel7.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Item ID");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(updateClearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(setPriceFIELD, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(addStockFIELD)
                                .addComponent(addItemFIELD))
                            .addComponent(deleteItemFIELD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItemFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStockFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBTN)
                            .addComponent(updateClearBTN)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(setPriceFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteItemFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addComponent(deleteBTN)
                .addGap(47, 47, 47))
        );

        jTabbedPanel1.addTab("Add/Delete", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)))
                .addComponent(jTabbedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM inventory";
            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
                DefaultTableModel tableModel = (DefaultTableModel) itemsTBL.getModel();
                tableModel.setRowCount(0); // Clear existing data
                while (rs.next()) {
                    int itemId = rs.getInt("item_id");
                    String itemName = rs.getString("item_name");
                    int stock = rs.getInt("stock");
                    double price = rs.getDouble("price");
                    tableModel.addRow(new Object[]{itemId, itemName, stock, price});
                }
            }
        } catch (SQLException e) {
        // Handle SQL exception
        }
    }//GEN-LAST:event_displayBTNActionPerformed

    
    private void cartBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBTNActionPerformed
    String itemNum = indexFIELD.getText();
    String qtyText = qtyFIELD.getText();

    System.out.println("Item Number: " + itemNum);
    System.out.println("Quantity Text: " + qtyText);

    // Check if either field is empty
    if (itemNum.isEmpty() || qtyText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both item number and quantity.");
        return; // Stop further execution
    }

    // Check if the quantity field contains non-numeric characters
    if (!isNumeric(qtyText)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid quantity.");
        return; // Stop further execution
    }

    int qty = Integer.parseInt(qtyText);

    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "SELECT item_name, stock, price FROM inventory WHERE item_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(itemNum));
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String itemName = rs.getString("item_name");
                    int stock = rs.getInt("stock");
                    double price = rs.getDouble("price");

                    if (stock >= qty) {
                        // Deduct purchased quantity from stock in the database
                        String updateSQL = "UPDATE inventory SET stock = stock - ? WHERE item_id = ?";
                        try (PreparedStatement updatePstmt = conn.prepareStatement(updateSQL)) {
                            updatePstmt.setInt(1, qty);
                            updatePstmt.setInt(2, Integer.parseInt(itemNum));
                            updatePstmt.executeUpdate();
                        }

                        // Add or update the item in the cartTBL
                        updateCartTable(itemNum, itemName, qty, price);

                        // Record the transaction
                        String insertSQL = "INSERT INTO transactions (item_id, quantity, total_price) VALUES (?, ?, ?)";
                        try (PreparedStatement insertPstmt = conn.prepareStatement(insertSQL)) {
                            insertPstmt.setInt(1, Integer.parseInt(itemNum));
                            insertPstmt.setInt(2, qty);
                            insertPstmt.setDouble(3, qty * price);
                            insertPstmt.executeUpdate();
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Insufficient stock.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Item not found.");
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_cartBTNActionPerformed
private void updateCartTable(String itemNum, String itemName, int qty, double price) {
    DefaultTableModel model = (DefaultTableModel) cartTBL.getModel();
    boolean itemExists = false;
    int rowIndex = -1;

    // Check if the item already exists in the cart
    for (int i = 0; i < model.getRowCount(); i++) {
        Object cellValue = model.getValueAt(i, 0);
        if (cellValue != null && cellValue.equals(itemNum)) {
            itemExists = true;
            rowIndex = i;
            break;
        }
    }

    double totalPrice = qty * price;

    if (itemExists) {
        // Update the existing row
        int currentQty = (int) model.getValueAt(rowIndex, 2);
        int newQty = currentQty + qty;
        model.setValueAt(newQty, rowIndex, 2);
        model.setValueAt(newQty * price, rowIndex, 3);
    } else {
        // Add a new row
        model.addRow(new Object[]{itemNum, itemName, qty, totalPrice});
    }
}



    
    private void qtyFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyFIELDActionPerformed

    }//GEN-LAST:event_qtyFIELDActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        item_numFIELD.setText("");
        tenderedFIELD.setText("");
        changeFIELD.setText("");
        totalpriceFIELD.setText("");
        indexFIELD.setText("");
        qtyFIELD.setText("");
        
        JOptionPane.showMessageDialog(this, "Fields cleared.");
    }//GEN-LAST:event_clearBTNActionPerformed

    private void payBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBTNActionPerformed
    DefaultTableModel model = (DefaultTableModel) cartTBL.getModel();
    int rowCount = model.getRowCount();
    int totalQuantity = 0;
    double total = 0;

    // Iterate over the cart table to calculate the total quantity and total price
    for (int i = 0; i < rowCount; i++) {
        int quantity = (int) model.getValueAt(i, 2);
        double itemTotalPrice = (double) model.getValueAt(i, 3);

        // Sum up the quantity and total price
        totalQuantity += quantity;
        total += itemTotalPrice;
    }

    // Set the total quantity in the item_numFIELD
    item_numFIELD.setText(String.valueOf(totalQuantity));

    // Set the total price in the totalpriceFIELD
    totalpriceFIELD.setText(String.valueOf(total));

    // Create a pop-up dialog for the user to input the amount of money
    String inputAmount = JOptionPane.showInputDialog(this, "Enter amount:");

    // Parse the input to ensure it's a valid number
    try {
        double tenderedAmount = Double.parseDouble(inputAmount);

        // Check if the entered amount is enough
        if (tenderedAmount < total) {
            JOptionPane.showMessageDialog(this, "Entered amount is not enough to cover the total price.");
            return;
        }

        // Deduct the total price from the input amount to calculate the change
        double change = tenderedAmount - total;

        // Display the change in the changeFIELD
        changeFIELD.setText(String.valueOf(change));

        // Update the tenderedFIELD with the input amount
        tenderedFIELD.setText(inputAmount);

        // Generate the receipt content
        StringBuilder receiptContent = new StringBuilder();
        receiptContent.append("Receipt\n");
        receiptContent.append("Total quantity: ").append(totalQuantity).append("\n");
        receiptContent.append("Total price: ").append(total).append("\n");
        receiptContent.append("Tendered amount: ").append(tenderedAmount).append("\n");
        receiptContent.append("Change: ").append(change).append("\n");

        // Display the receipt in a dialog
        JOptionPane.showMessageDialog(this, receiptContent.toString(), "Receipt", JOptionPane.PLAIN_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
    }
    }//GEN-LAST:event_payBTNActionPerformed

    private void totalpriceFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpriceFIELDActionPerformed
      
    }//GEN-LAST:event_totalpriceFIELDActionPerformed

    private void item_numFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_numFIELDActionPerformed
    
    }//GEN-LAST:event_item_numFIELDActionPerformed

    private void deleteItemFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemFIELDActionPerformed
        
    }//GEN-LAST:event_deleteItemFIELDActionPerformed

    private void updateClearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateClearBTNActionPerformed
        addItemFIELD.setText("");
        addStockFIELD.setText("");
        setPriceFIELD.setText("");
        
        JOptionPane.showMessageDialog(this, "Fields cleared.");
    }//GEN-LAST:event_updateClearBTNActionPerformed

    // Method to update the table model with the latest data from the database
    private void updateTableModel() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM inventory";
            try (PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
                DefaultTableModel tableModel = (DefaultTableModel) itemsTBL.getModel();
                tableModel.setRowCount(0); // Clear existing data
                while (rs.next()) {
                    int itemId = rs.getInt("item_id");
                    String itemName = rs.getString("item_name");
                    int stock = rs.getInt("stock");
                    double price = rs.getDouble("price");
                    tableModel.addRow(new Object[]{itemId, itemName, stock, price});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQL exception
        }
    }
    
    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        String itemID = deleteItemFIELD.getText();
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM inventory WHERE item_id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, itemID);
                int affectedRows = pstmt.executeUpdate();
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(this, "Item deleted.");
                    updateTableModel();
                } else {
                    JOptionPane.showMessageDialog(this, "Item not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQL exception
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
    String itemName = addItemFIELD.getText();
    String stockText = addStockFIELD.getText();
    String priceText = setPriceFIELD.getText();
    
    // Check if any of the fields are empty
    if (itemName.isEmpty() || stockText.isEmpty() || priceText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return; // Stop further execution
    }

    // Validate if stockText and priceText contain only numbers
    if (!isNumeric(stockText) || !isNumeric(priceText)) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for stock and price.");
        return; // Stop further execution
    }

    // Parse input values
    int stock = Integer.parseInt(stockText);
    double price = Double.parseDouble(priceText);

    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "INSERT INTO inventory (item_name, stock, price) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, itemName);
            pstmt.setInt(2, stock);
            pstmt.setDouble(3, price);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Item added to inventory.");
            
            updateTableModel();
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle SQL exception
    }
}

// Method to check if a string contains only numeric characters
private boolean isNumeric(String str) {
    return str.matches("\\d+");
    }//GEN-LAST:event_addBTNActionPerformed

    private void setPriceFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPriceFIELDActionPerformed

    }//GEN-LAST:event_setPriceFIELDActionPerformed

    private void addStockFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockFIELDActionPerformed
       
    }//GEN-LAST:event_addStockFIELDActionPerformed

    private void addItemFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemFIELDActionPerformed
        
    }//GEN-LAST:event_addItemFIELDActionPerformed

    private void itemIDFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIDFIELDActionPerformed
       
    }//GEN-LAST:event_itemIDFIELDActionPerformed

    private void updateItemNameFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemNameFIELDActionPerformed
      
    }//GEN-LAST:event_updateItemNameFIELDActionPerformed

    private void stockFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockFIELDActionPerformed
    
    }//GEN-LAST:event_stockFIELDActionPerformed

    private void saveChangesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesBTNActionPerformed
    // Get values from text fields
    String itemName = updateItemNameFIELD.getText();
    int stock = Integer.parseInt(stockFIELD.getText());
    double price = Double.parseDouble(updatePriceFIELD.getText());

    // Assuming you have a field to get item_id, make sure it's an integer
    int itemId = Integer.parseInt(itemIDFIELD.getText()); // Adjust this line based on your actual UI component

    try (Connection conn = DatabaseConnection.getConnection()) {
        // SQL query to update the inventory
        String sql = "UPDATE inventory SET item_name = ?, stock = ?, price = ? WHERE item_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // Set parameters
            pstmt.setString(1, itemName);
            pstmt.setInt(2, stock);
            pstmt.setDouble(3, price);
            pstmt.setInt(4, itemId); // Assuming item_id is an integer

            // Execute the update
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Item updated.");
            } else {
                JOptionPane.showMessageDialog(this, "Item not found.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating item: " + e.getMessage());
    }
    }//GEN-LAST:event_saveChangesBTNActionPerformed

    private void updatePriceFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePriceFIELDActionPerformed
      
    }//GEN-LAST:event_updatePriceFIELDActionPerformed

    private void delBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBTNActionPerformed
        itemIDFIELD.setText("");
        updateItemNameFIELD.setText("");
        stockFIELD.setText("");
        updatePriceFIELD.setText("");
    }//GEN-LAST:event_delBTNActionPerformed

    private void tenderedFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenderedFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenderedFIELDActionPerformed

    private void changeFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeFIELDActionPerformed
    // Main method to run the application       
    public static void main(String args[]) {  
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display_Purchase().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JTextField addItemFIELD;
    private javax.swing.JTextField addStockFIELD;
    private javax.swing.JButton cartBTN;
    private javax.swing.JTable cartTBL;
    private javax.swing.JTextField changeFIELD;
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton delBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextField deleteItemFIELD;
    private javax.swing.JButton displayBTN;
    private javax.swing.JTextField indexFIELD;
    private javax.swing.JLabel itemID;
    private javax.swing.JTextField itemIDFIELD;
    private javax.swing.JTextField item_numFIELD;
    private javax.swing.JTable itemsTBL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton payBTN;
    private javax.swing.JTextField qtyFIELD;
    private javax.swing.JButton saveChangesBTN;
    private javax.swing.JTextField setPriceFIELD;
    private javax.swing.JTextField stockFIELD;
    private javax.swing.JTextField tenderedFIELD;
    private javax.swing.JTextField totalpriceFIELD;
    private javax.swing.JButton updateClearBTN;
    private javax.swing.JTextField updateItemNameFIELD;
    private javax.swing.JTextField updatePriceFIELD;
    // End of variables declaration//GEN-END:variables
}