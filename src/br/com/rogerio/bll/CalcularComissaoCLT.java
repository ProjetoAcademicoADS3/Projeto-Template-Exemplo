/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.bll;

import br.com.rogerio.model.Apartamento;

/**
 *
 * @author roger
 */
public class CalcularComissaoCLT extends ApartamentoBll{

    private double comissao = 0.025;

    public CalcularComissaoCLT() {
        super();
    }

    @Override
    public double calcularComissao(Apartamento apto) {
        
           return apto.getValor() * comissao;
       
    }
    
}
