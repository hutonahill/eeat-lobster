import java.awt.*;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.*;
//import javax.swing.event.*;

public class welcomeFrame extends JFrame implements ActionListener {
    
    private JComboBox primaryOptionDrop;
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
    private JFrame frame;
    


    public MyPanel() {

        //construct components
        primaryOptionDrop = new JComboBox(primaryOptionDropItems);

        //set title of the window
        //this.frame.setTitle("Title of Window");

        // set close function
        //this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

        // set location to the center of the screen.
        //setLocationRelativeTo(null);

        //construct preComponents
        String[] primaryOptionDropItems = {"Item 1", "Item 2", "Item 3"};

        

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
        this.frame.setPreferredSize (new Dimension (422, 319));
        this.frame.setLayout (null);

        //add components
        this.frame.add (primaryOptionDrop);
        this.frame.add (goButton);
        this.frame.add (noLaborRadio);
        this.frame.add (zeroSaleRadio);
        this.frame.add (negSaleRadio);
        this.frame.add (label4);
        this.frame.add (label3);
        this.frame.add (label2);
        this.frame.add (loadButton);
        this.frame.add (label1);
        this.frame.add (locationLabel);

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

        this.frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == goButton){
        }
    }
}
