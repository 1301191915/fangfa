package fangfa;

public class Host {
	public static void main(String[] args) {
		Dog mydog = new Dog();
		mydog.setAge(4);
	    mydog.setName("����");
	    String sound =mydog.bark();
	    System.out.println(sound);
	    String food ="�׷�";
	    mydog.eat(food);
	    mydog.sleep();
	    
	    
	    
	}
    
}
