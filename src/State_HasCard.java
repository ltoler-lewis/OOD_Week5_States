
public class State_HasCard implements State {
 
    PopsicleMachine popsicleMachine;
 
    public State_HasCard(PopsicleMachine popsicleMachine) {
        this.popsicleMachine = popsicleMachine;
    }

	@Override
	public void insertDollar() {
		System.out.println("You have already swiped your card.\n");
	}
	@Override
	public void swipeCard() {
		System.out.println("You have already swiped your card.\n");
		
	}
	@Override
	public void cancelTransaction() {
		System.out.println("The transaction has been cancelled. Your card will not be charged.\n");
		popsicleMachine.setState(popsicleMachine.getIdleState());
	}

	@Override
	public void dispensePopsicle(int x) {
		System.out.println("Now dispensing: " + popsicleMachine.getSelectedPopsicle(x).getName() +".\n" );
		popsicleMachine.getSelectedPopsicle(x).decrement();
		popsicleMachine.setState(popsicleMachine.getIdleState());
	}

	@Override
	public boolean canRefill() {
		System.out.println("You cannot refill me in the middle of a transaction.");
		return false;
	}
	
	public String toString() {
		return "waiting for your choice.\n";
	}


}