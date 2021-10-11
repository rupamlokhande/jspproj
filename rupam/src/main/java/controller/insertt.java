package controller;


import java.sql.*;

public class insertt {
    public boolean validate(String bcode,String bprice,String bname,String blang,String bdate,String authcode,String authname,String authlname,String pcode,String pfname,String plname,String pcountry){  
    boolean status=false;  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","examly");  
        PreparedStatement ps=con.prepareStatement("insert into books(bcode,bprice,bname,blang,bdate,authcode,authname,authlname,pcode,pfname,plname,pcountry) values(?,?,?,?,?,?,?,?,?,?,?,?)");  
        ps.setString(1,bcode);
        ps.setString(2,bprice);
        ps.setString(3,bname);
        ps.setString(4,blang);
        ps.setString(5,bdate);
        ps.setString(6,authcode);
        ps.setString(7,authname);
        ps.setString(8,authlname);
        ps.setString(9,pcode);
        ps.setString(10,pfname);
        ps.setString(11,plname);
        ps.setString(12,pcountry);



        ps.executeUpdate(); 
        status=true; 
        
        
    }
    catch(Exception e){
        System.out.println(e);
    }  
    return status;  
    }   
}

