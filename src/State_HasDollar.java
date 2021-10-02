
public class State_HasDollar implements State {
 
    PopsicleMachine popsicleMachine;
 
    public State_HasDollar(PopsicleMachine popsicleMachine) {
        this.popsicleMachine = popsicleMachine;
    }
       
	@Override
	public void insertDollar() {
		System.out.println("You have already inserted cash.\n");
	}
	@Override
	public void swipeCard() {
		System.out.println("You have already inserted cash.\n");
		
	}
	@Override
	public void cancelTransaction() {
		System.out.println("The transaction has been cancelled. Your money will be returned.\n");
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