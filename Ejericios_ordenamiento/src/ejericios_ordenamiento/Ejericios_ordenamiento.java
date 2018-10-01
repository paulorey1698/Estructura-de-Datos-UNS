/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericios_ordenamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author santos
 */
public class Ejericios_ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nCantidadDatos=5000;
        int nValorMinimo=0;
        int nValorMaximo=10000;
        int[] oArreglo = new int[nCantidadDatos];
        Ordenamiento oClsOrdenamiento=new Ordenamiento();
        System.out.println("Ejemplo Ordenamiento\n");
        oArreglo = oClsOrdenamiento.DevuelveArreglo(nCantidadDatos, nValorMinimo, nValorMaximo);
        //Impresion de Arreglo
        System.out.println("\n");
        System.out.println("Arreglo Aleatorio\n");
        for(int n:oArreglo){
            System.out.print(" "+n);
        }
        long nInicioTiempo=System.currentTimeMillis();
        Ordenamiento.Quicksort(oArreglo, 0, oArreglo.length-1);
        long nRetardoTiempo=System.currentTimeMillis()-nInicioTiempo;
        
        System.out.println("\n");
        System.out.println(nRetardoTiempo);
        
        System.out.println("\n");
        
        //Ordenamiento por Quicksort
        System.out.println("Arreglo Ordenado\n");
         for(int n:oArreglo){
            System.out.print(" "+n);
        }
         
         long nInicioTiempo1=System.currentTimeMillis();
         Ordenamiento.Burbuja(oArreglo);
         long nRetardoTiempo1=System.currentTimeMillis()-nInicioTiempo1;
        System.out.println("\n");
        System.out.println(nRetardoTiempo1);
         
         System.out.println("\n");
         //Ordenamiento Burbuja
         System.out.println("Arreglo Ordenado - Burbuja\n");
        for(int n:oArreglo){
            System.out.print(" "+n);
        }
        
        long nInicioTiempo2=System.currentTimeMillis();
        Ordenamiento.Insercion(oArreglo);
        long nRetardoTiempo2=System.currentTimeMillis()-nInicioTiempo2;
        System.out.println("\n");
        System.out.println(nRetardoTiempo2);
        System.out.println("\n");
        //Ordenamiento Insercion
        System.out.println("Arreglo Ordenado - Insercion");
         for(int n:oArreglo){
            System.out.print(" "+n);
        }
         
         long nInicioTiempo3=System.currentTimeMillis();
         Ordenamiento.Shell(oArreglo);
         long nRetardoTiempo3=System.currentTimeMillis()-nInicioTiempo3;
        System.out.println("\n");
        System.out.println(nRetardoTiempo3);
         System.out.println("\n");
         //Ordenamiento Shell
         System.out.println("Arreglo Ordenado - Shell");
         for(int n:oArreglo){
            System.out.print(" "+n);
        }
         
         long nInicioTiempo4=System.currentTimeMillis();
         Ordenamiento.shell(oArreglo);
         long nRetardoTiempo4=System.currentTimeMillis()-nInicioTiempo4;
        System.out.println("\n");
        System.out.println(nRetardoTiempo4);
         System.out.println("\n");
         //Ordenamiento Shell
         System.out.println("Arreglo Ordenado - Shell 2");
         for(int n:oArreglo){
            System.out.print(" "+n);
        }
         
        Ventana VentanaPrincipal =new Ventana();
        VentanaPrincipal.setTitle("Bienvenido!");
        VentanaPrincipal.setVisible(true);
      
        System.out.println("\n");
        System.out.println("Metodo              Tiempo en milisegundos");
        System.out.println("Quicksort"+"                 "+nRetardoTiempo);
        System.out.println("Burbuja"+"                   "+nRetardoTiempo1);
        System.out.println("Insercion"+"                 "+nRetardoTiempo2);
        System.out.println("Shell"+"                     "+nRetardoTiempo4);
                
        
        
        
    }
    
    
}
