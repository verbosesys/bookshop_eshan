/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIClasses;

import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import java.awt.Frame;
import java.sql.ResultSet;
import javax.swing.JTextField;
import javax.swing.UIManager;
import tyre_shop_jaela.DB;
import tyre_shop_jaela.Essencials;

/**
 *
 * @author Nalaranga
 */
public class TyreAdd extends javax.swing.JFrame {

    Essencials es;

    public TyreAdd() {
        initComponents();
        es = new Essencials();
        es.setCenter(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comtyreid = new javax.swing.JTextField();
        bu_gen_combo3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comnoofrim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tftyresize1 = new javax.swing.JTextField();
        bu_gen_combo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfrackid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfrackrow = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comvehiclegroup = new javax.swing.JTextField();
        bu_gen_combo1 = new javax.swing.JButton();
        tftyresize2 = new javax.swing.JTextField();
        tftyresize3 = new javax.swing.JTextField();
        tftyresize4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tfprice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfpricegen = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfdis1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfdis2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfdis3 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(96, 125, 139));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(736, 77));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ic_call_received_white_18dp_1x.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ic_call_made_white_18dp_1x.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ic_close_white_18dp_1x.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ටයර දත්ත පිලිබඳ විස්තර");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));

        jLabel1.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("ටයර හඳුනාගැනීමේ අංකය");

