package br.feevale.pokertimer.screen;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;

public class MainScreen extends JFrame {
    private static final MainScreen instance = new MainScreen();

    private MainScreen() {
        initComponents();

        // screen size and position
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int w = super.getWidth();
        int h = super.getHeight();

        super.setBounds((screenSize.width - w) / 2, (screenSize.height - h) / 2, w, h);
        // -->

        this.tabsPane.addTab("Configuração", FirstGrouping.getInstance());
        this.tabsPane.addTab("Estrutura de blinds", SecondGrouping.getInstance());
        this.tabsPane.addTab("Timer", ThirdGrouping.getInstance());
        this.tabsPane.addTab("Resultado", FourthGrouping.getInstance());

        this.tabsPane.setEnabledAt(3, false);

        tabsPane.addChangeListener((ChangeEvent e) -> {
            if (tabsPane.getSelectedIndex() == 2) // Timer tab
                {
                 ThirdGrouping.getInstance().updateData();
                }
        });
     
        return;
    }

    public static MainScreen getInstance()
      { return (instance); }

    public JTabbedPane getTabbedPane()
      { return (this.tabsPane); }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabsPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PokerTimer v1.3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabsPane;
    // End of variables declaration//GEN-END:variables
}
