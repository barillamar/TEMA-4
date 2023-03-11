package com.example.condicionales;

public class tema4 {
    public static void main(String[] args) {
        var numeroIf = -16;

        if (numeroIf < 0) {
            System.out.println(numeroIf +  " es un número negativo.");
        } else if (numeroIf == 0) {
            System.out.println(numeroIf + " es un cero.");
        } else {
            System.out.println(numeroIf + " es un número positivo");
        }

        var numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile = 0;

        do {
            ++numeroDoWhile;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("La variable número for es igual a " + numeroFor);
        }
        var estacion = "SPAGETTI";

        switch (estacion) {
            case "INVIERNO":
                System.out.println("Estamos en " + estacion);
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en " + estacion);
                break;
            case "VERANO":
                System.out.println("Estamos en " + estacion);
                break;
            case "OTOÑO":
                System.out.println("Estamos en " + estacion);
                break;
            default:
                System.out.println(estacion + " no es una estacion");
        }
        }
    }


