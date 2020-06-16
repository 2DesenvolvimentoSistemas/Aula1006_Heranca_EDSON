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
public class TesteEstudante {
    public static void main(String[] args) {
        //Criação e instancia do objeto da clase Estudante
        Estudante estudante = new Estudante();
        
        //Construção do Objeto
        estudante.setNome("Edson");
        estudante.setId(10);
        
        //Imprimendo aluno
        System.out.println("\n\t\t\t ----- ESTUDANTE ------");
        estudante.EstudanteInfo();
        
        //Outro objeto para teste do construtor explicito
        Estudante outroEstudante = new Estudante("João",20);
        
        //Imprimendo outro aluno
        System.out.println("\n\t\t\t ----- OUTRO ESTUDANTE ------");
        outroEstudante.EstudanteInfo();
        
        //Criaçã da instancia do objeto EstudanteInfo
        EstudanteInfo estudanteinfo = new EstudanteInfo();
        
        //Construção do objeto Estudante INFO
        estudanteinfo.setNome("Pedro");
        estudanteinfo.setId(30);
        estudanteinfo.setInfoBasico(1);
        estudanteinfo.setLogica('I');
        
        //Imprimindo o objeto Estudante INFO
        System.out.println("\n\t\t\t ----- NOTA DO ESTUDANTE ------");
        estudanteinfo.EstudanteInfo();
        

    }
}
