package com.client;

import java.util.Date;
import java.util.Scanner;

import com.application.BookLibrary;
import com.application.Cd;
import com.application.CdLibrary;
import com.application.Library;
import com.application.Member;

public class Client {

	public static void main(String[] args) {
		Library l;
		l=new Library();
		while(true)
		{
			//complete the code for all the functionalities
			System.out.println("1	create a member");
			System.out.println(" 2	Issue");
			System.out.println(" 3	Return");
			System.out.println(" 4	Renew");
			System.out.println(" 5	checkStatus");
			System.out.println(" 6	GetMemberList");
			System.out.println(" 0	exit");

			System.out.println("Enter choice");
			Scanner s=new Scanner(System.in);
			int choice=s.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter member details");
				
				
Member newMember=new Member(s.next(),s.next(),
		s.next().charAt(0),new Date());
				l.addMember(newMember);break;


			case 2: System.out.println("Enter member code");
					String mcode=s.next();
					Member m1=l.getMember(mcode);
					if(m1.getMemberType()=='c'){
					 CdLibrary  c1=new CdLibrary();
					   c1.getAllCds();
					   System.out.println("Enter cd code");
					   c1.changeStatus(s.nextInt(),"issued",mcode);
					   c1.getAllCds();
					}
					else if(m1.getMemberType()=='b'){
						 BookLibrary  b1=new BookLibrary();
						   b1.getAllbooks();
						   System.out.println("Enter book code");
						   b1.changeStatus(s.nextInt(),"issued",mcode);
						   Cd[] cds=new Cd[5];
							public CdLibrary()
							{
								cds[0]=new Cd(1,"C++","XXXX","mmmm");
								cds[1]=new Cd(2,"Java","XXXX","mmmm");
								cds[2]=new Cd(3,"Csharp","XXXX","mmmm");
								cds[3]=new Cd(4,"Linux","XXXX","mmmm");
								cds[4]=new Cd(5,"HR","XXXX","mmm");
							}
							
							public void changeStatus(int cdCode,String status,String memCode)
							{
								for(Cd c1:cds)
									if(c1.getCdCode()==cdCode){
										c1.setStatus(status);
										c1.setMemCode(memCode);
									break;}
							}
							
							public void getAllCds()
							{
								for(Cd c1:cds)
									System.out.println(c1.getCdCode()+" "+
											c1.getDescription()+" "+c1.getStatus()+" "+
											c1.getMemCode());
							}
						}
		
						
			case 6:		
				l.getAllMembers(); break;	

			case 0: System.exit(1);



			}
		}
	}
}