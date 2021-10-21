/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deck2;

import java.util.*;

public class Deck2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;
        
        Card card = new Card();
        int PALOS = card.palo.length;
        int VALORES = card.valor.length;
        int COLORES = card.color.length;
        int N = PALOS * VALORES * COLORES; 

        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < VALORES; i++) {
            for (int j = 0; j < PALOS; j++) {
                deck.add(card.palo[j]+ ", Rojo , " + card.valor[i]);
                deck.add(card.palo[j]+ ", Negro , " + card.valor[i]);
        }
        
        while(!salir){
            System.out.println("Bienvenido a Poker!");
            System.out.println("Selecciona una opcion: \n1. Mezclar deck. \n2. Sacar una carta. \n3. Carta al azar. \n4. Generar una mano de 5 cartas. \n0. Salir.");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Se mezclo el deck");
                    break;
                    
                case 2:
                    System.out.println(deck.get(0));
                    deck.remove(0);
                    System.out.println("Quedan " + deck.size() + " cartas \n");
                    break;
                    
                case 3: 
                    Random aleatorio = new Random();
                    System.out.println(deck.get(aleatorio.nextInt(deck.size())));
                    deck.remove(aleatorio.nextInt(deck.size()));
                    System.out.println("Quedan " + deck.size() + " cartas\n");
                    break;
                    
                case 4: 
                    for(int i = 0; i<4; i++){
                        System.out.println(deck.get(i));
                    }
                    for(int i = 0; i<4; i++){
                        deck.remove(i);
                    }
                    System.out.println("Quedan " + deck.size() + " cartas");
                    break;
                    
                case 0:
                    salir = true;
                    break;
            }
        }
    }
    
}
