
package sustentacion;

import java.util.Scanner;


public class PELUCHE_DATE {
    private String nombre;
    private int cantidad; 
    private int valor ;
    private int cant_vendida;
    //private Object teclado;
    Scanner teclado = new Scanner(System.in);//ingresar por teclado

    //constructor
    public PELUCHE_DATE() {
    }

    public int getCant_vendida() {
        return cant_vendida;
    }

    public void setCant_vendida(int cant_vendida) {
        this.cant_vendida = cant_vendida;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
        
   /*funciones para almacenar*/
    public void Loading_Data(int cont_prod ){
        System.out.println("PRODUCTO "+cont_prod);
        System.out.println("Ingrese.");
        System.out.print("Nombre: ");
        nombre=teclado.nextLine();
        System.out.print("Cantidad:# ");
        cantidad=teclado.nextInt();
        System.out.print("Valor unitario en pesos:$ ");
        valor =teclado.nextInt();
        teclado.nextLine();//para limpiar el bufer
        System.out.print("");
                      
    }
    
    public void Data_Show() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Cantidad:# "+cantidad);
        System.out.println("Valor unitario en pesos:$ "+valor);
    }
    
    public void Data_Show_Gain() {
        System.out.println("Nombre: "+nombre);
        //System.out.println("Cantidad actual:# "+cantidad);
        System.out.println("Cantidad de ventas:# "+cant_vendida);
       // System.out.println("Valor unitario en pesos:$ "+valor);
    }
    
      
}
