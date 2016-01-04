/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.maquinagoma.model;

/**
 *
 * @author Leticia
 */
public interface MaquinaSetupState {
    public void previousValue();
    public void nextValue();
    public void selectValue();
    
    public String getInstructions();
    public int getSelectedValue();

}
