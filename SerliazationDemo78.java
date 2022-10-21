import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerliazationDemo78 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Collar c=new Collar(10);
		Dog1 d=new Dog1(c,"white");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file.txt"));
		oos.writeObject(d);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.txt"));
		Dog1 dog1=(Dog1) ois.readObject();
		System.out.println("objectwritten"+dog1.getCollar().getLength());
	}
}
class Dog1 implements Serializable{
	
	
	private transient Collar collar;
	
	private String furColor;
	
	public Dog1(Collar collar, String furColor) {
		super();
		this.collar = collar;
		this.furColor = furColor;
	}

	
	public Collar getCollar() {
		return collar;
	}



	
}
class Collar /*implements Serializable*/{
	private int length;

	public Collar(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

}
