

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.io.File;
import javax.swing.JButton;
import javax.swing.*;
//import javax.swing.JFileChooser;
//import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class testFrame implements ActionListener{
    private JComboBox<String> primaryOptionDrop;
    private JButton goButton;
    private JRadioButton noLaborRadio;
    private JRadioButton zeroSaleRadio;
    private JRadioButton negSaleRadio;
    private JLabel label4;
    private JLabel label3;
    private JLabel label2;
    private JButton loadButton;
    private JLabel label1;
    private JLabel locationLabel;
    private JFrame frame1;

    public testFrame() {

        frame1 = new JFrame();

        //add a tile to the jframe
        this.frame1.setTitle("Title of Window"); 

        //end the program when you hit the x.
        this.frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

        //adjust size and set layout
        this.frame1.setPreferredSize (new Dimension (422, 319));
        this.frame1.setLayout (null);

        // set the size.
        this.frame1.setSize(500, 500);  

        // set location to the center of the screen.
        this.frame1.setLocationRelativeTo(null);

        //construct preComponents
        String[] primaryOptionDropItems = {"Item 1", "Item 2", "Item 3"};

        //construct components
        primaryOptionDrop = new JComboBox<> (primaryOptionDropItems);
        goButton = new JButton ("GO");
        noLaborRadio = new JRadioButton ("No Labor");
        zeroSaleRadio = new JRadioButton ("No $0 Sale");
        negSaleRadio = new JRadioButton ("No Negitive Sale");
        label4 = new JLabel ("Welcome to EEAT");
        label3 = new JLabel ("Filters");
        label2 = new JLabel ("Primary Options");
        loadButton = new JButton ("load .csv Report");
        label1 = new JLabel ("File Location:");
        locationLabel = new JLabel ("filler");

        //adjust size and set layout
        this.frame1.setPreferredSize (new Dimension (422, 319));
        this.frame1.setLayout (null);

        //add components
        this.frame1.add (primaryOptionDrop);
        this.frame1.add (goButton);
        this.frame1.add (noLaborRadio);
        this.frame1.add (zeroSaleRadio);
        this.frame1.add (negSaleRadio);
        this.frame1.add (label4);
        this.frame1.add (label3);
        this.frame1.add (label2);
        this.frame1.add (loadButton);
        this.frame1.add (label1);
        this.frame1.add (locationLabel);

        //set component bounds (only needed by Absolute Positioning)
        primaryOptionDrop.setBounds (65, 105, 100, 25);
        goButton.setBounds (160, 275, 60, 25);
        noLaborRadio.setBounds (245, 80, 100, 30);
        zeroSaleRadio.setBounds (245, 105, 110, 25);
        negSaleRadio.setBounds (245, 130, 125, 25);
        label4.setBounds (130, 10, 150, 30);
        label3.setBounds (260, 50, 70, 25);
        label2.setBounds (65, 75, 100, 25);
        loadButton.setBounds (125, 180, 130, 25);
        label1.setBounds (65, 215, 80, 25);
        locationLabel.setBounds (140, 215, 100, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == goButton){
            testFrame.this.frame1.setVisible(false);
        }
    }
}