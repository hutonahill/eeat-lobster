
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class myFrame extends JFrame implements ActionListener{

JButton button

    myFrame(){
        this.setDefalultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File")
        button.addActionListener(l)

        this.add(button)
        this.pack();
        this.sebBisible(true);
    }

    @override
    public void actionPerfromed(ActionEvent e){
        
        if(e.getSorece() == button){
            JFilechooser fileChoser = new JFilechooser();
            
            System.out.println(fileChoser.showOpenDialog(null)); //sellect file to open
        }

    }
}