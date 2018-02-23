import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AlotInPut {

	public static void main(String[] args) {
		Map<Integer, String> I_S = new LinkedHashMap<Integer, String>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			I_S.put(scanner.nextInt(), scanner.next());
			
		}
		
		Iterator it = I_S.entrySet().iterator();    
        while(it.hasNext())    
        {    
            Map.Entry entity = (Map.Entry) it.next();
            System.out.println("[ key = " + entity.getKey() +     
                    ", value = " + entity.getValue() + " ]");    
        }        
	}

}
