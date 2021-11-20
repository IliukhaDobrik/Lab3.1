package MainPackege;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenuBar extends JMenuBar implements ActionListener {
    JMenu fileMenu = new JMenu("Файл");
    JMenu helpMenu = new JMenu("Справка");

    JMenuItem loadItem = new JMenuItem("Загрузить");
    JMenuItem saveItem = new JMenuItem("Сохранить");
    JMenuItem exitItem = new JMenuItem("Выход");

    JMenuItem infoItem = new JMenuItem("О программе");

    public MyMenuBar(){
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        infoItem.addActionListener(this);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        helpMenu.add(infoItem);

        this.add(fileMenu);
        this.add(helpMenu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == loadItem) {
                System.out.println("Пока так...");
            }
            if (e.getSource() == saveItem) {
                System.out.println("Пока так...");
            }
            if (e.getSource() == exitItem) {
                System.exit(0);
            }
            if (e.getSource() == infoItem) {
                JOptionPane.showMessageDialog(
                        null,
                        "Создатель: Добринский Илья Сергеевич\nСтудент 6 группы",
                        "О создателе",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}
