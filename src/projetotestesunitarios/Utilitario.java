/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotestesunitarios;
   
/**
 *
 * @author Administrator
 */
public class Utilitario {
    public Utilitario() { 
        
    }
    
    public boolean validaData(int dia, int mes, int ano) {
        boolean validacao = true;
        
        int diasDoMes[]={31, 28, 31, 30, 31, 30, 31, 30, 30, 31, 30, 31};
        
        if ( mes == 2) {
            if ( ano % 4 == 0 ) {
                diasDoMes[mes-1]=29;
            }
        }
        
        // validações simples
        
        if ( dia < 1 || dia > diasDoMes[mes -1]) {
            validacao = false;
        }
        
        if ( mes < 1 || mes > 12 ) {
            validacao = false;
        }
        
        if ( ano < 1 ) {
            validacao = false; 
        }
        
        return validacao;
    }
    
    public int duplicarValor(int v) {
        return v * 2;
    }
    
    public String posicaoPodium(int p) {
        String resposta; 
        switch(p) {
            case 1: resposta = "Ouro"; break;
            case 2: resposta = "Prata"; break;
            case 3: resposta = "Bronze"; break;
            default: resposta = "T-Shirt";
        }
        return resposta;
    }
    
    public boolean numeroPar(int n) {
        return n % 2 == 0;
    }
    
    public double calculaPreco(double preco, double quantidade) {
        return preco * quantidade;
    }
    
    
}
