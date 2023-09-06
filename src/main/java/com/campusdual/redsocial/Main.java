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
                            System.out.println("Añadir nuevo usuario");
                            String username = Input.string();
                            Users newUser = new Users(username);
                            pressAnyKeyToContinue();
                            break;
                        case 2:
                            System.out.println("Añadir nuevo post");
                            String post = Input.string();

                            pressAnyKeyToContinue();
                            break;
                        case 3:
                            System.out.println("Añadir nuevo comentario");
                            pressAnyKeyToContinue();
                            break;
                        default:
                            System.out.println("Opciones validas: 1 / 2 / 3");
                    }
                    break;
                case 2:
                    System.out.println("Seguir a un nuevo usuario");

                    break;
                case 3:
                    System.out.println("Dejar de seguir a un usuario");
                    break;
                case 4:
                    System.out.println("\nElije la opcion que desee:");
                    System.out.println("\n1. Eliminar usuario\n2. Eliminar post\n3. Eliminar comentario");
                    elec = Input.integer();
                    switch (elec)
                    {
                        case 1:
                            System.out.println("Eliminar un usuario");

                            pressAnyKeyToContinue();
                            break;
                        case 2:
                            System.out.println("Eliminar un post");
                            pressAnyKeyToContinue();
                            break;
                        case 3:
                            System.out.println("Eliminar un comentario");
                            pressAnyKeyToContinue();
                            break;
                        default:
                            System.out.println("Opciones validas: 1 / 2 / 3");
                    }
                    break;
                case 5:
                    System.out.println("Listar posts de un usuario");
                    //----------------list post for one user-------------------
                    user1.listPosts();
                    break;
                case 6:
                    System.out.println("Listar comentarios de un usuario");
                    break;
                case 7:
                    System.out.println("Mostrar numero de comentarios que tiene un post");
                    //-----------------show Comments for Post-----------------
                    user01.numberComments(post1);
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

    static public void funtionalities()
    {
        //----------------show wall for one user-------------------
        System.out.println("Muro de Usuario1:");
        user1.showWall();

        //----------------Suggest Mutual Friends---------------------
        List<Users> suggest = user1.suggestMutualFriends(user2);
        System.out.println("Sugerencias de amistad para Usuario1:");
        for (Users sug : suggest) {
            System.out.println(sug.getUsername());
        }
    }
    static public void createData()
    {
        //----------------Create Users--------------------
        Users user01 = new Users("Juan Luna");
        Users user02 = new Users("Andres Martinez");
        Users user03 = new Users("Maria Alvarez");
        Users user04 = new Users("Angel Sanchez");
        Users user05 = new Users("Susana Castillo");
        Users user06 = new Users("Jorge Blanco");
        Users user07 = new Users("Merly Moreno");
        Users user08 = new Users("Ricardo Mendoza");
        Users user10 = new Users("Victoria Sarmiento");
        Users user09 = new Users("Felipe Losada");
        Users user11 = new Users("Sandra Garcia");
        Users user12 = new Users("Sergio Suarez");
        Users user13 = new Users("Ana Vila");
        Users user14 = new Users("Uxia Perez");
        Users user15 = new Users("Viviana Cordoba");
        Users user16 = new Users("Manuel Trujillo");
        Users user17 = new Users("Teresa Sevilla");
        Users user18 = new Users("Yolanda Hurtado");
        Users user19 = new Users("Francisco Gomez");
        Users user20 = new Users("Cristian Galan");

        //----------------Follow-Users--------------------
        user01.followUser(user02);
        user02.followUser(user03);
        user03.followUser(user04);
        user04.followUser(user05);
        user05.followUser(user06);
        user06.followUser(user07);
        user07.followUser(user08);
        user08.followUser(user09);
        user09.followUser(user10);
        user01.followUser(user11);
        user02.followUser(user12);
        user03.followUser(user13);
        user04.followUser(user14);
        user05.followUser(user15);
        user06.followUser(user16);
        user07.followUser(user17);
        user08.followUser(user18);
        user09.followUser(user19);
        user01.followUser(user20);
        user02.followUser(user01);
        user03.followUser(user02);
        user04.followUser(user03);
        user05.followUser(user04);
        user06.followUser(user05);
        user07.followUser(user06);
        user08.followUser(user07);
        user09.followUser(user08);
        user01.followUser(user09);
        user02.followUser(user10);
        user03.followUser(user11);
        user04.followUser(user12);
        user05.followUser(user13);
        user06.followUser(user14);
        user07.followUser(user15);
        user08.followUser(user16);
        user09.followUser(user17);
        user01.followUser(user18);
        user02.followUser(user19);
        user03.followUser(user20);
        user04.followUser(user01);
        user05.followUser(user02);
        user06.followUser(user03);
        user07.followUser(user04);
        user08.followUser(user05);
        user09.followUser(user06);
        user01.followUser(user07);
        user02.followUser(user08);
        user03.followUser(user09);
        user04.followUser(user10);
        user05.followUser(user11);
        user06.followUser(user12);
        user07.followUser(user13);
        user08.followUser(user14);
        user09.followUser(user15);

        //---------------Create and Add Posts--------------
        Posts post01 = new Posts("",user01.getUsername());
        Posts post02 = new Posts("",user02.getUsername());
        Posts post03 = new Posts("",user03.getUsername());
        Posts post04 = new Posts("",user04.getUsername());
        Posts post05 = new Posts("",user05.getUsername());
        Posts post06 = new Posts("",user06.getUsername());
        Posts post07 = new Posts("",user07.getUsername());
        Posts post08 = new Posts("",user08.getUsername());
        Posts post09 = new Posts("",user09.getUsername());
        Posts post10 = new Posts("",user01.getUsername());
        Posts post12 = new Posts("",user02.getUsername());
        Posts post13 = new Posts("",user03.getUsername());
        Posts post14 = new Posts("",user04.getUsername());
        Posts post15 = new Posts("",user05.getUsername());
        Posts post16 = new Posts("",user06.getUsername());
        Posts post17 = new Posts("",user07.getUsername());
        Posts post18 = new Posts("",user08.getUsername());
        Posts post19 = new Posts("",user09.getUsername());
        Posts post20 = new Posts("",user07.getUsername());
        Posts post21 = new Posts("",user08.getUsername());
        Posts post22 = new Posts("",user01.getUsername());
        Posts post23 = new Posts("",user02.getUsername());
        Posts post24 = new Posts("",user03.getUsername());
        Posts post25 = new Posts("",user04.getUsername());
        Posts post26 = new Posts("",user05.getUsername());
        Posts post27 = new Posts("",user06.getUsername());
        Posts post28 = new Posts("",user07.getUsername());

        //---------------Add Posts to User--------------
        user01.addPost(post01);
        user02.addPost(post02);
        user03.addPost(post03);
        user04.addPost(post04);
        user05.addPost(post05);
        user06.addPost(post06);
        user07.addPost(post07);
        user08.addPost(post08);
        user09.addPost(post09);
        user01.addPost(post10);
        user02.addPost(post12);
        user03.addPost(post13);
        user04.addPost(post14);
        user05.addPost(post15);
        user06.addPost(post16);
        user07.addPost(post17);
        user08.addPost(post18);
        user09.addPost(post19);
        user07.addPost(post20);
        user08.addPost(post21);
        user01.addPost(post22);
        user02.addPost(post23);
        user03.addPost(post24);
        user04.addPost(post25);
        user05.addPost(post26);
        user06.addPost(post27);
        user07.addPost(post28);

        //----------------Add Comments--------------------
        Comments comment01 = new Comments("Primer comentario jajaja",user1);
        Comments comment02 = new Comments("Y tambien el segundo comentario jajaja",user1);
        Comments comment03 = new Comments("Hola soy nuevo, contexto plis",user2);
        Comments comment04 = new Comments("XD XD XD XD",user1);
        Comments comment05 = new Comments("jajaja",user1);
        Comments comment06 = new Comments("Un saludo",user2);
        Comments comment07 = new Comments("Que interesante son tus ultimos post",user1);
        Comments comment08 = new Comments("Increible!!!",user1);
        Comments comment09 = new Comments("Espero sigas subiendo contenido",user2);
        Comments comment10 = new Comments("Me gusta la presentacion",user1);
        Comments comment11 = new Comments("Quien son? No me suenan",user1);
        Comments comment12 = new Comments("Cuales son los ingredientes?",user2);
        Comments comment13 = new Comments("Deberias mirar este post @user",user1);
        Comments comment14 = new Comments("Me siento identificado",user1);
        Comments comment15 = new Comments("La implementacion es muy compleja? o es intuitiva",user2);
        Comments comment16 = new Comments("Como puedo participar?",user1);
        Comments comment17 = new Comments("Alguien vio el fallo en la imagen?",user1);
        Comments comment18 = new Comments("Buen programa me lo guardo",user2);
        Comments comment19 = new Comments("Primer comentario jajaja",user1);
        Comments comment20 = new Comments("Y tambien el segundo comentario jajaja",user1);
        Comments comment21 = new Comments("Hola soy nuevo, contexto plis",user2);
        Comments comment22 = new Comments("Primer comentario jajaja",user1);
        Comments comment23 = new Comments("Y tambien el segundo comentario jajaja",user1);
        Comments comment24 = new Comments("Hola soy nuevo, contexto plis",user2);
        Comments comment25 = new Comments("Primer comentario jajaja",user1);
        Comments comment26 = new Comments("Y tambien el segundo comentario jajaja",user1);
        Comments comment27 = new Comments("Hola soy nuevo, contexto plis",user2);
        Comments comment28 = new Comments("Primer comentario jajaja",user1);
        Comments comment29 = new Comments("Y tambien el segundo comentario jajaja",user1);
        Comments comment30 = new Comments("Hola soy nuevo, contexto plis",user2);

        post1.addComments(comment1);
        post1.addComments(comment2);
        post2.addComments(comment3);
    }


}
