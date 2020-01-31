
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;




public class CustomerHome {
    JFrame homeFrame;
    JPanel homePanel,receiptPanel;
    JTextArea receipTextArea;
    JScrollPane receiptScrollPane;
    JLabel all_food_items;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JLabel customerInfoLabel,receiptLabel;
    
    
    JLabel logoLabel,redLabel,blueLabel,vanillaLabel,chocolateLabel,nutellaLabel,
            peanutLabel,blackLabel,cinamonLabel,puffLabel,strawberryLabel;
    
    JButton totalButton,receiptButton,resetButton,exitButton;
    JButton submitButton,showButton;
    
    JCheckBox redCBox,blueCBox,vanillaCBox,chocolateCBox,nutellaCBox,
            peanutCBox,blackCBox,cinamonCBox,puffCBox,strawberryCBox;
    
    JTextField q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
    JButton itemButton;
    JRadioButton deliveryButton,pickupButton;
    ButtonGroup bg;
    JButton paymentButton;
    
    JLabel taxLabel,subTotalLabel,totalLabel, taxTextLabel,subTotalTextLabel,totalTextLabel,serviceChrgLabel,serviceChrgTextLabel;
    JLabel profileNameLabel;
    //JButton profileNameLabel;
    JLabel profilepicLabel;
    JButton plusButton1,plusButton2,plusButton3,plusButton4,plusButton5,plusButton6,
            plusButton7,plusButton8,plusButton9,plusButton10;
    
    
   //receipt er kaj er jonne variable declare
    double [] cake=new double[10];
    double []cost=new double[3];
    
    double []i= new double[10];
    
