/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacajeromodificado;

import java.util.Scanner;

/**
 *
 * @author Fabricio Laureano
 */
public class TareaCajeroModificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        
//Inicializar el objeto Scanner con su constructor (pasamos el System Input)
        int dineroSolicitado=0;
        final int BILLETES[]= {500,200,100,50,20,10,5,2,1};
        int billetesEntregados[] = new int[BILLETES.length];
        int billetesRecargados[] = new int[BILLETES.length];
        int contadorRecarga=0;
        int contadorRetiro=0;
        int dineroEntregado=0,dineroRestante=0;
        int limiteDiarioDeRetiro=10000;
       // int miBalance=10000;   // le agregue este 
        int opcion = 0; // le agregue este 
        int dineroRecargado; // este 
       
      do{     
        System.out.println("***SELECCIONE UNA OPCION DEL MENU****");
        System.out.println("1. Recargar");
        System.out.println("2. Retirar");
        System.out.println("3. Historial de transacciones");
        System.out.println("4. Salir");
        
         System.out.println("Que opcion desea hacer?");
        opcion= entrada.nextInt();
     
        switch (opcion){
            case 1:
       System.out.println("Ingrese la cantidad de dinero que va a recargar: ");
        dineroRecargado=entrada.nextInt();
                
                dineroRestante=dineroRecargado;
                
        for(int x=0;x<BILLETES.length;x++){
            if(dineroRestante>=BILLETES[x]){
                billetesRecargados[x]= dineroRestante/BILLETES[x];  //Conocer cuantos billetes entrego de esta denominacion
                dineroEntregado=billetesRecargados[x]*BILLETES[x];  //Dinero entregando con estos billetes
                dineroRestante-=dineroEntregado;                    //Restar esa cifra para saber cuanto me falta pagar
                contadorRecarga++;
            }else{
                billetesRecargados[x]=0;
            }
            //contadorRecarga++;
            
            System.out.println("Billetes de "+BILLETES[x]+" entregados: " + billetesRecargados[x] + " DINERO Recargado: " + dineroRecargado + " DINERO Restante: " + dineroRestante);
            dineroEntregado=0;
        }
        break;
        
      
        
            case 2:
                System.out.println("La cantidad limite de retiro diario no debe exceder a 10,000");
                System.out.println("Ingrese la cantidad que desea retirar: ");
             dineroSolicitado=entrada.nextInt(); 
             if(dineroSolicitado<limiteDiarioDeRetiro){
             
             dineroRestante=dineroSolicitado;
                contadorRetiro++;

        for(int x=0;x<BILLETES.length;x++){
            if(dineroRestante>=BILLETES[x]){
                billetesEntregados[x]= dineroRestante/BILLETES[x];  //Conocer cuantos billetes entrego de esta denominacion
                dineroEntregado=billetesEntregados[x]*BILLETES[x];  //Dinero entregando con estos billetes
                dineroRestante-=dineroEntregado;                    //Restar esa cifra para saber cuanto me falta pagar
            }else{
                billetesEntregados[x]=0;
            }
            System.out.println("Billetes de "+BILLETES[x]+" entregados: " + billetesEntregados[x] + " DINERO Entregado: " + dineroEntregado + " DINERO Restante: " + dineroRestante);
            dineroEntregado=0;
              }
             }
             else{
              System.out.println("Monto diario de retiro excedido. Ingrese una cantidad menor a 10,000");

             }
        break;
        
            case 3:
                
                System.out.println("Ha recargado: " + contadorRecarga + " veces");
                System.out.println("Ha retirado: " + contadorRetiro + " veces");

                
        
            case 4:
                System.out.println("Gracias por usar nuestros servicios. Vuelva pronto! :) ");
}
        
        }
        
      while(opcion!=4);

        
}

} 
    

