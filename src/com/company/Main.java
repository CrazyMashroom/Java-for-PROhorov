package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
  public static class Grathic extends JFrame {
    private JButton button = new JButton("FINISH");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Как вас зовут?: ");
    private JRadioButton radio1 = new JRadioButton("Вы Левша?");
    private JRadioButton radio2 = new JRadioButton("Вы Правша?");
    private JCheckBox check = new JCheckBox("Знаете JAVA?", false);

    public Grathic() {
      super("Анкета");
      this.setBounds(500, 0, 0, 0);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container container = this.getContentPane();
      container.setLayout(new GridBagLayout());
      container.add(label);
      container.add(input);
      setSize(550,200);
      ButtonGroup group = new ButtonGroup();
      group.add(radio1);
      group.add(radio2);
      container.add(radio1);
      radio1.setSelected(true);
      container.add(radio2);
      container.add(check);
      button.addActionListener(new ButtonEventListener());
      container.add(button);
    }

    class ButtonEventListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
        String message = "";
        message += "Ваши данные: \n";
        message += "Имя:  " + input.getText() + "\n";
        message += (radio1.isSelected() ? "Левша\n" : "Правша\n");
        message += "Java программирование " + ((check.isSelected())
                ? "усвоили" : "не усвоили");
        JOptionPane.showMessageDialog(null,
                message,
                "Вывод",
                JOptionPane.PLAIN_MESSAGE);
      }
    }
  }
  public static void main(String[] args) {
    Grathic app = new Grathic();
    app.setVisible(true);

  }
}

 /*public static void main(String[] args) {
    LinkedList<Student> people = new LinkedList<>();
    people.add(new Student("Ivan", "Vladko", 20, true));
    people.add(new Student("Vasiliy", "Dolgopolov", 19, true));
    people.add(new Student("Ekaterina", "Stanova", 18, false));
    people.add(new Student("Nikolay", "Denisov", 38, true));
    people.stream().filter((n) -> n.getAge() >= 18 && n.getAge() < 28
    && n.getGen() == true).forEach(n -> System.out.println("В армию идёт: " + n.getName()));
    people.forEach(n -> System.out.println(n.getName()));
  */


