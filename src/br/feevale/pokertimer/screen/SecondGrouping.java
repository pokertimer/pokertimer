package br.feevale.pokertimer.screen;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public class SecondGrouping extends JPanel {
    private static final SecondGrouping instance = new SecondGrouping();

    private int levels = 0;

    private List< Object[] > blindsTableData = new ArrayList<  >();

    public static SecondGrouping getInstance()
      { return (instance); }

    public List< Object[] > getBlindsData()
      { return (this.blindsTableData); }

    private SecondGrouping() {
        initComponents();
 
        this.tblBlinds.setRowSelectionAllowed(true);
        this.tblBlinds.setColumnSelectionAllowed(false);
        this.tblBlinds.setCellSelectionEnabled(true);
        
        this.tblBlinds.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e)
                {
                 int row = tblBlinds.getSelectedRow();

                 if ((row > -1))
                   {
                    tblBlinds.setRowSelectionInterval(row, row);
                    tblBlinds.addColumnSelectionInterval(0, tblBlinds.getColumnCount() - 1);
                   }
                }
        });

        this.initTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBlinds = new javax.swing.JTable();
        btnReplicateLevel = new javax.swing.JButton();
        btnValidateBlindsTable = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblBlinds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Level", "Small-blind", "Big-blind", "Ante", "Time (minutes)", "Break (minutes)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBlinds.setColumnSelectionAllowed(true);
        tblBlinds.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblBlinds);
        tblBlinds.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnReplicateLevel.setText("Replicar Level");
        btnReplicateLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplicateLevelActionPerformed(evt);
            }
        });

        btnValidateBlindsTable.setText("Validar tabela");
        btnValidateBlindsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateBlindsTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnValidateBlindsTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReplicateLevel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReplicateLevel)
                    .addComponent(btnValidateBlindsTable))
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

    private void btnReplicateLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplicateLevelActionPerformed
        if (tblBlinds.getSelectedRow() == -1)
          {
           JOptionPane.showMessageDialog(this, "Selecione um Level na tabela.");
           return; 
          }
        
          Object[] row = new Object[6];

          row[0] = "Level " + ++this.levels;
          row[1] = this.blindsTableData.get(tblBlinds.getSelectedRow())[1];
          row[2] = this.blindsTableData.get(tblBlinds.getSelectedRow())[2];
          row[3] = this.blindsTableData.get(tblBlinds.getSelectedRow())[3];
          row[4] = this.blindsTableData.get(tblBlinds.getSelectedRow())[4];
          row[5] = 0;

          this.blindsTableData.add(row);
          
          this.setTableData();
    }//GEN-LAST:event_btnReplicateLevelActionPerformed

    private void btnValidateBlindsTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateBlindsTableActionPerformed
        for (Object[] row : this.blindsTableData)
          {
           for (int i = 1; i < row.length; i++) 
             {
              if ((Integer) row[i] == 0)
                {
                 JOptionPane.showMessageDialog(this, "Tabela está incompleta.");
                 return; 
                }
             }
          }

        JOptionPane.showMessageDialog(this, "Tabela está completa.");

        return;
    }//GEN-LAST:event_btnValidateBlindsTableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReplicateLevel;
    private javax.swing.JButton btnValidateBlindsTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBlinds;
    // End of variables declaration//GEN-END:variables

    private void initTableData()
      {
       for (int i = 1; i <= 6; i++) 
         {
          Object[] row = new Object[6];

          row[0] = "Level " + ++this.levels;
          row[1] = 0;
          row[2] = 0;
          row[3] = 0;
          row[4] = 0;
          row[5] = 0;

          this.blindsTableData.add(row);
         }

       this.setTableData();

       return;
      }
    
    private void setTableData() {
        DefaultTableModel model = new DefaultTableModel() {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }  
        };

        model.setColumnIdentifiers(new String[] { "Level", "Small-blind", "Big-blind", "Ante", "Time (minutes)", "Break (minutes)" });

        this.blindsTableData.stream().forEach((row) -> { model.addRow(row); });

        this.tblBlinds.setModel(model);

        model.addTableModelListener((TableModelEvent e) -> {
            blindsTableData.get(e.getFirstRow())[e.getColumn()] = (Integer) tblBlinds.getValueAt(e.getFirstRow(), e.getColumn());

            if (e.getColumn() == 1)
            {
                blindsTableData.get(e.getFirstRow())[2] = 2 * (Integer) tblBlinds.getValueAt(e.getFirstRow(), 1);
                setTableData();
            }
        });

        return;
    }
}
