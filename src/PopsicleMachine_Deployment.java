
public class PopsicleMachine_Deployment {

	public static void main(String[] args) {
		PopsicleMachine popsicleMachine = new PopsicleMachine();

		System.out.println(popsicleMachine);

		popsicleMachine.insertDollar();
		popsicleMachine.pickPopsicle("Strawberry");

		System.out.println(popsicleMachine);
		
		popsicleMachine.swipeCard();
		System.out.println(popsicleMachine);
		popsicleMachine.pickPopsicle("Lime");
		popsicleMachine.swipeCard();
		popsicleMachine.pickPopsicle("Lime");
		
		System.out.println(popsicleMachine);
		
		popsicleMachine.swipeCard();
		popsicleMachine.cancelTransaction();
		
		popsicleMachine.refill("Strawberry", 1);
		
		System.out.println(popsicleMachine);

	}
}