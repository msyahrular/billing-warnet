
import java.sql.*;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Msyahrul Ar
 */
public class koneksi{
     private static Connection con;
     private static Statement stat;
     public Connection getConnection(){
		try {
		    Class.forName("oracle.jdbc.OracleDriver");
		    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","013","013");
                    stat = con.createStatement();
		} catch (Exception e) {
		    JOptionPane.showMessageDialog(null,"Database Gagal terhubung");
		}
		return con;
	}
}
