package laboratoriodos;

import java.util.Scanner;

public class Cano_Daniel_E1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("- - - - - - - - - - - - - ");
            System.out.println(" Menu de Opciones:");
            System.out.println("1. PIRAMIDE ");
            System.out.println("2. EL MAYOR ");
            System.out.println("3. Caja Digital");
            System.out.println("4. CARACTERES VOCALES.");
            System.out.println("5. SALIR");
            System.out.println("- - - - - - - - - - - - - ");
            
            opcion = lea.nextInt();
            lea.nextLine();

            if (opcion == 1) {
                
                System.out.print("Ingrese la cantidad de filas para la piramide: ");
                int totalFilas = lea.nextInt();
                int numeroImpar = 1;

                for (int filaActual = 1; filaActual <= totalFilas; filaActual++) {
                    int sumaFila = 0;

                    for (int numEnFila = 1; numEnFila <= filaActual; numEnFila++) {
                        System.out.print(numeroImpar + " ");
                        sumaFila += numeroImpar;
                        numeroImpar += 2;
                    }

                    System.out.println("= " + sumaFila);
                }
                
            } else if (opcion == 2) {

                int numero;
                int mayor = Integer.MIN_VALUE;
                int suma = 0;
                int contador = 0;
                String continuar;

                do {
                    System.out.print("Ingresa un numero entero: ");
                    
                    while (!lea.hasNextInt()) {
                        System.out.print("Error, ingresa un numero entero: ");
                        lea.next();  
                    }
                    
                    numero = lea.nextInt();

                    if (numero > mayor) {
                        mayor = numero;
                    }

                    suma += numero;
                    contador++;

                    System.out.print("Quieres ingresar otro numero? (S/N): ");
                    continuar = lea.next();
                    
                } while (continuar.equalsIgnoreCase("S"));

                double promedio = (double) suma / contador;

                System.out.println("El numero mayor ingresado es: " + mayor);
                System.out.println("El promedio de los numeros ingresados es: " + promedio);

            } else if (opcion == 3) {

                System.out.print("Nombre del cliente: ");
                String nombreCliente = lea.nextLine();
                
                int normales = 0;
                int hd = 0;
                int subtotal = 0;
                String tipoCaja;
                String tipoCanal;
                String continuarCanal;
                
                do {
                    System.out.print("Tipo de canal (HD/NORMAL): ");
                    tipoCanal = lea.nextLine().toUpperCase();
                    
                    if (tipoCanal.equals("HD")) {
                        hd++;
                        subtotal += 30; 
                    } else if (tipoCanal.equals("NORMAL")) {
                        normales++;
                        subtotal += 20;
                    } else {
                        System.out.println("Tipo de canal no valido.");
                    }
                    
                    System.out.print("Desea ingresar otro canal? (S/N): ");
                    continuarCanal = lea.nextLine();
                    
                } while (continuarCanal.equalsIgnoreCase("S"));
                
                System.out.print("Tipo de Caja Digital (LIGHTBOX/HDBOX/DVRBOX): ");
                tipoCaja = lea.nextLine().toUpperCase();
                
                int costoCaja = 0;
                String nombresito = "";
                if (tipoCaja.equals("LIGHTBOX")) {
                    nombresito = "LIGHTBOX";
                    costoCaja = 50;
                    
                } else if (tipoCaja.equals("HDBOX")) {
                    nombresito = "HDBOX";
                    costoCaja = 100;
                    

                } else if (tipoCaja.equals("DVRBOX")) {
                    nombresito = "DVRBOX";
                    costoCaja = 150;
                

                } else {
                    System.out.println("Tipo de caja no valido.");
                }
                
                subtotal += costoCaja;
                double impuesto = 0.15 * subtotal;
                double total = subtotal + impuesto;
                
                System.out.println("- - - - - - Factura - - - - - -");
                System.out.println("Cantidad de canales NORMALES: " + normales);
                System.out.println("Cantidad de canales HD: " + hd);
                System.out.println("Tipo de caja digital: " + nombresito);
                System.out.println("Subtotal a pagar: " + subtotal + " lps");
                System.out.println("Impuesto (15%): " + impuesto + " lps");
                System.out.println("Total a pagar del cliente: " + total + " lps");

            } else if (opcion == 4) {
               System.out.print("Ingrese una cadena: ");
                String cadena = lea.nextLine();

                 int conteoVocales = 0;

                 for (int indice = 0; indice < cadena.length(); indice++) {
                    char caracter = cadena.charAt(indice);

                     switch (caracter) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            conteoVocales++;
                            
                             ;
                    }
                }

                 System.out.println("Numero de vocales minusculas: " + conteoVocales);
                
                
                
            } else if (opcion ==5) {
                System.out.println("Saliendo . . . . . ....");
                
            } else {
               
                System.out.println("Del 1-5 inge");
            }
            
        } while (opcion != 5); 
        
        
    }
}
