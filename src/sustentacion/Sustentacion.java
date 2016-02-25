/*
 * 1. Agregar Producto
2. Buscar Producto
3. Eliminar producto
4. Mostrar Inventario
5. Realizar Venta
6. Mostrar Ganancias totales
7. Salir
 */
package sustentacion;

import java.util.Scanner;


public class Sustentacion {
    
    static Scanner teclado = new Scanner(System.in);//ingresar por teclado
    static int cont_prod=0;//contador de peluches(productos)
    static PELUCHE_DATE[] producto=new PELUCHE_DATE[10];
    static int posicion;
    static boolean confir=false;//utilizada en la funcion busqueda
    
    public static void main(String[] args) {
       
        
        //String nombre;
        //int cantidad; 
        //int valor ;
        
        
        int valor_venta=0; //opcion para entrar al case
        int valor_ventas_totales=0;
        int opcion;
        int cont=0;
        //int ingreso=0,ingreso2=0,saldo_cuenta=0;
        //boolean verificacion=false;
                    
        int  aux_cant_a_vender=0;
        
        
        while(true){
            System.out.println("Programa que realiza la contabilidad de la empresa peluchitos.com");
            System.out.println("1. Agregar producto.");
            System.out.println("2. Buscar producto.");
            System.out.println("3. Eliminar producto..");//esta no esta en uso
            System.out.println("4. Mostrar inventario.");
            System.out.println("5. Realizar venta.");
            System.out.println("6. Mostrar ganancias totales.");
            System.out.println("7. Salir.");
            System.out.print("Ingrese la opcion a ejecutar: ");
            
            opcion=teclado.nextInt();
                   
            switch(opcion){
                case 1:
                   System.out.println("*****INGRESAR DATOS DEL PRODUCTO*****");
                   //System.out.println("PRODUCTO "+cont_prod);
                   
                   producto[cont_prod]=new PELUCHE_DATE();// es el contador de los usuarios
                   producto[cont_prod].Loading_Data(cont_prod);
                   
                   cont_prod++;//aumenta el contador del cliente
                break;
                case 2:
                    confir=busqueda_p();
                    if(confir==false){
                    System.out.println("El producto buscado no existe, intente nuevamente.\n");
                    }
                    else{
                    producto[posicion].Data_Show();
                    //confir=false;
                    }
                break;
                case 3:
                    confir=busqueda_p();//funcion que busca para que entre a modificr
                    if(confir==false){
                         System.out.println("El producto buscado no existe, intente nuevamente.\n");
                    }else{
                    cont_prod--;//cantidad de usuarios ingresados le resta 1 por q el indice siempre se aumenta
                    for(int i=posicion;i<cont_prod;i++){
                        producto[i].setNombre(producto[i+1].getNombre());
                        producto[i].setCantidad(producto[i+1].getCantidad());
                        producto[i].setValor(producto[i+1].getValor());        
                    }                          
                    System.out.println("Producto eliminado.\n");
                        //Para eliminar la ultima posicion
                        producto[cont_prod].setNombre("");
                        producto[cont_prod].setCantidad(0);
                        producto[cont_prod].setValor(0);
                    }
                break;
                case 4:
                    System.out.print("");
                    System.out.println("INVENTARIO");
                    for(int i=0;i<cont_prod;i++){
                        System.out.println("MOSTRANDO LOS DATOS DEL PRODUCTO "+i);
                        producto[i].Data_Show();
                    }
                    
                break;
                case 5:
                    
                    System.out.println("Realizar venta");
                    confir=busqueda_p();
                    if(confir==false){
                    System.out.println("El producto buscado no existe, intente nuevamente.\n");
                    }
                    else{
                    producto[posicion].Data_Show();
                    System.out.print("Ingrese la cantidad que desea vender: ");
                    aux_cant_a_vender = teclado.nextInt();
                    teclado.nextLine();
                    
                    if(producto[posicion].getCantidad()>=aux_cant_a_vender){
                    producto[posicion].setCant_vendida(aux_cant_a_vender);
                    producto[posicion].setCantidad(producto[posicion].getCantidad()-aux_cant_a_vender);
                    System.out.println("cantidad vendida: "+producto[posicion].getCant_vendida());
                    cont++;
                    }
                    else{
                    System.out.println("No existe esa cantidad de productos ");
                    }
                    //confir=false;
                    }
                   
                break;
                case 6:
                    if (cont>=1){
                    System.out.print("");
                    System.out.println("GANANCIAS TOTALES");
                    valor_ventas_totales=0;
                    for(int i=0;i<cont_prod;i++){
                        System.out.println("MOSTRANDO LOS DATOS DEL PRODUCTO "+i);
                        producto[i].Data_Show_Gain();
                        valor_venta=producto[i].getCant_vendida()*producto[i].getValor() ;
                        System.out.println("Valor venta:$ "+valor_venta);
                        valor_ventas_totales=valor_venta+valor_ventas_totales;
                    }
                        System.out.println("Valor total de ventas:$ "+valor_ventas_totales);

                    }else{ 
                    System.out.println("");
                    System.out.println("Valor total de ventas es cero "+valor_ventas_totales);
                    }
                
                break;
                               
                default:
                System.exit(0);//salida de tipo normal
                break;
            }
                       
        }    
        //
    }
    
    /*funion buscar*/
    static boolean busqueda_p(){
        System.out.print("Ingrese el nombre de producto: ");
        teclado.nextLine();
        String nom_pro = teclado.nextLine();
        //System.out.println("");
        for(int i=0;i<cont_prod;i++){
          if(nom_pro.equals(producto[i].getNombre())){
          //System.out.println("producto encontrado en la posicion "+i+"\n");
          posicion=i;//guarda la posicion en la que se encontro
          return true;//porque la encontro y retorna true para entrar al otro metodo
          }
        }
        return false;//para que no entre siempre a que la personase encontro
    }
    /* funcion realizar venta*/
     public void Realizar_venta(int cant_vent) {
        
        
    }
        
        
        
        
}
    

