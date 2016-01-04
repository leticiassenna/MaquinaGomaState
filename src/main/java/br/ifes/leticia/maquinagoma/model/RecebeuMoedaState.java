/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.maquinagoma.model;

import br.ifes.leticia.maquinagoma.control.MaquinaSetup;

/**
 *
 * @author Leticia
 */
public class RecebeuMoedaState implements MaquinaSetupState{
    private final MaquinaSetup maquinaSetup;
    private int moeda;


    public RecebeuMoedaState(MaquinaSetup maquinaSetup) {
        this.maquinaSetup = maquinaSetup;
    }
    
    public final void getValorMoeda(int moedaInserida){
        if (moedaInserida==1){
            moeda = moedaInserida;
            nextValue();
        }
        else {
            System.out.println("insira moeda valida");
            System.out.println("Valor da moeda: " + moeda + "\nSomente moeda de R$1!!");
            previousValue();
            System.exit(moeda);
        }
    }

    @Override
    public void previousValue() {
        moeda=0;
    }

    @Override
    public void nextValue() {
        moeda=1;
    }

    @Override
    public void selectValue() {
        moeda = maquinaSetup.getMoedaInserida();
        getValorMoeda(moeda);
        maquinaSetup.setState(maquinaSetup.getGomaVendidaState());
        maquinaSetup.puxarAlavanca();
    }

    @Override
    public String getInstructions() {
        return "Puxe a alavanca...";
    }

    @Override
    public int getSelectedValue() {
        return moeda;
    }
    
}
