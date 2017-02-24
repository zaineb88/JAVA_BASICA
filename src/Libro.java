
public class Libro {
	
	private String isbn = null;
	private String titulo = null;
	private String autor = null;
	private String anyo = null;
	private String editorial = null;

	public Libro(String isbn,String titulo,String autor,String anyo,String editorial)
	{
	this.isbn = isbn;
	this.titulo = titulo;
	this.autor = autor;
	this.anyo = anyo;
	this.editorial = editorial;
	}
	
	public Libro() {

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); // tipo de String m�s r�pido en
												// a�adir!
	
		sb.append("\nEL T�tulo es: " + titulo);
		sb.append("\nEl Autor es: " + autor);
		sb.append("\nEl a�o es: " + anyo);
		sb.append("\nEl editorial: " + editorial+"\n\n");
		
		return sb.toString();
	}

}


