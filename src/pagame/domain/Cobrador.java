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
package pagame.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLO
 */
public class Cobrador {
    private int id;
    private String nombre;
    private List<Deudor> deudoresLista;

    public Cobrador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        deudoresLista= new ArrayList<Deudor>();
    }
    
    public void addDeudor(Deudor deudor){
        deudoresLista.add(deudor);
    }
}
