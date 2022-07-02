import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;

public class SerializationDemo77 {

	public static void main(String[] args) {
		Cat232 cat=new Cat232(12,"white");
		try {
			ObjectOutputStream  oos=new ObjectOutputStream(new FileOutputStream("file.txt"));
			oos.writeObject(cat);
			System.out.println("object written successfully");
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

