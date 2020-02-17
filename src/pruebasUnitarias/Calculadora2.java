/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasUnitarias;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chamb
 */
public class Calculadora2 {
    private int ans;
    
    public Calculadora2(){
        ans=0;
    }
    
    public int add(int a, int b){
        ans=a+b;
        return ans;
    }
    
    public int sub(int a, int b ){
        ans = a-b;
        return ans;
    }
    
    public int div(int a, int b){
        if(b==0){
            throw new ArithmeticException("No puedes dividir por cero");
        }
        ans = a/b;
        return ans;
    }
    public int add(int v){
        ans +=v;
        return ans;
    }
    public int sub(int v){
        ans -=v;
        return ans;            
    }
    public int ans(){
        return ans;
    }
    
    public void clear(){
        ans =0;
    }
    
    public void operacionOptima(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void operacionOptima2(){
        for (;;) {
            
        }
    }
}
