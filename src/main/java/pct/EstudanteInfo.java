/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author edson
 */                        ///extends vincula a clase estudante atrves de herança  
public class EstudanteInfo extends Estudante {
    //Declarando variaveis 
    private double infoBasico;
    private char logica;
    
    //Metodos
    public void atribuirNota(){
        
        if (infoBasico == 1 && logica == 'B')
        {
        System.out.println("NOTA......................: APROVADO COM UMA BOA NOTA!");    
        } else if (infoBasico == 1 && logica == 'R')
                {
                System.out.println("NOTA......................: APROVADO COM NOTA REGULAR!");    
                }else if (infoBasico == 1 && logica == 'I')
                        {
                        System.out.println("NOTA......................: REPROVADO, COM NOTA INRREGULAR EM LÓGICA");        
                        }
                        else 
                        {   
                        System.out.println("NOTA......................: REPROVADO, VOCÊ NÃO POSSUI INFORMATICA BASICA.");
                        }        
    }
    
    /**
     * @return the infoBasico
     */
    public double getInfoBasico() {
        return infoBasico;
    }

    /**
     * @param infoBasico the infoBasico to set
     */
    public void setInfoBasico(double infoBasico) {
        this.infoBasico = infoBasico;
    }

    /**
     * @return the logica
     */
    public char getLogica() {
        return logica;
    }

    /**
     * @param logica the logica to set
     */
    public void setLogica(char logica) {
        this.logica = logica;
    }

    //Construtor completo
    public EstudanteInfo(double infoBasico, char logica) {
        this.infoBasico = infoBasico;
        this.logica = logica;
    }
    
    //Construtor vazio
    public EstudanteInfo() {
        this.setNome("Nome não informados");
    }  

   //Consrutor com Override usando SUPER
    @Override
    public void EstudanteInfo() {
        super.EstudanteInfo(); //To change body of generated methods, choose Tools | Templates.
        this.atribuirNota();        
    }
     
}
