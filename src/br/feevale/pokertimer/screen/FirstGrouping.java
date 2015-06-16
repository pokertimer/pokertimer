package br.feevale.pokertimer.screen;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FirstGrouping extends JPanel {
    private static final FirstGrouping instance = new FirstGrouping();

    public static FirstGrouping getInstance()
      { return (instance); }

    private FirstGrouping() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTournamentName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuyInValue = new JNumericTextField();
        txtBuyInChips = new JNumericTextField();
        txtReBuyValue = new JNumericTextField();
        txtReBuyChips = new JNumericTextField();
        txtAddOnValue = new JNumericTextField();
        txtAddOnChips = new JNumericTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt1oPerc = new JNumericTextField();
        txt1oValue = new JNumericTextField();
        txt2oPerc = new JNumericTextField();
        txt2oValue = new JNumericTextField();
        txt3oPerc = new JNumericTextField();
        txt3oValue = new JNumericTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPlayers = new JNumericTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nome do Torneio:");

        txtTournamentName.setText("Novo Torneio");
        txtTournamentName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTournamentNameFocusLost(evt);
            }
        });
        txtTournamentName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTournamentNameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTournamentName)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTournamentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Valor");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fichas");

        jLabel4.setText("Buy-In");

        txtBuyInValue.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtBuyInValue.setText("0");
        txtBuyInValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuyInValueFocusLost(evt);
            }
        });
        txtBuyInValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuyInValueActionPerformed(evt);
            }
        });

        txtBuyInChips.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtBuyInChips.setText("0");
        txtBuyInChips.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuyInChipsFocusLost(evt);
            }
        });

        txtReBuyValue.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtReBuyValue.setText("0");
        txtReBuyValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReBuyValueFocusLost(evt);
            }
        });

        txtReBuyChips.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtReBuyChips.setText("0");
        txtReBuyChips.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReBuyChipsFocusLost(evt);
            }
        });

        txtAddOnValue.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAddOnValue.setText("0");
        txtAddOnValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddOnValueFocusLost(evt);
            }
        });

        txtAddOnChips.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAddOnChips.setText("0");
        txtAddOnChips.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddOnChipsFocusLost(evt);
            }
        });

        jLabel5.setText("Re-Buy");

        jLabel6.setText("Add-On");

        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAddOnValue)
                    .addComponent(txtReBuyValue)
                    .addComponent(txtBuyInValue, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuyInChips)
                    .addComponent(txtReBuyChips)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(txtAddOnChips))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuyInValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuyInChips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReBuyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReBuyChips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddOnValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddOnChips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("%");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("$");

        jLabel9.setText("1º lugar");

        txt1oPerc.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt1oPerc.setText("50");
        txt1oPerc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt1oPercFocusLost(evt);
            }
        });

        txt1oValue.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt1oValue.setText("0");
        txt1oValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt1oValueFocusLost(evt);
            }
        });

        txt2oPerc.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt2oPerc.setText("30");
        txt2oPerc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt2oPercFocusLost(evt);
            }
        });

        txt2oValue.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt2oValue.setText("0");
        txt2oValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt2oValueFocusLost(evt);
            }
        });

        txt3oPerc.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt3oPerc.setText("20");
        txt3oPerc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt3oPercFocusLost(evt);
            }
        });

        txt3oValue.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt3oValue.setText("0");
        txt3oValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt3oValueFocusLost(evt);
            }
        });

        jLabel10.setText("2º lugar");

        jLabel11.setText("3º lugar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt1oPerc)
                    .addComponent(txt2oPerc)
                    .addComponent(txt3oPerc)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt1oValue)
                    .addComponent(txt2oValue)
                    .addComponent(txt3oValue, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt1oPerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1oValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2oPerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2oValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3oPerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3oValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("Players:");

        txtPlayers.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtPlayers.setText("0");
        txtPlayers.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlayersFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(58, 58, 58)
                .addComponent(txtPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuyInValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuyInValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuyInValueActionPerformed

    private void txt1oPercFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1oPercFocusLost
        JNumericTextField txt1oPerc = (JNumericTextField) this.txt1oPerc;

        txt1oPerc.setText(String.valueOf(txt1oPerc.getInt()));

        if ((txt1oPerc.getInt() == 0) || (txt1oPerc.getInt() > 100))
          {
           JOptionPane.showMessageDialog(this, "Percentual do 1º lugar deve estar entre 0 e 100.");
           txt1oPerc.setInt(0);
           return;
          }

        this.checkFocus();
        return;
    }//GEN-LAST:event_txt1oPercFocusLost

    private void txt2oPercFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2oPercFocusLost
        JNumericTextField txt2oPerc = (JNumericTextField) this.txt2oPerc;

        txt2oPerc.setText(String.valueOf(txt2oPerc.getInt()));

        if ((txt2oPerc.getInt() == 0) || (txt2oPerc.getInt() > 100))
          {
           JOptionPane.showMessageDialog(this, "Percentual do 2º lugar deve estar entre 0 e 100.");
           txt2oPerc.setInt(0);
           return;
          }

        this.checkFocus();
        return;
    }//GEN-LAST:event_txt2oPercFocusLost

    private void txt3oPercFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt3oPercFocusLost
        JNumericTextField txt3oPerc = (JNumericTextField) this.txt3oPerc;

        txt3oPerc.setText(String.valueOf(txt3oPerc.getInt()));

        if ((txt3oPerc.getInt() == 0) || (txt3oPerc.getInt() > 100))
          {
           JOptionPane.showMessageDialog(this, "Percentual do 3º lugar deve estar entre 0 e 100.");
           txt3oPerc.setInt(0);
           return;
          }

        this.checkFocus();
        return;
    }//GEN-LAST:event_txt3oPercFocusLost

    private void txtPlayersFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayersFocusLost
        JNumericTextField txtPlayers = (JNumericTextField) this.txtPlayers;

        if ((txtPlayers.getInt() < 3) || (txtPlayers.getInt() > 10))
          {
           JOptionPane.showMessageDialog(this, "'Players' deve ter um valor entre 3 e 10.");
           txtPlayers.setInt(0);
          }

        return;
    }//GEN-LAST:event_txtPlayersFocusLost

    private void txtTournamentNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTournamentNameKeyTyped
     if (this.txtTournamentName.getText().length() >= 200)
       { evt.consume(); }

     return;
    }//GEN-LAST:event_txtTournamentNameKeyTyped

    private void txtTournamentNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTournamentNameFocusLost
        if (this.txtTournamentName.getText().length() > 200)
          { this.txtTournamentName.setText(this.txtTournamentName.getText().substring(0, 199)); }

        return;
    }//GEN-LAST:event_txtTournamentNameFocusLost

    private void txtBuyInValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuyInValueFocusLost
        this.txtBuyInValue.setText(String.valueOf(((JNumericTextField) this.txtBuyInValue).getInt()));
        return;
    }//GEN-LAST:event_txtBuyInValueFocusLost

    private void txtReBuyValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReBuyValueFocusLost
        this.txtReBuyValue.setText(String.valueOf(((JNumericTextField) this.txtReBuyValue).getInt()));
        return;
    }//GEN-LAST:event_txtReBuyValueFocusLost

    private void txtAddOnValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddOnValueFocusLost
        this.txtAddOnValue.setText(String.valueOf(((JNumericTextField) this.txtAddOnValue).getInt()));
        return;
    }//GEN-LAST:event_txtAddOnValueFocusLost

    private void txtBuyInChipsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuyInChipsFocusLost
        this.txtBuyInChips.setText(String.valueOf(((JNumericTextField) this.txtBuyInChips).getInt()));
        return;
    }//GEN-LAST:event_txtBuyInChipsFocusLost

    private void txtReBuyChipsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReBuyChipsFocusLost
        this.txtReBuyChips.setText(String.valueOf(((JNumericTextField) this.txtReBuyChips).getInt()));
        return;
    }//GEN-LAST:event_txtReBuyChipsFocusLost

    private void txtAddOnChipsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddOnChipsFocusLost
        this.txtAddOnChips.setText(String.valueOf(((JNumericTextField) this.txtAddOnChips).getInt()));
        return;
    }//GEN-LAST:event_txtAddOnChipsFocusLost

    private void txt1oValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt1oValueFocusLost
        this.txt1oValue.setText(String.valueOf(((JNumericTextField) this.txt1oValue).getInt()));
        return;
    }//GEN-LAST:event_txt1oValueFocusLost

    private void txt2oValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt2oValueFocusLost
        this.txt2oValue.setText(String.valueOf(((JNumericTextField) this.txt2oValue).getInt()));
        return;
    }//GEN-LAST:event_txt2oValueFocusLost

    private void txt3oValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt3oValueFocusLost
        this.txt3oValue.setText(String.valueOf(((JNumericTextField) this.txt3oValue).getInt()));
        return;
    }//GEN-LAST:event_txt3oValueFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.validateFirstGrouping())
          { JOptionPane.showMessageDialog(this, "Todos os campos têm valores válidos."); }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txt1oPerc;
    private javax.swing.JTextField txt1oValue;
    private javax.swing.JTextField txt2oPerc;
    private javax.swing.JTextField txt2oValue;
    private javax.swing.JTextField txt3oPerc;
    private javax.swing.JTextField txt3oValue;
    private javax.swing.JTextField txtAddOnChips;
    private javax.swing.JTextField txtAddOnValue;
    private javax.swing.JTextField txtBuyInChips;
    private javax.swing.JTextField txtBuyInValue;
    private javax.swing.JTextField txtPlayers;
    private javax.swing.JTextField txtReBuyChips;
    private javax.swing.JTextField txtReBuyValue;
    private javax.swing.JTextField txtTournamentName;
    // End of variables declaration//GEN-END:variables

    private void checkFocus() {
        JNumericTextField txt1oPerc = (JNumericTextField) this.txt1oPerc;
        JNumericTextField txt2oPerc = (JNumericTextField) this.txt2oPerc;
        JNumericTextField txt3oPerc = (JNumericTextField) this.txt3oPerc;

        if ((txt1oPerc.getInt() + txt2oPerc.getInt() + txt3oPerc.getInt() > 100))
          {
           JOptionPane.showMessageDialog(this, "A soma dos percentuais dos 3 lugares deve estar entre 0 e 100.");
           txt1oPerc.setInt(0);
           txt2oPerc.setInt(0);
           txt3oPerc.setInt(0);
           return;
          }

        return;
    }

    private boolean validateFirstGrouping() {
        JNumericTextField txtBuyInValue = (JNumericTextField) this.txtBuyInValue;
        JNumericTextField txtBuyInChips = (JNumericTextField) this.txtBuyInChips;
        JNumericTextField txtReBuyChips = (JNumericTextField) this.txtReBuyChips;
        JNumericTextField txtReBuyValue = (JNumericTextField) this.txtReBuyValue;
        JNumericTextField txtAddOnChips = (JNumericTextField) this.txtAddOnChips;
        JNumericTextField txtAddOnValue = (JNumericTextField) this.txtAddOnValue;

        boolean valid = true;

        if (txtBuyInValue.getInt() == 0)
          {
           JOptionPane.showMessageDialog(this, "É obrigatório informar o valor de Buy-In.");
           valid = false;
          }

        if (txtBuyInChips.getInt() == 0)
          {
           JOptionPane.showMessageDialog(this, "É obrigatório informar as fichas de Buy-In.");
           valid = false;
          }

        if (txtReBuyValue.getInt() == 0)
          {
           JOptionPane.showMessageDialog(this, "É obrigatório informar o valor de Re-Buy.");
           valid = false;
          }

        if (txtReBuyChips.getInt() == 0)
          {
           JOptionPane.showMessageDialog(this, "É obrigatório informar as fichas de Re-Buy.");
           valid = false;
          }

        if (txtAddOnValue.getInt() == 0)
          {
           JOptionPane.showMessageDialog(this, "É obrigatório informar o valor de Add-On.");
           valid = false;
          }
        
        if (txtAddOnChips.getInt() == 0)
          {
           JOptionPane.showMessageDialog(this, "É obrigatório informar as fichas de Add-On.");
           valid = false;
          }

        return (valid);
    }
}
