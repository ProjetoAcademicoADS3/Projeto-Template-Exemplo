
package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class Apartamento {
    
    private String padrao;
    private int tamanho;
    private double valor;

    public Apartamento() {
    }

    public Apartamento(String padrao, int tamanho, double valor) {
        this.padrao = padrao;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "----------------- Informações do Apartamento ----------------\n"
                + "Apartamento: " + padrao + "\n"
                + "Tamanho: " + tamanho + "\n"
                + "Valor R$: " + valor;
    }
    
    
    
    
    
    
    
    
}
