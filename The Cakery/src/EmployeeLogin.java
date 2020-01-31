import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class EmployeeLogin {
    JFrame frame;
    JPanel panel;
    JLabel logo;
    
    JTextField nameField,emailField;
    JPasswordField passField;
    JButton loginBtn,resetBtn,exitBtn;
    JLabel nameLabel,emailLabel,passLabel;
    
    
    public EmployeeLogin(){
        frame=new JFrame("Employee Login");
        panel=new JPanel();
        loginBtn=new JButton();
        resetBtn=new JButton();
        exitBtn=new JButton();
        
        
        panel.setBackground(Color.white);
        frame.setSize(400, 400);
        frame.setResizable(false);
        Font f= new Font("Calibri", Font.BOLD, 12);
        Font f1= new Font("Calibri", Font.PLAIN, 14);
        
        logo=new JLabel();
        logo.setIcon(new ImageIcon("Cake images\\logo.png"));
        logo.setBounds(135,10,130,130);
        logo.setLayout(null);
        
        //signup=new JLabel("New User? Sign Up here..");
        nameLabel=new JLabel("User Name: ");
        passLabel=new JLabel("Password: ");
        nameLabel.setBounds(15,200 ,100 ,25 );
        nameLabel.setFont(f);
        
        
        
        passLabel.setBounds(15,240 ,100 ,25 );
        passLabel.setFont(f);
        
        nameField=new JTextField();
    
        passField=new JPasswordField();
        
        nameField.setBounds(120,200 ,250 ,25 );
        
       
        
        passField.setBounds(120,240 ,250 ,25 );
        
        
        
        loginBtn.setBounds(50,300 ,80 ,25 );
        loginBtn.setBackground(Color.BLACK);
        loginBtn.setForeground(Color.WHITE);
        
        
        loginBtn.setFont(f1);
        loginBtn.setText("Login");
        
        
        
        resetBtn.setBounds(150,300 ,80 ,25);
        resetBtn.setBackground(Color.BLACK);
        resetBtn.setFont(f1);
        resetBtn.setText("Reset");
        resetBtn.setForeground(Color.WHITE);
        
        exitBtn.setBounds(250,300 ,80 ,25);
        exitBtn.setBackground(Color.BLACK);
        exitBtn.setFont(f1);
        exitBtn.setText("Exit");
        exitBtn.setForeground(Color.WHITE);
        
        
        
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        
        panel.add(loginBtn);panel.add(resetBtn);panel.add(exitBtn);
        panel.add(nameLabel);panel.add(passLabel);
        panel.add(nameField);panel.add(passField);
        
        panel.add(logo);
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
         
            
                
                String username=nameField.getText();
                String password=passField.getText();
                
                
                
                
                if(username.equals("")&& password.equals("")  )
                {
                     JOptionPane.showMessageDialog(null, "Empty Fields");
                    
                }
                else{
                   cakeryDBHandler cd= new cakeryDBHandler();
                   cd.connectDatabase();
                   ResultSet rs = cd.empLoginQuery(username, password);
                    try {
                        if(rs.next()){
                            JOptionPane.showMessageDialog(null, "Done");
                            frame.setVisible(false);
                            new EmployeeHome();                          
                        }else{
                             JOptionPane.showMessageDialog(null, "Not Match");
                            nameField.setText(null);
                            passField.setText(null);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(EmployeeLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                        

            }
        });
        
        
        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               nameField.setText(null);
              passField.setText(null);
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