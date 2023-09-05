package com.campusdual.redsocial;

import com.campusdual.redsocial.util.Input;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        boolean bandera = true;
        int opc;
        int elec;

        do {
            System.out.println("\nBIENVENIDOS A NUESTRA RED SOCIAL CAMPUSDUAL");
            System.out.println("\nElije la opcion que desee:");
            System.out.println("\n1. Añadir usuarios, posts y comentarios.");
            System.out.println("2. Dejar de seguir un usuario.");
            System.out.println("3. Comenzar a seguir un usuario.");
            System.out.println("4. Eliminar un usuario, un post o un comentario.");
            System.out.println("5. Listar todos los posts de un usuario.");
            System.out.println("6. Listar los comentarios de un usuario.");
            System.out.println("7. Mostrar el número de comentarios que tiene un post.");
            System.out.println("\n0. Salir");
            //System.out.print("\033[H\033[2J");
            System.out.flush();

            opc = Input.integer();
            switch (opc)
            {
                case 1:
                    System.out.println("\nElije la opcion que desee:");
                    System.out.println("\n1. Añadir usuario\n2. Añadir post\n3. Añadir comentario");
                    elec = Input.integer();
                    switch (elec)
                    {
                        case 1:
                            System.out.println("opcion 1.1");

                            pressAnyKeyToContinue();
                            break;
                        case 2:
                            System.out.println("opcion 1.2");
                            pressAnyKeyToContinue();
                            break;
                        case 3:
                            System.out.println("opcion 1.3");
                            pressAnyKeyToContinue();
                            break;
                        default:
                            System.out.println("Opciones validas: 1 / 2 / 3");
                    }
                    break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                case 4:
                    System.out.println("\nElije la opcion que desee:");
                    System.out.println("\n1. Eliminar usuario\n2. Eliminar post\n3. Eliminar comentario");
                    elec = Input.integer();
                    switch (elec)
                    {
                        case 1:
                            System.out.println("opcion 4.1");

                            pressAnyKeyToContinue();
                            break;
                        case 2:
                            System.out.println("opcion 4.2");
                            pressAnyKeyToContinue();
                            break;
                        case 3:
                            System.out.println("opcion 4.3");
                            pressAnyKeyToContinue();
                            break;
                        default:
                            System.out.println("Opciones validas: 1 / 2 / 3");
                    }
                    break;
                case 5:
                    System.out.println("opcion 5");
                    break;
                case 6:
                    System.out.println("opcion 6");
                    break;
                case 7:
                    System.out.println("opcion 7");
                    break;
                case 0:
                    bandera=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta, vuelve a intentarlo");
            }
        }while (bandera);
    }
    static public void pressAnyKeyToContinue()
    {
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Press Enter key to continue...");
        try
        {
            seguir = teclado.nextLine();
        }
        catch(Exception e)
        {}
    }

    static public void createData()
    {

    }
}
