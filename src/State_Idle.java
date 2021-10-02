
public class State_Idle implements State {
 
    PopsicleMachine popsicleMachine;
 
    public State_Idle(PopsicleMachine popsicleMachine) {
        this.popsicleMachine = popsicleMachine;
    }
       
	public String toString() {
		return "idle";
	}
	@Override
	public void insertDollar() {
		System.out.println("You have inserted a dollar.");
		popsicleMachine.setState(popsicleMachine.getHasDollarState());
	}
	@Override
	public void swipeCard() {
		System.out.println("You have swiped your card.");
		popsicleMachine.setState(popsicleMachine.getSwipedCardState());		
	}
	
	public void cancelTransaction() {
		System.out.println("No transaction to cancel.");		
	}

	public void dispensePopsicle(int x) {
		System.out.println("You have not paid yet.");
		
	}

	@Override
	public boolean canRefill() {
		return true;
	}


}