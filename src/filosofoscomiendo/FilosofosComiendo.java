/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofoscomiendo;

/**
 *
 * @author kikiu
 */
public class FilosofosComiendo {

    public static void main(String[] args) throws Exception  {
        Filosofo[] filosofos = new Filosofo[5];            //creacion de filosofos
        Object[] Palillos = new Object[5]; //crea la misma cantidad de palillos que de filosofos
        
        for (int i = 0; i < Palillos.length; i++) 
            Palillos[i] = new Object();                  //creacion de los palillos                                  
        
        
        for (int i = 0; i < filosofos.length; i++) { 
            Object PalilloIzq = Palillos[i];                          //palillos izquierdos
            Object PalilloDer = Palillos[(i + 1) % Palillos.length];  //palillos derechos, el modulo es para que al 5to 
                                                                      //filosofo tome el palillo izquierdo del 1ro
            filosofos[i] = new Filosofo(PalilloIzq, PalilloDer);      //crea un folosofo con los palillos asignados

            Thread t = new Thread(filosofos[i], "Filosofo " + (i + 1)); //crea un hilo para cada filosofo
            t.start();                                                  //y lo inicia.
        }
    }
    
}
