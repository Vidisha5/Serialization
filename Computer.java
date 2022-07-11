import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Keyboard{
	
}
public class Computer implements Serializable{
	
	Keyboard k=new Keyboard();

	public static void main(String[] args) {
		Computer c=new Computer();
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file.txt"));
			oos.writeObject(c);
			oos.close();
			System.out.println("objectwritten");
			
			/*ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.txt"));
			Computer c1=(Computer)ois.readObject();
			System.out.println(c1);*/
			
		} catch (IOException e) {
			
			//System.out.println("exc");
			e.printStackTrace();
		} 
		/*catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}
}
