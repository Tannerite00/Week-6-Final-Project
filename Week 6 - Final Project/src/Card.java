
public class Card {
	 int value;
	 String name;
	 
	 public Card(String name, int value) {
		 this.name = name;
		 this.value = value;
	 }
	 
	public int getValue() {
		return value;
	}

	public void setValue(int i) {
		this.value = i;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void describe() {
		System.out.println("Card: " + name);
		System.out.println("Value: " + value);
	}
	}

