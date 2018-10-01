/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericios_ordenamiento;

/**
 *
 * @author santos
 */
public class Ordenamiento {
    public int[] DevuelveArreglo(int nValores,int nValorMinimo,int nValorMaximo){
        int [] numeros =new int [nValores];
        for (int i=0;i<numeros.length;i++){
            numeros[i]=DevuelveNumeroAleatorio(nValorMinimo,nValorMaximo);
        }
        return numeros;
    }
    public int DevuelveNumeroAleatorio(int nMinimo,int nMaximo){
        int nValorDevuelto=0;
        nValorDevuelto=(int)(Math.random()*(nMaximo-nMinimo));
        return nValorDevuelto;
    }
    
    public static void Quicksort(int [] vector, int izquierda, int derecha){
        int pivote=0,i,j,auxintercambio;
        pivote=vector[izquierda];
        i=izquierda;
        j=derecha;
        auxintercambio=0;
        while(i<j){
            while(vector[i]<=pivote && i<j){
                i++;
            }
            while (vector[j]>pivote){
                j=j-1;
            }
            if(i<j){
                auxintercambio=vector[i];
                vector[i]=vector[j];
                vector[j]=auxintercambio;
            }
        }
        vector[izquierda]=vector[j];
        vector[j]=pivote;
        if(izquierda<j-1){
            Quicksort(vector,izquierda,j-1);
        }
        if(j+1<derecha){
            Quicksort(vector,j+1,derecha);
        }
    }
    public static void Burbuja(int []vector){
        int i, j, aux;
        for( i=0;i<vector.length-1;i++){
            for( j=0;j<vector.length-1;j++){
                if(vector[j]>vector[j+1]){
                    aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }
            
        }
            
        }
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
    public static void Shell(int [] vector){
        int inta,i,aux;
        boolean band;
        inta=vector.length;
        while(inta>0){
            inta=inta/2;
            band=true;
            while(band){
                band=false;
                i=0;
                while((i+inta)<=vector.length-1){
                    if(vector[i]>vector[i+inta]){
                        aux=vector[i];
                        vector[i]=vector[i+inta];
                        vector[i+inta]=aux;
                        band=true;
                    }
                    i++;
                }
            }
        }
    }
    
    public static void shell(int A[]){
   int salto, aux, i;
   boolean cambios;
   for(salto=A.length/2; salto!=0; salto/=2){
           cambios=true;
           while(cambios){ // Mientras se intercambie algún elemento
                       cambios=false;
                       for(i=salto; i< A.length; i++) // se da una pasada
                               if(A[i-salto]>A[i]){ // y si están desordenados
                                     aux=A[i]; // se reordenan
                                     A[i]=A[i-salto];
                                     A[i-salto]=aux;
                                     cambios=true; // y se marca como cambio.
                               }
                        }
            }
}
    
}
