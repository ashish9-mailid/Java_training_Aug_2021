package com.application;

public class BookLibrary extends Library {
//array of Books
	Book[] books=new Book[5];
	public BookLibrary()
	{
		books[0]=new Book(1,"C++","XXXX","mmmm");
		books[1]=new Book(2,"Java","XXXX","mmmm");
		books[2]=new Book(3,"Csharp","XXXX","mmmm");
		books[3]=new Book(4,"Linux","XXXX","mmmm");
		books[4]=new Book(5,"HR","XXXX","mmm");
	}
	
	public void changeStatus(int BookCode,String status,String memCode)
	{
		for(Book c1:books)
			if(c1.getBookId()==BookCode){
				c1.setStatus(status);
				c1.setMemCode(memCode);
			break;}
	}
	
	public void getAllbooks()
	{
		for(Book c1:books)
			System.out.println(c1.getBookId()+" "+
					c1.getTitle()+" "+c1.getStatus()+" "+
					c1.getMemCode());
	}
}
