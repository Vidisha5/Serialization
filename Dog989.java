import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Dog989 implements Serializable{
	
	
	private transient Collar6767 collar;
	
	private String furColor;
	
	public Dog989(Collar6767 collar, String furColor) {
		super();
		this.collar = collar;
		this.furColor = furColor;
	}

	
	public Collar6767 getCollar() {
		return collar;
	}


	
	private void writeObject(ObjectOutputStream oos) {
		try {
			System.out.println("insidewriteobject");
			oos.defaultWriteObject();
			oos.writeInt(collar.getLength());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			collar=new Collar6767(ois.readInt());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Collar6767 c=new Collar6767(10);
		Dog989 d=new Dog989(c,"white");
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file.txt"));
		oos.writeObject(d);
		System.out.println("objectwritten");
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.txt"));
		Dog989 dog=(Dog989) ois.readObject();
		
		System.out.println("objectread"+dog.getCollar().getLength());
	}
	
}
class Collar6767 /*implements Serializable*/{
	private int length;

	public Collar6767(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

}