    double serviceCharge=30.0;
    String []orderType=new String[2];
    int click1=0,click2=0,click3=0,click4=0,click5=0,click6=0,click7=0,click8=0,click9=0,click10=0;
    
    
    public CustomerHome(String s){
        
        homeFrame= new JFrame("Cakery Home");
        homePanel=new JPanel();
        receiptPanel=new JPanel();
        receipTextArea=new JTextArea();receiptScrollPane=new JScrollPane(receipTextArea);
        receiptLabel=new JLabel();
        
        itemButton=new JButton();
        deliveryButton=new JRadioButton("Delivery");
        pickupButton=new JRadioButton("Pickup");
        bg=new ButtonGroup();
        
        customerInfoLabel=new JLabel();
        
        /*
        paymentButton=new JButton("Payment");
        paymentButton.setBounds(820, 520, 100, 30);
        paymentButton.setBackground(Color.red);
        paymentButton.setIcon(new ImageIcon
                ("Cake images\\menu.png"));
        homePanel.add(paymentButton); */
        
       
        
        all_food_items=new JLabel();
        l1=new JLabel();l2=new JLabel();l3=new JLabel();l4=new JLabel();l5=new JLabel();l6=new JLabel();
        l7=new JLabel();l8=new JLabel();l9=new JLabel();l10=new JLabel();
        
        q1=new JTextField("0");q2=new JTextField("0");q3=new JTextField("0");q4=new JTextField("0");q5=new JTextField("0");
        q6=new JTextField("0");q7=new JTextField("0");q8=new JTextField("0");q9=new JTextField("0");q10=new JTextField("0");
        
        logoLabel=new JLabel();
        profilepicLabel=new JLabel();
        
        redLabel=new JLabel();          redCBox=new JCheckBox();
        blueLabel=new JLabel();         blueCBox=new JCheckBox();
        vanillaLabel=new JLabel();      vanillaCBox=new JCheckBox();
        chocolateLabel=new JLabel();    chocolateCBox=new JCheckBox();
        nutellaLabel=new JLabel();      nutellaCBox=new JCheckBox();
        peanutLabel=new JLabel();       peanutCBox=new JCheckBox();
        blackLabel=new JLabel();        blackCBox=new JCheckBox();
        cinamonLabel=new JLabel();      cinamonCBox=new JCheckBox();
        puffLabel=new JLabel();         puffCBox=new JCheckBox();
        strawberryLabel=new JLabel();   strawberryCBox=new JCheckBox();
        
        
        taxLabel=new JLabel("Tax: "); taxTextLabel=new JLabel("0");
        subTotalLabel=new JLabel("Sub Total: "); subTotalTextLabel=new JLabel("0");
        totalLabel=new JLabel("Total: "); totalTextLabel=new JLabel("0");
        serviceChrgLabel=new JLabel("Service Charge: "); serviceChrgTextLabel=new JLabel("0");
        
        totalButton=new JButton();
        receiptButton=new JButton();
        resetButton=new JButton();
        exitButton=new JButton();
        
        submitButton=new JButton();
        showButton=new JButton();
        
        Font ff= new Font("Calibri", Font.PLAIN, 16);
        Font f= new Font("Calibri", Font.BOLD, 12);
        Font f1=new Font("Calibri",Font.BOLD,25);
        Font cf=new Font("Courier New",Font.PLAIN,10);
        
        
        profileNameLabel=new JLabel("h");
        profileNameLabel.setBounds(1200,60, 150, 50);
        profileNameLabel.setBackground(Color.orange);
        profileNameLabel.setLayout(null);
        this.profileNameLabel.setText(s);
        
        
        
        Border border = BorderFactory.createLineBorder(Color.black);
        
        receiptScrollPane.setBounds(1000,200,300,450);
        receipTextArea.setBounds(1000,200,300,450);
        receipTextArea.setFont(cf);
        receipTextArea.setBackground(Color.white);
        receipTextArea.setBorder(BorderFactory.createCompoundBorder(border, 
            BorderFactory.createEmptyBorder(50, 50, 50, 50)));
       
        
        homeFrame.setBounds(0,0,1400,850);
        homePanel.setBackground(Color.WHITE);
        homeFrame.setResizable(false);
        homePanel.setLayout(null);
        
        
        
        profilepicLabel.setIcon(new ImageIcon
                ("Cake images\\profile.png"));
       // profilepicLabel.setBackground(Color.BLACK);
        profilepicLabel.setBounds(1250,15, 40, 40);
        profilepicLabel.setLayout(null);
        
        
        receiptLabel.setBounds(1050, 128, 300, 35);
        receiptLabel.setText("Order Receipt");
        receiptLabel.setFont(f1);
        
        
        deliveryButton.setBounds(570,100,120,50);
        pickupButton.setBounds(570,150,120,50);
        
        itemButton.setBackground(Color.white);
        itemButton.setIcon(new ImageIcon
                ("Cake images\\menu.png"));
        itemButton.setBounds(250,25,120,100);
        
        
        logoLabel.setIcon(new ImageIcon
                ("Cake images\\logo.png"));
        logoLabel.setBounds(28,21,252,85);
        logoLabel.setLayout(null);
        
        all_food_items.setFont(ff);
        all_food_items.setBounds(28,128,252,21);
        all_food_items.setText("All food items");
        
        l1.setFont(f);
        l1.setBounds(28,176,28,21);
        l1.setText("1.");
        
        l2.setFont(f);
        l2.setBounds(28,284,28,21);
        l2.setText("2.");
        
        l3.setFont(f);
        l3.setBounds(28,390,28,21);
        l3.setText("3.");
        
        l4.setFont(f);
        l4.setBounds(28,496,28,21);
        l4.setText("4.");
        
        l5.setFont(f);
        l5.setBounds(28,603,28,21);
        l5.setText("5.");
        
        l6.setFont(f);
        l6.setBounds(288,176,28,21);
        l6.setText("6.");
        
        l7.setFont(f);
        l7.setBounds(288,284,28,21);
        l7.setText("7.");
        
        l8.setFont(f);
        l8.setBounds(288,390,28,21);
        l8.setText("8.");
        
        l9.setFont(f);
        l9.setBounds(288,496,28,21);
        l9.setText("9.");
        
        l10.setFont(f);
        l10.setBounds(288,603,28,21);
        l10.setText("10.");
        
        
        redCBox.setBounds(45,260,170,21);
        redCBox.setText("Red Velvet Cupcake: 250Tk");
        //redCBox.setBackground(Color.white);
        redCBox.setBackground(Color.WHITE);
        redCBox.setFont(f);
        //redCBox.setForeground(Color.white);
        
        blueCBox.setBounds(45,370,170,21);
        blueCBox.setText("Blueberry Cheesecake: 350Tk");
        //blueCBox.setBackground(Color.white);
        blueCBox.setBackground(Color.WHITE);
        blueCBox.setFont(f);
        //blueCBox.setForeground(Color.white);
        
        vanillaCBox.setBounds(45,480,170,21);
        vanillaCBox.setText("Vanilla Tart: 300Tk");
        //vanillaCBox.setBackground(Color.white);
        vanillaCBox.setBackground(Color.WHITE);
        vanillaCBox.setFont(f);
        //vanillaCBox.setForeground(Color.white);
        
        chocolateCBox.setBounds(45,590,170,21);
        chocolateCBox.setText("Chocolate Mousse: 150Tk");
        //chocolateCBox.setBackground(Color.white);
        chocolateCBox.setBackground(Color.WHITE);
        chocolateCBox.setFont(f);
        
        nutellaCBox.setBounds(45,700,170,21);
        nutellaCBox.setText("Nutella Brownie: 50Tk");
        //nutellaCBox.setBackground(Color.white);
        nutellaCBox.setBackground(Color.WHITE);
        nutellaCBox.setFont(f);
  
        
        peanutCBox.setBounds(305,260,170,21);
        peanutCBox.setText("Peanut Bars: 95Tk");
        //peanutCBox.setBackground(Color.white);
        peanutCBox.setBackground(Color.WHITE);
        peanutCBox.setFont(f);
        //redCBox.setForeground(Color.white);
        
        blackCBox.setBounds(305,370,170,21);
        blackCBox.setText("Blackforest Cake: 780Tk");
        //blackCBox.setBackground(Color.white);
        blackCBox.setBackground(Color.WHITE);
        blackCBox.setFont(f);
        //blueCBox.setForeground(Color.white);
        
        cinamonCBox.setBounds(305,480,170,21);
        cinamonCBox.setText("Cinamon Rolls: 100Tk");
        //cinamonCBox.setBackground(Color.white);
        cinamonCBox.setBackground(Color.WHITE);
        cinamonCBox.setFont(f);
        //vanillaCBox.setForeground(Color.white);
        
        puffCBox.setBounds(305,590,170,21);
        puffCBox.setText("Puff Pastry: 65Tk");
        //puffCBox.setBackground(Color.white);
        puffCBox.setBackground(Color.WHITE);
        puffCBox.setFont(f);
        
        strawberryCBox.setBounds(305,700,170,21);
        strawberryCBox.setText("Strawberry Shortcake: 450Tk");
        //strawberryCBox.setBackground(Color.white);
        strawberryCBox.setBackground(Color.WHITE);
        strawberryCBox.setFont(f);
        
        
        redLabel.setIcon(new ImageIcon
                ("Cake images\\red_velvet.jpg"));
        redLabel.setBounds(80,176,150,100);
        redLabel.setLayout(null);
        
        blueLabel.setIcon(new ImageIcon
                ("Cake images\\blueberry_cheesecake.jpg"));
        blueLabel.setBounds(80,284,150,100);
        blueLabel.setLayout(null);
        
        vanillaLabel.setIcon(new ImageIcon
                ("Cake images\\vanilla_tart.jpg"));
        vanillaLabel.setBounds(80,390,150,100);
        vanillaLabel.setLayout(null);
        
        chocolateLabel.setIcon(new ImageIcon
                ("Cake images\\chocolate_mousse.jpg"));
        chocolateLabel.setBounds(80,496,150,100);
        chocolateLabel.setLayout(null);
        
        nutellaLabel.setIcon(new ImageIcon
                ("Cake images\\nutella_brownie.jpg"));
        nutellaLabel.setBounds(80,603,150,100);
        nutellaLabel.setLayout(null);
        
        
        peanutLabel.setIcon(new ImageIcon
                ("Cake images\\peanut_butter_bar.jpg"));
        peanutLabel.setBounds(340,176,150,100);
        peanutLabel.setLayout(null);
        
        blackLabel.setIcon(new ImageIcon
                ("Cake images\\black_forest_cake.jpg"));
        blackLabel.setBounds(340,284,150,100);
        blackLabel.setLayout(null);
        
        cinamonLabel.setIcon(new ImageIcon
                ("Cake images\\cinamon_roll.jpg"));
        cinamonLabel.setBounds(340,390,150,100);
        cinamonLabel.setLayout(null);
        
        puffLabel.setIcon(new ImageIcon
                ("Cake images\\puff_pastry.jpg"));
        puffLabel.setBounds(340,496,150,100);
        puffLabel.setLayout(null);
        
        strawberryLabel.setIcon(new ImageIcon
                ("Cake images\\strawberry_shortcake.jpeg"));
        strawberryLabel.setBounds(340,603,150,100);
        strawberryLabel.setLayout(null);
        
        
        plusButton1=new JButton();
        plusButton1.setBounds(235,220,20,20);
        plusButton1.setIcon(new ImageIcon
                ("Cake images\\plus.png"));
        homePanel.add(plusButton1);
        
        plusButton2=new JButton();
        plusButton2.setBounds(235,330,20,20);
        plusButton2.setIcon(new ImageIcon
                ("Cake images\\plus.png"));
        homePanel.add(plusButton2);
        
        plusButton3=new JButton();
        plusButton3.setBounds(235,440,20,20);
        plusButton3.setIcon(new ImageIcon
                ("Cake images\\plus.png"));
        homePanel.add(plusButton3);
        
        plusButton4=new JButton();
        plusButton4.setBounds(235,550,20,20);
        plusButton4.setIcon(new ImageIcon
                ("Cake images\\plus.png"));
        homePanel.add(plusButton4);
        
        plusButton5=new JButton();
        plusButton5.setBounds(235,660,20,20);
        plusButton5.setIcon(new ImageIcon
                ("Cake images\\plus.png"));
        homePanel.add(plusButton5);
        
        
        plusButton6=new JButton();
        plusButton6.setBounds(480,220,20,20);
        plusButton6.setIcon(new ImageIcon
                ("Cake images\\plus.png"));
        homePanel.add(plusButton6);
        
        plusButton7=new JButton();
        plusButton7.setBounds(480,330,20,20);
        plusButton7.setIcon(new ImageIcon
                ("Cake images\\plus.png"));
        homePanel.add(plusButton7);
        
        plusButton8=new JButton();
        plusButton8.setBounds(480,440,20,20);
        plusButton8.setIcon(new ImageIcon
                ("Cake images\\plus.png"));
        homePanel.add(plusButton8);
        
        plusButton9=new JButton();
        plusButton9.setBounds(480,550,20,20);
        plusButton9.setIcon(new ImageIcon
                ("Cake images\\plus.png"));
        homePanel.add(plusButton9);
        
        plusButton10=new JButton();
        plusButton10.setBounds(480,660,20,20);
        plusButton10.setIcon(new ImageIcon
                ("Cake images\\plus.png"));
        homePanel.add(plusButton10);
        
        
        
        
        
        q1.setBounds(235,260,40,20); 
        q2.setBounds(235,370,40,20);
        q3.setBounds(235,480,40,20);
        q4.setBounds(235,590,40,20);
        q5.setBounds(235,700,40,20);
        q6.setBounds(480,260,40,20);
        q7.setBounds(480,370,40,20);
        q8.setBounds(480,480,40,20);
        q9.setBounds(480,590,40,20);
        q10.setBounds(480,700,40,20);
        
        taxLabel.setBounds(670, 400, 100, 30);
        taxLabel.setFont(f);
        subTotalLabel.setBounds(670, 435, 100, 30);
        subTotalLabel.setFont(f);
        serviceChrgLabel.setBounds(670, 470, 100, 30);
        serviceChrgLabel.setFont(f);
        totalLabel.setBounds(670, 505, 100, 30);
        totalLabel.setFont(f);
        
        
        taxTextLabel.setBounds(820, 400, 100, 30);
        taxTextLabel.setFont(ff);
        subTotalTextLabel.setBounds(820, 435, 100, 30);
        subTotalTextLabel.setFont(ff);
        serviceChrgTextLabel.setBounds(820, 470, 100, 30);
        serviceChrgTextLabel.setFont(ff);
        totalTextLabel.setBounds(820, 505, 100, 30);
        totalTextLabel.setFont(ff);
        
    
        /*
        totalButton.setBounds(750,670,100,30);
        totalButton.setBackground(Color.BLACK);
        totalButton.setForeground(Color.WHITE);
        totalButton.setFont(ff);
        totalButton.setText("Total"); */
        
        receiptButton.setBounds(900,670,100,30);
        receiptButton.setBackground(Color.BLACK);
        receiptButton.setFont(ff);
        receiptButton.setText("Receipt");
        receiptButton.setForeground(Color.WHITE);
        
        resetButton.setBounds(1050,670,100,30);
        resetButton.setBackground(Color.BLACK);
        resetButton.setFont(ff);
        resetButton.setText("Reset");
        resetButton.setForeground(Color.WHITE);
        
        exitButton.setBounds(1200,670,100,30);
        exitButton.setBackground(Color.BLACK);
        exitButton.setFont(ff);
        exitButton.setText("Exit");
        exitButton.setForeground(Color.WHITE);
        
        /*
        submitButton.setBounds(630,450,100,30);
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);
        submitButton.setFont(ff);
        submitButton.setText("Submit");
        
        showButton.setBounds(750,450,100,30);
        showButton.setBackground(Color.BLACK);
        showButton.setFont(ff);
        showButton.setText("Show");
        showButton.setForeground(Color.WHITE);   */
        
        bg.add(deliveryButton);
        bg.add(pickupButton);
        homePanel.add(deliveryButton);
        homePanel.add(pickupButton);
        
        homePanel.add(l1);homePanel.add(l2);homePanel.add(l3);homePanel.add(l4);homePanel.add(l5);
        homePanel.add(l6);homePanel.add(l7);homePanel.add(l8);homePanel.add(l9);homePanel.add(l10);
        
        homePanel.add(profilepicLabel);
        homePanel.add(logoLabel);
        
        homePanel.add(receiptLabel);
        homePanel.add(customerInfoLabel);
        
        
        homePanel.add(receiptScrollPane);
        
        homePanel.add(redCBox);
        homePanel.add(blueCBox);
        homePanel.add(vanillaCBox);
        homePanel.add(chocolateCBox);
        homePanel.add(nutellaCBox);
        homePanel.add(peanutCBox);
        homePanel.add(blackCBox);
        homePanel.add(cinamonCBox);
        homePanel.add(puffCBox);
        homePanel.add(strawberryCBox);
        
        homePanel.add(q1);homePanel.add(q2);homePanel.add(q3);homePanel.add(q4);homePanel.add(q5);
        homePanel.add(q6);homePanel.add(q7);homePanel.add(q8);homePanel.add(q9);homePanel.add(q10);
        
        homePanel.add(profileNameLabel);
        //homePanel.add(itemButton);
        
        homePanel.add(redLabel);
        homePanel.add(blueLabel);
        homePanel.add(vanillaLabel);
        homePanel.add(chocolateLabel);
        homePanel.add(nutellaLabel);
        
        homePanel.add(peanutLabel);
        homePanel.add(blackLabel);
        homePanel.add(cinamonLabel);
        homePanel.add(puffLabel);
        homePanel.add(strawberryLabel);
        
        homePanel.add(taxLabel);homePanel.add(taxTextLabel);
        homePanel.add(subTotalLabel);homePanel.add(subTotalTextLabel);
        homePanel.add(totalLabel);homePanel.add(totalTextLabel);
        homePanel.add(serviceChrgLabel);homePanel.add(serviceChrgTextLabel);
        
        //homePanel.add(totalButton);
        homePanel.add(receiptButton);
        homePanel.add(resetButton);
        homePanel.add(exitButton);
        
         homePanel.add(submitButton);
        homePanel.add(showButton);
        
        homePanel.add(all_food_items);
        
        homeFrame.add(homePanel);
        homeFrame.setVisible(true);
        homeFrame.setLocationRelativeTo(null);
        initComponents();
        
    }
    
    
    private void initComponents(){
     
        plusButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Plus Button clicked");
                click1++;
                String i=Integer.toString(click1); //
                q1.setText(i);
                
                
            }
        }); 
        
        plusButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Plus Button clicked");
                click2++;
                String i=Integer.toString(click2);
                q2.setText(i);
                
                
            }
        }); 
        
        plusButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Plus Button clicked");
                click3++;
                String i=Integer.toString(click3);
                q3.setText(i);
                
                
            }
        }); 
        
        plusButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Plus Button clicked");
                click4++;
                String i=Integer.toString(click4);
                q4.setText(i);
                
                
            }
        }); 
        
        plusButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Plus Button clicked");
                click5++;
                String i=Integer.toString(click5);
                q5.setText(i);
                
                
            }
        }); 
        
        plusButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Plus Button clicked");
                click6++;
                String i=Integer.toString(click6);
                q6.setText(i);
                
                
            }
        }); 
        
        plusButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Plus Button clicked");
                click7++;
                String i=Integer.toString(click7);
                q7.setText(i);
                
                
            }
        }); 
        
        plusButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Plus Button clicked");
                click8++;
                String i=Integer.toString(click8);
                q8.setText(i);
                
                
            }
        }); 
        
        plusButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Plus Button clicked");
                click9++;
                String i=Integer.toString(click9);
                q9.setText(i);
                
                
            }
        }); 
        
        plusButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Plus Button clicked");
                click10++;
                String i=Integer.toString(click10);
                q10.setText(i);
                
                
            }
        }); 
        
        
        
        
        
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Reset Button clicked");
               redCBox.setSelected(false);
               blueCBox.setSelected(false);
               vanillaCBox.setSelected(false);
               chocolateCBox.setSelected(false);
               nutellaCBox.setSelected(false);
               peanutCBox.setSelected(false);
               blackCBox.setSelected(false);
               cinamonCBox.setSelected(false);
               puffCBox.setSelected(false);
               strawberryCBox.setSelected(false);
                       
               q1.setText("0");
               q2.setText("0");
               q3.setText("0");
               q4.setText("0");
               q5.setText("0");
               q6.setText("0");
               q7.setText("0");
               q8.setText("0");
               q9.setText("0");
               q10.setText("0");
               
               deliveryButton.setSelected(false);
               pickupButton.setSelected(false);
               
               taxTextLabel.setText("0");
               subTotalTextLabel.setText("0");
               totalTextLabel.setText("0");
               serviceChrgTextLabel.setText("0");
               receipTextArea.setText(null);
               
            }
        });
        
        
        
        redCBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Red velvet cupcake selected");
                
                double cRed=Double.parseDouble(subTotalTextLabel.getText());
                double red=Double.parseDouble(q1.getText());
                double iRed=250.0;
                
                
                if(redCBox.isSelected()){
                    i[0]=(red* iRed)+cRed;
                    String price=String.format("%.2f", i[0]); //double type theke string a convert
                    subTotalTextLabel.setText(price);
                    
                    double tx=(i[0]*5)/100;
                    String tax=String.format("%.2f", tx);
                    taxTextLabel.setText(tax);
            
                    String s_chrg=String.format("%.2f", serviceCharge);
                    
                    
                    if(deliveryButton.isSelected()){
                        serviceChrgTextLabel.setText(s_chrg);
                    String total=String.format("%.2f", (i[0]+ tx +serviceCharge));
                    totalTextLabel.setText(total);
                    }else{
                        serviceChrgTextLabel.setText("0");
                        String total=String.format("%.2f", (i[0]+ tx));
                        totalTextLabel.setText(total);
                    }
                    
                    
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }

        }); 
        
        
        blueCBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Blueberry cheesecake selected");
                double cBlue=Double.parseDouble(subTotalTextLabel.getText());
                double blue=Double.parseDouble(q2.getText());
                double iBlue=350.0;
                
                if(blueCBox.isSelected()){
                    i[1]=(blue* iBlue)+cBlue;
                    String price=String.format("%.2f", i[1]);
                    subTotalTextLabel.setText(price);
                    
                    double tx=(i[1]*5)/100;
                    String tax=String.format("%.2f", tx);
                    taxTextLabel.setText(tax);
                    
                    String s_chrg=String.format("%.2f", serviceCharge);
                    
                    if(deliveryButton.isSelected()){
                    serviceChrgTextLabel.setText(s_chrg);
                    String total=String.format("%.2f", (i[1] +tx+serviceCharge));
                    totalTextLabel.setText(total);
                    }else{
                        serviceChrgTextLabel.setText("0");
                    String total=String.format("%.2f", (i[1] +tx));
                    totalTextLabel.setText(total);
                    }
                    
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }

        });
        
        
        vanillaCBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Vanilla tart selected");
                double cVanilla=Double.parseDouble(subTotalTextLabel.getText());
                double vanilla=Double.parseDouble(q3.getText());
                double iVanilla=300.0;
                
                if(vanillaCBox.isSelected()){
                    i[2]=(vanilla* iVanilla)+cVanilla;
                    String price=String.format("%.2f", i[2]);
                    subTotalTextLabel.setText(price);
                    
                    double tx=(i[2]*5)/100;
                    String tax=String.format("%.2f", tx);
                    taxTextLabel.setText(tax);
                    
                    String s_chrg=String.format("%.2f", serviceCharge);
                    
                    if(deliveryButton.isSelected()){
                    serviceChrgTextLabel.setText(s_chrg);
                    String total=String.format("%.2f", (i[2] +tx+serviceCharge));
                    totalTextLabel.setText(total);
                    }else{
                        serviceChrgTextLabel.setText("0");
                    String total=String.format("%.2f", (i[2] +tx));
                    totalTextLabel.setText(total);
                    }
                    
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }

        });
        
        chocolateCBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Chocolate mousse selected");
                double cChocolate=Double.parseDouble(subTotalTextLabel.getText());
                double chocolate=Double.parseDouble(q4.getText());
                double iChocolate=150.0;
                
                if(chocolateCBox.isSelected()){
                    i[3]=(chocolate* iChocolate)+cChocolate;
                    String price=String.format("%.2f", i[3]);
                    subTotalTextLabel.setText(price);
                    
                    double tx=(i[3]*5)/100;
                    String tax=String.format("%.2f", tx);
                    taxTextLabel.setText(tax);
                    
                    String s_chrg=String.format("%.2f", serviceCharge);
                    
                    if(deliveryButton.isSelected()){
                    serviceChrgTextLabel.setText(s_chrg);
                    String total=String.format("%.2f", (i[3]+tx +serviceCharge));
                    totalTextLabel.setText(total);
                    }else{
                        serviceChrgTextLabel.setText("0");
                    String total=String.format("%.2f", (i[3]+tx ));
                    totalTextLabel.setText(total);
                    }
                    
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }

        });
        
        nutellaCBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Nutella Brownie selected");
                double cNutella=Double.parseDouble(subTotalTextLabel.getText());
                double nutella=Double.parseDouble(q5.getText());
                double iNutella=50.0;
                
                if(nutellaCBox.isSelected()){
                    i[4]=(nutella* iNutella)+cNutella;
                    String price=String.format("%.2f", i[4]);
                    subTotalTextLabel.setText(price);
                    
                    double tx=(i[4]*5)/100;
                    String tax=String.format("%.2f", tx);
                    taxTextLabel.setText(tax);
                    
                    String s_chrg=String.format("%.2f", serviceCharge);
                    
                    if(deliveryButton.isSelected()){
                    serviceChrgTextLabel.setText(s_chrg);
                    String total=String.format("%.2f", (i[4] +tx+serviceCharge));
                    totalTextLabel.setText(total);
                    }else{
                        serviceChrgTextLabel.setText("0");
                    String total=String.format("%.2f", (i[4] +tx));
                    totalTextLabel.setText(total);
                    }
                    
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }

        });
        
        peanutCBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Peanut bar selected");
                double cPeanut=Double.parseDouble(subTotalTextLabel.getText());
                double peanut=Double.parseDouble(q6.getText());
                double iPeanut=95.0;
                
                if(peanutCBox.isSelected()){
                    i[5]=(peanut* iPeanut)+cPeanut;
                    String price=String.format("%.2f", i[5]);
                    subTotalTextLabel.setText(price);
                    
                    double tx=(i[5]*5)/100;
                    String tax=String.format("%.2f", tx);
                    taxTextLabel.setText(tax);
                    
                    String s_chrg=String.format("%.2f", serviceCharge);
                    
                    if(deliveryButton.isSelected()){
                    serviceChrgTextLabel.setText(s_chrg);
                    String total=String.format("%.2f", (i[5]+tx +serviceCharge));
                    totalTextLabel.setText(total);
                    }else{
                        serviceChrgTextLabel.setText("0");
                    String total=String.format("%.2f", (i[5]+tx ));
                    totalTextLabel.setText(total);
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }

        });
        
        blackCBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("BlackForest cake selected");
                double cBlack=Double.parseDouble(subTotalTextLabel.getText());
                double black=Double.parseDouble(q7.getText());
                double iBlack=780.0;
                
                if(blackCBox.isSelected()){
                    i[6]=(black* iBlack)+cBlack;
                    String price=String.format("%.2f", i[6]);
                    subTotalTextLabel.setText(price);
                    
                    double tx=(i[6]*5)/100;
                    String tax=String.format("%.2f", tx);
                    taxTextLabel.setText(tax);
                    
                    String s_chrg=String.format("%.2f", serviceCharge);
                    
                    if(deliveryButton.isSelected()){
                    serviceChrgTextLabel.setText(s_chrg);
                    String total=String.format("%.2f", (i[6]+tx +serviceCharge));
                    totalTextLabel.setText(total);
                    }else{
                       serviceChrgTextLabel.setText("0");
                    String total=String.format("%.2f", (i[6]+tx));
                    totalTextLabel.setText(total); 
                    }
                    
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }

        });
        
        cinamonCBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Cinamon Roll selected");
                double cCinamon=Double.parseDouble(subTotalTextLabel.getText());
                double cinamon=Double.parseDouble(q8.getText());
                double iCinamon=100.0;
                
                if(cinamonCBox.isSelected()){
                    i[7]=(cinamon* iCinamon)+cCinamon;
                    String price=String.format("%.2f", i[7]);
                    subTotalTextLabel.setText(price);
                    
                    double tx=(i[7]*5)/100;
                    String tax=String.format("%.2f", tx);
                    taxTextLabel.setText(tax);
                    
                    String s_chrg=String.format("%.2f", serviceCharge);
                    
                    if(deliveryButton.isSelected()){
                    serviceChrgTextLabel.setText(s_chrg);
                    String total=String.format("%.2f", (i[7]+tx +serviceCharge));
                    totalTextLabel.setText(total);
                    }else{
                        serviceChrgTextLabel.setText("0");
                    String total=String.format("%.2f", (i[7]+tx));
                    totalTextLabel.setText(total);
                    }
                    
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }

        });
        
        
        puffCBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Puff Pastry selected");
                double cPuff=Double.parseDouble(subTotalTextLabel.getText());
                double puff=Double.parseDouble(q9.getText());
                double iPuff=65.0;
                
                if(puffCBox.isSelected()){
                    i[8]=(puff* iPuff)+cPuff;
                    String price=String.format("%.2f", i[8]);
                    subTotalTextLabel.setText(price);
                    
                    double tx=(i[8]*5)/100;
                    String tax=String.format("%.2f", tx);
                    taxTextLabel.setText(tax);
                    
                    String s_chrg=String.format("%.2f", serviceCharge);
                    
                    if(deliveryButton.isSelected()){
                    serviceChrgTextLabel.setText(s_chrg);
                    String total=String.format("%.2f", (i[8]+tx +serviceCharge));
                    totalTextLabel.setText(total);
                    }else{
                        serviceChrgTextLabel.setText("0");
                    String total=String.format("%.2f", (i[8]+tx ));
                    totalTextLabel.setText(total);
                    }
                    
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }

        });
        
        
        strawberryCBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Strawberry Cheesecake selected");
                double cStrawberry=Double.parseDouble(subTotalTextLabel.getText());
                double strawberry=Double.parseDouble(q10.getText());
                double iStrawberry=450.0;
                
                if(strawberryCBox.isSelected()){
                    i[9]=(strawberry* iStrawberry)+cStrawberry;
                    String price=String.format("%.2f", i[9]);
                    subTotalTextLabel.setText(price);
                    
                    double tx=(i[9]*5)/100;
                    String tax=String.format("%.2f", tx);
                    taxTextLabel.setText(tax);
                    
                    String s_chrg=String.format("%.2f", serviceCharge);
                    
                    if(deliveryButton.isSelected()){
                    serviceChrgTextLabel.setText(s_chrg);
                    String total=String.format("%.2f", (i[9]+tx +serviceCharge));
                    totalTextLabel.setText(total);
                    }else{
                        serviceChrgTextLabel.setText("0");
                    String total=String.format("%.2f", (i[9]+tx));
                    totalTextLabel.setText(total);
                    }
                    
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }

        });
        
        
        receiptButton.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Receipt Button Clicked");
                //System.out.println(deliveryButton.getText());
                cake[0] =Double.parseDouble(q1.getText());
                cake[1] =Double.parseDouble(q2.getText());
                cake[2] =Double.parseDouble(q3.getText());
                cake[3] =Double.parseDouble(q4.getText());
                cake[4] =Double.parseDouble(q5.getText());
                cake[5] =Double.parseDouble(q6.getText());
                cake[6] =Double.parseDouble(q7.getText());
                cake[7] =Double.parseDouble(q8.getText());
                cake[8] =Double.parseDouble(q9.getText());
                cake[9] =Double.parseDouble(q10.getText());
                
                cost[0] =Double.parseDouble(taxTextLabel.getText());
                cost[1] =Double.parseDouble(subTotalTextLabel.getText());
                cost[2] =Double.parseDouble(totalTextLabel.getText());
                
                
                orderType[0]=deliveryButton.getText();
                orderType[1]=pickupButton.getText();
                //for a random reference
              //ashiq   new cakeryDBHandler().insertData_payment(, cost[2],001);
                int refs= 1325+ (int)(Math.random()*4238);
                
                
                //for showing exact date and time of placing order
                Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                tTime.format(timer.getTime());
                SimpleDateFormat TDate=new SimpleDateFormat("dd-MM-yyyy");
                TDate.format(timer.getTime());
                
                
             if(deliveryButton.isSelected()){
                receipTextArea.append("\t\t---The Cakery---\n\n"
                    +"--------------------------------------------------------\n"
                    +"Reference:\t\t\t\t"+refs
                    +"\n--------------------------------------------------------\n"
                    +"Customer Username: "+profileNameLabel.getText()+"\tOrder Type:  "+orderType[0]    
                    +"\n--------------------------------------------------------\n"
                    +"Item Name\t\tPrice(Tk.)\tQty\tAmount(Tk.)"
                    +"\n--------------------------------------------------------\n"
                    +"1. Red Velvet Cupcake\t250.00\t\t"+cake[0]+"\t"+(cake[0] * 250.0)
                    +"\n2. Blueberry Cheesecake\t350.00\t\t"+cake[1]+"\t"+(cake[1] * 350.0)
                    +"\n3. Vanilla Tart\t\t300.00\t\t"+cake[2]+"\t"+(cake[2] * 300.0)
                    +"\n4. Chocolate Mousse\t150.00\t\t"+cake[3]+"\t"+(cake[3] * 150.0)
                    +"\n5. Nutella Brownie\t50.00\t\t"+cake[4]+"\t"+(cake[4] * 50.0)
                    +"\n6. Peanut Bars\t\t95.00\t\t"+cake[5]+"\t"+(cake[5] * 95.0)
                    +"\n7. Blackforest Cake\t780\t\t"+cake[6]+"\t"+(cake[6] * 780.0)
                    +"\n8. Cinamon Rolls\t100.00\t\t"+cake[7]+"\t"+(cake[7] * 100.0)
                    +"\n9. Puff Pastry\t\t65.00\t\t"+cake[8]+"\t"+(cake[8] * 65.0)
                    +"\n10.Strawberry Shortcake 450.00\t\t"+cake[9]+"\t"+(cake[9] * 450.0)
                    +"\n--------------------------------------------------------\n"
                    +"--------------------------------------------------------\n"
                    +"\nTax:\t\t\t\t\t"+cost[0]+"Tk"   
                    +"\nSub Total:\t\t\t\t"+cost[1]+"Tk"
                    +"\nService Charge:\t\t\t\t"+serviceCharge+"Tk"
                    +"\n--------------------------------------------------------\n"
                    +"\nTotal:\t\t\t\t\t"+cost[2]+"Tk"  
                    +"\n--------------------------------------------------------\n"
                    +"\n\t\t\tDate: "+TDate.format(timer.getTime())
                    +"\n\t\t\tTime: "+tTime.format(timer.getTime())
                    +"\n--------------------------------------------------------\n"
                    +"\t\t\t\nThank You :) ");
            }
             
             else if(pickupButton.isSelected()){
                 
                receipTextArea.append("\t\t---The Cakery---\n\n"
                    +"--------------------------------------------------------\n"
                    +"Reference:\t\t\t\t"+refs
                    +"\n--------------------------------------------------------\n"
                    +"Customer Username: "+profileNameLabel.getText()+"\tOrder Type:  "+orderType[1]    
                    +"\n--------------------------------------------------------\n"
                    +"Item Name\t\tPrice(Tk.)\tQty\tAmount(Tk.)"
                    +"\n--------------------------------------------------------\n"
                    +"1. Red Velvet Cupcake\t250.00\t\t"+cake[0]+"\t"+(cake[0] * 250.0)
                    +"\n2. Blueberry Cheesecake\t350.00\t\t"+cake[1]+"\t"+(cake[1] * 350.0)
                    +"\n3. Vanilla Tart\t\t300.00\t\t"+cake[2]+"\t"+(cake[2] * 300.0)
                    +"\n4. Chocolate Mousse\t150.00\t\t"+cake[3]+"\t"+(cake[3] * 150.0)
                    +"\n5. Nutella Brownie\t50.00\t\t"+cake[4]+"\t"+(cake[4] * 50.0)
                    +"\n6. Peanut Bars\t\t95.00\t\t"+cake[5]+"\t"+(cake[5] * 95.0)
                    +"\n7. Blackforest Cake\t780\t\t"+cake[6]+"\t"+(cake[6] * 780.0)
                    +"\n8. Cinamon Rolls\t100.00\t\t"+cake[7]+"\t"+(cake[7] * 100.0)
                    +"\n9. Puff Pastry\t\t65.00\t\t"+cake[8]+"\t"+(cake[8] * 65.0)
                    +"\n10.Strawberry Shortcake 450.00\t\t"+cake[9]+"\t"+(cake[9] * 450.0)
                    +"\n--------------------------------------------------------\n"
                    +"--------------------------------------------------------\n"
                    +"\nTax:\t\t\t\t\t"+cost[0]+"Tk"   
                    +"\nSub Total:\t\t\t\t"+cost[1]+"Tk"
                    +"\nService Charge:\t\t\t\t"+"0 Tk"
                    +"\n--------------------------------------------------------\n"
                    +"\nTotal:\t\t\t\t\t"+cost[2]+"Tk"  
                    +"\n--------------------------------------------------------\n"
                    +"\n\t\t\tDate: "+TDate.format(timer.getTime())
                    +"\n\t\t\tTime: "+tTime.format(timer.getTime())
                    +"\n--------------------------------------------------------\n"
                    +"\t\t\t\nThank You :) ");
            }
             else if(deliveryButton.isSelected()==false && pickupButton.isSelected()==false){
                 JOptionPane.showMessageDialog(null, "Please Select the Order Type!");
             }  
           
           /*
          if( !(profileNameLabel.getText().equals("")) && !(l1.getText().equals(""))&& !(TDate.format(timer.getTime()).equals(""))&& !(q1.getText().equals(""))){
                    cakeryDBHandler db = new cakeryDBHandler();
                    db.connectDatabase();
                    db.insertOrderData(profileNameLabel.getText(),l1.getText(),TDate.format(timer.getTime()),q1.getText());
                    profileNameLabel.setText("");
                    l1.setText("");
                    TDate.format(timer.setTime());
                    addressField.setText("");
                    cellnoField.setText("");
                }
            */
             
             
            }
        });
        
        
        
        
        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit Button Clicked");
                System.exit(0);
            }
        });
        
        
    }
    
    
    
}
