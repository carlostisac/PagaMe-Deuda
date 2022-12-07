/* ITESS-TICS
*  Taller de investigacion I
*  Prof. dr. Francisco Javier Montecillo Puente
*
*  Descripccion: PagaMe proyecto desarrollado por TI-701 itess (2019-2023)
*         fecha: 
*           por: Carlos Isaac Tapia Rivera
*         email: ti19110336@itess.edu.mx
*
*/
import pagame.domain.Deudor;
/**
 *
 * @author CARLO
 */


public class DeudorTest {
    public static void main(String[] args) {
        Deudor deudor1 = new Deudor(1,"Juan Perez", "calle falsa 123",-4000.1f);
        Deudor deudor2 = new Deudor(2,"Maria Lopez", "calle falsa 3");
        
        printDeudor(deudor1);
        printDeudor(deudor2);
    }
    
    
    
    public static void printDeudor(Deudor deudor){
        System.out.println("Deudor          id: "+ deudor.getId());
        System.out.println("Deudor      Nombre: "+  deudor.getNombre());
        System.out.println("Deudor   direccion: "+  deudor.getDireccion());
        System.out.println("Deudor    cantidad: "+  deudor.getSaldo()+"\n");
    }
    
}
