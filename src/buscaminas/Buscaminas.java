/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscaminas;
import java.util.Scanner;

/**
 *
 *  Claudio Developer Docente: Vamos a realizar la lógica de 
 * negocio del Buscaminas.
Para ello vamos a hacer lo siguiente:
Ayudandonos de un array de caracteres de 200 casillas, vamos a rellenar de 
manera aleatoria caracteres del 1 al 4.
Posteriormente rellenaremos un número aleatorio de veces, en posiciones
también aleatorias las casillas con el caracter X

De manera que nos quede un patrón aleatorio, por ejemplo
[2][3][3][1][X][2][2][2][3][X][1][X]......
Finalmente le pediremos al
 usuario, un número del 1 hasta la posición máxima del array,
 para posteriormente mostrar el valor, si el VALOR es X,
 mostraremos un mensaje de GAME OVER, caso contrario,
 seguiremos con el bucle de manera infinita.
 */
public class Buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int [] posiciones= new int [200];
       
       for (int i=0;i<posiciones.length;i++){
            int aleatorio=(int)(Math.random()*4)+1;
            posiciones[i]=(int)(aleatorio + '0');// no lo entiendo
        }
       
        int minas=(int)(Math.random()* posiciones.length);
        for (int i=0;i<minas;i++){
            int ubicacion=(int)(Math.random()*posiciones.length);
            posiciones[ubicacion]= 'x';
        }
        
        Scanner teclado= new Scanner (System.in);
        while(true){
            System.out.println("Introduce un numero del 1 al "+posiciones.length+":");
            int ubicacion = teclado.nextInt();
            if (ubicacion <1|| ubicacion> posiciones.length){
                System.out.println("esa posicion no vale, tolete");
                continue;
            }
            if(posiciones [ubicacion -1]=='x'){
                System.out.println("GAME OVER");
                break;
            }
            else{
                System.out.println("Escapaste en tablas, la mina estaba en la posicion:");
                System.out.println(posiciones[ubicacion -1]);
            }
        }
        
        
        
        
    
       
        
        
        
    }
    
}
