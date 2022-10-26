package test;

import javax.swing.*;

class App {
  public static void main(String[] args) {
      new JFrameUI().setVisible(true);
  }
}

public class JFrameUI extends JFrame {
    private JButton btn = new JButton("Жми!");
    public JFrameUI() {
      super("Test"); // Заголовок формы
      this.setBounds(0, 0, 250, 300); // Положение и размеры формы
      this.setLocationRelativeTo(null); // *центр экрана
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // *реакция после закрытия
      this.getContentPane().add(btn);
      btn.addActionListener((e) -> {
        String text = JOptionPane.showInputDialog("Ведите текст?");
        JOptionPane.showMessageDialog(this, "ясно " + text + "!");
      });
    }
    
}

