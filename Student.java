package com.nit.array;

public class Student implements Runnable
{
 private String name;
 EducationInstitute institute;
public Student(String name, EducationInstitute institute) {
	super();
	this.name = name;
	this.institute = institute;
}
 
 public void viewCoursesAndFees()
 {
	System.out.println("Available Cources : ");
	for (Course course : institute.getCourses()) {
        System.out.println(course);
	}
 }

public void viewOffers() {
    System.out.println("Ongoing Offers:");
    for (Offer offer : institute.getOffers()) {
        System.out.println(offer.getOfferText());
    }
}

public void enrollInCourse(int courseId) {
    institute.enrollStudentInCourse(courseId, name);
}

@Override
public void run() {
    viewCoursesAndFees();
    viewOffers();
    enrollInCourse(1);
}
}
 
