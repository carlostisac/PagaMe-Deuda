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
public class Abono {
    private int id;
    private float cantidad;
    private LocalDate fecha;
    private int idDeudor;
    private int idCobrador;

    public Abono(int id, float cantidad, LocalDate fecha, int idDeudor, int idCobrador) {
        this.id = id;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.idDeudor = idDeudor;
        this.idCobrador = idCobrador;
    }

    public int getId() {
        return id;
    }

    public float getCantidad() {
        return cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getIdDeudor() {
        return idDeudor;
    }

    public int getIdCobrador() {
        return idCobrador;
    }
    
    
    
}
