package operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Student;

public class StudentFunctionalities {
	List<Student> exam1 = new ArrayList<Student>();
	List<Student> exam2 = new ArrayList<Student>();
	List<Student> exam3 = new ArrayList<Student>();
	List<Student> exam4 = new ArrayList<Student>();
	// List<Student>[] listOfStudents = new List[5];

	public ArrayList<Student> addDetails() {
		Scanner sc = new Scanner(System.in);
		Scanner readInput = new Scanner(System.in);
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
			for (int i = 0; i < 4; i++) {
			System.out.println("\nEnter id of student: ");
			int sid = sc.nextInt();
			System.out.println("\nEnter name of student: ");
			String name = readInput.nextLine();
			System.out.println("Enter exam id");
			int eid = sc.nextInt();
			System.out.println("Enter first mark");
			int m1 = sc.nextInt();
			System.out.println("Enter second mark");
			int m2 = sc.nextInt();
			System.out.println("Enter third mark");
			int m3 = sc.nextInt();
			System.out.println("Enter fourth mark");
			int m4 = sc.nextInt();
			Student exam1 = new Student(sid, name, eid, m1, m2, m3, m4);
			listOfStudents.add(exam1);
		}
		return listOfStudents;
	}

	public void addStudent() {

		exam1 = addDetails();
		try {
			FileOutputStream fop = new FileOutputStream("D:\\Exam1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fop);
			oos.writeObject(exam1);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		exam2 = addDetails();
		try {
			FileOutputStream fop = new FileOutputStream("D:\\Exam2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fop);
			oos.writeObject(exam2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		exam3 = addDetails();
		try {
			FileOutputStream fop = new FileOutputStream("D:\\Exam3.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fop);
			oos.writeObject(exam3);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		exam4 = addDetails();
		try {
			FileOutputStream fop = new FileOutputStream("D:\\Exam4.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fop);
			oos.writeObject(exam4);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public List<Student> readMarks(String path) {
		ArrayList<Student> s1 = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			s1 = (ArrayList<Student>) ois.readObject();

		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		return s1;

	}
}