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

		int x = 2;
		this.numero.incrementar(x);
        assertEquals(102, this.numero.getValor());

    }

    @Test
    public void testDoblar() {
        this.numero.doblar();
        assertEquals(200, this.numero.getValor());
    }

    @Test
    public void testDecrementar() {

    	int x = 2;
    	this.numero.decrementar(x);
        assertEquals(98, numero.getValor());

        this.numero.decrementar(10);
        assertEquals(88, numero.getValor());
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
