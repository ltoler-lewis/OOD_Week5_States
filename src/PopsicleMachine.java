
public class PopsicleMachine {
 
	State hasDollarState;
	State swipedCardState;
	//State soldOutState;
	State soldState;
	State idleState;
	
	//Bad form, this will create bugs at some point
	Popsicle[] popsicleOptions;
	int [] popsicleCounts;
	
	State state;
	
 
	public PopsicleMachine() {
		
		
		hasDollarState = new State_HasDollar(this);
		swipedCardState = new State_HasCard(this);
		idleState = new State_Idle(this);
		soldState = new State_Sold(this);
		
		popsicleOptions = new Popsicle[4];
		popsicleOptions[0] = new Popsicle("Strawberry", 4);
		popsicleOptions[1] = new Popsicle("Bannana", 4);
		popsicleOptions[2] = new Popsicle("Chocolate", 4);
		popsicleOptions[3] = new Popsicle("Lime", 4);
		
		setState(getIdleState());

	}
 
	public void insertDollar() {
		state.insertDollar();
	}
 
	public void swipeCard() {
		state.swipeCard();
	}
	
	public void cancelTransaction() {
		state.cancelTransaction();
	}
 
	public void pickPopsicle(String choice) {
		boolean validOption = false;
		
		for (int x = 0; x < popsicleOptions.length; x++) {
			if (choice.equals(popsicleOptions[x].getName())) {
				//System.out.println("Name match");
				if (popsicleOptions[x].getCount() > 0)
				{
					//If there are popsicles of that type available, call dispensePopsicle()
					state.dispensePopsicle(x);
					validOption=true;
					x=4;
				}
				else
				{
					//Stay in the same state, but don't dispense
					//Could have done this in dispensePopsicle() but oh well
					System.out.println("I'm sorry, we are out of " + choice + " popsicles");
					validOption=true;
					x=4;
				}
			}
		}
		if (!validOption) {
			System.out.println("It doesn't look like we carry that");
			//State stays the same
		}
	}
 
	//Refill a specified pop type

	void refill(String popsicle, int count) {
		for (int x = 0; x < popsicleOptions.length; x++) {
			if (popsicle.equals(popsicleOptions[x].getName())) {
				if(state.canRefill()) {
					System.out.println("Refilling");
					popsicleOptions[x].refill(count);
				}
				x=4;
			}
		}

	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getHasDollarState() {
        return hasDollarState;
    }

    public State getSwipedCardState() {
        return swipedCardState;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public Popsicle getSelectedPopsicle(int x) {
    	return popsicleOptions[x];
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nWelcome to Mike's Popsicle Machine");
		result.append("\nYour options are: ");
		for (int x = 0; x < popsicleOptions.length; x++) {
			result.append(popsicleOptions[x].getName() + " (" + popsicleOptions[x].getCount() + ")   ");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}