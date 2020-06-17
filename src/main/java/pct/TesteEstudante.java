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
        
        
        //Criaçã da instancia do objeto EstudanteInfo
        EstudanteInfo estudanteinfo = new EstudanteInfo();
        
        //Construção do objeto Estudante INFO (INFORME OS DADOS DO ESTUDANTE)
        estudanteinfo.setNome("Edson Araujo de Jesus");
        estudanteinfo.setId(30);
        estudanteinfo.setInfoBasico(1);
        estudanteinfo.setLogica('I');
        
        //Imprimindo o objeto Estudante INFO
        System.out.println("\n\t\t\t ----- NOTA DO ESTUDANTE ------");
        estudanteinfo.EstudanteInfo();
        
        
    }
}