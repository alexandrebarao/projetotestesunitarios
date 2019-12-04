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
