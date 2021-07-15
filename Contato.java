import java.util.Scanner;

public class Contato {
	private String nome;
	private String email;
	
	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return this.nome;
	}
	public String getEmail() {
		return this.email;
	}
	public static void main(String args[]) throws Exception
	{
		
		@SuppressWarnings("resource")
		Scanner nome = new Scanner(System.in);
		System.out.println("Escreve o nome:");
		
		String cont = nome.nextLine();
		System.out.println("nome escrito: " + cont);
		
		@SuppressWarnings("resource")
		Scanner email = new Scanner(System.in);
		System.out.println("Escreve o email:");
		
		String em = email.nextLine();
		System.out.println("email escrito: " + em);
		
		Contato teste = new Contato(cont, em);
		
		Agenda.adicionar(teste);
		System.out.println("contatos:" + Agenda.contatos);
		
		System.out.println("contato:" + Agenda.buscar(teste).getNome() + Agenda.buscar(teste).getEmail());
		Agenda.deletar(teste);
		System.out.println("contatos:" + Agenda.contatos);
		Agenda.buscar(teste);
		System.out.println("contato:" + Agenda.buscar(teste));
		
	}
}