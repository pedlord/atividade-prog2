import java.util.ArrayList;

public class Agenda {
	public static ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	public static void adicionar(Contato teste) {
		contatos.add(teste);
		}
	public static void deletar(Contato cont) {
		for (int i = 0; i < contatos.size(); i++) { 
			if (contatos.get(i) == cont) {
				contatos.remove(i);
				}
			}
		}
	public static Contato buscar(Contato cont) {
		for (int i = 0; i < contatos.size(); i++) { 
			if (contatos.get(i) == cont) {
				Contato teste = contatos.get(i);
				return teste;
			}
		}
		Contato n = null;
		return n;
		
	}
}