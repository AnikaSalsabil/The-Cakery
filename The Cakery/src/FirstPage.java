
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class FirstPage {
    JFrame frame;
    JPanel panel;
    JLabel logo;
    JLabel signup,nameLabel,unameLabel,emailLabel,passLabel,addressLabel,cellnoLabel;
    JTextField nameField,unameField,emailField,addressField,cellnoField;
    JPasswordField passField;
    JLabel loginLabel;
    JButton signupButton,loginButton;
    //JLabel employeeLabel;
    JButton employeeLoginButton;
    
    public FirstPage(){
        frame=new JFrame("Cakery First Page");
        panel=new JPanel();
        
        panel.setBackground(Color.white);
        frame.setSize(400, 650);
        frame.setResizable(false);
        
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        
        Border border = BorderFactory.createLineBorder(Color.black);
        Font f= new Font("Calibri", Font.BOLD, 12);
        Font f1=new Font("Calibri",Font.BOLD,20);
        Font f2= new Font("Calibri", Font.PLAIN, 16);
        
        logo=new JLabel();
        logo.setIcon(new ImageIcon("Cake images\\logo.png"));
        logo.setBounds(135,10,130,130);
        logo.setLayout(null);
        
        signup=new JLabel("New User? Sign Up here..");
        nameLabel=new JLabel("Full Name: ");
        unameLabel=new JLabel("User Name: ");
        emailLabel=new JLabel("Email: ");
        passLabel=new JLabel("Password: ");
        addressLabel=new JLabel("Address: ");
        cellnoLabel=new JLabel("Cell No: ");
        
        
        employeeLoginButton=new JButton("CLICK HERE if you are an Employee");
        employeeLoginButton.setBounds(60,550 ,270 ,30 );
        employeeLoginButton.setFont(f2);
        employeeLoginButton.setBackground(Color.DARK_GRAY);
        employeeLoginButton.setForeground(Color.white);
        //employeeLoginButton.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(70, 70, 70, 70)));
        
        signup.setBounds(15,140 ,400 ,50 );
        signup.setForeground(Color.black);
        signup.setFont(f1);
        
        nameLabel.setBounds(15,200 ,100 ,25 );
        nameLabel.setFont(f);
        
        unameLabel.setBounds(15,230 ,100 ,25 );
        unameLabel.setFont(f);
        
        emailLabel.setBounds(15,260 ,100 ,25 );
        emailLabel.setFont(f);
        
        passLabel.setBounds(15,290 ,100 ,25 );
        passLabel.setFont(f);
        
        addressLabel.setBounds(15,320 ,100 ,25 );
        addressLabel.setFont(f);
        
        cellnoLabel.setBounds(15,350 ,100 ,25 );
        cellnoLabel.setFont(f);
        
        
        nameField=new JTextField();
        unameField=new JTextField();
        emailField=new JTextField();
        passField=new JPasswordField();
        addressField=new JTextField();
        cellnoField=new JTextField();
        
        nameField.setBounds(120,200 ,250 ,25 );
        
        unameField.setBounds(120,230 ,250 ,25 );
        
        emailField.setBounds(120,260 ,250 ,25 );
        
        passField.setBounds(120,290 ,250 ,25  );
        
        addressField.setBounds(120,320 ,250 ,25 );
        
        cellnoField.setBounds(120,350 ,250 ,25 );
        
        signupButton=new JButton("Sign Up");
        signupButton.setBounds(260,385 ,100 ,30 );
        signupButton.setFont(f2);
        signupButton.setBackground(Color.black);
        signupButton.setForeground(Color.white);
        
        loginLabel=new JLabel("Already a User? Then Click Login..");
        loginLabel.setBounds(15,430 ,300 ,50 );
        loginLabel.setForeground(Color.black);
        loginLabel.setFont(f1);
        
        loginButton=new JButton();
        loginButton=new JButton("Log In");
        loginButton.setBounds(150,480 ,100 ,30 );
        loginButton.setFont(f2);
        loginButton.setBackground(Color.black);
        loginButton.setForeground(Color.white);
        
        panel.add(employeeLoginButton);
        panel.add(signup);panel.add(nameLabel);panel.add(unameLabel); panel.add(emailLabel);
        panel.add(passLabel); panel.add(addressLabel); panel.add(cellnoLabel);
        
        panel.add(loginLabel);
        panel.add(loginButton);
        panel.add(nameField);panel.add(unameField); panel.add(emailField);
        panel.add(passField); panel.add(addressField); panel.add(cellnoField);
        
        panel.add(signupButton);
        panel.add(logo);
        frame.add(panel);
        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        
        initComponents();
        
    }
    private void initComponents(){
        
        signupButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Submit Button clicked");
                if(!Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", emailField.getText())){
                      JOptionPane.showMessageDialog(null,"Please use vaild email");
                }else if(cellnoField.getText().length()!=11){
                      JOptionPane.showMessageDialog(null,"Please use vaild cell no");
                }else if( !(nameField.getText().equals("")) &&!(unameField.getText().equals("")) &&  !(emailField.getText().equals("")) && !(passField.getText().equals(""))&& !(addressField.getText().equals(""))&& !(cellnoField.getText().equals(""))){
                    cakeryDBHandler db = new cakeryDBHandler();
                    db.connectDatabase();
                    boolean check=db.insertData(nameField.getText(),unameField.getText(),emailField.getText(),passField.getText(),addressField.getText(),cellnoField.getText());
                    if(check){
                      JOptionPane.showMessageDialog(null, "Reg Successful");
                    
                    }else{
                      JOptionPane.showMessageDialog(null, "Duplicate value detected! Reg Failed");
                    
                    }
                    nameField.setText("");
                    unameField.setText("");
                    emailField.setText("");
                    passField.setText("");
                    addressField.setText("");
                    cellnoField.setText("");

                    
                }
            }
        });
        
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Log In Button Clicked");
                Login_Form lf=new Login_Form();
                frame.setVisible(false);
            }
        });
        
        employeeLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("EmployeeLogin Button Clicked");
                new EmployeeLogin();
                frame.setVisible(false);
                
            }
        });
        
        
    }
    
    
}
