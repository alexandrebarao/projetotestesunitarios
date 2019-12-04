/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotestesunitarios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class UtilitarioTest {
    
    Utilitario u;
    
    public UtilitarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        u = new Utilitario();
    }
    
    @After
    public void tearDown() {
    }

   
    /**
     * Test of duplicarValor method, of class Utilitario.
     */
    @Test
    public void testDuplicarValor() {
        assertEquals(8, u.duplicarValor(4));
        assertEquals(12, u.duplicarValor(6));
    }

    /**
     * Test of posicaoPodium method, of class Utilitario.
     */
    @Test
    public void testPosicaoPodium() {
        assertEquals("Ouro", u.posicaoPodium(1)); 
        assertEquals("Prata", u.posicaoPodium(2)); 
        assertEquals("Bronze", u.posicaoPodium(3)); 
        assertEquals("T-Shirt", u.posicaoPodium(4)); 
        
        
    }
    
    @Test
    public void testNumeroPar() {
        assertTrue(u.numeroPar(22));
        assertFalse(u.numeroPar(11));
    }
    
    @Test
    public void testCalculaPreco() {
        assertEquals(2000, u.calculaPreco(1000, 2), 0.0);
    }
    
    
}
