import java.io.*;
import java.util.*;

public class PBL1 {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	double a_1 = 0;
	int n = 0;
	double r = 0;
	
	// criaçao das variaveis para calculos, e o scanner para ler o que o usuario ira digitar
	
	
	
	while(a_1 <= 1 && r <= 1 && n <= 1) {
		System.out.println("Digite o valor do primeiro termo PA (digite apenas valores positivos!): ");
		a_1 = leitor.nextDouble();
		System.out.println("Digite a razao da PA (digite apenas valores positivos!): ");
		r = leitor.nextDouble();
		System.out.println("Digite o numero de termos para a PA (digite apenas valores positivos!): ");
		n = leitor.nextInt();
	}
	// while utilizado para o usuario digitar apenas valores positivos
	double a_n = a_1 + (n - 1) * r;
	System.out.println("o ultimo termo do PA e: "+ a_n);
	double s_n = (a_1 + a_n) * n / 2;
	System.out.println("A soma de todos os valores do PA e: "+ s_n);
	
	// contas para exibir o resultado correto puxando variaveis digitadas pelo usuario e fazendo o calculo da PA
	
	}
	
}
