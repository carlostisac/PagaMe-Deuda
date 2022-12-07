/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appconsola;

import java.util.Scanner;
import pagame.domain.Abono;
import pagame.domain.Cobrador;
import pagame.domain.Deuda;
import pagame.domain.Deudor;

/**
 *
 * @author CARLO
 */
public class PagaMe {
    private int opcion;
    
    private Deudor[]deudor = new Deudor[100];
    private int numDeudores=0;
    
    Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        PagaMe inicio = new PagaMe();
        int opcion= inicio.menuPrincipal();
            switch(opcion){
                
                case 1 -> {
                    
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 0 -> {System.exit(opcion);}
                default -> {
                    System.out.println("el dato ingresado no corresponde a un valor valido del menu");
                }
       
            }
    }
    
    public int menuPrincipal(){
        System.out.println("""
                                  MENU
                                 PagaMe
                           1: crear deudor
                           2: ver deudores
                           3: 
                           4: 
                           0: salir""");
        System.out.println(">>>>>>>ingresa la opcion deseada");
        opcion = sc.nextInt();
    return opcion;}
    
    static Deudor crearDeudor(){
        int id;
        String nombre;
        String direccion;
        float saldo;
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el id");
        id = datos.nextInt();
        System.out.println("Ingrese el nombre");
        nombre = datos.next();
        System.out.println("Ingrese la direccion");
        direccion = datos.next();
        System.out.println("Ingrese el saldo: ");
        saldo = datos.nextFloat();
        Deudor deudor1 = new Deudor(id,nombre,direccion,saldo);
        return deudor1;
        
    }
public  void verDeudor(Deudor deudor1){
        System.out.println("Id: " + deudor1.getId());
        System.out.println("Nombre: " + deudor1.getNombre());
        System.out.println("Direccion: " + deudor1.getDireccion());
        System.out.println("Saldo: " + deudor1.getSaldo());
    }
    
    
    
}
