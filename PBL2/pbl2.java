import java.util.*;


public class pbl2 {
	public static void main(String[] args) {
		
		System.out.println("Integral por Trapézios");
		System.out.println("Descricao: ");
		System.out.println("Calcula a integral aproximada da função f(x) = 2 seno(x) + (cosseno(x))/3 em um\r\n"
				+ "intervalo [a,b] tal que f(x) ≥ 0, a ≤ x ≤ b, por meio da Regra do Trapézio\r\n"
				+ "Repetida.");
		
		// titulo com descricao do programa 
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		double a = scanner.nextDouble();
		System.out.println("Digite o valor de B: ");
		double b = scanner.nextDouble();
		
		while(true) {
			if(a <= b) {
				System.out.println("Digite o valor de N: ");
				int n = scanner.nextInt();
				while(true) {
					if(n > 0) {
						double area_total = 0;
						double x = a;
						double h = (b-a) / n;
						double y1 = (2 * Math.sin(x)) + (Math.cos(x) / 3);
						int i = 0;
						while(i < n) {
							x = x+h;
							double y2 = (2 * Math.sin(x)) + (Math.cos(x) / 3);
							double area_trapezio = ((y1 + y2) / 2) * h;
							area_total = area_total + area_trapezio;
							break;
						}
						System.out.println(area_total);
						
						
					}else {
						System.out.println("Erro: valor de A deve ser menor ou igual ao valor de B");
					}
				}
				} else {
				System.out.println("Erro: valor de A deve ser menor ou igual ao valor de B");
			}
		}
		
		// leitura dos valores das variaveis e da logica apresentada na documentaçao 

		
		
	}
}
