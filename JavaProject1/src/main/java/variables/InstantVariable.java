package variables;

public class InstantVariable {

	private String name;
	private int age;
	
	public InstantVariable() {
		name = "";
		age = 0;
	}
	
	public InstantVariable(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		InstantVariable std = new InstantVariable("Tania", 25);
		
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
	}
}
