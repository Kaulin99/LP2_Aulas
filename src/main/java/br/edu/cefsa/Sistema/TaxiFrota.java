/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.Sistema;

/**
 *
 * @author 082220027
 */
public class TaxiFrota implements Frota {

    private int numero;

    public TaxiFrota() {
    }

    public TaxiFrota(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override public Double Aluguel() {
        return 100.0;
    }
}
