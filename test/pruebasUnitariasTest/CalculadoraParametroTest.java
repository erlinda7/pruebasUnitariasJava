/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasUnitariasTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pruebasUnitarias.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author chamb
 */
@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {

    @Parameters
    public static Iterable<Object[]> getData(){
      return Arrays.asList(new Object[][]{
          {3,1,4},
          {2,3,5},
          {3,3,6}
      });
        /* List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[]{3,1,4});
        obj.add(new Object[]{2,3,5});
        obj.add(new Object[]{3,3,6});
        return obj;*/
    }
    
    private int a, b, exp;

    public CalculadoraParametroTest(int a, int b, int exp) {//quien lo llama .. el propio junit con RunWiht
        this.a = a;
        this.b = b;
        this.exp = exp;
    }

    @Test
    public void testAdd() {
        Calculadora2 calc = new Calculadora2();
        int result = calc.add(a, b);
        assertEquals(exp, result);
    }
}
