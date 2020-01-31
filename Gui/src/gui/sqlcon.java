/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.sql.*;

/**
 *
 * @author Lahiru
 */

public class sqlcon {
    
    public void sql(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums?zeroDateTimeBehavior=convertToNull [root on Default schema]","root","newrootpassword");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name,age,id from student");
            while(rs.next())
            {
                String name= rs.getString("name");
                int age = rs.getInt("age");
                int course = rs.getInt("id");

                System.out.println("Name = "+ name);
                System.out.println("age = " + age );
                System.out.println("id = "+ course);
            }
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}
    
   

