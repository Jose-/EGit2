package spai.egit2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.NumeroEntero;

public class NumeroEnteroTest {
    private NumeroEntero numero;

    @Before
    public void initObjects() {
        this.numero = new NumeroEntero(100);
    }

    @Test
    public void testConstructorSinParametros() {
        NumeroEntero numero = new NumeroEntero();
        assertEquals(0, numero.getValor());
    }
    
    @Test
    public void testConstructorConParametros() {
        NumeroEntero numero = new NumeroEntero(-10);
        assertEquals(-10, numero.getValor());
    }

    @Test
    public void testIncrementar() {
        this.numero.incrementar(5);
        assertEquals(105, this.numero.getValor());
    }

    @Test
    public void testDoblar() {
        this.numero.doblar();
        assertEquals(200, this.numero.getValor());
    }

    @Test
    public void testDecrementar() {
        this.numero.decrementar(10);
        assertEquals(90, numero.getValor());
        numero = new NumeroEntero();
        this.numero.decrementar(-5);
        assertEquals(-5, numero.getValor());
    }

     @Test
    public void testSumar() {        
        assertEquals(13, this.numero.sumar(8,5));
    }
    
    @Test
    public void testMultiplicar() {        
        assertEquals(15, this.numero.multiplicar(5,3));
    }
}
