package com.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.project.store.Book;

public class JdbcOperations {

	private Connection conn;
	
	public JdbcOperations()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost/inventorydb","root","root");
			if(conn==null)
				System.out.println("error in connection");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<Book> getAllRecords()
	{
		List<Book> books=new ArrayList<Book>();
		try{
			
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from book");
		while(rs.next())
		{
			Book newBook=new Book();
			newBook.setBookId(rs.getInt(1));
			newBook.setTitle(rs.getString(2));
			StringTokenizer st=new StringTokenizer(rs.getString(3));
			String[] authors=new String[2];
			int i=0;
			while(st.hasMoreElements())
			{
				authors[i++]=st.nextElement().toString();
				
			}
			newBook.setAuthors(authors);
			newBook.setPrice(rs.getDouble(4));
			newBook.setStock(rs.getLong(5));
			books.add(newBook);
			
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		return books;
		}catch(Exception e)
		{
			e.printStackTrace();return null;
		}
		
	}

	public int addBook(int bookid,String title,String authors,double price,long stock)
	{
		try{
		String sql="insert into book values(?,?,?,?,?)";
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1,bookid);  pstmt.setString(2, title);
		pstmt.setString(3,authors); pstmt.setDouble(4,price); pstmt.setLong(5, stock);
		int n=pstmt.executeUpdate();
		return n;
		}catch(SQLException e)
		{
			return -1;
		}
	}
	
	public int addStock(int bookId,long newstock){
		
		try{
			String sql="update book set stock=stock+? where bookid=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setLong(1, newstock);
			pstmt.setInt(2, bookId);
			
			return pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return -1;
		}
	}
	
	
	public int deleteBook(int bookId)
	{
		try{
			conn.setAutoCommit(false);
			String sql="delete from dispatch where bookid=?";
			String sql1="delete from book where bookid=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bookId);
			pstmt.executeUpdate();
			
			 pstmt=conn.prepareStatement(sql1);
			pstmt.setInt(1, bookId);
			int n=pstmt.executeUpdate();
			conn.commit();
			return n; 
		}
		catch(SQLException e)
		{
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(e);
			return -1;
		}
		
	}
	
	
}
