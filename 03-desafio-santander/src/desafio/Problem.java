package desafio;

//Abaixo segue um exemplo de código que você pode ou não utilizar
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Problem {
	public static void main(String[] args) throws IOException {
		final Integer TWO = 2;
		final double PI = 3.14;
		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
		DecimalFormat df = new DecimalFormat("0.00");
		double V, D, R, area, altura;

//TODO: Complete os espaços em branco com uma possível solução para o desafio

		while (leitor.hasNext()) {
			V = leitor.nextDouble();
			D = leitor.nextDouble();
			R = D / TWO;
			area = PI * Math.pow(R, TWO);
			altura = V / area;
			System.out.println("ALTURA = " + df.format(altura));
			System.out.println("AREA = " + df.format(area));
		}
	}
}