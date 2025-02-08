package com.nit.array;

public class Course
{
  private int courseId;
  private String courseName ;
  private double corseFee;
  
public Course(int courseId, String courseName, double corseFee) 
{
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.corseFee = corseFee;
}

protected int getCourseId() {
	return courseId;
}

protected String getCourseName() {
	return courseName;
}

protected double getCorseFee() {
	return corseFee;
}

@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", corseFee=" + corseFee + "]";
}
}
