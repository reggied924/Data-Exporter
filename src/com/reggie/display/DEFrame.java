package com.reggie.display;

import javax.swing.*;

/**
 * Created by reginalddaniel on 4/15/17.
 */

public class DEFrame extends JFrame {

    JMenuBar mb;
    JMenu file;

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

        mb.add(file);

        return mb;

    }



}
