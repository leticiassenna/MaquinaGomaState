/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.maquinagoma.app;

import br.ifes.leticia.maquinagoma.control.MaquinaSetup;

/**
 *
 * @author Leticia
 */
public class Cliente {
    public static void main(String[] args) {
        MaquinaSetup maquinaSetup = new MaquinaSetup(4);
        
        //maquinaSetup.inserirMoeda(2);
        maquinaSetup.inserirMoeda(1);
        maquinaSetup.puxarAlavanca(); 
        
        
    }
}
