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
public class SemGomaState implements MaquinaSetupState{
    private final MaquinaSetup maquinaSetup;
    private int goma;

    public SemGomaState(MaquinaSetup maquinaSetup) {
        this.maquinaSetup = maquinaSetup;
        goma = 0;
    }

    @Override
    public void previousValue() {
        goma=0;
    }

    @Override
    public void nextValue() {
        goma=0;
    }

    @Override
    public void selectValue() {
        System.out.println("MAQUINA SEM GOMA");
    }

    @Override
    public String getInstructions() {
        return "Por favor, repor as gomas";
    }

    @Override
    public int getSelectedValue() {
        return goma;
    }
    
}
