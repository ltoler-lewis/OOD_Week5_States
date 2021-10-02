public class Popsicle {
	String name;
	int count;
	
	
	public Popsicle(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	public int getCount() {
		return count;
	}
	public void decrement() {
		count--;
	}
	public void refill(int x) {
		count = count + x;
	}
}