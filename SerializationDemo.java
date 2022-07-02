import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Cat cat=new Cat(12,"white");
		try {
			ObjectOutputStream  oos=new ObjectOutputStream(new FileOutputStream("file.txt"));
			oos.writeObject(cat);
			System.out.println("object written successfully");
			
			ObjectInputStream  ois=new ObjectInputStream(new FileInputStream("file.txt"));
			try {
				Cat cat1=(Cat)ois.readObject();
				System.out.println(cat1);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class Cat  implements Serializable{
	int whiskerLength;
	String furColor;
	
	public Cat(int whiskerLength, String furColor) {
		super();
		this.whiskerLength = whiskerLength;
		this.furColor = furColor;
	}

	@Override
	public String toString() {
		return "Cat [whiskerLength=" + whiskerLength + ", furColor=" + furColor + "]";
	}
	
	
}
