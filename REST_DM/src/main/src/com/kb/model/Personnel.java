package com.kb.model;
 
import javax.xml.bind.annotation.XmlRootElement;
 

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
@XmlRootElement(name="Personnnel")
public class Personnel {
	public int id;
    public String nom;
    public String prenom;
    public String  date_naissance;
   // public String diplome;
    //public static List<Assistant> assistant_List = new ArrayList<Assistant>();
    
    
  //-----------Constructeur----------------------------------------------
    public Personnel(int id, String nom, String prenom, String date_naissance){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.date_naissance=date_naissance;
    }

  //-----------Getter----------------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	//-----------SETTER----------------------------------------------

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getDate_naissance() {
		return date_naissance;
	}



	public void setDate_naissance(String  date_naissance) {
		this.date_naissance = date_naissance;
	}
	
    
	//METHOD
	
	
	public String toString() {
        return "id: "+id +"\n Nom:"+nom+"\n Prenom:"+prenom+"\n Date_naissance:"+date_naissance;
        }
	
}