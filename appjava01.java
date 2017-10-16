/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmorales;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class supermercado14 {
    public static void main(String[] args) {
        
        int [][] lacteos = {{1, 500}, {2, 50}};
        int [][] licores = {{1, 200}, {2, 500}};
        int pedido[][] = new int[10][3];
        
        int op_g, op_l, op_li, cant, i, total, totalfila;
        total=0;
        totalfila=0;
        i=0;
        op_g = 0;
        op_l = 0;
        op_li = 0;
                
        Scanner entrada = new Scanner(System.in);
        
        while (op_g != 10) {
        
        System.out.println("Bienvenido a la aplicacion de 'El 14' ");
        System.out.println("Elige entre las siguientes categorias");
        System.out.println("1: Lacteos");
        System.out.println("2: Licores");
        System.out.println("10: Terminar pedido");
        
        op_g = entrada.nextInt();
        
            switch (op_g) {
                
                case 1 : 
                    while (op_l != 10) {
                    
                    System.out.println("Estas en la categoria lacteos");
                    System.out.println("1: leche");
                    System.out.println("2: yogurt");
                    System.out.println("10: regresar al menu principal");
                    
                    op_l = entrada.nextInt();
                    
                    
                        switch (op_l) {

                            case 1: // leche
                                
                                System.out.println("El precio de la leche es: "+lacteos[0][1]);
                                System.out.println("Ingresa la cantidad (cajas tetrapack)");
                                cant = entrada.nextInt();
                                
                                pedido[i][0] = i; // id=0
                                
                                pedido[i][1] = lacteos[0][1];
                                
                                pedido[i][2] = cant;
                                
                                i++;
                                       
                                System.out.println("Has ingresado el producto");

                            break;

                            case 2 :  // yogurt
                                
                                System.out.println("El precio del yogurt es: "+lacteos[1][1]);
                                System.out.println("Ingresa la cantidad (cajas tetrapack)");
                                cant = entrada.nextInt();
                                
                                pedido[i][0] = i; // id=0
                                
                                pedido[i][1] = lacteos[0][1];
                                
                                pedido[i][2] = cant;
                                
                                i++;
                                       
                                System.out.println("Has ingresado el producto");

                            break;
                            
                            default:

                                System.out.println("error sub");   
                                
                    
                    
                    
                    } // fin switch op_l
                    
                    
                            
                    
                    
                    } // while menu lacteos
                    
                    
                    
                    break;
                    
                case 2 : 
                    while (op_li != 10) {
                    
                    System.out.println("Estas en la categoria lacteos");
                    System.out.println("1: cerveza");
                    System.out.println("2: vino");
                    System.out.println("10: regresar al menu principal");
                    
                    op_li = entrada.nextInt();
                    
                    
                        switch (op_li) {

                            case 1: // cerveza
                                
                                System.out.println("El precio de la cerveza es: "+licores[0][1]);
                                System.out.println("Ingresa la cantidad de latas");
                                cant = entrada.nextInt();
                                
                                pedido[i][0] = i; // id=0
                                
                                pedido[i][1] = licores[0][1];
                                
                                pedido[i][2] = cant;
                                
                                i++;
                                       
                                System.out.println("Has ingresado el producto");

                            break;

                            case 2 :  // vino
                                
                                System.out.println("El precio del yogurt es: "+licores[1][1]);
                                System.out.println("Ingresa la cantidad de vino");
                                cant = entrada.nextInt();
                                
                                pedido[i][0] = i; // id=0
                                
                                pedido[i][1] = licores[0][1];
                                
                                pedido[i][2] = cant;
                                
                                i++;
                                       
                                System.out.println("Has ingresado el producto");

                            break;

                            default:

                            System.out.println("error sub");             
                                
                    
                    
                    
                    } // fin switch op_l
                    
                    
                            
                    
                    
                    } // while menu licores
                
                    break;                  
                
                    default:
                    
//                        System.out.println("error");       
                  
                   
                  
            
            
            } // swicht menu principal
        
        
        
        } // while menu principal
        
        for (int j = 0; j < pedido.length; j++) {
            
            totalfila = pedido[j][1] *  pedido[j][2];
            
            total = total + totalfila;
            
            
        }
        
        for (i = 0; i < pedido.length; i++) {
            
            System.out.println("Esta es la lista de tu pedido");
            System.out.println("Esta es la lista de tu pedido");
            
        }
        
        System.out.println("El valor total de la compra es: "+total);
        
        
    }
}
