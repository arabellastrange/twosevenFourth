import java.util.Scanner;

public class runDeque {
	public static void main(String[] args){
		DequeADT newStack = new NodeDeque();
		String option;
		System.out.println("Hello! Please choose from the following options \n - Press GF to get the first element of your queue \n - Press RF to remove the first element of the queue \n - Press E to check if your queue is empty \n - Press S to check the size of your queue \n - Press AF to add an element to you the front of your queue \n - Press GL to get the last element of your queue \n - Press RL to remove the last element of the queue \n - Press AL to add an element to you the rear of your queue \n - Press Q to Quit \n");
		do {
			System.out.println("Your command: ");
			Scanner s = new Scanner(System.in);
			option = s.nextLine().trim().toUpperCase(); 
			try{
				switch(option){

				case "GF": Object topE = newStack.getFirst();
				System.out.println("The first element of your queue is: " + topE);
				break;

				case "GL": topE = newStack.getLast();
				System.out.println("The last element of your queue is: " + topE);
				break;

				case "RF": Object lastE = newStack.getFirst();
				newStack.removeFirst();
				if(newStack.isEmpty()){
					System.out.println("Your queue is now empty");
				}
				else {
					topE = newStack.getFirst();
					System.out.println("The first element of your queue is now: " + topE);
				}
				System.out.println("The removed element is: " + lastE);
				break;
				case "RL": lastE = newStack.getLast();
				newStack.removeLast();
				if(newStack.isEmpty()){
					System.out.println("Your queue is now empty");
				}
				else {
					topE = newStack.getLast();
					System.out.println("The last element of your queue is now: " + topE);
				}
				System.out.println("The removed element is: " + lastE);
				break;

				case "E": boolean empty = newStack.isEmpty();
				if(empty == true){
					System.out.println("Your queue is empty!");
				} 
				else{
					System.out.println("Your queue is not empty!");
				}
				break;

				case "S": int size = newStack.size();
				System.out.println("The size your queue is: " + size );
				break;

				case "AF": System.out.println("Input the string you would like to add to your queue: ");
				String newElement = s.nextLine(); 
				newStack.addFirst(newElement);
				topE = newStack.getFirst();
				System.out.println("The first element of your queue is now: " + topE);
				break;
				case "AL": System.out.println("Input the string you would like to add to your queue: ");
				newElement = s.nextLine(); 
				newStack.addLast(newElement);
				topE = newStack.getLast();
				System.out.println("The last element of your queue is now: " + topE);
				break;
				case "Q":  System.out.println("Goodbye!");
				break;	  
				default:   System.out.println("Please enter a vaild command");
				break;
				}
			}
			catch(EmptyDequeException e){
				System.out.println("Queue is empty, so cannot get or remove from queue, please try again");
			}

		}
		while(!option.equals("Q"));
	}

}
