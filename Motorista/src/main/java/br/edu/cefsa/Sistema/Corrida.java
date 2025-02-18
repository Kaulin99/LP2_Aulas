/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.Sistema;

import java.time.LocalDateTime;

/**
 *
 * @author 082220027
 */
public class Corrida {
    
    private TaxiFrota taxi = new TaxiFrota();
    private Motorista motorista = new Motorista();
    private Passageiro passageiro = new Passageiro();
    private LocalDateTime inicio;
    private LocalDateTime termino;
    private Double valor;
}
