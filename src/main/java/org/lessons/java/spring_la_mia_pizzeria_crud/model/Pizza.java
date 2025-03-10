package org.lessons.java.spring_la_mia_pizzeria_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "pizze")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    @NotBlank
    @Lob
    private String descrizione;

    // @NotBlank
    // private String pizzaImage;

    @NotBlank
    private float prezzo;

    public Integer id() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    // public String getpizzaImage() {
    //     return this.pizzaImage;
    // }

    // public void setpizzaImage(String pizzaImage) {
    //     this.pizzaImage = pizzaImage;
    // }

    public float getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
    

    @Override
    public String toString(){
        return String.format(" nome %s, descrizione %s, prezzo %s", this.nome, this.descrizione, this.prezzo);
    }
    
}