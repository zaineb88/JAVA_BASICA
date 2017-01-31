package Xml;


import java.io.FileInputStream;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainSax {

	public static void main(String[] args) throws Throwable {
 
		XMLReader reader = XMLReaderFactory.createXMLReader(); // clase para leer xml
		
		/*ParserLibroXML parserLibro=null;
		 parserLibro =new ParserLibroXML();
		 reader.setContentHandler(parserLibro); // cuando encontras elementos llama a esa clase 
		//reader.parse(new InputSource(new FileInputStream("libro.xml"))); // para leer un libro */
		
		
		ListaLibros lista=null;
		lista =new ListaLibros();
		reader.setContentHandler(lista);
		reader.parse(new InputSource(new FileInputStream("libros.xml")));

	}

}
