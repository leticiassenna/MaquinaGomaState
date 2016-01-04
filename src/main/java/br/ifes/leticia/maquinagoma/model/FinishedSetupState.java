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
public class FinishedSetupState implements MaquinaSetupState{
    private final MaquinaSetup maquinaSetup;
    private int goma;

    public FinishedSetupState(MaquinaSetup maquina) {
        this.goma = maquina.getQtdGoma();
        this.maquinaSetup = maquina;
    }

    @Override
    public void previousValue() {
        goma++;
        System.out.println("Ignored...");
    }

    @Override
    public void nextValue() {
        goma--;
        System.out.println("Menos uma goma");
    }

    @Override
    public void selectValue() {
        nextValue();
        //System.out.println("4 Valor moeda " + 0);
        System.out.println("Quantidade de goma na máquina: " + goma);
        if (goma==0){
            maquinaSetup.setState(maquinaSetup.getSemGomaState());
            maquinaSetup.verificar();
        }
    }

    @Override
    public String getInstructions() {
        return "Retire Goma";
    }

    @Override
    public int getSelectedValue() {
        throw new IllegalStateException("Machine setup finished");
    }
    
}
