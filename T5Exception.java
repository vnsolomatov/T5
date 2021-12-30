public class T5Exception extends Exception {

	private int num;

	public int getNumber() { return num; }

	public T5Exception(String message, int num) {
		super(message);
		this.num=num;
	}

}