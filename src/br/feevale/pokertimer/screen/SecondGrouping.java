package br.feevale.pokertimer.screen;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

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

        this.tblBlinds.addKeyListener(new KeyAdapter() {         
                @Override
                public void keyPressed(KeyEvent e) {
                    char key = e.getKeyChar();

                    if ((key < '0') || (key > '9'))
                      { e.consume(); }

                    return;
                }
           });

        this.tblBlinds.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e)
                {
                 int row = tblBlinds.getSelectedRow();

                 if ((row > -1))
                   {
                    tblBlinds.setRowSelectionInterval(row, row);
                   }
                }

            @Override
            public void mouseReleased(MouseEvent e)
                {
                 int row = tblBlinds.getSelectedRow();

                 if ((row > -1))
                   {
                    tblBlinds.setRowSelectionInterval(row, row);
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
        btnRemoveLevel = new javax.swing.JButton();

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
        tblBlinds.setRowHeight(25);
        tblBlinds.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblBlinds);
        tblBlinds.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnReplicateLevel.setText("Replicar Level");
        btnReplicateLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplicateLevelActionPerformed(evt);
            }
        });

        btnRemoveLevel.setText("Excluir Level");
        btnRemoveLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveLevelActionPerformed(evt);
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
                        .addComponent(btnReplicateLevel)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveLevel)))
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
                    .addComponent(btnRemoveLevel))
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

          return;
    }//GEN-LAST:event_btnReplicateLevelActionPerformed

    private void btnRemoveLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveLevelActionPerformed
        if (tblBlinds.getSelectedRow() == -1)
          {
           JOptionPane.showMessageDialog(this, "Selecione um Level na tabela.");
           return; 
          }

          this.blindsTableData.remove(tblBlinds.getSelectedRow());

          this.setTableData();

          return;
    }//GEN-LAST:event_btnRemoveLevelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemoveLevel;
    private javax.swing.JButton btnReplicateLevel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBlinds;
    // End of variables declaration//GEN-END:variables

    private void initTableData()
      {
       this.blindsTableData.add(new Object[] { "Level 1",  50,  100, 0, 15,  0 });
       this.blindsTableData.add(new Object[] { "Level 2", 100,  200, 0, 15,  0 });
       this.blindsTableData.add(new Object[] { "Level 3", 150,  300, 0, 15,  0 });
       this.blindsTableData.add(new Object[] { "Level 4", 200,  400, 0, 15,  0 });
       this.blindsTableData.add(new Object[] { "Level 5", 300,  600, 0, 15,  0 });
       this.blindsTableData.add(new Object[] { "Level 6", 500, 1000, 0, 15, 45 });

       this.levels = 6;

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

        TableColumn columnModel = this.tblBlinds.getColumnModel().getColumn(1);
        columnModel.setCellEditor(new DefaultCellEditor(new JNumericTextField()));

        model.addTableModelListener((TableModelEvent e) -> {
            if (tblBlinds.getValueAt(e.getFirstRow(), e.getColumn()).equals(""))
              { tblBlinds.setValueAt(0, e.getFirstRow(), e.getColumn()); }

            blindsTableData.get(e.getFirstRow())[e.getColumn()] = Integer.parseInt(tblBlinds.getValueAt(e.getFirstRow(), e.getColumn()).toString());

            if (e.getColumn() == 1)
            {
                blindsTableData.get(e.getFirstRow())[2] = 2 * Integer.parseInt(tblBlinds.getValueAt(e.getFirstRow(), 1).toString());
                setTableData();
            }
        });

        return;
    }
}
