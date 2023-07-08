/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package StudentRepository;

import DBContext.StudentDBContext;
import entity.Student;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;
import static org.junit.Assert.*;
import studentrepository.IStudentRepository;
import studentrepository.StudentRepository;

/**
 *
 * @author Asus
 */
public class Insert {

    public Insert() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TC01() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 3;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);
        
        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC02() {
        String id = "HE720";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC03() {
        String id = "HEe720";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC04() {
        String id = "he1720";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC05() {
        String id = "HE1234";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC06() {
        String id = "HE17200";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC07() {
        String id = "HE1720";
        String name = "Javan Jr";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC08() {
        String id = "HE1720";
        String name = "Nguyen Van 10";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC09() {
        String id = "HE1720";
        String name = "nguyen van a";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC10() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 0;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC11() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 2;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC12() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 9;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC13() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 10;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    @Test
    public void TC14() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = ".nEt";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC15() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = "java";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC16() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = "c/c++";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, true);
    }

    @Test
    public void TC17() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = "dotnet";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}