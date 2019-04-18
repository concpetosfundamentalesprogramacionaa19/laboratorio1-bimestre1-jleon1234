/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author JuanPablo
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        int horasTrabajadas;
        double precioHoras;
        double sueldo;
        double sueldoPagar;
        double descuento;
        
        System.out.println("Ingrese el nombre del trabajador \n");
        nombre = entrada.nextLine();
        System.out.println("Ingrese las horas Trabajadas\n");
        horasTrabajadas = entrada.nextInt();
        System.out.println("Ingrese el precio por horas");
        precioHoras = entrada.nextDouble();
 
        
        
        sueldo = horasTrabajadas * precioHoras;
        descuento = sueldo * 0.10;
        sueldoPagar = sueldo - descuento;
        
        System.out.printf("El valor a pagar a %s es de %.2f\n", nombre, sueldoPagar);
        
        
        
    }
    
}
