package com.kb.model;

public class Module {

	
	public String titre ;
	public double nb_heures_cours ;
	public double nb_heures_td ;
	public double nb_heures_tp ;
	//public Personnel responsable;
	
//-----------Constructeur----------------------------------------------
	public Module (String titre, int nb_heures_cours, int nb_heures_td, int nb_heures_tp)
	{
		this.titre=titre;
		this.nb_heures_cours=nb_heures_cours;
		this.nb_heures_td=nb_heures_td;
		this.nb_heures_tp=nb_heures_tp;
	}
	
	//-----------Getter----------------------------------------------

	public String getTitre() {
		return titre;
	}
	
	public double getNb_heures_cours() {
		return nb_heures_cours;
	}
	
	public double getNb_heures_td() {
		return nb_heures_td;
	}
	
	public double getTb_heures_tp() {
		return nb_heures_tp;
	}
	
	//-----------SETTER----------------------------------------------
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public void setNb_heures_cours(double nb_heures_cours) {
		this.nb_heures_cours = nb_heures_cours;
	}
	
	public void setNb_heures_td(double nb_heures_td) {
		this.nb_heures_td = nb_heures_td;
	}
	
	public void setNb_heures_tp(double nb_heures_tp) {
		this.nb_heures_tp = nb_heures_tp;
	}
	
	//-----------les fonctions---------------------------------------------
	public void ajouter_h_cc(double nb_h)
	{
		nb_heures_cours += nb_h ;
	}
	
	public void ajouter_h_td(double nb_h)
	{
		nb_heures_td += nb_h ;
	}
	public void ajouter_h_tp(double nb_h)
	{
		nb_heures_tp += nb_h ;
	}
	
	
}
