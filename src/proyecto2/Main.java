
package proyecto2;

/**
 *
 * @author JorgeJr
 */
public class Main {
    
    //MyThread[10] memory = MyThread[10];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread hilo1 = new MyThread();
        MyThread hilo2 = new MyThread();
        
        hilo1.start();
        hilo2.start();
    }
    
}
