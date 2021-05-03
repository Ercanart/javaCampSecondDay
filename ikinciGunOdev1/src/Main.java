
public class Main {

	public static void main(String[] args) {
		
		MyCourses myCourses1 = new MyCourses(1,"C# + Angular", "Resim1", "Engin", "Demiroğ", "free" );
				
		MyCourses myCourses2 = new MyCourses();
		
		myCourses2.id = 2;
		myCourses2.courseName = "Java + React";
		myCourses2.courseImage = "Resim2";
		myCourses2.educatorName = "Engin";
		myCourses2.educatorSurname = "Demiroğ";
		myCourses2.courseUnitPrice = "free";
		
		MyCourses myCourses3 = new MyCourses();
		
		myCourses3.id = 3;
		myCourses3.courseName = "Temel Kurs";
		myCourses3.courseImage = "Resim3";
		myCourses3.educatorName = "Engin";
		myCourses3.educatorSurname = "Demiroğ";
		myCourses3.courseUnitPrice = "free";
		
		MyCourses[] courses = {myCourses1, myCourses2, myCourses3};
		for (MyCourses course : courses) {
			System.out.println(course.courseName);
		}	
			
	
		
		Student student1 = new Student(1, "Ali", "Afacan", 20, "Ankara", "1234","ali@gmail.com");
		Student student2 = new Student(1, "Ahmet", "Babacan", 22, "İstanbul", "2345","ahmet@gmail.com");
		Student student3 = new Student(1, "Mehmet", "Bilircan", 24, "Denizli", "3456", "mehmet@gmail.com");
		
		Student[] students = {student1, student2, student3};
		for (Student student : students) {
			System.out.println(student.name);
		}	
		
		
		MyCoursesManager coursesManager = new MyCoursesManager();
		coursesManager.add(myCourses3);
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student3);
		
		
			
			
			
		
	}	
	
}	
		
			
		
		

	


