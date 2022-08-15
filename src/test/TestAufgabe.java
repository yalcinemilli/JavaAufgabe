import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * Empty TestDummy Class in /src/test
 * 
 * @author Yalcin Emilli
 */
public class TestAufgabe {

	@Test
	public void test() {
		
		//Einlesen der Datei.
		reader read = new reader();
		List<substance> sub = new ArrayList<substance>();
		sub = read.readFile(new File("samples/Substances.dat"));
	
		//Ausgabe ndes Letzten Objektes inkl. Synonym.
		substance lastsub = sub.get(sub.size() - 1);
		System.out.println(lastsub.toString());
		lastsub.getSubSynonym().forEach(System.out::println);

		//Ausgabe aller Objekte inkl Synonyme.
		Iterator<substance> iter = sub.iterator();
		while(iter.hasNext())
		{
		    substance sub1 = iter.next();
		    System.out.println(sub1.getCasCode() + ", " + sub1.getSubSynonym().get(0).getSynonymName());
		}
	}
}
