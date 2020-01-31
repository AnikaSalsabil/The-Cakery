import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.PasswordField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.omg.CORBA.ORB;

public class Login_Form {
    JFrame frame;
    JPanel panel;
    JButton loginBtn,resetBtn,exitBtn;
    JTextField userNameTF;
    JLabel imgL1,imgL2,userNameL,passwordL;

    JPasswordField passwordPF;
    
    public Login_Form() 
    {
        
        
        frame=new JFrame("The Cakery Login");
        panel=new JPanel();
        imgL1=new JLabel();
        imgL2=new JLabel();
        
        panel.setBackground(Color.white);
        
        imgL1.setIcon(new ImageIcon("Cake images\\bg.jpg"));
        imgL1.setBounds(0,0,900,700);
        imgL1.setLayout(null);
        
        
        imgL2.setIcon(new ImageIcon("Cake images\\logo.png"));
        imgL2.setBounds(500,50,300,200);
        imgL2.setLayout(null);
        

        
        userNameL=new JLabel();
        passwordL=new JLabel();
        
        userNameTF=new JTextField();
        passwordPF=new JPasswordField();
        
        
        Font f= new Font("Calibri", Font.PLAIN, 16);
        //Font f= new Font("Bubbleboddy",Font.PLAIN, 16);
        
        loginBtn=new JButton();
        resetBtn=new JButton();
        exitBtn=new JButton();
        
        frame.setSize(900, 700);
        frame.setResizable(false);
        
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
 
        
        userNameL.setBounds(500, 300, 250, 30);
        passwordL.setBounds(500, 350, 250, 30);
        
        userNameL.setText("User Name:");
        passwordL.setText("Password:");
        
        userNameL.setForeground(Color.BLACK);
        passwordL.setForeground(Color.BLACK);
        
        userNameL.setFont(f);
        passwordL.setFont(f);
        
       
        userNameTF.setBounds(600, 300, 250, 30);
        passwordPF.setBounds(600, 350, 250, 30);
        
        
        loginBtn.setBounds(550,500,80,30);
        loginBtn.setBackground(Color.BLACK);
        loginBtn.setForeground(Color.WHITE);
        
        
        loginBtn.setFont(f);
        loginBtn.setText("Login");
        
        
        
        resetBtn.setBounds(650,500,80,30);
        resetBtn.setBackground(Color.BLACK);
        resetBtn.setFont(f);
        resetBtn.setText("Reset");
        resetBtn.setForeground(Color.WHITE);
        
        exitBtn.setBounds(750,500,80,30);
        exitBtn.setBackground(Color.BLACK);
        exitBtn.setFont(f);
        exitBtn.setText("Exit");
        exitBtn.setForeground(Color.WHITE);
        
        
        
        panel.add(imgL1);
        imgL1.add(imgL2);
        
        imgL1.add(userNameL);
        imgL1.add(passwordL);

        
        imgL1.add(userNameTF);
        imgL1.add(passwordPF);
        
        imgL1.add(loginBtn);
        
        imgL1.add(resetBtn);
        imgL1.add(exitBtn);
        
        frame.add(panel);
        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        
        initComponents();
        
        
    }
    
    
    private void initComponents() {
        //loginbutton
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username=userNameTF.getText();
                String password=passwordPF.getText();
      
                if(username.equals("")&& password.equals("")  )
                {
                     JOptionPane.showMessageDialog(null, "Empty Fields");
                    
                }
                else{
                   cakeryDBHandler cd= new cakeryDBHandler();
                   cd.connectDatabase();
                   ResultSet rs = cd.userLoginQuery(username, password);
                    try {
                        if(rs.next()){
                            new CustomerHome(username);
                            frame.setVisible(false);
                        }else{
                             JOptionPane.showMessageDialog(null, "Not Match");
                            userNameTF.setText(null);
                    passwordPF.setText(null);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                        

            }
        });
        
        
        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               userNameTF.setText(null);
               passwordPF.setText(null);
            }
        });
        
        
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
            }
            
}