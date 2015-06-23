package br.feevale.pokertimer;

import br.feevale.pokertimer.screen.MainScreen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main
  {
   public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
     {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }

     EventQueue.invokeLater(() -> {
         JFrame window = MainScreen.getInstance();
         
         window.setVisible(true);
         
         return;
     });
     }
  }
