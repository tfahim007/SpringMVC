package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Tahmidul Islam
 */
public class TestJdbc {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false && serverTimeZone=UTC";
        String user = "bs1226";
        String pass = "bs1226";

        try{
            System.out.println("Connecting to Database");
            Connection myConn =
                    DriverManager.getConnection(jdbcURL,user,pass);
            System.out.println("COnnection Successful");
        }catch(Exception ex){

        }

    }
}
