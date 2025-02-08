package com.nit.array;

public class EducationInstituteApps {
public static void main(String[] args) {
    Course[] courses = {
        new Course(1, "Mathematics", 1000.0),
        new Course(2, "Science", 1200.0),
        new Course(3, "English", 900.0)
    };

    Offer[] offers = {
        new Offer("Special discount: Get 20% off on all courses!"),
        new Offer("Limited time offer: Enroll in any two courses and get one course free!")
    };

    EducationInstitute institute = new EducationInstitute(courses, offers);

    Thread student1 = new Thread(new Student("Virat", institute));
    Thread student2 = new Thread(new Student("Dhoni", institute));

    student1.start();
    student2.start();
}
}