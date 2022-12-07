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
import java.time.LocalDate;

/**
 *
 * @author CARLO
 */
public class Deuda {
    private int id;
    private float monto;
    private LocalDate fecha;
    private int idDeudor;

    public Deuda(int id, float monto, LocalDate fecha, int idDeudor) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.idDeudor = idDeudor;
    }

    public int getId() {
        return id;
    }

    public float getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getIdDeudor() {
        return idDeudor;
    }
    
    
    
}
