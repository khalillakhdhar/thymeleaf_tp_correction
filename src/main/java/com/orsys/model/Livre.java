package com.orsys.model;

public class Livre {
private String titre,auteur;
private int prix;
public Livre(String titre, String auteur, int prix) {
	super();
	this.titre = titre;
	this.auteur = auteur;
	this.prix = prix;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public int getPrix() {
	return prix;
}
public void setPrix(int prix) {
	this.prix = prix;
}
@Override
public String toString() {
	return "Livre [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + "]";
}



}
