import java.io.Serializable;

class Cat232  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	int whiskerLength;
	String furColor;
	
	public Cat232(int whiskerLength, String furColor) {
		super();
		this.whiskerLength = whiskerLength;
		this.furColor = furColor;
	}

	@Override
	public String toString() {
		return "Cat [whiskerLength=" + whiskerLength + ", furColor=" + furColor + "]";
	}
	
	
}
