/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada1;

import java.util.ArrayList;
//import javax.swing.JOptionPane;


/**
 *
 * @author Administrador
 */
public class ListarLinealEnlazada {

    public int start;

    private int nCantidadElementos = 0;

    ArrayList<Nodo> ListaLinealEnlazada;

    public void AumentarCantidadElementos() {
        this.nCantidadElementos++;
    }
    
    
    
    public static ArrayList<Nodo> DevuelveListaEnlazada(
            int nCantidadElementosIniciales,
            int nValorInicialDato,
            int nValorFinalDato,
            int nValorInicialEnlace,
            int nValorFinalEnlace) {
        ArrayList<Nodo> oLista = new ArrayList<Nodo>();

        //this.nCantidadElementos = nCantidadElementosIniciales;
        
        int enlace=0;
        int dato = 0;
        int aux =0;
        for (int i = 1; i <= nCantidadElementosIniciales; i++) {
            
            
            if (i == nCantidadElementosIniciales) {
                enlace = 0;
            } else
            {
                enlace=DevuleveNumeroAleatorio(nValorInicialEnlace, nValorFinalEnlace);
            
            }

            dato = DevuleveNumeroAleatorio(nValorInicialDato, nValorFinalDato);
            
            Nodo onodo = new Nodo(dato, enlace);
            
            
            if(i == 1)   {
                onodo.setPosicion(1);
                onodo.setStart(true);
            } else {
                onodo.setPosicion(aux);
                onodo.setStart(false);
            }
            
            aux=enlace;
            oLista.add(onodo);
            onodo = null;
              
        }
        return oLista;
    }

    public static int DevuleveNumeroAleatorio(int p_al_vmin, int p_al_vmax) {
        int nNumeroAleatorio = 0;

        nNumeroAleatorio = (int) (Math.random() * (p_al_vmax - p_al_vmin));

        return nNumeroAleatorio;
    }

    public ListarLinealEnlazada(ArrayList<Nodo> oLista, int p_inicio,
            int p_nCantidadElementos) {
        this.ListaLinealEnlazada = oLista;
        this.start = p_inicio;
        this.nCantidadElementos = p_nCantidadElementos;
    }
    
    public void ImprimirListaLinealEnlazadaOrdenada(ArrayList<Nodo> Lista)
    {
        
        
    }
    public void ImprimirLlistaLinealEnlazada(int p) {

       // JOptionPane.showMessageDialog(null, Lista);
        int ptr = this.start;
        int i=1;
        int [] arreglodatos= new int[p+1];
        int [] arreglodatos2= new int [p+1];
        int [] arregloenlace= new int[p+1];
        int [] arregloenlace2= new int[p+1];
        int [] arregloposicion=new int[p+1];
        int [] arregloposicion2=new int[p+1];
        
        while (ptr != 0) {
            int aux = LeerEnlacePuntero(ptr);
            
            System.out.println("( " + i +" ) ---- > " + "[ Posición : " + ptr + "" + " Dato : " + LeerDatoPuntero(ptr) + " Enlace : " + aux + " ]" );
            arreglodatos[i]=LeerDatoPuntero(ptr);
            arreglodatos2[i]=arreglodatos[i];
             arregloenlace[i]=aux;
             arregloposicion[i]=ptr;
            ptr = aux;
            //arreglolista[i]=LeerDatoPuntero(ptr);
            i++;
        }
        
        Insercion(arreglodatos);
        System.out.println("Numero de Elementos Lista Lineal Enlazada : " + this.nCantidadElementos );
        for(int a=1;a<p+1;a++){
            
            //System.out.println("\n");
            int numero=arreglodatos2[a];
            int cont=0;
            while(cont<arreglodatos.length && arreglodatos[cont]<numero){
                cont++;
            }
            
            if(arreglodatos[cont]==numero){
                //System.out.println(arreglodatos[cont]+" numero encontrado en la posicion "+cont);
            
            int elemento=arregloenlace[a];
            arregloenlace2[cont]=elemento;
            int elemento2=arregloposicion[a];
            arregloposicion2[cont]=elemento2;
            //System.out.println(arregloenlace[a]);
            //System.out.println(arregloenlace2[a]);
        }
            
        }
        for(int paulo=1;paulo<p+1;paulo++){
           System.out.println("Posicion : "+arregloposicion2[paulo] + "    Dato: "+arreglodatos[paulo]+ "  Enlace : " + arregloenlace2[paulo]); 
        }
        System.out.println("\n");
        //JOptionPane.showMessageDialog(null, Lista2);
        
        
    }
    
    
       public int DevolverDatoListaEnlazada( int n_correlativo)
    {
        // n_correlativo : es el orden donde se encuentra el dato.
        int dato = 0;
        
        int ptr = 0;
        ptr = start;
        int i = 1;
        boolean bevaluacion = true;
        
        while(ptr != 0 && bevaluacion == true)
        {
            if (i == n_correlativo) {
                dato = LeerDatoPuntero(ptr);
                bevaluacion = false;
            }
            ptr = LeerEnlacePuntero(ptr);
            i++;
        } 
        
        return dato;
    }

    public int LeerDatoPuntero(int ptr) {
        int dato = 0;
        for (Nodo onodo : ListaLinealEnlazada) {

            if (onodo.getPosicion() == ptr) {
                dato = onodo.getDato();
            }
        }
        return dato;
    }

    public int LeerEnlacePuntero(int ptr) {
        int enlace = 0;
        for (Nodo onodo : ListaLinealEnlazada) {

            if (onodo.getPosicion() == ptr) {
                enlace = onodo.getEnlace();
            }
        }
        return enlace;
    }
    public static void Insercion (int []vector){
       int i,j,aux;
       for(i=1;i<vector.length;i++){
           j=i;
           aux=vector[i];
           while(j>0 && aux < vector[j-1]){
               vector[j]=vector[j-1];
               j=j-1;
           }
           vector[j]=aux;
       }
       
    }
}
