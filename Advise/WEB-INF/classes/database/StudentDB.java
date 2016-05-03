/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import beans.Login;
import beans.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sourabh
 */
public class StudentDB {
    
   
    public void addStudent(beans.Student s) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/weadvise", "root", "thesstar");   
        String query= "insert into student values(default,?,?,?,?,?,?)";
        PreparedStatement ps= con.prepareStatement(query);
        ps.setString(1,s.getFirstName());
        ps.setString(2,s.getLastName());
        ps.setString(3,s.getPhoneNumber());
        ps.setString(4,s.getAddress());
        ps.setString(5,s.geteMail());
        ps.setString(6,s.getUniverSity());
        ps.executeUpdate(); 
    }
    public void addLogin(beans.Login l) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/weadvise", "root", "thesstar");   
        String query= "insert into login values(default,?,?)";
        PreparedStatement ps= con.prepareStatement(query);
        ps.setString(1,l.getUserName());
        ps.setString(2,l.getPassword());
        ps.executeUpdate();
    }
    
   
    public String getLogin(String user, String pass) throws ClassNotFoundException, SQLException
    {
           String Login = user;
           String Password = pass;
           String l = "null";
           Class.forName("com.mysql.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/weadvise", "root", "thesstar");
           String query= "select username from login where username='"+Login+"' and password='"+Password+"';";
           System.out.println("Query="+query);
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery(query);
            if(rs.next())
            {
                System.out.println("we are in if statement");
                 l = rs.getString("UserName");
            }
            else
            {
                System.out.println("Empty");
            }
            rs.close();
            return l;
    }
    public void addUser(beans.Student s) throws ClassNotFoundException, SQLException
    {
        System.out.println("We are in add USer");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/weadvise", "root", "thesstar");   
        String query= "insert into user values(default,?,?,?,?,?)";
        PreparedStatement ps= con.prepareStatement(query);
        ps.setString(1,s.getFirstName());
        ps.setString(2,s.getLastName());
        ps.setString(3,s.getPhoneNumber());
        ps.setString(4,s.getAddress());
        ps.setString(5,s.geteMail());
        ps.executeUpdate(); 
    }
     public void addEmployer(beans.Employer e) throws ClassNotFoundException, SQLException
    {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/weadvise", "root", "thesstar");   
        String query= "insert into employer values(default,?,?,?,?,?)";
        PreparedStatement ps= con.prepareStatement(query);
        ps.setString(1,e.getCompanyName());
        ps.setString(2,e.getEmployerName());
        ps.setString(3,e.getPhonenumber());
        ps.setString(4,e.getCompanyAddress());
        ps.setString(5,e.getEmail());
        ps.executeUpdate(); 
    }
    
}