        comtyreid.setBackground(new java.awt.Color(252, 252, 252));
        comtyreid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        comtyreid.setForeground(new java.awt.Color(153, 153, 153));
        comtyreid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        comtyreid.setPreferredSize(new java.awt.Dimension(59, 28));
        comtyreid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comtyreidActionPerformed(evt);
            }
        });
        comtyreid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comtyreidKeyTyped(evt);
            }
        });

        bu_gen_combo3.setBackground(new java.awt.Color(252, 252, 252));
        bu_gen_combo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ic_clear_all_black_24dp_1x.png"))); // NOI18N
        bu_gen_combo3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        bu_gen_combo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_gen_combo3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("රීම් ප්‍රමාණය");

        comnoofrim.setBackground(new java.awt.Color(252, 252, 252));
        comnoofrim.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        comnoofrim.setForeground(new java.awt.Color(204, 102, 0));
        comnoofrim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        comnoofrim.setPreferredSize(new java.awt.Dimension(59, 28));

        jLabel4.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("ටයරයේ ප්‍රමාණය");

        tftyresize1.setBackground(new java.awt.Color(252, 252, 252));
        tftyresize1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tftyresize1.setForeground(new java.awt.Color(102, 102, 102));
        tftyresize1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tftyresize1.setPreferredSize(new java.awt.Dimension(59, 28));

        bu_gen_combo.setBackground(new java.awt.Color(252, 252, 252));
        bu_gen_combo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ic_keyboard_arrow_down_black_24dp_1x.png"))); // NOI18N
        bu_gen_combo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        bu_gen_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_gen_comboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("ගබඩා කර ඇති රාක්කය");

        tfrackid.setBackground(new java.awt.Color(252, 252, 252));
        tfrackid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tfrackid.setForeground(new java.awt.Color(102, 102, 102));
        tfrackid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tfrackid.setPreferredSize(new java.awt.Dimension(59, 28));

        jLabel7.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("ගබඩා කර ඇති තට්ටුව");

        tfrackrow.setBackground(new java.awt.Color(252, 252, 252));
        tfrackrow.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tfrackrow.setForeground(new java.awt.Color(102, 102, 102));
        tfrackrow.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tfrackrow.setPreferredSize(new java.awt.Dimension(59, 28));

        jLabel8.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("අයත් වාහන කාණ්ඩය");

        comvehiclegroup.setBackground(new java.awt.Color(252, 252, 252));
        comvehiclegroup.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        comvehiclegroup.setForeground(new java.awt.Color(204, 102, 0));
        comvehiclegroup.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        comvehiclegroup.setPreferredSize(new java.awt.Dimension(59, 28));

        bu_gen_combo1.setBackground(new java.awt.Color(252, 252, 252));
        bu_gen_combo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ic_keyboard_arrow_down_black_24dp_1x.png"))); // NOI18N
        bu_gen_combo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        bu_gen_combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_gen_combo1ActionPerformed(evt);
            }
        });

        tftyresize2.setBackground(new java.awt.Color(252, 252, 252));
        tftyresize2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tftyresize2.setForeground(new java.awt.Color(102, 102, 102));
        tftyresize2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tftyresize2.setPreferredSize(new java.awt.Dimension(59, 28));

        tftyresize3.setBackground(new java.awt.Color(252, 252, 252));
        tftyresize3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tftyresize3.setForeground(new java.awt.Color(102, 102, 102));
        tftyresize3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tftyresize3.setPreferredSize(new java.awt.Dimension(59, 28));

        tftyresize4.setBackground(new java.awt.Color(252, 252, 252));
        tftyresize4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tftyresize4.setForeground(new java.awt.Color(102, 102, 102));
        tftyresize4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tftyresize4.setPreferredSize(new java.awt.Dimension(59, 28));

        jLabel9.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("ටයරයේ ප්‍රමාණය");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfrackrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tftyresize3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addComponent(tftyresize4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfrackid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(comtyreid, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(bu_gen_combo3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comvehiclegroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comnoofrim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bu_gen_combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bu_gen_combo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tftyresize1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(9, 9, 9)
                                    .addComponent(tftyresize2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comtyreid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_gen_combo3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comnoofrim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_gen_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comvehiclegroup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bu_gen_combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tftyresize1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tftyresize2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tftyresize3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftyresize4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfrackid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfrackrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));

        jLabel10.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("ලැබෙන මිල");

        tfprice.setBackground(new java.awt.Color(252, 252, 252));
        tfprice.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tfprice.setForeground(new java.awt.Color(102, 102, 102));
        tfprice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tfprice.setPreferredSize(new java.awt.Dimension(59, 28));

        jLabel11.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("සාමාන්‍ය විකුණන මිල");

        tfpricegen.setBackground(new java.awt.Color(252, 252, 252));
        tfpricegen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tfpricegen.setForeground(new java.awt.Color(102, 102, 102));
        tfpricegen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tfpricegen.setPreferredSize(new java.awt.Dimension(59, 28));

        jLabel12.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("ලබාදිය හැකි වට්ටම 1");

        tfdis1.setBackground(new java.awt.Color(252, 252, 252));
        tfdis1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tfdis1.setForeground(new java.awt.Color(102, 102, 102));
        tfdis1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tfdis1.setPreferredSize(new java.awt.Dimension(59, 28));

        jLabel13.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("ලබාදිය හැකි වට්ටම 2");

        tfdis2.setBackground(new java.awt.Color(252, 252, 252));
        tfdis2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tfdis2.setForeground(new java.awt.Color(102, 102, 102));
        tfdis2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tfdis2.setPreferredSize(new java.awt.Dimension(59, 28));

        jLabel16.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("ලබාදිය හැකි වට්ටම 3");

        tfdis3.setBackground(new java.awt.Color(252, 252, 252));
        tfdis3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        tfdis3.setForeground(new java.awt.Color(102, 102, 102));
        tfdis3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 220, 220)));
        tfdis3.setPreferredSize(new java.awt.Dimension(59, 28));

        btnSave.setBackground(new java.awt.Color(245, 245, 245));
        btnSave.setFont(new java.awt.Font("Noto Sans Sinhala", 0, 10)); // NOI18N
        btnSave.setText("සුරකින්න");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(215, 215, 215)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfprice, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(tfpricegen, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(tfdis1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(tfdis3, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdis2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfpricegen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdis3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
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
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        es.maximizeWin(this);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        es.moveWindow(this);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        es.setDirection(this);
    }//GEN-LAST:event_jPanel2MousePressed

    private void comtyreidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comtyreidActionPerformed
  
    }//GEN-LAST:event_comtyreidActionPerformed

    private void comtyreidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comtyreidKeyTyped
        es.numsONLY(evt);
    }//GEN-LAST:event_comtyreidKeyTyped

    private void bu_gen_combo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_gen_combo3ActionPerformed
        es.INVno(false, comtyreid, "hot");
    }//GEN-LAST:event_bu_gen_combo3ActionPerformed

    private void bu_gen_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_gen_comboActionPerformed

    }//GEN-LAST:event_bu_gen_comboActionPerformed

    private void bu_gen_combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_gen_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bu_gen_combo1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JTextField[] jt = {comtyreid, comnoofrim, comvehiclegroup, tftyresize1, tftyresize2, tfpricegen};
        boolean result = es.checkEMPTY(jt);
        if(!result){
            try {
                ResultSet rs = DB.search("SELECT * FROM rim WHERE tyre_id = '"+comtyreid.getText()+"'");
                if(rs.next()){
                    try {
                        DB.Execute("DELETE * FROM rim WHERE tyre_id = '"+comtyreid.getText()+"'");
                        DB.Execute("INSERT INTO rim VALUES('"+comtyreid.getText()+"', '"+comnoofrim.getText()+"', '"+comvehiclegroup.getText()+"', '"+tftyresize1.getText()+"', '"+tftyresize2.getText()+"', '"+tftyresize3.getText()+"', '"+tftyresize4.getText()+"', '"+tfrackid.getText()+"', '"+tfrackrow.getText()+"', '"+tfprice.getText()+"', '"+tfpricegen.getText()+"', '"+tfdis1.getText()+"', '"+tfdis2.getText()+"', '"+tfdis3.getText()+"')");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else{
                    try {
                        DB.Execute("INSERT INTO rim VALUES('"+comtyreid.getText()+"', '"+comnoofrim.getText()+"', '"+comvehiclegroup.getText()+"', '"+tftyresize1.getText()+"', '"+tftyresize2.getText()+"', '"+tftyresize3.getText()+"', '"+tftyresize4.getText()+"', '"+tfrackid.getText()+"', '"+tfrackrow.getText()+"', '"+tfprice.getText()+"', '"+tfpricegen.getText()+"', '"+tfdis1.getText()+"', '"+tfdis2.getText()+"', '"+tfdis3.getText()+"')");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            JTextField[] jt2 = {comtyreid, comnoofrim, comvehiclegroup, tftyresize1, tftyresize2, tftyresize3, tftyresize4, tfrackid, tfrackrow, tfprice, tfpricegen, tfdis1, tfdis2, tfdis3};
            es.clearTFS(jt2);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
                    new TyreAdd().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton bu_gen_combo;
    private javax.swing.JButton bu_gen_combo1;
    private javax.swing.JButton bu_gen_combo3;
    private javax.swing.JTextField comnoofrim;
    public static javax.swing.JTextField comtyreid;
    private javax.swing.JTextField comvehiclegroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTextField tfdis1;
    private javax.swing.JTextField tfdis2;
    private javax.swing.JTextField tfdis3;
    private javax.swing.JTextField tfprice;
    private javax.swing.JTextField tfpricegen;
    private javax.swing.JTextField tfrackid;
    private javax.swing.JTextField tfrackrow;
    private javax.swing.JTextField tftyresize1;
    private javax.swing.JTextField tftyresize2;
    private javax.swing.JTextField tftyresize3;
    private javax.swing.JTextField tftyresize4;
    // End of variables declaration//GEN-END:variables
}
