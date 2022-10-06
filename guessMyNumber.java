import java.util.Random;
import java.util.Scanner;

public class guessMyNumber {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int numScelto;
		int tentativi = 0;
		int num = r.nextInt();
		do {
			System.out.print("Prova a indovinare il numero: ");
			numScelto = in.nextInt();
			tentativi++;
			if (numScelto < num)
				System.out.println("Il numero inserito è minore di quello da indovinare!");
			else if (numScelto > num)
				System.out.println("Il numero inserito è maggiore di quello da indovinare!");
		} while (numScelto != num);

		System.out.println("Risposta esatta! Il numero di tentativi fatti è:" + tentativi + "");
	}

}
