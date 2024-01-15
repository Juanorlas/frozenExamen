package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leerDato= new Scanner(System.in);

        int precioHeladoSimple=8000;
        int precioHeladoDoble=12000;
        int precioHeladoEspecial=16000;
        System.out.println("Bienvenido a FROZEN");
        System.out.print("ingrese el nombre de usuario: ");
        String nombreAdministrador=leerDato.nextLine();
        System.out.print("señor "+nombreAdministrador+" Ingrese su Documento: ");
        String documentoAdministrador=leerDato.nextLine();

        System.out.println("Ingrese La Cantidad De Helados Simple Vendida");
        byte cantidadHeladoSimple=leerDato.nextByte();
        System.out.println("Ingrese La Cantidad De Helados Doble Vendida");
        byte cantidadHeladoDoble=leerDato.nextByte();
        System.out.println("Ingrese La Cantidad De Helados Especial Vendida");
        byte cantidadHeladoEspecial=leerDato.nextByte();

        int totalVentasSimple=precioHeladoSimple*cantidadHeladoSimple;
        int totalVentasDoble=precioHeladoDoble*cantidadHeladoDoble;
        int totalVentasEspecial=precioHeladoEspecial*cantidadHeladoEspecial;
        int totalVentasDia=totalVentasEspecial+totalVentasDoble+totalVentasSimple;
        System.out.println("La Cantidad De Helado Simple Vendida Es: $"+totalVentasSimple);
        System.out.println("La Cantidad De Helado Doble Vendida Es: $"+totalVentasDoble);
        System.out.println("La Cantidad De Helado Especial Vendida Es: $"+totalVentasEspecial);
        System.out.println("El Total De Ventas es: $"+ totalVentasDia);

        // Juan Diego Orlas Rengifo
        // Manuela Orlas Rengifo


    }
}