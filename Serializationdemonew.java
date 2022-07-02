import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serializationdemonew {

	
	public static void main(String[] args) throws IOException {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
		
			Cat232 cat1 = (Cat232)ois.readObject();
			
			System.out.println(cat1);
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
