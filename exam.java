import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
class result
{
	int count = 1;
	public void show() {
		while(count != 0){
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("-----Welcome To Feduni Result Manager-----");
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Main Menu: Please Select your Option.....");
		
		System.out.println();
		System.out.println("1.) Add a course");
		System.out.println("2.) Add a Student");
		System.out.println("3.) Add a Reusult");
		System.out.println("4.) View a Reuslt");
		System.out.println("5.) Exit");
		System.out.println();
		
		System.out.println("Enter your choice: ");
		Scanner ins=new Scanner(System.in);
		int n=ins.nextInt();
		
		switch(n)
		 {
			 case 1:
			  { 
			     try{
					 String opt = "y";
					   FileWriter writer=new FileWriter("course.txt" ,true);
					   //writer.write("Course_Id Course_name");
					    while(opt =="y" || opt=="Y" || opt == "YES" || opt == "yes"){
				        Scanner in=new Scanner(System.in);
						System.out.println("Enter Course Code: ");
						int code=in.nextInt();
						writer.write("\r\n");
						writer.write(new Integer(code).toString());
						// *****************************************
						Scanner ina=new Scanner(System.in);
						System.out.println("Enter Course Name: ");
						String cname=ina.nextLine();
						writer.write("\t"+cname);
						Scanner inx = new Scanner(System.in);
						
						System.out.println("Do you want Add or Exit:y/n");
						opt=inx.nextLine();
						writer.close();
						
				       }// while(opt=="y"||opt=="Y");
						   
					  
				 }
				 catch (IOException e) {}
                 
				 break;
			  }//case1
		 
			  
		 case 2:
			  { 
			     try{
					 String opt;
					  
				     FileWriter writer=new FileWriter("student.txt" ,true);
					// writer.write("Stud_Id Stud_name");
					do{
				        Scanner in=new Scanner(System.in);
						System.out.println("Enter Student Id: ");
						int code=in.nextInt();
						writer.write("\r\n");
						writer.write(new Integer(code).toString());
						// *****************************************
						Scanner ina=new Scanner(System.in);
						System.out.println("Enter Student Name: ");
						String cname=ina.nextLine();
						writer.write(cname);
						Scanner inx=new Scanner(System.in);
						
						System.out.println("Do you want Add or Exit:y/n");
						opt=inx.nextLine();
						writer.close();
				       } while(opt=="y"||opt=="Y");
			}
				 catch (IOException e) {}  
				 break;
			  }//***case2
			  
			  case 3:
			  {
				  try{
					 String opt;
					  int ch;
					  
				     FileWriter writer=new FileWriter("score.txt" ,true);
				     FileReader reader=new FileReader("student.txt");
					 FileReader reader1=new FileReader("course.txt");
					while(true){
						
				        Scanner in=new Scanner(System.in);
						System.out.println("Enter Student Id: ");
						
						int code=in.nextInt();
						ch=reader.read();
						if(ch==code) {
						writer.write(new Integer(code).toString());
						}
						else {
							System.out.println("you have enter wrong student id");
						}
						// *****************************************
						/*Scanner ina=new Scanner(System.in);
						System.out.println("Enter Student Name: ");
						String cname=ina.nextLine();
						writer.write(cname);*/
						Scanner inx=new Scanner(System.in);
						System.out.println("Do you want Add or Exit:y/n");
						opt=inx.nextLine();
						//writer.close();
				       }// while(opt=="y"||opt=="Y");
				 }
				 catch (IOException e) {}
				 break;  
			  }
			  case 5:{
			  	count = 0;
			  }
		 	}
			
		}
	}
}	
		
public class exam {
	public static void main(String a[]) {
		result res=new result();
		res.show();
	}
}