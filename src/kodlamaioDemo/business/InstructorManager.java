package kodlamaioDemo.business;

import kodlamaioDemo.entities.Instructor;

public class InstructorManager {
	public void instructorAdd(Instructor instructor)
	{
		System.out.println("Eğitmen Eklendi : "+instructor.getFirstName()+" "+instructor.getLastName() );
	}
}
