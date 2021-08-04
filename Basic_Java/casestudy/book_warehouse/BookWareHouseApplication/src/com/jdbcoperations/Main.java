package com.jdbcoperations;
/**
 * An application on Book WareHouse Management
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.project.store.Book;


public class Main {

	
	public static void main(String[] args) {
		List<Book> books=null;
		outer: while(true){
			System.out.println("1 admin \n 2 manager \n 0 exit");
			int user=new Scanner(System.in).nextInt();
			JdbcOperations jdbc=new JdbcOperations();
			switch(user)
			{
			
			case 1:

				while(true)
				{
					
					System.out.println("1. add Book to the ware house\n 2. display \n 3.delete \n 4.update \n 0.exit");
					Scanner s=new Scanner(System.in);
					int choice=s.nextInt();

					switch(choice)
					{
					case 1:
						System.out.println("enter id,name,authors(only two),price,stock");
						int id=s.nextInt(); String title=s.next();
						String authorsList[]=new String[2];
						authorsList[0]=s.next(); authorsList[1]=s.next();
						String authors=Arrays.toString(authorsList);
						double price=s.nextDouble(); 
						long stock=s.nextLong();
						int n=jdbc.addBook(id, title, authors, price, stock);
						
						System.out.println(n+" records added!!");
						break;


					case 2:
						 books=jdbc.getAllRecords();
						 System.out.println("--------Books in the WareHouse-----------");
						 for(Book b:books)
							 System.out.println(b);
						System.out.println("--------------------------------------");
						break;
						
					case 3:
						System.out.println("Enter book id of the book to be deleted");
						int bookId=new Scanner(System.in).nextInt();
						 n=jdbc.deleteBook(bookId);
						 System.out.println(n+" records deleted.. from book and dispatch");
						break;

					case 0:
						//System.exit(1); 
						continue outer;
						
					case 4:
						System.out.println("enter bookid and newstock");
						bookId=s.nextInt();
						long newstock=s.nextLong();
						 n=jdbc.addStock(bookId,newstock);
						System.out.println(n+" records updated...");
					}
				}

			case 2: //manager
				while(true)
				{
					UserJdbcOperations uop=new UserJdbcOperations();
					 books=jdbc.getAllRecords();
					 System.out.println("--------Books in the WareHouse-----------");
					 for(Book b:books)
						 System.out.println(b);
					System.out.println("--------------------------------------");
					System.out.println("1.dispatch \n 2. displayDetails on a particular date" +
							"\n 3. displayDetails between two dates" +
							" \n 0. exit");
					Scanner s=new Scanner(System.in);
					int choice=s.nextInt();
					switch(choice)
					{
					case 1:
						System.out.println("enter id of the book,details and qty..");
						int bookId=s.nextInt();
						String details=s.next();
						int qty=s.nextInt();
						int n=uop.dispatch(bookId, qty, details);
						System.out.println(n+" books of"+qty+" qty dispatched.....");
						break;
					case 2:
						System.out.println("Enter Date of Dispatch....");
						String dateString=new Scanner(System.in).next();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
						Date dTemp=null;
						try {
							dTemp = sdf.parse(dateString);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						java.sql.Date sqlDate=new java.sql.Date(dTemp.getTime());
						List<DispatchDetails> disDetails=uop.getDispatchDetails(sqlDate);
						
						System.out.println(disDetails);
						break;

					case 3:
						System.out.println("Enter From and to Date of Dispatch....");
						String fromDateString=new Scanner(System.in).next();
						String toDateString=new Scanner(System.in).next();
						sdf=new SimpleDateFormat("yyyy-MM-dd");
						Date dTemp1=null;Date dTemp2=null;
						try {
							dTemp1 = sdf.parse(fromDateString);
							dTemp2 = sdf.parse(toDateString);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						java.sql.Date sqlDateFrom=new java.sql.Date(dTemp1.getTime());
						java.sql.Date sqlDateTo=new java.sql.Date(dTemp2.getTime());
						List<DispatchDetails> disDetails1=uop.getDispatchDetails(sqlDateFrom,sqlDateTo);
						
						System.out.println(disDetails1);
						break;
					case 0:
						System.exit(1);
					}
				}



			case 0: System.exit(1);

			}
		}
		
		
		
	

	}

}
