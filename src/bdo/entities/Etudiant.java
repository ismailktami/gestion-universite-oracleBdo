/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdo.entities;

/**
 *
 * @author ORACLE
 */
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String cne;
    private String email;
    private String filiere;
    private int niveau;

    public Etudiant(String nom, String prenom, String cne, String email, String filiere, int niveau) {
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
        this.email = email;
        this.filiere = filiere;
        this.niveau = niveau;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public Etudiant(int id, String nom, String prenom, String cne, String email, String filiere, int niveau) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
        this.email = email;
        this.filiere = filiere;
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cne=" + cne + ", email=" + email + ", filiere=" + filiere + ", niveau=" + niveau + '}';
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    
    
    
    
    
    
}
