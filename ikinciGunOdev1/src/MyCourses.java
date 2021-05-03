
public class MyCourses {
	
	public MyCourses() {
		System.out.println("%0 tamamlandý");
		
		
	}
		
	
		
	
	
	
	public MyCourses (int id, String courseName, String courseImage, String educatorName, String educatorSurname, String courseUnitPrice) { //Constructor (Yapýcý)
		this(); 
		this.id = id;
		this.courseName = courseName;
		this.courseImage = courseImage;
		this.educatorName = educatorName;
		this.educatorSurname = educatorSurname;
		this.courseUnitPrice = courseUnitPrice;
		
		
	
	}
	
	
	int id;
	String courseName;
	String courseImage;
	String educatorName;
	String educatorSurname;
	String courseUnitPrice;
	
	

	}
