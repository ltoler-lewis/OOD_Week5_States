
public interface State {
 
	public void insertDollar();
	public void swipeCard();
	
	public void cancelTransaction();
	
	//public void pickPopsicle(String choice);
	public void dispensePopsicle(int x);
	
	public boolean canRefill();
	
	
}