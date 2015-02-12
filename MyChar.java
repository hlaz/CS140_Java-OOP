package hw3;

public class MyChar extends Element {
	
	char content = '0';
	
	public char Get() {
		return this.content;
	}
	
	public void Set (char val) {
		this.content = val;
	}
	
	void Print()
	{
		System.out.println("the MyChar has " + content);
	}
	
	public static void main(String[] args) {
		MyChar c = new MyChar();
		c.Print();
		
	}

}
