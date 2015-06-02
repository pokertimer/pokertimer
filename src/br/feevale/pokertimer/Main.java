package br.feevale.pokertimer;

import br.feevale.pokertimer.screen.MainScreen;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main
  {
   public static void main(String[] args)
     {
     EventQueue.invokeLater(() -> {
         JFrame window = new MainScreen();
         
         window.setVisible(true);
         
         return;
     });
     }
  }
