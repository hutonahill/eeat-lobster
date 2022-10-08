
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;

//import java.io.File;
//import javax.swing.JFileChooser;
//import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;

public class welcomeFrame implements ActionListener {
    private JComboBox<String> primaryOptionDrop;
    private JButton goButton;
    private JCheckBox noLaborRadio;
    private JCheckBox zeroSaleRadio;
    private JCheckBox negSaleRadio;
    private JCheckBox descending;
    private JLabel label4;
    private JLabel label3;
    private JLabel label2;
    private JButton loadButton;
    private JLabel label1;
    private JLabel locationLabel;
    private JFrame frame1;
    private ButtonGroup filters;

    public welcomeFrame() {

        frame1 = new JFrame();

        // add a tile to the jframe
        this.frame1.setTitle("CSV Report Compiler");

        // end the program when you hit the x.
        this.frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // adjust size and set layout
        this.frame1.setLayout(null);

        // set the size.
        this.frame1.setSize(422, 400);

        // set location to the center of the screen.
        this.frame1.setLocationRelativeTo(null);

        // construct preComponents
        String[] primaryOptionDropItems = { "Select Item...",
                "Discount", "Units", "Gross Sale Price", "Profit", "Margin (Sale)"
        };

        filters = new ButtonGroup();

        // construct components
        primaryOptionDrop = new JComboBox<>(primaryOptionDropItems);

        goButton = new JButton("GO");
        goButton.addActionListener(this);

        noLaborRadio = new JCheckBox("No Labor", true);
        filters.add(noLaborRadio);
        noLaborRadio.addActionListener(this);

        zeroSaleRadio = new JCheckBox("No $0 Sale");
        filters.add(zeroSaleRadio);
        zeroSaleRadio.addActionListener(this);

        negSaleRadio = new JCheckBox("No Negitive Sale");
        filters.add(negSaleRadio);
        negSaleRadio.addActionListener(this);

        descending = new JCheckBox("Descending");
        filters.add(descending);
        descending.addActionListener(this);

        label4 = new JLabel("Welcome to Frankenstein's Lobster");
        label3 = new JLabel("Filters");
        label2 = new JLabel("Primary Options");

        loadButton = new JButton("load .csv Report");
        loadButton.addActionListener(this);
        ;
        label1 = new JLabel("File Location:");
        locationLabel = new JLabel("");
        locationLabel.setHorizontalAlignment(SwingConstants.LEFT);
        locationLabel.setVerticalAlignment(SwingConstants.TOP);

        // adjust size and set layout
        this.frame1.setPreferredSize(new Dimension(500, 319));
        this.frame1.setLayout(null);

        // add components
        this.frame1.add(primaryOptionDrop);
        this.frame1.add(goButton);
        this.frame1.add(noLaborRadio);
        this.frame1.add(zeroSaleRadio);
        this.frame1.add(negSaleRadio);
        this.frame1.add(descending);
        this.frame1.add(label4);
        this.frame1.add(label3);
        this.frame1.add(label2);
        this.frame1.add(loadButton);
        this.frame1.add(label1);
        this.frame1.add(locationLabel);

        // set component bounds (only needed by Absolute Positioning)
        primaryOptionDrop.setBounds(65, 105, 170, 25);
        goButton.setBounds(160, 275, 60, 25);
        noLaborRadio.setBounds(245, 80, 100, 30);
        zeroSaleRadio.setBounds(245, 105, 110, 25);
        negSaleRadio.setBounds(245, 130, 125, 25);
        descending.setBounds(245, 155, 100, 25);
        label4.setBounds(100, 10, 300, 30);
        label3.setBounds(260, 50, 70, 25);
        label2.setBounds(65, 75, 100, 25);
        loadButton.setBounds(125, 180, 130, 25);
        label1.setBounds(5, 215, 80, 25);
        locationLabel.setBounds(85, 220, 315, 50);

        this.frame1.setVisible(true);
    }

    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void outputSettings(String settings) {
        try {
            FileWriter outputFile = new FileWriter("stage1\\stage1Output.txt");
            System.out.println();
            outputFile.write(settings);

            outputFile.close();

        } catch (IOException e) {
        }
    }

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    private File selectedFile = null;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == goButton) {
            welcomeFrame.this.frame1.setVisible(false);

            if (selectedFile == null) {
                infoBox("You must Select a file. Please try agean",
                        "Impropper Input");
                welcomeFrame.this.frame1.setVisible(true);
            } else /* if (selectedFile != null) */ {

                String settings;

                settings = getSelectedButtonText(filters);

                settings = settings + "," + primaryOptionDrop.getSelectedItem();

                outputSettings(settings);

                solution process = new solution();
                process.setfileLocation(selectedFile.getAbsolutePath());
                process.setUserInput(settings);
                System.out.println(settings);
                process.run();

                System.exit(0);
            }

        } else if (e.getSource() == loadButton) {
            // hide the original frame when working in file chooser
            welcomeFrame.this.frame1.setVisible(false);

            // create a new file chooser window
            JFileChooser fileChooser = new JFileChooser();

            // spesify that only pdfs can be selected
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    ".csv reports only", "csv");
            fileChooser.setFileFilter(filter);

            // get the butten pressed to close the file chooser
            int responce = fileChooser.showOpenDialog(null);

            // if a file was selected same its location and print it to the command line.
            if (responce == JFileChooser.APPROVE_OPTION) {
                selectedFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println("file locaton: " + selectedFile);

                String fileLocation = selectedFile.getAbsolutePath();

                welcomeFrame.this.locationLabel.setText("<HTML>" + fileLocation + "<HTML>");

                // call stage 2 with selectedFile as a peramiter
            }

            welcomeFrame.this.frame1.setVisible(true); // show original frame.
        }
    }
}