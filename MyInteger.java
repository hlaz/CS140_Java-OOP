package hw3;

public class MyInteger extends Element {
	
	int content = 0;
	
	public int Get() {
		return this.content;
	}
	
	public void Set(int val) {
		this.content = val;
		
	}
	
	void Print()
	{
		System.out.println("the MyInteger has " + content);
	}
	
	public static void main(String[] args) {
		MyInteger i = new MyInteger();
		i.Print();
		
	}

}
