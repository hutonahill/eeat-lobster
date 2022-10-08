import javax.swing.JFrame;

public class stage1Main {
    public static void main(String[] args) {

        //create new welcomeFrame object
        welcomeFrame frame1 = new welcomeFrame();
        
        // set location to the center of the screen.
        frame1.setLocationRelativeTo(null);

        // set close function
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make the frame visible
        frame1.setVisible(true);

        // ??
        frame1.getContentPane().add (new MyPanel());
    }

}