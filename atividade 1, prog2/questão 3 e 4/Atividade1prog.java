
public class Atividade1prog{
	public static void main(String args[]) throws Exception
	{
		int a = 10;
		int b = 20;
		System.out.println("valor 1: " + a + "\n" + "valor 2: " +b);
		comparavalor(a,b);
		decrescente(a);
	}
	
	public static int comparavalor(int valor1, int valor2) {
		if (valor1 > valor2) {
			System.out.println("maior valor: " + valor1);
			return valor1;
		}
		else if (valor1 < valor2) {
			System.out.println("maior valor: " + valor2);
			return valor2;
		}
		else{
			System.out.println("valores iguais: " + valor1);
			return 0;
		}
	}
	public static int decrescente(int valor) {
			System.out.println("ordem decrescente do valor " + valor);
			if (valor>0) {
				while (valor >= 0) {
					System.out.print(valor + " ");
					valor = valor - 1;
				} return valor;
			}
			else if (valor<0) {
				while (valor <= 0) {
					System.out.print(valor + " ");
					valor = valor + 1;;
				} return valor;
			}
			else {return 10000;}
	}
}
