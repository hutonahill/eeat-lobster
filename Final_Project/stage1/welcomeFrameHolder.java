
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Enumeration;

// //import java.io.File;
// import javax.swing.JButton;
// import javax.swing.*;
// //import javax.swing.JFileChooser;
// //import javax.swing.filechooser.FileNameExtensionFilter;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.filechooser.FileNameExtensionFilter;

// import java.awt.*;

// public class welcomeFrame implements ActionListener {
// private JComboBox<String> primaryOptionDrop;
// private JButton goButton;
// private JRadioButton noLaborRadio;
// private JRadioButton zeroSaleRadio;
// private JRadioButton negSaleRadio;
// private JLabel label4;
// private JLabel label3;
// private JLabel label2;
// private JButton loadButton;
// private JLabel label1;
// private JLabel locationLabel;
// private JFrame frame1;
// private ButtonGroup filters;

// public welcomeFrame() {

// frame1 = new JFrame();

// // add a tile to the jframe
// this.frame1.setTitle("CSV Report Compiler");

// // end the program when you hit the x.
// this.frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

// // adjust size and set layout
// this.frame1.setLayout(null);

// // set the size.
// this.frame1.setSize(422, 400);

// // set location to the center of the screen.
// this.frame1.setLocationRelativeTo(null);

// // construct preComponents
// String[] primaryOptionDropItems = { "Select Item...",
// "Most Discounted", "Least Discounted", "Highest Average Discount",
// "Lowest Average Discount", "Most Units Sold", "Least Units Sold",
// "Most Profitable", "Least Profitable", "Best Margin", "Worst Margin" };

// filters = new ButtonGroup();

// // construct components
// primaryOptionDrop = new JComboBox<>(primaryOptionDropItems);

// goButton = new JButton("GO");
// goButton.addActionListener(this);

// noLaborRadio = new JRadioButton("No Labor");
// filters.add(noLaborRadio);

// zeroSaleRadio = new JRadioButton("No $0 Sale");
// filters.add(zeroSaleRadio);

// negSaleRadio = new JRadioButton("No Negitive Sale");
// filters.add(negSaleRadio);

// label4 = new JLabel("Welcome to EEAT");
// label3 = new JLabel("Filters");
// label2 = new JLabel("Primary Options");

// loadButton = new JButton("load .csv Report");
// loadButton.addActionListener(this);
// ;
// label1 = new JLabel("File Location:");
// locationLabel = new JLabel("");
// locationLabel.setHorizontalAlignment(SwingConstants.LEFT);
// locationLabel.setVerticalAlignment(SwingConstants.TOP);

// // adjust size and set layout
// this.frame1.setPreferredSize(new Dimension(422, 319));
// this.frame1.setLayout(null);

// // add components
// this.frame1.add(primaryOptionDrop);
// this.frame1.add(goButton);
// this.frame1.add(noLaborRadio);
// this.frame1.add(zeroSaleRadio);
// this.frame1.add(negSaleRadio);
// this.frame1.add(label4);
// this.frame1.add(label3);
// this.frame1.add(label2);
// this.frame1.add(loadButton);
// this.frame1.add(label1);
// this.frame1.add(locationLabel);

// // set component bounds (only needed by Absolute Positioning)
// primaryOptionDrop.setBounds(65, 105, 100, 25);
// goButton.setBounds(160, 275, 60, 25);
// noLaborRadio.setBounds(245, 80, 100, 30);
// zeroSaleRadio.setBounds(245, 105, 110, 25);
// negSaleRadio.setBounds(245, 130, 125, 25);
// label4.setBounds(130, 10, 150, 30);
// label3.setBounds(260, 50, 70, 25);
// label2.setBounds(65, 75, 100, 25);
// loadButton.setBounds(125, 180, 130, 25);
// label1.setBounds(5, 215, 80, 25);
// locationLabel.setBounds(85, 220, 315, 50);

// this.frame1.setVisible(true);
// }

// public static void infoBox(String infoMessage, String titleBar) {
// JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar,
// JOptionPane.INFORMATION_MESSAGE);
// }

// public static void outputSettings(String settings) {
// try {
// FileWriter outputFile = new FileWriter("stage1\\stage1Output.txt");

// outputFile.write(settings);

// outputFile.close();

// } catch (IOException e) {
// }
// }

// public String getSelectedButtonText(ButtonGroup buttonGroup) {
// for (Enumeration<AbstractButton> buttons = buttonGroup.getElements();
// buttons.hasMoreElements();) {
// AbstractButton button = buttons.nextElement();

// if (button.isSelected()) {
// return button.getText();
// }
// }

// return null;
// }

// private File selectedFile = null;

// @Override
// public void actionPerformed(ActionEvent e) {

// if (e.getSource() == goButton) {
// welcomeFrame.this.frame1.setVisible(false);

// if (selectedFile == null) {
// infoBox("You must Select a file. Please try agean",
// "Impropper Input");
// welcomeFrame.this.frame1.setVisible(true);
// } else /* if (selectedFile != null) */ {

// String settings;

// settings = getSelectedButtonText(filters);

// settings = settings + "," + primaryOptionDrop.getSelectedItem();

// outputSettings(settings);

// solution bacon = new solution();

// bacon.run();

// System.exit(0);
// }

// } else if (e.getSource() == loadButton) {
// // hide the original frame when working in file chooser
// welcomeFrame.this.frame1.setVisible(false);

// // create a new file chooser window
// JFileChooser fileChooser = new JFileChooser();

// // spesify that only pdfs can be selected
// FileNameExtensionFilter filter = new FileNameExtensionFilter(
// ".csv reports only", "csv");
// fileChooser.setFileFilter(filter);

// // get the butten pressed to close the file chooser
// int responce = fileChooser.showOpenDialog(null);

// // if a file was selected same its location and print it to the command line.
// if (responce == JFileChooser.APPROVE_OPTION) {
// selectedFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
// System.out.println("file locaton: " + selectedFile);

// String fileLocation = selectedFile.getAbsolutePath();

// welcomeFrame.this.locationLabel.setText("<HTML>" + fileLocation + "<HTML>");

// // call stage 2 with selectedFile as a peramiter
// }

// welcomeFrame.this.frame1.setVisible(true); // show original frame.
// }
// }
// }
