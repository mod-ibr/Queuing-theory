/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import queuesystemproj.statusFlags.FlagStates;
import queuesystemproj.stocustic.*;
import static queuesystemproj.QueueSystemProj.homePage_Frame;

/**
 *
 * @author 20114
 */
public class MM_frame extends javax.swing.JFrame {

    /**
     * Creates new form DD_frame
     */
    private boolean isSystemFinite = false;
    private final int TIME = 0;
    private final int RATE = 1;
    private final int IDLE = 0;
    private final int ERROR_DETECTED = 1;

    private int lampdaCaseTimeRate;
    private int muCaseTimeRate;
    private int c;
    private int k;

    private float lampdaValue;
    private float muValue;

    private MM_abstract MM_Model_obj;
    private FlagStates flagStatus = new FlagStates();

    public MM_frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_DD1ooFCFS = new javax.swing.JPanel();
        btn_calculate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_mu = new javax.swing.JLabel();
        txt_mu = new javax.swing.JTextField();
        cmpbx_mu = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lbl_lampda = new javax.swing.JLabel();
        cmpbx_lampda = new javax.swing.JComboBox<>();
        txt_lampda = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txt_k = new javax.swing.JFormattedTextField();
        txt_c = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_Title = new javax.swing.JLabel();
        Is_Finite_System = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        lbl_W = new javax.swing.JLabel();
        txt_W = new javax.swing.JTextField();
        txt_Wq = new javax.swing.JTextField();
        lbl_Wq = new javax.swing.JLabel();
        txt_Lq = new javax.swing.JTextField();
        txt_L = new javax.swing.JTextField();
        lbl_L = new javax.swing.JLabel();
        lbl_Lq = new javax.swing.JLabel();
        btn_backToHomePage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_calculate.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_calculate.setForeground(new java.awt.Color(0, 0, 204));
        btn_calculate.setText("Calculate");
        btn_calculate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_calculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });

        lbl_mu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_mu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mu.setText("mu(ServiceTime/Rate)");

        txt_mu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_mu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_muActionPerformed(evt);
            }
        });

        cmpbx_mu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmpbx_mu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time", "Rate" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_mu, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cmpbx_mu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_mu, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lbl_mu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(161, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_mu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmpbx_mu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        lbl_lampda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_lampda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_lampda.setText("Lampda(ArrivalTime/Rate)");

        cmpbx_lampda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmpbx_lampda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time", "Rate" }));

        txt_lampda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_lampda, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(cmpbx_lampda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txt_lampda)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lbl_lampda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(161, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_lampda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmpbx_lampda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        txt_k.setEditable(false);
        txt_k.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        txt_k.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_k.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_k.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_kFocusGained(evt);
            }
        });
        txt_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kActionPerformed(evt);
            }
        });

        txt_c.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        txt_c.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_c.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("c");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("K");

        lbl_Title.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lbl_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Title.setText("M / M / c / k");

        Is_Finite_System.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Is_Finite_System.setText("Finite System");
        Is_Finite_System.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Is_Finite_SystemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(txt_k, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Is_Finite_System, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Is_Finite_System))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_W.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_W.setText("Expected waiting time in the System");

        txt_W.setEditable(false);
        txt_W.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_WActionPerformed(evt);
            }
        });

        txt_Wq.setEditable(false);
        txt_Wq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Wq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_WqActionPerformed(evt);
            }
        });

        lbl_Wq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Wq.setText("Expected waiting time in the Queue");

        txt_Lq.setEditable(false);
        txt_Lq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_L.setEditable(false);
        txt_L.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LActionPerformed(evt);
            }
        });

        lbl_L.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_L.setText("Expected number of the customers in the System ");

        lbl_Lq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Lq.setText("Expected number of the customers in the Queue ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Lq)
                        .addComponent(lbl_L))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_L, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Lq, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lbl_W)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_W))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lbl_Wq)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Wq, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_L)
                        .addComponent(lbl_W)
                        .addComponent(txt_L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_W, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Lq)
                        .addComponent(lbl_Wq)
                        .addComponent(txt_Lq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Wq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        btn_backToHomePage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_backToHomePage.setText("Back to Home Page");
        btn_backToHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backToHomePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_DD1ooFCFSLayout = new javax.swing.GroupLayout(pnl_DD1ooFCFS);
        pnl_DD1ooFCFS.setLayout(pnl_DD1ooFCFSLayout);
        pnl_DD1ooFCFSLayout.setHorizontalGroup(
            pnl_DD1ooFCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DD1ooFCFSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_DD1ooFCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_DD1ooFCFSLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DD1ooFCFSLayout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addComponent(btn_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btn_backToHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DD1ooFCFSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_DD1ooFCFSLayout.setVerticalGroup(
            pnl_DD1ooFCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DD1ooFCFSLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_DD1ooFCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(pnl_DD1ooFCFSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_backToHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_DD1ooFCFS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_DD1ooFCFS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kActionPerformed
        if (isSystemFinite) {
            System.out.println("Editable");
            txt_k.setEditable(true);
        } else {
            System.out.println("UNEditable");
            txt_k.setEditable(false);
        }
    }//GEN-LAST:event_txt_kActionPerformed

    private void txt_muActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_muActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_muActionPerformed

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed

        readComboBoxes();
        if (validation() == IDLE) {
            preparingParameters();
            creatingModelObject();
            showValues();
        } else if (validation() == ERROR_DETECTED) {
            JOptionPane.showMessageDialog(this, flagStatus.getMSGErrorStates(), "Error MSG", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_calculateActionPerformed

    private void txt_LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LActionPerformed

    private void txt_WqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_WqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_WqActionPerformed

    private void txt_WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_WActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_WActionPerformed

    private void btn_backToHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backToHomePageActionPerformed
        // TODO add your handling code here:
        homePage_Frame.setVisible(true);
        MM_frame.this.setVisible(false);
    }//GEN-LAST:event_btn_backToHomePageActionPerformed

    private void Is_Finite_SystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Is_Finite_SystemActionPerformed
        Is_Finite_System.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.print("System Is : ");
                System.out.println(e.getStateChange() == 1 ? "Finite" : "Infinite");
                if (e.getStateChange() == 1) {
                    isSystemFinite = true;
                    txt_k.setEditable(true);
                } else {
                    isSystemFinite = false;
                    txt_k.setEditable(false);

                }
                //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_Is_Finite_SystemActionPerformed

    private void txt_kFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_kFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kFocusGained

    private void readComboBoxes() {
        System.out.println("@ readComboBoxes");
        lampdaCaseTimeRate = (this.cmpbx_lampda.getSelectedItem() == "Time") ? (TIME) : (RATE);
        muCaseTimeRate = (this.cmpbx_mu.getSelectedItem() == "Time") ? (TIME) : (RATE);
        System.out.println("lampdaCaseTimeRate :" + ((lampdaCaseTimeRate == 0) ? ("Time") : ("Rate")));
        System.out.println("muCaseTimeRate :" + ((muCaseTimeRate == 0) ? ("Time") : ("Rate")));
    }

    private int validation() {
        System.out.println("@ validation");
        System.out.println("Reset FlagStatus");
        flagStatus.resetState();
        //Lampda Validation
        if (Pattern.matches("[0-9]*[\\./]?[0-9]+", txt_lampda.getText())) {
            lampdaValue = Float.parseFloat(txt_lampda.getText());
            System.out.println("Pure lampda calculated = " + lampdaValue);
        } else {
            System.out.println("invaled lampda ");
            flagStatus.setLampdaError();
        }

        //Mu Validation
        if (Pattern.matches("[0-9]*[\\./]?[0-9]+", txt_mu.getText())) {
            muValue = Float.parseFloat(txt_mu.getText());
            System.out.println("Pure mu calculated = " + muValue);
        } else {
            System.out.println("invaled mu ");
            flagStatus.setMuError();
        }

        //K Validation 
        if (!txt_k.getText().isEmpty()) {
            System.out.println("K is NOT Embty ");
            if (Pattern.matches("[0-9]+", txt_k.getText())) {
                k = Integer.parseInt(txt_k.getText());
                System.out.println("Pure K calculated = " + k);
            } else {
                System.out.println("invaled K ");
                flagStatus.setQueueMaxMemberError();
            }

        } else {
            System.out.println("K is Embty ");
        } 

        //C Validation
        if (Pattern.matches("[1-9][0-9]*", txt_c.getText())) {
            c = Integer.parseInt(txt_c.getText());
            System.out.println("Pure c calculated = " + c);
        } else {
            System.out.println("invaled c ");
            flagStatus.setParallelServerError();
        }
        if (lampdaValue < muValue) {
            flagStatus.setStocusticSpecialError();
        }
        return (flagStatus.getMSGErrorStates().equals("Clear") ? (IDLE) : (ERROR_DETECTED));
    }

    private void creatingModelObject() {

        /**
         * According to the Greater of Lampda or Mu the Object will be Created.
         */
        System.out.println("@ creatingModelObject");
        // Creating the suitable object  
        if (c == 1) {
            //  M/M/1/inf
            System.out.println("M/M/1 is on");
            if (k == 0) {
                System.out.println("M/M/1/inf. is on");
                MM_Model_obj = new MM1(lampdaValue, muValue);
            } //  M/M/1/K
            else if (k > 0) {
                System.out.println("M/M/1/K is on");
                MM_Model_obj = new MM1K(lampdaValue, muValue, k);
            }
        } //  MM/c
        else if (c > 1) {
            //  M/M/c/inf
            System.out.println("M/M/c is on");
            if (k == 0) {
                System.out.println("M/M/c/inf. is on");
                MM_Model_obj = new MMc(lampdaValue, muValue, c);
            } //  M/M/c/K
            else if (k > 0) {
                System.out.println("M/M/c/K is on");
                MM_Model_obj = new MMcK(lampdaValue, muValue, c, k);
            }
        }
    }

    private void preparingParameters() {
        System.out.println("@ preparingParameters");

        /**
         * Since the model designed to accept Rates So any rate value will
         * assigned directly Else will be converted into Rate.
         *
         */
        switch (lampdaCaseTimeRate) {
            case TIME: {
                //Need to be converted into Rate value
                System.out.println("In Time Lampda case ");
                lampdaValue = (float) 1 / lampdaValue;

            }
            break;
            case RATE: {
                //No need to conversion
                System.out.println("In Rate Lampda case ");
                lampdaValue = lampdaValue;
            }
            break;
        }

        switch (muCaseTimeRate) {
            case TIME: {
                //Need to be converted into Rate value
                System.out.println("In Time Mu case ");
                muValue = (float) 1 / muValue;
            }
            break;
            case RATE: {
                //No need to conversion
                System.out.println("In Rate Mu case ");
                muValue = muValue;
            }
            break;
        }
    }

    private void showValues() {
        txt_L.setText(Float.toString(MM_Model_obj.GetExpectedCustomersAtQueue()));
        txt_Lq.setText(Float.toString(MM_Model_obj.GetExpectedCustomersAtSystem()));
        txt_W.setText(Float.toString(MM_Model_obj.GetExpectedWaitingAtQueue()));
        txt_Wq.setText(Float.toString(MM_Model_obj.GetExpectedWaitingAtSystem()));
    }

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
            java.util.logging.Logger.getLogger(MM_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MM_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MM_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MM_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MM_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Is_Finite_System;
    private javax.swing.JButton btn_backToHomePage;
    private javax.swing.JButton btn_calculate;
    private javax.swing.JComboBox<String> cmpbx_lampda;
    private javax.swing.JComboBox<String> cmpbx_mu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_L;
    private javax.swing.JLabel lbl_Lq;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_W;
    private javax.swing.JLabel lbl_Wq;
    private javax.swing.JLabel lbl_lampda;
    private javax.swing.JLabel lbl_mu;
    private javax.swing.JPanel pnl_DD1ooFCFS;
    private javax.swing.JTextField txt_L;
    private javax.swing.JTextField txt_Lq;
    private javax.swing.JTextField txt_W;
    private javax.swing.JTextField txt_Wq;
    private javax.swing.JFormattedTextField txt_c;
    private javax.swing.JFormattedTextField txt_k;
    private javax.swing.JTextField txt_lampda;
    private javax.swing.JTextField txt_mu;
    // End of variables declaration//GEN-END:variables
}