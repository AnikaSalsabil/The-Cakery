
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Array;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.border.Border;


public class EmployeeHome {
    JFrame homeFrame;
    JPanel homePanel;
    JButton exitButton;
    JButton customerButton,employeeButton,itemsButton,ordersButton,paymentButton,pickupsButton;
    JLabel logo,label;
    JScrollPane scrollPane;
    JTextArea showTextField;
    
    JTable jtable;
    public EmployeeHome(){
        homeFrame =new JFrame("Employee Section");
        homePanel=new JPanel();
        exitButton=new JButton();
        logo=new JLabel();
        showTextField=new JTextArea();
        scrollPane=new JScrollPane(showTextField);
        
        
        /*
        jtable=new JTable();
        jtable.setBounds(140,100,750,740);
        homePanel.add(jtable); */
        
        
        homePanel.setBackground(Color.white);
        homeFrame.setSize(900, 750);
        homeFrame.setResizable(false);
        
        homePanel.setLayout(null);
     
        Border border = BorderFactory.createLineBorder(Color.black);
        Font f= new Font("Calibri", Font.BOLD, 20);
        Font f1= new Font("Calibri", Font.PLAIN, 13);
        
        customerButton=new JButton();
        employeeButton=new JButton();
        itemsButton=new JButton();
        ordersButton=new JButton();
        paymentButton=new JButton();
        pickupsButton=new JButton();
        
        logo.setBounds(360, -15, 130, 130);
        logo.setIcon(new ImageIcon("Cake images\\logo.png"));
        
        
        scrollPane.setBounds(140,100,730,700);
        showTextField.setBounds(140,100,750,740);
        showTextField.setFont(f1);
        showTextField.setBackground(Color.white);
        showTextField.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(50, 50, 50, 50)));
        
        
        customerButton.setBackground(Color.white);employeeButton.setBackground(Color.white);
        itemsButton.setBackground(Color.white);ordersButton.setBackground(Color.white);
        paymentButton.setBackground(Color.white);pickupsButton.setBackground(Color.white);
        
        customerButton.setIcon(new ImageIcon("Cake images\\customer.png"));
        employeeButton.setIcon(new ImageIcon("Cake images\\employee.png"));
        itemsButton.setIcon(new ImageIcon("Cake images\\items.png"));
        ordersButton.setIcon(new ImageIcon("Cake images\\order.png"));
        paymentButton.setIcon(new ImageIcon("Cake images\\payment.png"));
        pickupsButton.setIcon(new ImageIcon("Cake images\\pickup.png"));
        
        
        customerButton.setBounds(20, 100, 100, 100);
        employeeButton.setBounds(20, 200, 100, 100);
        itemsButton.setBounds(20, 300, 100, 100);
        ordersButton.setBounds(20, 400, 100, 100);
        paymentButton.setBounds(20, 500, 100, 100);
        pickupsButton.setBounds(20, 600, 100, 100);
        
       
        
        exitButton.setBounds(780,0 ,70 ,70 );
        exitButton.setIcon(new ImageIcon("Cake images\\exit.png"));
        exitButton.setBackground(Color.WHITE);
        //exitButton.setForeground(Color.BLACK);
        homePanel.add(scrollPane);
        //homePanel.add(showTextField);
        //scrollPane.add(showTextField);
        homePanel.add(logo);
       homePanel.add(customerButton);
       homePanel.add(employeeButton);
       homePanel.add(itemsButton);
       homePanel.add(ordersButton);
       homePanel.add(paymentButton);
       homePanel.add(pickupsButton);
        //homePanel.add(scrollPane);
        //homePanel.add(exitButton);
        homeFrame.add(homePanel);
        homeFrame.setVisible(true);
        homeFrame.setLocationRelativeTo(null);
        initComponents();
        
    }
    
    
    private void initComponents(){
     
        
        
        
        /*
        
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Show Button clicked");
                cakeryDBHandler db = new cakeryDBHandler();
                db.connectDatabase();
                ResultSet rs = db.testQuery();
                showResult(rs);
            }
        });
        
        */
        
        
        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Customer Button Clicked");
                cakeryDBHandler db = new cakeryDBHandler();
                db.connectDatabase();
                ResultSet rs = db.testQuery();
                
                showResult(rs);
                
                
            }
        });
        
        employeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Employee Button Clicked");
                cakeryDBHandler db = new cakeryDBHandler();
                db.connectDatabase();
                ResultSet rs = db.EmployeetestQuery();
                
                EmployeeshowResult(rs);
                
            }
        });
        
        itemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Items Button Clicked");
                cakeryDBHandler db = new cakeryDBHandler();
                db.connectDatabase();
                ResultSet rs = db.ItemtestQuery();
                
                ItemshowResult(rs);
            }
        });
        
        ordersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Orders Button Clicked");
                cakeryDBHandler db = new cakeryDBHandler();
                db.connectDatabase();
                ResultSet rs = db.OrdertestQuery();
                
                OrdershowResult(rs);
                
            }
        });
        
        paymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Payment Button Clicked");
                cakeryDBHandler db = new cakeryDBHandler();
                db.connectDatabase();
                ResultSet rs = db.PaymenttestQuery();
                
                PaymentshowResult(rs);
                
            }
        });
        pickupsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pickups Button Clicked");
                cakeryDBHandler db = new cakeryDBHandler();
                db.connectDatabase();
                ResultSet rs = db.PickuptestQuery();
                
                PickupshowResult(rs);
                
            }
        });
        
        
        
        
    }
    
    public void showResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("fullname");
                String uname = resultSet.getString("username");
                String email = resultSet.getString("email");
                String address =resultSet.getString("address");
                String cellno = resultSet.getString("cellno");
                
                //showTextField.append("Customer ID\tName\tEmail\tAddress\tCell No\n");
                showTextField.append(+id+"\t"+name+"\t"+uname+"\t"+email+"\t"+address+"\t"+cellno+"\n");
             //   System.out.println(id + " " + name + " " + dept_name+" "+total_cred);
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
    
    public void EmployeeshowResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("emp_id");
                String name = resultSet.getString("emp_name");
                String uname = resultSet.getString("emp_uname");
                String cellno = resultSet.getString("emp_cellno");
                String position =resultSet.getString("position");
                String salary = resultSet.getString("salary");
                String joindate =resultSet.getString("join_date");
                String leftdate =resultSet.getString("left_date");
                
                //showTextField.append("Customer ID\tName\tEmail\tAddress\tCell No\n");
                showTextField.append(+id+"\t"+name+"\t"+uname+"\t"+cellno+"\t"+position+"\t"+salary+"\t"+joindate+"\t"+leftdate+"\n");
             //   System.out.println(id + " " + name + " " + dept_name+" "+total_cred);
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
    
    public void ItemshowResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("item_id");
                String name = resultSet.getString("item_name");
                Double price = resultSet.getDouble("item_price");
                String type = resultSet.getString("item_type");
               
                
                
                showTextField.append(+id+"\t"+name+"\t\t"+price+"\t"+type+"\n");
             //   System.out.println(id + " " + name + " " + dept_name+" "+total_cred);
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
    
     public void OrdershowResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("order_id");
                int c_id = resultSet.getInt("customer_id");
                int i_id = resultSet.getInt("item_id");
                Date date = resultSet.getDate("date");
               String quantity = resultSet.getString("quantity");
                String type = resultSet.getString("order_type");
                
                showTextField.append(+id+"\t"+c_id+"\t\t"+i_id+"\t"+date+"\t"+quantity+"\t"+type+"\n");
             //   System.out.println(id + " " + name + " " + dept_name+" "+total_cred);
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
     
     
     public void PaymentshowResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("pay_id");
                int c_id = resultSet.getInt("customer_id");
                int d_id = resultSet.getInt("del_id");
                int p_id = resultSet.getInt("pickup_id");
                 double amount = resultSet.getDouble("paid_amount");
                 double charge = resultSet.getDouble("del_charge");
               
                
                
                showTextField.append(+id+"\t"+c_id+"\t\t"+d_id+"\t"+p_id+"\t"+amount+"\t"+charge+"\n");
             //   System.out.println(id + " " + name + " " + dept_name+" "+total_cred);
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
     
     
     public void PickupshowResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("pickup_id");
                Date date = resultSet.getDate("date");
                
               
                
                
                showTextField.append(+id+"\t"+date+"\n");
             //   System.out.println(id + " " + name + " " + dept_name+" "+total_cred);
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
    
    
}
