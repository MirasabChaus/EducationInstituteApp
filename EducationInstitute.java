package com.nit.array;

public class EducationInstitute 
{
	Course[] courses = {};
	Offer[] offers = {};
	
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}
	
	public Course[] getCourses() {
        return courses;
    }

    public Offer[] getOffers() {
        return offers;
    }

    public synchronized void enrollStudentInCourse(int courseId, String studentName) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                System.out.println(studentName + " has enrolled in the course: " + course.getCourseName());
                return;
            }
        }
        System.out.println("Course not found!");
    }
}
