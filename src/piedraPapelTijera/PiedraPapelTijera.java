package piedraPapelTijera;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		String usuario;
		
		System.out.println("Cachipun contra la maquina");

		do {
			System.out.println("Seleccione una opcion(piedra, papel, tijera o salir para terminar con el juego): ");

			usuario = s.nextLine();

			String[] maquina = { "piedra", "papel", "tijera", "piedra"};

			Random randomObject = new Random();
			int randomInt = randomObject.nextInt(maquina.length);

			System.out.println("usuario = " + usuario);
			System.out.println("maquina = " + maquina[randomInt]);

			switch (usuario) {

			case "piedra":
				if (usuario == "piedra" ||  maquina[randomInt] == "tijera") {
					System.out.println("\nganaste, la piedra vence a la tijera");
				} else if (usuario == "piedra" | maquina[randomInt] == "piedra") {
					System.out.println("\npiedra contra piedra es un empate!!!, juega denuevo");
				} else if (usuario == "piedra" ||  maquina[randomInt] == "papel") {
					System.out.println("\nperdiste!!!, el papel vence a la piedra");
				}
				break;

			case "tijera":
				if (usuario == "tijera" || maquina[randomInt] == "tijera") {
					System.out.println("\ntijera contra tijera es un empate!!!, juega denuevo");
				} else if (usuario == "tijera"|| maquina[randomInt] == "piedra") {
					System.out.println("\nperdiste!!!, la piedra vence a la tijera");
				} else if (usuario == "tijera" || maquina[randomInt] == "papel") {
					System.out.println("\nganaste, la tijera vence al papel");
				}
				break;
			case "papel":
				if (usuario == "papel" || maquina[randomInt] == "papel") {
					System.out.println("\npapel contra papel es un empate!!!, juega denuevo");
				} else if (usuario == "papel" || maquina[randomInt] == "tijera") {
					System.out.println("\nperdiste!!!, la tijera vence al papel");
				} else if (usuario == "papel" || maquina[randomInt] == "piedra") {
					System.out.println("\nganaste, el papel vence a la piedra");
				}
				break;

			case "salir":
				System.out.println("\nSaliendo del juego\nNos vemos luego!!!");
				System.exit(-1);
				break;

			default:
				System.out.println("\nError!, debe ingresar 'piedra', 'papel', 'tijera' o 'salir'");
			}
		} while (usuario != "salir");

		s.close();
	}
}
