package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Volei;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Volei> arvore = new ArrayList<>();

		arvore.add(new Volei("Eduardo", "Dudu", 1.93, "Ponteiro"));
		arvore.add(new Volei("Alexandre", "Xande", 1.90, "Ponteiro"));
		arvore.add(new Volei("Fabricio", "Fab", 1.89, "Oposto"));
		arvore.add(new Volei("Alisson", "Ali", 1.75, "Libero"));
		arvore.add(new Volei("Roberto", "Beto", 1.92, "Central"));
		arvore.add(new Volei("Wagner", "Wag", 1.98, "Levantador"));

		System.out.println(" ------- MENU TIME DE VOLEI ------ ");
		System.out.println("|     1 - Cadastrar               |");
		System.out.println("|     2 - Listar                  |");
		System.out.println("|     3 - Listar por altura       |");
		System.out.println("|     4 - Remover                 |");
		System.out.println("|     5 - Pesquisar apelido       |");
		System.out.println("|     6 - Sair                    |");
		System.out.println(" ---------------------------------");

		System.out.print("Digite uma opcao --> ");
		int opcao = sc.nextInt();

		while (true) {

			if (opcao == 1) {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Apelido: ");
				String apelido = sc.next();
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				System.out.print("Posicao: ");
				String posicao = sc.next();

				arvore.add(new Volei(nome, apelido, altura, posicao));
			}

			if (opcao == 2) {
				arvore.forEach(System.out::println);
			}

			if (opcao == 3) {
				arvore.stream().sorted((a1, a2) -> a1.compareTo(a2)).collect(Collectors.toList())
						.forEach(System.out::println);
			}

			if (opcao == 4) {
				System.out.print("Digite um nome para remover: ");
				String nome = sc.next();
				boolean removido = arvore.removeIf(a -> a.getNome().equalsIgnoreCase(nome));
				System.out.println(removido ? "Jogador removido com sucesso!" : "Jogador não encontrado!");

				arvore.forEach(System.out::println);
			}

			if (opcao == 5) {
				System.out.print("Pesquise um apelido: ");
				String apelido = sc.next();
				arvore.stream().filter(a -> a.getApelido().equalsIgnoreCase(apelido)).collect(Collectors.toList())
						.forEach(System.out::println);
				;
			}

			if (opcao == 6) {
				break;
			}
		}
	}
}
