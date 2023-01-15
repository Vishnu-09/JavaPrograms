import java.util.*;
public class Student {
String USN,Name,Branch;
	long phone;	
	
		void insertStudent(String reg, String nm, String br,long ph)
		{
			USN=reg;
			Name=nm;
			Branch=br;
			phone=ph;
		}
		
		void displayStudent()
		{
			System.out.println("**********");
			System.out.println("USN="+USN);
			System.out.println("Name="+Name);
			System.out.println("Branch="+Branch);
			System.out.println("Phone number="+phone);
			System.out.println("**********");
		}
	
	..
				System.out.println("Enter the USN,Name,Branch,Phone number");
				String USN=ip.next();
				String Name=ip.next();
				String Branch=ip.next();
				long phone=ip.nextLong();
				st[j].insertStudent(USN, Name, Branch, phone);
			}
			for (int m=0;m<n;m++)
			{
			
				System.out.format("Student %d details are \n",m+1);
				st[m].displayStudent();
			}
	}
}
