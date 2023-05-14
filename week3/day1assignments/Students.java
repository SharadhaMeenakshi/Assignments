package week3.day1assignments;

public class Students {

	public void getStudentInfo(int Rollno) {
		 System.out.println("Student Information (ID): " + Rollno);
    }
	public void getStudentInfo(int id, String name) {
        System.out.println("Student Information (ID & Name): " + id + ", " + name);
    }

    public void getStudentInfo(String email, String phoneNumber) {
        System.out.println("Student Information (Email & Phone Number): " + email + ", " + phoneNumber);
    }
    
    

        public static void main(String[] args) {
            Students students = new Students();
            
            students.getStudentInfo(123);                                 // Calling with Rollno only
            students.getStudentInfo(456, "Shara");                         // Calling with ID and Name
            students.getStudentInfo("shara@example.com", "1234567890");
}}
/*
Class: Students
Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber*/