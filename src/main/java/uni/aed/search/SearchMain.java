/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.search;
import java.util.Scanner;
import uni.aed.sort.Sort;
/**
 * programa que invoca el algoritmo de busqueda Lineal
 * @author uni.cc232
 */
public class SearchMain {
    static Search search=new Search();
    static Integer[] X;
    public static void main(String[] args){
        carga();
        visualizar();
        searchLineal(X);
        visualizar();
        searchBinaria(X);
        visualizar();
        
    }
    public static void carga(){
        Integer[] Y={15,1,25,60,69,86,3,78,2,10};
        X=Y;
    }
    public static void visualizar(){
        System.out.println("El array contiene los siguientes elementos: ");
        for(Integer x:X)
            System.out.print(x.toString()+",");
        System.out.println("");
    }
    
    public static void searchLineal(Integer[] X){
        Scanner scr=new Scanner(System.in);
        System.out.println("Ingrese el valor a buscar: ");
        int valor =scr.nextInt();
        int pos=search.searchLineal(X, valor); 
        if (pos==-1)
            System.out.println("El numero " + valor + " no existe en la lista");
        else
            System.out.println("El numero " + valor + " se ubico en la lista en la posicion "+ pos);
    }        
    public static void searchBinaria(Integer[] X){
        Scanner scr=new Scanner(System.in);
        System.out.print("Ingrese el valor a buscar: ");
        int valor =scr.nextInt();
        Sort sort=new Sort();
        sort.setY(X);
        X=sort.bubbleWuSort();
           //visualizar el array ordenado
        for(Integer x:X)
            System.out.print(x.toString()+",");
        System.out.print("");
        //Realiza la busqueda binaria del array
        int pos=search.searchBinaria(X, valor);
        if (pos==-1)
            System.out.print("El numero"+ valor + "no existe en la lista.");
        else
            System.out.print("El numero"+ valor + "se ubico en la lista en la posicion " + pos);


    }

}