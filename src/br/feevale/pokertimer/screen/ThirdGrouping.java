package br.feevale.pokertimer.screen;

import java.util.List;
import javax.swing.JPanel;

public class ThirdGrouping extends JPanel {
    private static final ThirdGrouping instance = new ThirdGrouping();

    private int currentLevel = 0;

    public static ThirdGrouping getInstance()
      { return (instance); }

    private ThirdGrouping() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        timerLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBlindsInfo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblAnteInfo = new javax.swing.JLabel();
        lblNextBlindsInfo = new javax.swing.JLabel();
        lblNextAnteInfo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblPlayersEmJogo = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblTotalArrecadado1 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        timerLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("00:00");

        lblBlindsInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBlindsInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBlindsInfo.setText("Blinds info");

        lblAnteInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAnteInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnteInfo.setText("Ante info");

        lblNextBlindsInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNextBlindsInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNextBlindsInfo.setText("Next Blinds info");

        lblNextAnteInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNextAnteInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNextAnteInfo.setText("Next Ante info");

        lblPlayersEmJogo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPlayersEmJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayersEmJogo.setText("Players em jogo");

        lblTotalArrecadado1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalArrecadado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalArrecadado1.setText("Total arrecadado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(lblBlindsInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(lblAnteInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNextBlindsInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(lblNextAnteInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(lblPlayersEmJogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(lblTotalArrecadado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBlindsInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnteInfo)
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNextBlindsInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNextAnteInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalArrecadado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlayersEmJogo)
                .addContainerGap(52, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAnteInfo;
    private javax.swing.JLabel lblBlindsInfo;
    private javax.swing.JLabel lblNextAnteInfo;
    private javax.swing.JLabel lblNextBlindsInfo;
    private javax.swing.JLabel lblPlayersEmJogo;
    private javax.swing.JLabel lblTotalArrecadado1;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables

  public void initData()
    {
     List< Object[] > blindsData = SecondGrouping.getInstance().getBlindsData();

     Object[] current = blindsData.get(currentLevel);
     Object[] next = blindsData.get(currentLevel + 1);
     
     this.lblBlindsInfo.setText("Small-blind: " + current[1] + " / Big-blind: " + current[2]);
     this.lblAnteInfo.setText("Ante: " + current[3]);

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
    }
}
