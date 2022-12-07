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

/**
 *
 * @author CARLO
 */
public class Deudor {
    private int id;
    private String nombre;
    private String direccion;
    private float saldo;

    public Deudor(int id, String nombre, String direccion, float saldo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.saldo = saldo;
    }
    
    public Deudor(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}



    