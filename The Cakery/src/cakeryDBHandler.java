import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class cakeryDBHandler {
    Connection connect = null;
    
    public void connectDatabase(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/ccakery","root","");
            System.out.println("Successfully Connected to Mysql");

        }catch(Exception e){
            System.out.println("Not Connected..");
            e.printStackTrace();
        }
    }
    public ResultSet userLoginQuery(String uname, String pass){
            ResultSet resultSet = null;
        try{
           
            String query = "select * from customer where username=? and password=?"; 
            PreparedStatement pStatement = connect.prepareStatement(query); //query statement akare pathano lage
            pStatement.setString(1, uname); 
           pStatement.setString(2, pass);
           resultSet = pStatement.executeQuery(); //statement k finally execute korar jonno result set var a statemnt k store kore rakhsi

            System.out.println("Successfully Done Query..");    
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }        
        return resultSet;
    }
    public ResultSet empLoginQuery(String uname, String pass){
            ResultSet resultSet = null;
        try{
           
            String query = "select * from employee where emp_uname=? and password=?"; 
            PreparedStatement pStatement = connect.prepareStatement(query); //query statement akare pathano lage
            pStatement.setString(1, uname); 
           pStatement.setString(2, pass);
           resultSet = pStatement.executeQuery(); //statement k finally execute korar jonno result set var a statemnt k store kore rakhsi

            System.out.println("Successfully Done Query..");    
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }        
        return resultSet;
    }
    
    
    /*
      public void insertData_payment(double amount) throws SQLException{
        
            String query ="INSERT INTO payment`(customer_id`,`paid_amount') VALUES (?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
          //  pStatement.setInt(1,pay_id);
          //  pStatement.setString(2,method);
            pStatement.setDouble(1,amount);
      
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");
            
            
        }
      */
      
    public ResultSet testQuery(){
            ResultSet resultSet = null;
        try{
            String query = "SELECT * FROM customer";
            Statement statement ;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            
//            String query = "SELECT * FROM student WHERE student_name =? and id_student =?";
//            PreparedStatement pStatement = connect.prepareStatement(query);
//            pStatement.setString(1, "ABC");
//            pStatement.setString(2, "1");
//            resultSet = pStatement.executeQuery();
            
            System.out.println("Successfully Done Query..");
           
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }           
        return resultSet;
    }
    
    public void showResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("customer_id");
                String fname = resultSet.getString("fullname");
                String uname = resultSet.getString("username");
                String email = resultSet.getString("email"); 
                String password = resultSet.getString("password");   
                String address = resultSet.getString("address");
                String cellno = resultSet.getString("cellno");
                System.out.println(id + "\t" + fname + "\t" +uname+"\t"+ email+"\t"+password+"\t"+address+"\t"+cellno);
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
   
    
    
    
    
    

    
    
    public boolean insertData(String fname,String uname,String email,String password,String address,String cellno){
        try{
            String query = "INSERT INTO customer (fullname,username,email,password,address,cellno) values(?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1, fname);
            pStatement.setString(2, uname);
            pStatement.setString(3, email);
            pStatement.setString(4, password);
             pStatement.setString(5, address);
              pStatement.setString(6, cellno);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");
            return true;
            
        }catch(Exception e){
            System.out.println("Error in inserting");
            e.printStackTrace();
            return false;
        }
    }
    
    
    public boolean insertOrderData(String customerid,String itemid,Date date,String quantity,String ordertype){
        try{
            String query = "INSERT INTO orders (customer_id,item_id,date,quantity,order_type) values(?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1, customerid);
            pStatement.setString(2, itemid);
            pStatement.setDate(3, (java.sql.Date) date);
            pStatement.setString(4, quantity);
             pStatement.setString(5, ordertype);
              
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");
            return true;
            
        }catch(Exception e){
            System.out.println("Error in inserting");
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    public void logindata(String uname,String password){
        try{
            String query = "SELECT (uname, password) FROM customer WHERE (uname = ? AND password = ?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1, uname);
            pStatement.setString(2, password);
            
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");
            
            
        }catch(Exception e){
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    public void employeelogindata(String uname,String password){
        try{
            String query = "SELECT (uname, password) FROM employee WHERE (emp_uname = ? AND password = ?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1, uname);
            pStatement.setString(2, password);
            
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");
            
            
        }catch(Exception e){
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    
    
    
    
    public ResultSet EmployeetestQuery(){
            ResultSet resultSet = null;
        try{
            String query = "SELECT * FROM employee";
            Statement statement ;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
       
            System.out.println("Successfully Done Query..");
           
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }           
        return resultSet;
    }
    
    public void EmployeeshowResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("emp_id");
                String name = resultSet.getString("emp_name");
                String uname = resultSet.getString("emp_uname");
                String password = resultSet.getString("password");
                String cellno = resultSet.getString("emp_cellno");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");
                Date joindate = resultSet.getDate("join_date");
                Date leftdate = resultSet.getDate("left_date");
                
                System.out.println(id + "\t" + name + "\t" +uname+"\t"+password+"\t"+cellno+"\t"+position+"\t"+salary+"\t"+joindate+"\t"+leftdate+"\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
    
    
    
     public ResultSet ItemtestQuery(){
            ResultSet resultSet = null;
        try{
            String query = "SELECT * FROM items";
            Statement statement ;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
       
            System.out.println("Successfully Done Query..");
           
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }           
        return resultSet;
    }
    
    public void ItemshowResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("item_id");
                String name = resultSet.getString("item_name");
                Double price = resultSet.getDouble("item_price");
                String type = resultSet.getString("item_type");
                
                
                System.out.println(id + "\t" + name + "\t" +name+"\t"+price+"\t"+type+"\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
    
    
    
    public ResultSet OrdertestQuery(){
            ResultSet resultSet = null;
        try{
            String query = "SELECT * FROM orders";
            Statement statement ;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
       
            System.out.println("Successfully Done Query..");
           
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }           
        return resultSet;
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
                
                
                System.out.println(+id+"\t"+c_id+"\t\t"+i_id+"\t"+date+"\t"+quantity+"\t"+type+"\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
    
    
    public ResultSet PaymenttestQuery(){
            ResultSet resultSet = null;
        try{
            String query = "SELECT * FROM payment";
            Statement statement ;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
       
            System.out.println("Successfully Done Query..");
           
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }           
        return resultSet;
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
                
                
                System.out.println(+id+"\t"+c_id+"\t\t"+d_id+"\t"+p_id+"\t"+amount+"\t"+charge+"\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
    
    public ResultSet PickuptestQuery(){
            ResultSet resultSet = null;
        try{
            String query = "SELECT * FROM pickups";
            Statement statement ;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
       
            System.out.println("Successfully Done Query..");
           
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }           
        return resultSet;
    }
    
    public void PickupshowResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("pickup_id");
                Date date = resultSet.getDate("date");
                
                
                System.out.println(+id+"\t"+date+"\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
   
    
}