package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import operations.StudentFunctionalities;
import bean.Student;

public class main {
	public static void main(String[] args) throws Exception {
		int ch;
		int choice;
		Scanner sc = new Scanner(System.in);
		StudentFunctionalities s = new StudentFunctionalities();
		List<Student> exam1 = new ArrayList<Student>();
		List<Student> exam2 = new ArrayList<Student>();
		List<Student> exam3 = new ArrayList<Student>();
		List<Student> exam4 = new ArrayList<Student>();
		do {
			System.out.println("\n1.Add student 2.View students 3.Good or bad performer 4.Consistent performer");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				s.addStudent();
				break;
			case 2:
				System.out.println("\n...exam1..");

				exam1 = s.readMarks("D:\\Exam1.txt");
				for (int i = 0; i < exam1.size(); i++) {
					System.out.println(exam1.get(i).getStudentId() + "\t" + exam1.get(i).getStudentName() + "\t"
							+ exam1.get(i).getExamId() + "\t" + exam1.get(i).getMark1() + "\t" + exam1.get(i).getMark2()
							+ "\t" + exam1.get(i).getMark3() + "\t" + exam1.get(i).getMark4() + "\n");
				}
				System.out.println("\n...exam2..");

				exam2 = s.readMarks("D:\\Exam2.txt");
				for (int i = 0; i < exam2.size(); i++) {
					System.out.println(exam2.get(i).getStudentId() + "\t" + exam2.get(i).getStudentName() + "\t"
							+ exam2.get(i).getExamId() + "\t" + exam2.get(i).getMark1() + "\t" + exam2.get(i).getMark2()
							+ "\t" + exam2.get(i).getMark3() + "\t" + exam2.get(i).getMark4() + "\n");
				}
				System.out.println("\n...exam3..");

				exam3 = s.readMarks("D:\\Exam3.txt");
				for (int i = 0; i < exam3.size(); i++) {
					System.out.println(exam3.get(i).getStudentId() + "\t" + exam3.get(i).getStudentName() + "\t"
							+ exam3.get(i).getExamId() + "\t" + exam3.get(i).getMark1() + "\t" + exam3.get(i).getMark2()
							+ "\t" + exam3.get(i).getMark3() + "\t" + exam3.get(i).getMark4() + "\n");
				}
				System.out.println("\n...exam4..");

				exam4 = s.readMarks("D:\\Exam4.txt");
				for (int i = 0; i < exam4.size(); i++) {
					System.out.println(exam4.get(i).getStudentId() + "\t" + exam4.get(i).getStudentName() + "\t"
							+ exam4.get(i).getExamId() + "\t" + exam4.get(i).getMark1() + "\t" + exam4.get(i).getMark2()
							+ "\t" + exam4.get(i).getMark3() + "\t" + exam4.get(i).getMark4() + "\n");
				}
				break;
			case 3:
				exam1 = s.readMarks("D:\\Exam1.txt");
				exam2 = s.readMarks("D:\\Exam2.txt");
				exam3 = s.readMarks("D:\\Exam3.txt");
				exam4 = s.readMarks("D:\\Exam4.txt");
				int largest=0;
				int smallest=0;
				int id1=0,id2=0,id3=0,id4=0;
				int bid=0,wid=0;
				int total1=0,total2=0,total3=0,total4=0;
											
				id1=exam4.get(0).getStudentId();
				id2=exam4.get(1).getStudentId();
				id3=exam4.get(2).getStudentId();
				id4=exam4.get(3).getStudentId();
				total1=total1+exam1.get(0).getMark1()+exam1.get(0).getMark2()+exam1.get(0).getMark3()+exam1.get(0).getMark4()+exam2.get(0).getMark1()+exam2.get(0).getMark2()+exam2.get(0).getMark3()+exam2.get(0).getMark4()+exam3.get(0).getMark1()+exam3.get(0).getMark2()+exam3.get(0).getMark3()+exam3.get(0).getMark4()+exam4.get(0).getMark1()+exam4.get(0).getMark2()+exam4.get(0).getMark3()+exam4.get(0).getMark4();
				total2=total2+exam1.get(1).getMark1()+exam1.get(1).getMark2()+exam1.get(1).getMark3()+exam1.get(1).getMark4()+exam2.get(1).getMark1()+exam2.get(1).getMark2()+exam2.get(1).getMark3()+exam2.get(1).getMark4()+exam3.get(1).getMark1()+exam3.get(1).getMark2()+exam3.get(1).getMark3()+exam3.get(1).getMark4()+exam4.get(1).getMark1()+exam4.get(1).getMark2()+exam4.get(1).getMark3()+exam4.get(1).getMark4();
				total3=total3+exam1.get(2).getMark1()+exam1.get(2).getMark2()+exam1.get(2).getMark3()+exam1.get(2).getMark4()+exam2.get(2).getMark1()+exam2.get(2).getMark2()+exam2.get(2).getMark3()+exam2.get(2).getMark4()+exam3.get(2).getMark1()+exam3.get(2).getMark2()+exam3.get(2).getMark3()+exam3.get(2).getMark4()+exam4.get(2).getMark1()+exam4.get(2).getMark2()+exam4.get(2).getMark3()+exam4.get(2).getMark4();
				total4=total4+exam1.get(3).getMark1()+exam1.get(3).getMark2()+exam1.get(3).getMark3()+exam1.get(3).getMark4()+exam2.get(3).getMark1()+exam2.get(3).getMark2()+exam2.get(3).getMark3()+exam2.get(3).getMark4()+exam3.get(3).getMark1()+exam3.get(3).getMark2()+exam3.get(3).getMark3()+exam3.get(3).getMark4()+exam4.get(3).getMark1()+exam4.get(3).getMark2()+exam4.get(3).getMark3()+exam4.get(3).getMark4();
				largest=total1;
				bid=id1;
				if(total2>largest) {
					largest=total2;
					bid=id2;
				}
				if(total3>largest) {
					largest=total3;
					bid=id3;
				}
				if(total4>largest) {
					largest=total4;
					bid=id4;
				}
					System.out.println("Best performer"+bid);
					
					
				smallest=total1;
				wid=id1;
				if(total2<smallest) {
					smallest=total2;
					wid=id2;
				}
				if(total3<smallest) {
					smallest=total3;
					wid=id3;
				}
				if(total4<smallest) {
					smallest=total4;
					wid=id4;
				}
					System.out.println("Worst performer"+wid);
								break;
			default:
				System.out.println("Wrong choice");
				break;
			}
						System.out.println("Do you want to continue?Type 1 to continue.");
			ch = sc.nextInt();
					} while (ch == 1);
	
	}
	}
