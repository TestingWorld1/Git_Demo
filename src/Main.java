
	public class Main {
	int modelYear;
	String 	modelName;
	
	public Main(int year, String name) {
	
	modelYear = year;
	modelName = name;
	
	
}	
	public static void main(String[] args) {
		Main myCar = new Main(2001, "Alto");
		System.out.println(myCar.modelName + ": " + myCar.modelYear);
		Test_1 myObj = new Test_1();
		myObj.fullThrottle();
		myObj.speed(240);
		
		
		Person obj = new Person();
		obj.setName("Ojas");
		
		System.out.println(obj.getName());
		System.out.println("My name is" + obj.getName());
	}

}
