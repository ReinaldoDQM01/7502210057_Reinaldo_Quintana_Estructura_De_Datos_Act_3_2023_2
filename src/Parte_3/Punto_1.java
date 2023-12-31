/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_3;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author rey
 */
public class Punto_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> person = new LinkedList<>();
        person.add(8);
        person.add(5);
        person.add(10);
        person.add(3);
        person.add(4);
        person.add(20);
        person.add(1);
        person.add(15);
        person.add(6);
        person.add(7);
        person.add(2);
        person.add(11);
        person.add(9);
        person.add(13);
        person.add(19);
        person.add(14);
        person.add(18);
        person.add(12);
        person.add(17);
        person.add(16);
        System.out.println("Estos son los numeros ya ordenados y sus multiplos: ");
        listaPersonal((List<Integer>) person);
        
        // Imprimimos el tamaño de la lista de números
        System.out.print("Estos son todos los elementos en la cola: " + person);
        System.out.println();
        System.out.print("Agregue un nuevo elemento por favor: ");
        // Enqueue - Agregar elemento al final de la cola
        String agregar = scanner.nextLine();
        person.addAll(person);
        System.out.print("Nuevo elemento agregado a la cola: " + agregar);
          
          
        System.out.println();
        // Peek - Acceder al primer elemento de la cola sin eliminarlo
        Integer acceder = person.peek();
        System.out.println("Elemento accedido sin ser eliminado es: " + acceder);
        // Dequeue - Eliminar y devolver el primer elemento de la cola
        int quitado = person.remove();
        System.out.println("Elemento removido de la cola: " + quitado);
        System.out.println("El siguiente elemento que le sigue despues del anterior es: " + person.remove());
        // IsEmpty - Verificar si la cola está vacía
        boolean llenaOvacia = person.isEmpty();
        System.out.println("La cola esta o no vacia? " + llenaOvacia);

    }
    
       public static void listaPersonal(List<Integer> person){
        int i=0, e=0;
        while (i++ <20){
            System.out.println(i);
            
            if(i%4==0){
                System.out.println("El numero " +i+ " es multiplo de 4");
            }
            
            if(i%6==0){
                System.out.println("El numero " +i+ " es multiplo de 6");
            }
        }
    }
}
