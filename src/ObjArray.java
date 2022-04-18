
public class ObjArray {

	public static void main(String[] args) {
		
		Student s1 = new Student(10,"Ram");
		Student s2 = new Student(20,"Sam");
		Student s3 = new Student(30,"Jam");
		
		Student[] newArray = new Student[3];
		
		newArray[0] = s1;
		newArray[1] = s2;
		newArray[2] = s3;

		for(Student s: newArray)
			if(s.roll >=30)
				System.out.println(s);
				
	}

}
