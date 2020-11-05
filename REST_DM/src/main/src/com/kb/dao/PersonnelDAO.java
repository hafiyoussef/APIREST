package com.kb.dao;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.kb.model.Personnel;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/*import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;*/

 
//Just to avoid DB calls in this example, Assume below data is interacting with DB
public class PersonnelDAO {
    static HashMap<String, Personnel> usersMap = new HashMap<String, Personnel>();
    	
    	
    	public List<Personnel> getAllPersonnel() {
    		List<Personnel> listProfesseur = new ArrayList<Personnel>();
    		String url ="jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    		String login = "root";
    		String passwd="Zarzis92";
    		Connection cn=null;
    		Statement st =null;
    		ResultSet rs =null;
    		try {
    			Class.forName("com.mysql.jdbc.Driver");
    			cn=(Connection) DriverManager.getConnection(url,login,passwd);
    			st=(Statement) cn.createStatement();
    			String sql = "select id, nom, prenom ,date_naissance from personnel p ";
    			rs=st.executeQuery(sql);
    			while(rs.next()) {
    				int id = rs.getInt("id");
    				String nom = rs.getString("nom");
    				String prenom = rs.getString("prenom");
    				String date_naissance = rs.getString("date_naissance");
    				Personnel per= new Personnel(id, nom, prenom,date_naissance);
    				listProfesseur.add(per);
    			}
    		}catch (SQLException e) {
    			e.printStackTrace();
    		}catch(ClassNotFoundException e) {
    			e.printStackTrace();
    		}finally {
    			try {
    				cn.close();
    				st.close();
    				
    			}catch (SQLException e) {
    				e.printStackTrace();
    			}
    		}
    		return listProfesseur;	
    	}
    	public  Personnel getPersonnel(int id ) {
    		String url ="jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    		String login = "root";
    		String passwd="Zarzis92";
    		Connection cn=null;
    		Statement st =null;
    		ResultSet rs =null;
    		try {
    			Class.forName("com.mysql.jdbc.Driver");
    			cn=(Connection) DriverManager.getConnection(url,login,passwd);
    			st=(Statement) cn.createStatement();
    			String sql = "select id, nom, prenom ,date_naissance from personnel p  where id =('"+id+"')";
    			rs=st.executeQuery(sql);
    			while (rs.next()) {
    				int id1 = rs.getInt("id");
    				String nom = rs.getString("nom");
    				String prenom = rs.getString("prenom");
    				String date_naissance = rs.getString("date_naissance");
    				Personnel per= new Personnel(id1, nom, prenom,date_naissance);
    				return per;
    			}
    		}catch (SQLException e) {
    			e.printStackTrace();
    		}catch(ClassNotFoundException e) {
    			e.printStackTrace();
    		}finally {
    			try {
    				cn.close();
    				st.close();
    				
    			}catch (SQLException e) {
    				e.printStackTrace();
    			}
    		}
    		return null;
    		
    	}
    	public void addPersonnel(Personnel p) {
    		String url ="jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    		String login = "root";
    		String passwd="Zarzis92";
    		Connection cn=null;
    		Statement st =null;
    		try {
    			Class.forName("com.mysql.jdbc.Driver");
    			cn=(Connection) DriverManager.getConnection(url,login,passwd);
    			st=(Statement) cn.createStatement();
    			
    			String sql = "insert into personnel values ('"+p.id+"','"+p.nom+"','"+p.prenom+"','"+ p.date_naissance+"')";
    			//String sql2="insert into professeur values('"+id+"')";
    			st.executeUpdate(sql);
    			//st.executeUpdate(sql2);
    		}catch (SQLException e) {
    			e.printStackTrace();
    		}catch(ClassNotFoundException e) {
    			e.printStackTrace();
    		}finally {
    			try {
    				cn.close();
    				st.close();
    				
    			}catch (SQLException e) {
    				e.printStackTrace();
    			}
    		}
    		
    	
    	}
    	
    	
    }

   