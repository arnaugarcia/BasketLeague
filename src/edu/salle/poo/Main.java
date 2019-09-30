package edu.salle.poo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    Jugador lebronJames = new Jugador(
	            "Lebron James",
                LocalDate.of(1984, 12, 30),
                "United States",
                203,
                110.0f,
                "Base");

	    Entrenador entrenador = new Entrenador(
	            "Entrenador 1",
                LocalDate.of(1984, 12, 30),
                "Spain",
                LocalDate.now(),
                100);

        System.out.println(lebronJames);
        System.out.println(entrenador);

    }
}
