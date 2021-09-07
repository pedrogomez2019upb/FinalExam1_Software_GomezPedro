package edu.upb.software.finalExam1.Punto2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        CODIGO DE PRUEBA
        Personaje prototipoHeroe = new Heroe("Superman","x",170,64,"Astuto","Volar");
        ArrayList personajes = new ArrayList();
         */
        FabricaPersonaje fp ;
        Heroe heroe;
        Monstruo monstruo ;
        Principe principe;
        Villano villano;
        boolean seguir = true;
        ArrayList<String> listaPersonajes=new ArrayList<>() ;
        Scanner sc= new Scanner (System.in);
        int i=0;
        while(seguir==true){
            System.out.println("\n###########################");
            System.out.println("\nFabrica de Personajes");
            System.out.println("\n###########################");
            System.out.println("\nBienvenido a la fabrica de personajes.\nSelecciona el personaje que quieras crear o si quieres puedes seleccionar un personaje en las siguientes opciones:");
            System.out.println("\n1.Heroe");
            System.out.println("\n2.Monstruo");
            System.out.println("\n3.Principe");
            System.out.println("\n4.Villano");
            System.out.println("\n5. Seleccionar Personaje");
            int option =0;
            option=sc.nextInt();
            if(option==1){
                String tipo="Heroe";
                System.out.println("\n###########################");
                System.out.println("\nPersonaje: Heroe");
                System.out.println("\n###########################");
                System.out.println("\nIngresa el nombre de tu personaje:");
                String nombre= sc.next();
                System.out.println("\nIngresa su imagen:");
                String imagen=sc.next();
                System.out.println("\nIngresa la altura de tu personaje:");
                int altura=sc.nextInt();
                System.out.println("\nIngresa el peso de tu personaje:");
                int peso= sc.nextInt();
                System.out.println("\nIngresa la inteligencia de tu personaje:");
                String inteligencia = sc.next();
                System.out.println("\nIngresa la habilidad de tu personaje:");
                String habilidad=sc.next();
                fp= new FabricaPersonaje(new Heroe(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Monstruo(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Principe(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Villano(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i));
                heroe=fp.crearHeroe();
                listaPersonajes.add(i,heroe.toString());
                i++;
                System.out.println("\n###########################");
                System.out.println(heroe);
                System.out.println("\n###########################");
                System.out.println("\nQuieres seguir en el programa?Si=1,No=2");
                int continuar = sc.nextInt();
                if(continuar==1){
                    continue;
                }
                else{
                    seguir=false;
                }
            }
            else if(option==2){
                String tipo="Heroe";
                System.out.println("\n###########################");
                System.out.println("\nPersonaje: Monstruo");
                System.out.println("\n###########################");
                System.out.println("\nIngresa el nombre de tu personaje:");
                String nombre= sc.next();
                System.out.println("\nIngresa su imagen:");
                String imagen=sc.next();
                System.out.println("\nIngresa la altura de tu personaje:");
                int altura=sc.nextInt();
                System.out.println("\nIngresa el peso de tu personaje:");
                int peso= sc.nextInt();
                System.out.println("\nIngresa la inteligencia de tu personaje:");
                String inteligencia = sc.next();
                System.out.println("\nIngresa la habilidad de tu personaje:");
                String habilidad=sc.next();
                fp= new FabricaPersonaje(new Heroe(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Monstruo(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Principe(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Villano(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i));
                monstruo=fp.crearMonstruo();
                listaPersonajes.add(i,monstruo.toString());
                i++;
                System.out.println("\n###########################");
                System.out.println(monstruo);
                System.out.println("\n###########################");
                System.out.println("\nQuieres seguir en el programa?Si=1,No=2");
                int continuar = sc.nextInt();
                if(continuar==1){
                    continue;
                }
                else{
                    seguir=false;
                }
            }
            else if(option==3){
                String tipo="Heroe";
                System.out.println("\n###########################");
                System.out.println("\nPersonaje: Principe");
                System.out.println("\n###########################");
                System.out.println("\nIngresa el nombre de tu personaje:");
                String nombre= sc.next();
                System.out.println("\nIngresa su imagen:");
                String imagen=sc.next();
                System.out.println("\nIngresa la altura de tu personaje:");
                int altura=sc.nextInt();
                System.out.println("\nIngresa el peso de tu personaje:");
                int peso= sc.nextInt();
                System.out.println("\nIngresa la inteligencia de tu personaje:");
                String inteligencia = sc.next();
                System.out.println("\nIngresa la habilidad de tu personaje:");
                String habilidad=sc.next();
                fp= new FabricaPersonaje(new Heroe(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Monstruo(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Principe(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Villano(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i));
                principe=fp.crearPrincipe();
                listaPersonajes.add(i,principe.toString());
                i++;
                System.out.println("\n###########################");
                System.out.println(principe);
                System.out.println("\n###########################");
                System.out.println("\nQuieres seguir en el programa?Si=1,No=2");
                int continuar = sc.nextInt();
                if(continuar==1){
                    continue;
                }
                else{
                    seguir=false;
                }
            }
            else if(option==4){
                String tipo="Heroe";
                System.out.println("\n###########################");
                System.out.println("\nPersonaje: Villano");
                System.out.println("\n###########################");
                System.out.println("\nIngresa el nombre de tu personaje:");
                String nombre= sc.next();
                System.out.println("\nIngresa su imagen:");
                String imagen=sc.next();
                System.out.println("\nIngresa la altura de tu personaje:");
                int altura=sc.nextInt();
                System.out.println("\nIngresa el peso de tu personaje:");
                int peso= sc.nextInt();
                System.out.println("\nIngresa la inteligencia de tu personaje:");
                String inteligencia = sc.next();
                System.out.println("\nIngresa la habilidad de tu personaje:");
                String habilidad=sc.next();
                fp= new FabricaPersonaje(new Heroe(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Monstruo(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Principe(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i),new Villano(tipo,nombre,imagen,altura,peso,inteligencia,habilidad,i));
                villano=fp.crearVillano();
                listaPersonajes.add(i,villano.toString());
                i++;
                System.out.println("\n###########################");
                System.out.println(villano);
                System.out.println("\n###########################");
                System.out.println("\nQuieres seguir en el programa?Si=1,No=2");
                int continuar = sc.nextInt();
                if(continuar==1){
                    continue;
                }
                else{
                    seguir=false;
                }
            }
            else if(option==5){
                System.out.println("\n###########################");
                System.out.println("\nSeleccionar Personaje");
                System.out.println("\n###########################");
                System.out.println("Por favor ingresa la posición(index) retornado al momento de crear el personaje");
                int posicion=sc.nextInt();
                String personaje=listaPersonajes.get(posicion);
                System.out.println("\n###########################");
                System.out.println("\nPersonaje Obtenido:");
                System.out.println(personaje);
                System.out.println("\n###########################");
                System.out.println("\nQuieres seguir en el programa?Si=1,No=2");
                int continuar = sc.nextInt();
                if(continuar==1){
                    continue;
                }
                else{
                    seguir=false;
                }
            }
        }
        //System.out.println(listaPersonajes);
    }
}
