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
public class Filosofo implements Runnable {
    private final Object PalilloIzq;
    private final Object PalilloDer;

    public Filosofo(Object PalilloIzq, Object PalilloDer) {
        this.PalilloIzq = PalilloIzq;
        this.PalilloDer = PalilloDer;
    }
    
    private void Accion(String accion) throws InterruptedException {
        System.out.println(
            Thread.currentThread().getName() + " " + accion);
            Thread.sleep((int) (Math.random() * 100));          //cada filosofo espera un tiempo random entre 0 y 100
        }

    @Override
    public void run() {
        try{
            while (true) {
                Accion("Pensando"); // todos empiezan pensando 
                synchronized (PalilloIzq) {
                    Accion("Levanta el palillo izquierdo");
                    synchronized (PalilloDer) {
                        Accion("Levanta el palillo derecho y SE PONE A COMER"); 
                        Accion("Deja tenedor derecho");
                    }  
                    // acción pensar
                    Accion("Deja palillo izquierdo. Ahora esta pensando"); 
                }  
            }
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
