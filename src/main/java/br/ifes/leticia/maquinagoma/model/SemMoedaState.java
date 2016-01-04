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
public class SemMoedaState implements MaquinaSetupState{
    private final MaquinaSetup maquina;
    private int moeda;
    private int goma;

    public SemMoedaState(MaquinaSetup maquinaSetup) {
        this.goma = maquinaSetup.getQtdGoma();
        this.maquina = maquinaSetup;
    }
    
    public final void getQtdGoma(int qtdGoma){
        if (qtdGoma>=1){
            goma = qtdGoma;
            nextValue();
        }
        else {
            previousValue();
            System.out.println("Máquina está sem goma");
            System.exit(goma);
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
        getQtdGoma(goma);
        moeda = maquina.getMoedaInserida();
        //System.out.println("Valor da moeda: " + moeda);
        maquina.setState(maquina.getRecebeuMoedaState());
    }

    @Override
    public String getInstructions() {
        return "Insira a moeda...";
    }

    @Override
    public int getSelectedValue() {
        return moeda;
    }
}
