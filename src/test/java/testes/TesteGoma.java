/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import br.ifes.leticia.maquinagoma.control.MaquinaSetup;
import br.ifes.leticia.maquinagoma.model.MaquinaSetupState;
import br.ifes.leticia.maquinagoma.model.SemGomaState;
import br.ifes.leticia.maquinagoma.model.SemMoedaState;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leticia
 */
public class TesteGoma {
    
    public TesteGoma() {
    }
    
    @Test
    public void testQtdGoma() 
    {
        MaquinaSetup maquinaSetup = new MaquinaSetup(4);
        Assert.assertEquals(4, maquinaSetup.getQtdGoma());
    }
    
    @Test
    public void testValorMoeda() 
    {
        MaquinaSetup maquinaSetup = new MaquinaSetup(4);
        maquinaSetup.inserirMoeda(1);
        Assert.assertEquals(1, maquinaSetup.getMoedaInserida());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
