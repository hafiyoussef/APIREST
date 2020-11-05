package com.kb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.kb.model.Personnel;
import com.kb.model.Module;
public class ModuleDAO {
    static HashMap<String, Module> usersMap = new HashMap<String, Module>();
	public List<Module> getAllModule() {
		
		List<Module> listModule = new ArrayList<Module>();
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
			String sql = "select titre, nb_heures_cours, nb_heures_td ,nb_heures_tp from module ";
			rs=st.executeQuery(sql);
			while(rs.next()) {
				
				String titre = rs.getString("titre");
				int  nb_heures_cours = rs.getInt("nb_heures_cours");
				int  nb_heures_td = rs.getInt("nb_heures_td");
				int  nb_heures_tp = rs.getInt("nb_heures_tp");
				Module mod= new  Module(titre, nb_heures_cours, nb_heures_td,nb_heures_tp);
				listModule.add(mod);
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
		return listModule;	
	}

}
