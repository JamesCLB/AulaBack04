package AulaBackEnd04;

public class livros {
	private String titulo;
	private String autor;
	
	public livros(String tit, String aut) {
		this.titulo = tit;
		this.autor = aut;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setTitulo(String titulos) {
		this.titulo = titulos;
	}
	public void setAutor(String aut) {
		this.autor = aut;
	}
	
}
