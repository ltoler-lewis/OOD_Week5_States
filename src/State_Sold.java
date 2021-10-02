
public class State_Sold implements State {
 
    PopsicleMachine popsicleMachine;
 
    public State_Sold(PopsicleMachine popsicleMachine) {
        this.popsicleMachine = popsicleMachine;
    }
       

	
	public void refill() { }
 
	public String toString() {
		return "dispensing a gumball";
	}
	@Override
	public void insertDollar() {
		// TODO Auto-generated method stub
	}
	@Override
	public void swipeCard() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cancelTransaction() {
		// TODO Auto-generated method stub
		
	}

	public void dispensePopsicle(int x) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean canRefill() {
		// TODO Auto-generated method stub
		return false;
	}
}