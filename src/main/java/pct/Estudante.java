/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author edson
 */
public class Estudante {
    //Atributos
    private String nome;
    private int id;
    
    //Metodos
    public void EstudanteInfo(){
        System.out.println("Nome do estudante.........: " + this.getNome());
        System.out.println("ID do estudante...........: " + this.getId());
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
        
}