package fangfa;

public class Pet {
	private String name; 
	private int age; 
	public String bark() {
		return "½Ğ";
	}
    public void eat(String food) {
		System.out.println(name+"³Ô"+food); 
	}
    public void sleep () {
		System.out.println(name+"ÔÚË¯¾õ");
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) { 
		if (age > 20 || age < 0) { 
				System.out.println("ÊäÈëÊı¾İ´íÎó"); 
			} else 
				this.age = age; 
	 	} 
	
		

}


