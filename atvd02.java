package AulaBackEnd04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atvd02 {

	public static void main(String[] args) {
		Scanner batata = new Scanner(System.in);
		List<livros> livros = new ArrayList<>();
		while(true) {
			System.out.println("\nMenu: ");
			System.out.println("1- Adicionar livro: ");
			System.out.println("2- Buscar livro por titulo: ");
			System.out.println("3- Exibir lista de livros: ");
			System.out.println("4- Sair");
			int escolha = batata.nextInt();
			int ii = 1;
			switch(escolha) {
			case 1:
				System.out.println("Digite o titulo do livro: ");
				String titulo = batata.next();
				System.out.println("Digite o autor do livro: ");
				String autor = batata.next();
				livros livro = new livros(titulo, autor);
				livros.add(livro);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				System.out.println("Digite o titulo do livro: ");
				String tituloB = batata.next();
				for (livros i : livros) {
					if(tituloB.equals(i.getTitulo())) {
						System.out.println("Livro econtrado");
						System.out.printf("Titulo: %s", i.getTitulo());
						System.out.printf("\nAutor: %s", i.getAutor());
					}
				}
				break;
			case 3:
				System.out.println("Lista: ");
				if(livros.isEmpty()) {
					System.out.println("Biblioteca vazia.");
				}else {
					for (livros i : livros) {
						System.out.println(i.getTitulo());
					}
				}
				break;
			case 4:
				System.out.println("Saindo do programa...");
				batata.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opção inexistente.");
			}
		}
	}

}
