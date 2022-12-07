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
import pagame.domain.Abono;
import java.time.LocalDate;

/**
 *
 * @author CARLO
 */
public class AbonoTest {
    public static void main (String ... args){
        Abono abono = new Abono(1,30, LocalDate.of(2022, 10, 30),1,1);
        
        System.out.println("Abono          id: "+ abono.getId());
        System.out.println("Abono    cantidad: "+ abono.getCantidad());
        System.out.println("Abono       fecha: "+ abono.getFecha());
        System.out.println("Abono id cobrador: "+ abono.getIdCobrador());
        System.out.println("Abono id deudor: "+ abono.getIdDeudor());
    }
}
