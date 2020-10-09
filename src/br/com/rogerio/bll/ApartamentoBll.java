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
public abstract class ApartamentoBll {

    private double comissaoPaga;
    private String categoriaVendedor;

    public ApartamentoBll() {
    }

    public abstract double calcularComissao(Apartamento apto);

    public final double pagarComissao(Apartamento apto, String vendedor) {

        categoriaVendedor = vendedor;
        
        this.comissaoPaga = calcularComissao(apto);
        
        return this.comissaoPaga;

    }

    @Override
    public String toString() {
        return "\n--------- Informações da Comissão ---------\n"
                + "Categoria do vendedor: " + categoriaVendedor + "\n"
                + "comissaoPaga = " + this.comissaoPaga;
    }

}
