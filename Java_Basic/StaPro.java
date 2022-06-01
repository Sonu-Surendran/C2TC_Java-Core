package Java_Basic;


class Student_Data{
	 int rollNo;
	 String name;
	 static String college="ROCK";
	
	Student_Data(int rollNO,String Name){
		this.rollNo = rollNO;
		this.name = Name;
	}
	
	static void change() {
		college = "DIS";
	}
	
	 void display() {
		System.out.println(rollNo+" "+ college+" "+name);
	}
}

public class StaPro {

public static void main(String[] args) {
		
		Student_Data s1 = new Student_Data(111,"Troy");
		Student_Data s2 = new Student_Data(112,"Joy");
		Student_Data.change();
		s1.display();
		s2.display();
		
	}
	
}
