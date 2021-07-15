
public class atv1prog {
	private double valor;
	
	public atv1prog(double valor) {this.setValor(valor);}
	
	public atv1prog() {this.valor=0;}
	
	public void setValor(double valor) {this.valor = valor;}
	
	public double getValor() {return this.valor;}
	
	public static void main(String args[]) throws Exception
	{
	double a = 30;
	impar(a);
	par(a);
	
	atv1prog v1al = new atv1prog(10);
	atv1prog v2al = new atv1prog(20);
	
	System.out.println("v1al:" + v1al.getValor());
	System.out.println("v2al:" + v2al.getValor());
	
	troca(v1al,v2al);
	
	System.out.println("v1al(troca):" + v1al.getValor());
	System.out.println("v2al(troca):" + v2al.getValor());
	//atividade:
	double v1 = 10;
	double v2 = 20;
	double aux = v1;
	v1 = v2;
	v2 = aux;
	System.out.println("v1:" + v1);
	System.out.println("v2:" + v2);
	
	double v3 = 15;
	double v4 = 30;
	v3 = v3 + v4;
	v4 = v3 - v4;
	v3 = v3 - v4;
	System.out.println("v3:" + v3);
	System.out.println("v4:" + v4);
	//atividade.
	}
	public static void impar(double valor) {
		double n = 0;
		while (valor >= 1) {
			if (valor%2!=0) {
				n = n + valor;
				//System.out.println("soma:" + n);
				}
			//System.out.println(valor);
			valor = valor - 1;
		}
		System.out.println("soma:" + n);
	}
	public static void par(double valor) {
		double m = 1;
		while (valor >= 1) {
			if (valor%2==0) {
				m = m * valor;
				//System.out.println("multi:" + m);
				}
			//System.out.println(valor);
			valor = valor - 1;
		}
		System.out.println("multi:" + m);
	}
	public static void troca(atv1prog c, atv1prog d) {
		double a = c.getValor();
		double b = d.getValor();
		c.setValor(b);
		d.setValor(a);
	}
	
}
