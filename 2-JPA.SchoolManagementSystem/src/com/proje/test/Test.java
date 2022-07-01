package com.proje.test;

import com.proje.controller.CourseController;
import com.proje.model.Course;
import com.proje.model.PermanentInstructor;
import com.proje.model.Student;
import com.proje.model.VisitingResearcher;
import com.proje.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //saveTestData();  create modunda ilk bunu çalıştır.

        //bundan sonrası update modunda çalışşın.
        CourseController courseController = new CourseController();

        //kurs listesini çeker.
        //courseController.findAll().forEach(System.out::println);

        //id ile kurs bulma.
        //System.out.println(courseController.findById(2));

        /*
           database kurs ekleme.
           Course course = new Course("chemistry",65);
           courseController.saveToDatabase(course);
         */
        /*  database kurs silme.
            Course course = courseController.findById(6);
            courseController.deleteFromDatabase(course);

            courseController.deleteFromDatabase(7);
         */

        /*  database course update.
            Course course = courseController.findById(1);
            course.setCreditScore(85);
            courseController.updateOnDatabase(course);
         */
        /*
            course ile student listesini getirme.
            Course course = courseController.findById(1);
            courseController.getCourseStudentList(course).forEach(System.out::println);
         */

        /*
            Verilen creditScore dan yüksek olan kursları getirme.
            courseController.findGreatCreditScore(60).forEach(System.out::println);
         */
        /*
            Verilen creditScore lar arasındaki kursları getirme.
            courseController.findBetweenCreditScore(50,65).forEach(System.out::println);
         */

        /*
            Kursları creditScorlarına göre sıralama.
            courseController.findOrderByCourseCreditScore().forEach(System.out::println);
         */
    }

    private static void saveTestData() {

        Course course1 = new Course("Mathematics",80);
        Course course2 = new Course("English",50);
        Course course3 = new Course("Art",30);
        Course course4 = new Course("Physics",60);
        Course course5 = new Course("Turkish",70);

        Student student1 = new Student("Hakan", LocalDate.of(1999, Month.APRIL, 12),"Adana","male");
        Student student2 = new Student("Oguzhan", LocalDate.of(2002, Month.MARCH, 05),"Mersin","male");
        Student student3 = new Student("Ayse", LocalDate.of(1995, Month.JANUARY, 15),"Istanbul","female");
        Student student4 = new Student("Fatma", LocalDate.of(1996, Month.DECEMBER, 28),"Bursa","female");
        Student student5 = new Student("Burak", LocalDate.of(2005, Month.MARCH, 12),"Adana","male");

        PermanentInstructor permanentInstructor1 = new PermanentInstructor("Ali","Adana",55555555555l,9500);

        VisitingResearcher visitingResearcher1 = new VisitingResearcher("Rümeysa","Bursa",2222222l,65.9);
        VisitingResearcher visitingResearcher2 = new VisitingResearcher("Buse","Istanbul",1111111l,92.4);

        course1.setInstructor(permanentInstructor1);
        course2.setInstructor(permanentInstructor1);
        course3.setInstructor(visitingResearcher1);
        course4.setInstructor(visitingResearcher2);
        course5.setInstructor(visitingResearcher2);

        permanentInstructor1.getCourseList().add(course1);
        permanentInstructor1.getCourseList().add(course2);
        visitingResearcher1.getCourseList().add(course3);
        visitingResearcher2.getCourseList().add(course4);
        visitingResearcher2.getCourseList().add(course5);

        course1.getStudentList().add(student1);
        course1.getStudentList().add(student2);
        course1.getStudentList().add(student3);
        course2.getStudentList().add(student4);
        course3.getStudentList().add(student2);
        course3.getStudentList().add(student1);
        course4.getStudentList().add(student5);
        course4.getStudentList().add(student4);
        course5.getStudentList().add(student1);

        student1.getCourseList().add(course1);
        student1.getCourseList().add(course3);
        student1.getCourseList().add(course5);
        student2.getCourseList().add(course1);
        student2.getCourseList().add(course3);
        student3.getCourseList().add(course1);
        student4.getCourseList().add(course2);
        student4.getCourseList().add(course4);
        student5.getCourseList().add(course5);

        EntityManager entityManager = EntityManagerUtils.getEntityManager("mysqlPU");


        try {
            entityManager.getTransaction().begin();

            entityManager.persist(course1);
            entityManager.persist(course2);
            entityManager.persist(course3);
            entityManager.persist(course4);
            entityManager.persist(course5);

            entityManager.persist(student1);
            entityManager.persist(student2);
            entityManager.persist(student3);
            entityManager.persist(student4);
            entityManager.persist(student5);

            entityManager.persist(permanentInstructor1);

            entityManager.persist(visitingResearcher1);
            entityManager.persist(visitingResearcher2);

            entityManager.getTransaction().commit();

        }catch (Exception e){
            entityManager.getTransaction().rollback();
        }finally {
            EntityManagerUtils.closeEntityManager(entityManager);
        }
    }
}
