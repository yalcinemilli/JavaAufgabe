import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class reader {


	private void findobj(int id, List<substance> subs, synonym subSynonym) {
	    
		Iterator<substance> iterator = subs.iterator();
	    
		while (iterator.hasNext()) 
		{
	    	substance sub = iterator.next();
	    
	    	if (sub.getNodeID() == id) 
	    	{
	        	sub.setSubSynonym(subSynonym);
            }
	    }
	}

	public List<substance> readFile(File quelle) {
	
		List<substance> sub = new ArrayList<substance>();
		
		try (Reader dateiLeser = new FileReader(quelle);
				BufferedReader guterLeser = new BufferedReader(dateiLeser)) {

			String gelesen = guterLeser.readLine();
			while (true) {
				if (gelesen == null) 
				{
					return sub;
				}
				
				String[] line = gelesen.split("\\t");
				
				if (line[0].equals("R")) 
				{
 					sub.add(new substance(line[0], Integer.parseInt(line[1]), line[2],line[3], line[4], Boolean.parseBoolean(line[5]), Boolean.parseBoolean(line[6]), Boolean.parseBoolean(line[7]), Boolean.parseBoolean(line[8]), Boolean.parseBoolean(line[9]), Boolean.parseBoolean(line[10])));
 				} else {
 					synonym syn = new synonym(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), line[3], line[4]);
 					findobj(Integer.parseInt(line[1]), sub, syn);
 				}
				
				gelesen = guterLeser.readLine();
			}
			
		} catch (IOException ausnahme) {
			System.out.println("Fehler beim Lesen der Datei " + quelle);
		}
		
		return null;
	}

}
