import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Player{
	Player(){
		System.out.println("p");
	}
}
public class CardPlayer extends Player implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CardPlayer(){
		System.out.println("c");
	}

	public static void main(String[] args) {
		CardPlayer cardplayer=new CardPlayer();
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file.txt"));
			oos.writeObject(cardplayer);
			oos.close();
			
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.txt"));
			CardPlayer cardplayer2=(CardPlayer)ois.readObject();
			ois.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
