package br.feevale.pokertimer.screen;

import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ThirdGrouping extends JPanel {
    private static final ThirdGrouping instance = new ThirdGrouping();

    protected double total = 0;

    private boolean started = false;
    private boolean paused = false;
    private int time = 0;
    private int currentLevel = 0;
    private int players = 0;
    private int playersTotal = 0;
    private int rebuys = 0;
    private int addons = 0;
    private int levels = 0;

    public static ThirdGrouping getInstance()
      { return (instance); }

    private ThirdGrouping() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        timerLabel = new javax.swing.JLabel();
        lblAnteInfo = new javax.swing.JLabel();
        lblBlindsInfo = new javax.swing.JLabel();
        btnPreviousLevel = new javax.swing.JButton();
        btnNextLevel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblNextBlindsInfo = new javax.swing.JLabel();
        lblNextAnteInfo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTotalValueInfo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblPlayersInfo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnMinusMinute = new javax.swing.JButton();
        btnPlusMinute = new javax.swing.JButton();
        btnMinusPlayer = new javax.swing.JButton();
        btnPlusPlayer = new javax.swing.JButton();
        btnMinusRebuy = new javax.swing.JButton();
        btnPlusRebuy = new javax.swing.JButton();
        btnMinusAddon = new javax.swing.JButton();
        btnPlusAddon = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Level corrente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        timerLabel.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("00:00");

        lblAnteInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnteInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnteInfo.setText("Ante");

        lblBlindsInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBlindsInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBlindsInfo.setText("Small blind / Big blind");

        btnPreviousLevel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPreviousLevel.setText("<");
        btnPreviousLevel.setBorderPainted(false);
        btnPreviousLevel.setFocusPainted(false);
        btnPreviousLevel.setFocusable(false);
        btnPreviousLevel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPreviousLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousLevelActionPerformed(evt);
            }
        });

        btnNextLevel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnNextLevel.setText(">");
        btnNextLevel.setBorderPainted(false);
        btnNextLevel.setFocusPainted(false);
        btnNextLevel.setFocusable(false);
        btnNextLevel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNextLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextLevelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnteInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblBlindsInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnPreviousLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextLevel))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextLevel)
                    .addComponent(btnPreviousLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBlindsInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnteInfo)
                .addGap(26, 26, 26))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Próximo level", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblNextBlindsInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNextBlindsInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNextBlindsInfo.setText("Small blind / Big blind");

        lblNextAnteInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNextAnteInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNextAnteInfo.setText("Ante");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNextAnteInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblNextBlindsInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblNextBlindsInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNextAnteInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Total arrecadado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblTotalValueInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalValueInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalValueInfo.setText("Valor total");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotalValueInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblTotalValueInfo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Players em jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblPlayersInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlayersInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayersInfo.setText("Players");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPlayersInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPlayersInfo)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        btnStart.setText("Iniciar");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("Encerrar");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnPause.setText("Pausar");
        btnPause.setEnabled(false);
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnMinusMinute.setText("-1min");
        btnMinusMinute.setEnabled(false);
        btnMinusMinute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusMinuteActionPerformed(evt);
            }
        });

        btnPlusMinute.setText("+1min");
        btnPlusMinute.setEnabled(false);
        btnPlusMinute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinuteActionPerformed(evt);
            }
        });

        btnMinusPlayer.setText("-1 player");
        btnMinusPlayer.setEnabled(false);
        btnMinusPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusPlayerActionPerformed(evt);
            }
        });

        btnPlusPlayer.setText("+1 player");
        btnPlusPlayer.setEnabled(false);
        btnPlusPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusPlayerActionPerformed(evt);
            }
        });

        btnMinusRebuy.setText("-1 Re-buy");
        btnMinusRebuy.setEnabled(false);
        btnMinusRebuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusRebuyActionPerformed(evt);
            }
        });

        btnPlusRebuy.setText("+1 Re-buy");
        btnPlusRebuy.setEnabled(false);
        btnPlusRebuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusRebuyActionPerformed(evt);
            }
        });

        btnMinusAddon.setText("-1 Add-on");
        btnMinusAddon.setEnabled(false);
        btnMinusAddon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusAddonActionPerformed(evt);
            }
        });

        btnPlusAddon.setText("+1 Add-on");
        btnPlusAddon.setEnabled(false);
        btnPlusAddon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusAddonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPlusMinute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinusMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPlusPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinusPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPlusRebuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinusRebuy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPlusAddon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinusAddon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnPlusMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMinusMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnPlusPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMinusPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(btnPlusAddon, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnMinusAddon, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(btnPlusRebuy, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnMinusRebuy, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        btnStart.setEnabled(true);
        btnStop.setEnabled(false);
        
        JTabbedPane tabbedPane = MainScreen.getInstance().getTabbedPane();

        tabbedPane.setEnabledAt(0, true);
        tabbedPane.setEnabledAt(1, true);
        tabbedPane.setEnabledAt(3, true);

        started = false;
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // verifica dados da primeira aba
        if (!FirstGrouping.getInstance().validateFirstGrouping())
          { return; }
        
        btnStart.setEnabled(false);
        btnStop.setEnabled(true);
        btnPreviousLevel.setEnabled(true);
        btnNextLevel.setEnabled(true);

        btnPause.setEnabled(true);
        btnPlusMinute.setEnabled(true);
        btnMinusMinute.setEnabled(true);
        btnPlusPlayer.setEnabled(true);
        btnMinusPlayer.setEnabled(true);
        btnPlusRebuy.setEnabled(true);
        btnMinusRebuy.setEnabled(true);
        btnPlusAddon.setEnabled(true);
        btnMinusAddon.setEnabled(true);

        JTabbedPane tabbedPane = MainScreen.getInstance().getTabbedPane();

        tabbedPane.setEnabledAt(0, false);
        tabbedPane.setEnabledAt(1, false);

        List< Object[] > blindsData = SecondGrouping.getInstance().getBlindsData();

        this.levels = blindsData.size();
        this.time = ((Integer) blindsData.get(0)[4]) * 60;
        this.players = ((JNumericTextField) FirstGrouping.getInstance().txtPlayers).getInt();
        this.playersTotal = ((JNumericTextField) FirstGrouping.getInstance().txtPlayers).getInt();
        this.rebuys = 0;
        this.addons = 0;

        paused = false;
        started = true;

        Runnable clock = () -> {
            boolean bk = false;

            while (started)
            {
                updateData();
                
                if (paused)
                {
                    try { Thread.sleep(1000); } catch (InterruptedException ex) { }
                    continue;
                }

                time--;
                try { Thread.sleep(1000); } catch (InterruptedException ex) { }

                if (time == 0)
                {
                    if (currentLevel == levels - 1)
                    { break; }

                    if (!bk && (Integer) blindsData.get(currentLevel)[5] > 0)
                      {
                       bk = true;
                       time = (Integer) blindsData.get(currentLevel)[5] * 60;
                       updateData();
                       continue;
                      }
                    
                    bk = false;
                    currentLevel++;
                    time = ((Integer) blindsData.get(currentLevel)[4]) * 60;
                    updateData();
                }
            }
            
            return;
        };
        
        (new Thread(clock)).start();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        if (this.paused)
          {
           this.paused = false;
           this.btnPause.setText("Pausar");
          }
        else
          {
           this.paused = true;
           this.btnPause.setText("Continuar");
          }
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnMinusMinuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusMinuteActionPerformed
        if (this.time < 60)
          { return; }

        this.time -= 60;
        this.updateData();
    }//GEN-LAST:event_btnMinusMinuteActionPerformed

    private void btnPlusMinuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinuteActionPerformed
        this.time += 60;
        this.updateData();
    }//GEN-LAST:event_btnPlusMinuteActionPerformed

    private void btnMinusPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusPlayerActionPerformed
        if (this.players == 1)
          { return; }
        
        this.players--;
        this.updateData();
    }//GEN-LAST:event_btnMinusPlayerActionPerformed

    private void btnPlusPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusPlayerActionPerformed
        if (this.playersTotal == 10)
          { return; }

        this.players++;
        this.playersTotal++;
        this.updateData(); 
    }//GEN-LAST:event_btnPlusPlayerActionPerformed

    private void btnMinusRebuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusRebuyActionPerformed
        this.rebuys--;
        this.updateData();
    }//GEN-LAST:event_btnMinusRebuyActionPerformed

    private void btnPlusRebuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusRebuyActionPerformed
        this.rebuys++;
        this.updateData();
    }//GEN-LAST:event_btnPlusRebuyActionPerformed

    private void btnMinusAddonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusAddonActionPerformed
        this.addons--;
        this.updateData();
    }//GEN-LAST:event_btnMinusAddonActionPerformed

    private void btnPlusAddonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusAddonActionPerformed
        this.addons++;
        this.updateData();
    }//GEN-LAST:event_btnPlusAddonActionPerformed

    private void btnNextLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextLevelActionPerformed
        this.currentLevel++;
        time = ((Integer) SecondGrouping.getInstance().getBlindsData().get(currentLevel)[4]) * 60;
        this.updateData();
    }//GEN-LAST:event_btnNextLevelActionPerformed

    private void btnPreviousLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousLevelActionPerformed
        this.currentLevel--;
        time = ((Integer) SecondGrouping.getInstance().getBlindsData().get(currentLevel)[4]) * 60;
        this.updateData();
    }//GEN-LAST:event_btnPreviousLevelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMinusAddon;
    private javax.swing.JButton btnMinusMinute;
    private javax.swing.JButton btnMinusPlayer;
    private javax.swing.JButton btnMinusRebuy;
    private javax.swing.JButton btnNextLevel;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlusAddon;
    private javax.swing.JButton btnPlusMinute;
    private javax.swing.JButton btnPlusPlayer;
    private javax.swing.JButton btnPlusRebuy;
    private javax.swing.JButton btnPreviousLevel;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblAnteInfo;
    private javax.swing.JLabel lblBlindsInfo;
    private javax.swing.JLabel lblNextAnteInfo;
    private javax.swing.JLabel lblNextBlindsInfo;
    private javax.swing.JLabel lblPlayersInfo;
    private javax.swing.JLabel lblTotalValueInfo;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables

  public void updateData()
    {
     List< Object[] > blindsData = SecondGrouping.getInstance().getBlindsData();

     if (currentLevel == 0)
       { btnPreviousLevel.setEnabled(false); }

     if (currentLevel == levels - 1)
       { btnNextLevel.setEnabled(false); }
     
     Object[] current = blindsData.get(currentLevel);
     Object[] next = currentLevel < levels - 1 ? blindsData.get(currentLevel + 1) : null;

     int minutes = this.time / 60;
     int seconds = this.time - (minutes * 60);

     this.timerLabel.setText((minutes < 10 ? "0" : "") + minutes + ":" + (seconds < 10 ? "0" : "") + seconds);

     this.lblBlindsInfo.setText("Small-blind: " + current[1] + " / Big-blind: " + current[2]);
     this.lblAnteInfo.setText("Ante: " + current[3]);
     this.lblPlayersInfo.setText(this.players + "/" + this.playersTotal);

     if (next != null)
       {
        this.lblNextBlindsInfo.setText("Small-blind: " + next[1] + " / Big-blind: " + next[2]);
        this.lblNextAnteInfo.setText("Ante: " + next[3]);
       }
     else
       {
        this.lblNextBlindsInfo.setText("");
        this.lblNextAnteInfo.setText("");
       }

     total = (this.playersTotal * ((JNumericTextField) FirstGrouping.getInstance().txtBuyInValue).getInt()) + (this.rebuys * ((JNumericTextField) FirstGrouping.getInstance().txtReBuyValue).getInt()) + (this.addons * ((JNumericTextField) FirstGrouping.getInstance().txtAddOnValue).getInt());
     
     this.lblTotalValueInfo.setText("R$ " + total);

     FourthGrouping.getInstance().lblTotal.setText("R$ " + total);
     FourthGrouping.getInstance().lblFirstPlace.setText("R$ " + (total * ((JNumericTextField) FirstGrouping.getInstance().txt1oPerc).getInt()) / 100);
     FourthGrouping.getInstance().lblSecondPlace.setText("R$ " + (total * ((JNumericTextField) FirstGrouping.getInstance().txt2oPerc).getInt()) / 100);
     FourthGrouping.getInstance().lblThirdPlace.setText("R$ " + (total * ((JNumericTextField) FirstGrouping.getInstance().txt3oPerc).getInt()) / 100);

     return;
    }
}
