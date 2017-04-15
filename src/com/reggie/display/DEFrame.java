package com.reggie.display;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by reginalddaniel on 4/15/17.
 */

public class DEFrame extends JFrame {

    JMenuBar mb;

    JMenu file;
    JMenuItem exportData;
    JMenuItem createConnection;
    JMenuItem exit;

    public DEFrame(){

        this.setTitle("Data Exporter");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(generateJMenuBar());
        this.setVisible(true);

    }


    private JMenuBar generateJMenuBar(){

        mb = new JMenuBar();


        file = new JMenu("File");
        exportData = new JMenuItem("Export Data");
        createConnection = new JMenuItem("Create Data Connection");
        exit = new JMenuItem("Exit");
        exit.addActionListener(new ExitAction());

        file.add(exportData);
        file.add(createConnection);
        file.addSeparator();
        file.add(exit);


        mb.add(file);

        return mb;

    }

    private class ExitAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            int selection = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",  "Exit Data Exporter", JOptionPane.YES_NO_OPTION);

            if(selection == JOptionPane.YES_OPTION){
                System.exit(0);
            }
            else{

                //Do nothing

            }

        }
    }



}
