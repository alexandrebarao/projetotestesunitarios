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
    
    @Test
    public void testValidaData() {
        assertFalse(u.validaData(0,2,2019));
        assertFalse(u.validaData(29,2,2019));
        assertTrue(u.validaData(28,2,2019));
        assertTrue(u.validaData(29,2,2020));
        assertFalse(u.validaData(31,6,2019));
        assertFalse(u.validaData(35,12,2019));
        assertFalse(u.validaData(0,-5,-100));
        
        

    }

    /**
     * Test of calculaComissao method, of class Utilitario.
     */
    @Test
    public void testCalculaComissao() {
       assertEquals(225, u.calculaComissao(1500), 0.0);
       assertEquals(300, u.calculaComissao(1999), 0.3);
       assertEquals(2500, u.calculaComissao(10000), 0.0);
       
    }

    /**
     * Test of numeroNegativo method, of class Utilitario.
     */
    @Test
    public void testNumeroNegativo() {
         assertTrue(u.numeroNegativo(-5));
        
    }

    /**
     * Test of modulo method, of class Utilitario.
     */
    @Test
    public void testModulo() {
        assertEquals(25, u.modulo(-25));
       
    }
}
