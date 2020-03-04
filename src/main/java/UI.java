
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

//class for the GUI of the demo
public class UI extends JFrame implements ActionListener {

    // Components of the Form
    private Container c;
    private JTextField email;
    private JTextField password;



    // constructor, to initialize the components
    // with default values.
    public UI() {

        setTitle("Bounty Board");
        setBounds(300, 90, 896, 504);
        ImageComponent component = new ImageComponent();
        add(component);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        //email field
        email = new JTextField();
        //color made for background of text
        Color silver = new Color(192,192,192);

       //modify of email settings
        email.setBackground(silver);
        email.setFont(new Font("Arial", Font.BOLD, 15));
        email.setSize(212, 40);
        email.setLocation(346, 266);
        email.addActionListener(this);
        c.add(email);

        //password field
        password = new JPasswordField();
        //color made for background
        Color orange = new Color(255,128,51);
        //modify of password settings
        password.setFont(new Font("Arial", Font.PLAIN, 15));
        password.setBackground(orange);
        password.setSize(212, 40);
        password.setLocation(346, 339);
        password.addActionListener(this);
        c.add(password);


        //MISSING LOG IN BUTTON

        //repaints content pane
        getContentPane().validate();
        getContentPane().repaint();

    }

    //function for actions to be performed using JComponents
    public void actionPerformed(ActionEvent e) {
    //here we can work with the actual functionality of the components placed within our Container c
        //TBD

    }


    //inner image class to help display images
    class ImageComponent extends JComponent {

        private static final long serialVersionUID = 1L;

        private Image image;

        public ImageComponent() {
            try {

                //section to add more images
                //adds background image of log in screen
                File image2 = new File("src/main/img/initial.jpg");
                image = ImageIO.read(image2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //function to paint image on screen
        //receives a graphics g as input and uses it to display image found in ImageComponent
        //drawn at full image not to scale
        public void paintComponent(Graphics g) {

            if (image == null) return;
            int imageWidth = image.getWidth(this);
            int imageHeight = image.getHeight(this);


            g.drawImage(image, 0, 0, this);

            for (int i = 0; i * imageWidth <= getWidth(); i++)
                for (int j = 0; j * imageHeight <= getHeight(); j++)
                    if (i + j > 0) g.copyArea(0, 0, imageWidth, imageHeight, i * imageWidth, j * imageHeight);

        }
    }
}

