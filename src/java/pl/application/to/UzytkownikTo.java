/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.application.to;

import java.io.Serializable;

/**
 *
 * @author K4masz
 */
public class UzytkownikTo implements Serializable{
    private Long id = 0l;
    private String imie = "";
    private String nazwisko = "";
    private boolean edited=false;
    
    public UzytkownikTo(){
        
    }
    
    
    public UzytkownikTo(Long id, String imie, String nazwisko, boolean edited){
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.edited = edited;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the imie
     */
    public String getImie() {
        return imie;
    }

    /**
     * @param imie the imie to set
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     * @return the nazwisko
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * @param nazwisko the nazwisko to set
     */
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    /**
     * @return the edited
     */
    public boolean isEdited() {
        return edited;
    }

    /**
     * @param edited the edited to set
     */
    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    
    
}
