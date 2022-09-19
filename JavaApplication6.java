/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Betos
 */
//usuario colocando el mes del año en numero y me va decir la estacion
        int mes = 7;
        // las estaciones
        String estacion;
        
        switch (mes) {
            case 6: case 7:  case 8: 
                //Sentencia o instrucciones
                estacion = "Verano";
                break;//Rompe el ciclo
            case 9: case 10:  case 11: 
                //Sentencia o instrucciones
                estacion = "Otoño";
                break;
              case 1: case 2:  case 12:
                //Sentencia o instrucciones
                estacion = "Invierno";
                break;
            default:
                estacion = "Mes Invalido";
                break;

        }
        System.out.println(estacion);
        
    }

