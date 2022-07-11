import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Testser {

	public static void main(String[] args) {
		SpecialSer specialser=new SpecialSer();
		
			try {
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("myfile.txt"));
				oos.writeObject(specialser);
				oos.close();
				System.out.println(++specialser.z +"");
				
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("myfile.txt"));
				
				SpecialSer specialser1=(SpecialSer)ois.readObject();
			
				ois.close();
				
				System.out.println(specialser1.y +""+ specialser1.z);
			} 
			catch (IOException e) {
				
				e.printStackTrace();
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} 
			
	}
}
class SpecialSer implements Serializable {
	transient int y = 7;
	static int z = 9;
}
