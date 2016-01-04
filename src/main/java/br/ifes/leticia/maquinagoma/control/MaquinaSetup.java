/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.maquinagoma.control;

import br.ifes.leticia.maquinagoma.model.FinishedSetupState;
import br.ifes.leticia.maquinagoma.model.GomaVendidaState;
import br.ifes.leticia.maquinagoma.model.MaquinaSetupState;
import br.ifes.leticia.maquinagoma.model.RecebeuMoedaState;
import br.ifes.leticia.maquinagoma.model.SemGomaState;
import br.ifes.leticia.maquinagoma.model.SemMoedaState;

/**
 *
 * @author Leticia
 */
public class MaquinaSetup {
    // The various states the setup can be in...
    private final MaquinaSetupState semMoedaState;
    private final MaquinaSetupState recebeuMoedaState;
    private final MaquinaSetupState gomaVendidaState;
    private final MaquinaSetupState semGomaState;
    private final MaquinaSetupState finishedState;
    private int qtdGoma;
    private int moedaInserida;
    
    // The current state we are in...
    private MaquinaSetupState currentState;

    public int getQtdGoma() {
        return qtdGoma;
    }

    public final void setQtdGoma(int qtdGoma) {
        this.qtdGoma = qtdGoma;
    }
    
    public int getMoedaInserida() {
        return moedaInserida;
    }

    public void setMoedaInserida(int moedaInserida) {
        this.moedaInserida = moedaInserida;
    }
  
    
    public MaquinaSetup(int goma) {
        setQtdGoma(goma);
        
        semMoedaState = new SemMoedaState(this);
        recebeuMoedaState = new RecebeuMoedaState(this);
        gomaVendidaState = new GomaVendidaState(this);
        finishedState = new FinishedSetupState(this);
        semGomaState = new SemGomaState(this);
        
        setState(semMoedaState);
    }
    
    
    public final void setState(MaquinaSetupState state) {
        currentState = state;
        System.out.println(currentState.getInstructions());
    }
    
    public void comMoeda(){
        currentState.nextValue();
    }
    
    public void semMoeda(){
        currentState.previousValue();
    }
    
    public void inserirMoeda(int moeda){
        setMoedaInserida(moeda);
        currentState.selectValue();
    }
    
    public void puxarAlavanca(){
        currentState.selectValue();
    }
   
    public void retirarGoma(){
        currentState.selectValue();
    }
    
    public void verificar(){
        currentState.selectValue();
    }
    
    public MaquinaSetupState getSemMoedaState() {
        return semMoedaState;
    }
    
    public MaquinaSetupState getRecebeuMoedaState() {
        return recebeuMoedaState;
    }
    
    public MaquinaSetupState getGomaVendidaState() {
        return gomaVendidaState;
    }
     
    public MaquinaSetupState getFinishedSetupState() {
        return finishedState;
    }
    
    public MaquinaSetupState getSemGomaState() {
        return semGomaState;
    }
    
    
    
}
