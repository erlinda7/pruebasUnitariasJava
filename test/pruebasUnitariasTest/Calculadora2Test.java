package pruebasUnitariasTest;

import org.junit.After;
import pruebasUnitarias.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chamb
 */
public class Calculadora2Test {

    Calculadora2 calc;

    public Calculadora2Test() {
    }

    @Before
    public void before() {
        System.out.println("before()");
        calc = new Calculadora2();
    }

    @After
    public void after() {
        System.out.println("after()");
        calc.clear();
    }

    @Test
    public void testSum() {
        System.out.println("sum()");
        Calculadora2 calc = new Calculadora2();
        int resul = calc.add(3, 2);
        int esper = 5;
        assertEquals(esper, resul);
    }

    @Test
    public void testAnsSum() {
        System.out.println("ansSum()");
        Calculadora2 calc = new Calculadora2();
        calc.add(3, 2);
        int resul = calc.ans();
        int esper = 5;
        assertEquals(esper, resul);
    }

    @Test
    public void testDiv() {
        calc.div(5, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivPorCero() {
        calc.div(5, 0);  //para probar division por cero funciona  y si doy (5,3) deberia dar error porque espera un excepcion aritmetica
    }

    @Test(timeout = 1000)
    public void algoritmoOptimoTest() {
        calc.operacionOptima(); //tarda mas de los 2000ms
    }

    @Test(timeout = 1000)
    public void algoritmoOptimo2Test() {
        calc.operacionOptima2();  //bucle infinito
    }
}
