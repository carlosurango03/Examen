package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombreCliente;
        String apellidoCliente;
        String cedulaCliente;
        String clienteEspecifico;
        double articulo ;
        double preciototal = 0.0;
        double precioArticulo = 5000.0;

        Scanner leer = new Scanner(System.in);

        //Proceso

        System.out.println("cual es tu nombre");
        nombreCliente = leer.nextLine();

        System.out.println("cual es tu apellido");
        apellidoCliente = leer.nextLine();

        System.out.println("puedes ingresar tu cedula");
        cedulaCliente = leer.nextLine();

        System.out.println("cliente regular/ vip");
        clienteEspecifico = leer.nextLine();
        System.out.println("cuantos productos compro?");
        articulo = leer.nextDouble();



        if (clienteEspecifico.equals("regular")& articulo==1 || articulo==2|| articulo==3) {
            articulo = 0.05;
        }else if (clienteEspecifico.equals("regular")){
            System.out.println("Digita si eres un cliente regular");
            preciototal=precioArticulo-articulo;
            System.out.println("el costo de compra es "+preciototal);

        }else if (clienteEspecifico.equals("regular")& articulo==4 || articulo==5|| articulo==6) {
            System.out.println("Digita si eres un cliente regular");
            articulo = 0.10;
            preciototal=precioArticulo-articulo;
            System.out.println("el costo de compra es"+preciototal);
        } else if (clienteEspecifico.equals("regular")& articulo==6 || articulo==7) {
            System.out.println("digita si eres cliente regular");
           articulo= 0.15;
           preciototal=precioArticulo-articulo;
            System.out.println("el costo de compra es"+preciototal);
        }


        if (cedulaCliente.equals("vip")& articulo==1 || articulo==2|| articulo==3){
            System.out.println("digita si eres cliente vip");
            clienteEspecifico =leer.nextLine();

        } else if (clienteEspecifico.equals("vip")& articulo==4|| articulo==5|| articulo==6) {
            System.out.println("digita si eres un cliente vip");
            articulo = 0.10;
            preciototal=precioArticulo-articulo;
            System.out.println("el costo de compra es"+preciototal);
        } else if (clienteEspecifico.equals("vip")) {
            System.out.println("digita si eres un cliente vip");
            articulo = 0.15;
            preciototal=precioArticulo-articulo;
            System.out.println("el costo de compra es"+preciototal);
        }else if (clienteEspecifico.equals("vip")){
            System.out.println("digita si eres un cliente vip");
            articulo = 0.20;
            preciototal=precioArticulo-articulo;
            System.out.println("el costo de compra es"+preciototal);
        }


    }
}