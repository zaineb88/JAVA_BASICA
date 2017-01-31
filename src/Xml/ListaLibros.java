package Xml;


import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ListaLibros extends DefaultHandler{

	
	private Libro libro;
	private String valor_actual;
	private List <Libro> lista_Libros;
	
	
	@Override
	public void startDocument() throws SAXException {
	
		System.out.println("INICIO DEL DOCUMENTO");
		this.libro = new Libro();
		lista_Libros = new ArrayList<>();
		
	}
	

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		if (localName.equals("libro")){
			libro = new Libro();
			String valor_isbn = attributes.getValue("isbn");
			this.libro.setIsbn(valor_isbn);
		}
	}
	
	
	

	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
	
	
		String str = new String(ch, start, length);

		valor_actual = str;
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
	
		if (localName.equals("titulo"))
		{
			libro.setTitulo(valor_actual);
		}
		else if (localName.equals("autor"))
		{
			libro.setAutor(valor_actual);
		}
		else if (localName.equals("anyo"))
		{
			libro.setAnyo(valor_actual);
		}
		else if (localName.equals("editorial"))
		{
			libro.setEditorial(valor_actual);
		}
		else if (localName.equals("libro")){
			
			lista_Libros.add(libro);
			
			}
			
		}
	
	@Override
	public void endDocument() throws SAXException {
		
		
		
		for (Libro libro: lista_Libros){
			
		System.out.println("INFO LIBRO");
		System.out.println("ISBN= " +libro.getIsbn());
		System.out.println("AUTOR= " +libro.getAutor());
		System.out.println("TITULO= " +libro.getTitulo());
		System.out.println("EDITORIAL= " +libro.getEditorial());
		System.out.println("AÑO= " +libro.getAnyo()+"\n");
		
		}
		
		System.out.println("FIN DEL DOCUMENTO");
	}
}
