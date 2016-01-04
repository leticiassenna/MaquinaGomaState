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
public class GomaVendidaState implements MaquinaSetupState{
    private final MaquinaSetup maquinaSetup;
    private int moeda;

    public GomaVendidaState(MaquinaSetup maquinaSetup) {
        moeda = 0;
        this.maquinaSetup = maquinaSetup;
    }

    @Override
    public void previousValue() {
        moeda=1;
    }

    @Override
    public void nextValue() {
        moeda=0;
    }

    @Override
    public void selectValue() {
        //System.out.println("3 Valor da moeda: " + moeda);
        maquinaSetup.setState(maquinaSetup.getFinishedSetupState());
        maquinaSetup.retirarGoma();
    }

    @Override
    public String getInstructions() {
        return "Espere pela goma...";
    }

    @Override
    public int getSelectedValue() {
        return moeda;
    }
    
    
}
