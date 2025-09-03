package ui;

import java.util.Locale;
import java.util.Scanner;

import model.Controller;

public class Main {

    private Controller controller;
    private Scanner sc;


    public static void main(String[] args) {
        Main Start = new Main();
        Start.init();
    }

    public void init() {
        this.sc = new Scanner(System.in).useLocale(Locale.US);
        int nType;
        System.out.println("ingrese la cantidad de tipos pokemon");
        nType = sc.nextInt();
        sc.nextLine();
        String[] types = new String[nType];
        for(int i= 0; i < types.length; i++){
            System.out.println("ingrese el nombre del tipo "+ (i+1) + " de los pokemones");
            String nametype = sc.nextLine();
            types[i]= nametype;
        }
        System.out.println("Ingrese el numero de pokemones que quiere registrar");
        int numberPokemon = sc.nextInt();
        sc.nextLine();

        // Initialize the controller
        controller = new Controller(numberPokemon);

        for (int i = 0; i < numberPokemon; i++) {
            System.out.print("Ingrese el nombre del pokemon " + (i + 1) + ": ");
            String namePokemon = sc.nextLine();
            System.out.print("Ingrese de que tipo es el pokemon " + (i + 1) + ": ");
            String pokemonType = sc.nextLine();
            System.out.print("Ingrese la habilidad del pokemon " + (i+1) + ": ");
            String abilityPokemon = sc.nextLine();
            controller.addPokemon(i, namePokemon, pokemonType, abilityPokemon);
        }

        // Now you can use the controller to interact with the model
        for (int i = 0; i < controller.getPokemons().length; i++) {
            System.out.println("Nombre: " + controller.getPokemon(i).getName() + " - tipo: " + controller.getPokemon(i).getType()+ " - Habilidad: " + controller.getPokemon(i).getAbility());
        }
    }

}