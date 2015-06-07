package br.feevale.pokertimer.screen;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

/**
 *
 * @author jeff.cf.br@gmail.com
 */
public class JNumericTextField extends JTextField implements KeyListener
  {
   { super.addKeyListener(this); }

   public int getInt()
     {
      String content = super.getText();

      if (content.length() == 0)
        { return (0); }

      int intContent = 0;

      try
        { intContent = Integer.parseInt(content); }
      catch(NumberFormatException e)
        {  }

      return (intContent);
     }

   public void setInt(final int content)
     {
      super.setText(String.valueOf(content));

      return;
     }

   @Override
   public void keyTyped(final KeyEvent e)
    {
     char key = e.getKeyChar();

     if ((key < '0') || (key > '9'))
       { e.consume(); }

     return;
    }

   @Override
   public void keyPressed(final KeyEvent e)
    { return; }

   @Override
   public void keyReleased(final KeyEvent e)
    { return; }
  }
