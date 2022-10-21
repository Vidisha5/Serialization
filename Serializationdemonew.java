import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serializationdemonew {

	
	public static void main(String[] args) throws IOException {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));//Exception in thread "main" java.io.InvalidClassException: Cat232; local class incompatible: stream classdesc serialVersionUID = 1, local class serialVersionUID = 2
		
			Cat232 cat1 = (Cat232)ois.readObject();
			
			System.out.println(cat1);
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
