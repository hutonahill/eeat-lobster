
//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
//import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.event.*;

public class myFrame implements ActionListener {

    // create action eliments of the JFrame as class variables
    // to allow action listener to see them.
    private JLabel welcomeLabel;
    private JButton button;
    private JFrame topFrame;

    myFrame() {
        initilize();
    }

    public void initilize() {
        // create new JFrame object
        topFrame = new JFrame();

        // add a tile to the jframe
        this.topFrame.setTitle("Title of Window");

        // end the program when you hit the x.
        this.topFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // adjust size and set layout
        this.topFrame.setPreferredSize(new Dimension(407, 325));
        this.topFrame.setLayout(null);

        // set the size.
        this.topFrame.setSize(500, 500);

        // set location to the center of the screen.
        this.topFrame.setLocationRelativeTo(null);

        // construct components
        welcomeLabel = new JLabel("Welcome to PDF selector");
        button = new JButton("Go");

        // set component bounds (only needed by Absolute Positioning)
        welcomeLabel.setBounds(125, 70, 150, 25);
        button.setBounds(175, 200, 65, 25);

        // object to JFrame
        this.topFrame.add(welcomeLabel);
        this.topFrame.add(button);
        button.addActionListener(this);

        // make the main frame visible.
        this.topFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {

            // hide the original frame when working in file chooser
            myFrame.this.topFrame.setVisible(false);

            // create a new file chooser window
            JFileChooser fileChooser = new JFileChooser();

            // spesify that only pdfs can be selected
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    ".pdfs", "pdf");
            fileChooser.setFileFilter(filter);

            // get the butten pressed to close the file chooser
            int responce = fileChooser.showOpenDialog(null);

            // if a file was selected same its location and print it to the command line.
            if (responce == JFileChooser.APPROVE_OPTION) {
                File selectedFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println("file locaton: " + selectedFile);
            }

            myFrame.this.topFrame.setVisible(true); // show original frame.
        }

    }
}
