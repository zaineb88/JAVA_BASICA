import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.stream.events.StartElement;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import Xml.ListaLibros;
import oracle.net.aso.n;
public class MainLibro {
	

	public static void main(String[] args) throws FileNotFoundException, SAXException, IOException {
		
		mostrar();
		int n=getNLibros();
		System.out.println("El numero de los libros es :"+n);
	
	}
	
	public static void mostrar() throws SAXException, FileNotFoundException, IOException
	{
		XMLReader reader = XMLReaderFactory.createXMLReader();
		ParserLibroXML parserlibro = new ParserLibroXML();
		
		reader.setContentHandler(parserlibro);
		
		reader.parse(new InputSource(new FileInputStream("libros.xml")));
	}
	
	public static int getNLibros()
	{

		int nlibros=0;
	nlibros=ParserLibroXML.getNLibros2();
     
		return nlibros;
	}
	
}

