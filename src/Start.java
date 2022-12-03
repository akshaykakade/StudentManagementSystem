import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;


public class Start {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Hello Welcome to Student Management System");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO EXIT STUDENT");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				//ADD STUDENT
				System.out.println("Enter STUDENT Name");
				String name=br.readLine();
				System.out.println("Enter STUDENT Phone");
				String phone=br.readLine();
				System.out.println("Enter STUDENT City");
				String city=br.readLine();
				//create student obj to store student
				Student st=new Student(name, phone, city);
				boolean answer=StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student Added Successfully...!!!");
				}
				else
				{
					System.out.println("Something went wrong try again");
				}
					
				System.out.println(st);
			}
			else if (c==2)
			{
				//DELETE STUDENT
				System.out.println("Enter Student Id to Delete");
				int userId=Integer.parseInt(br.readLine());
				StudentDao.deleteStudent(userId);
				
				
			}
			else if(c==3)
			{
				//DISPLAY STUDENT
				
				
			}
			else if(c==4)
			{
				//EXIT APP
				break;
			}
			else
			{
				
			}
		}
		System.out.println("THANK YOU FOR USING APPLICATION SEE YOU SOON .....!!!!");
		

	}

}
