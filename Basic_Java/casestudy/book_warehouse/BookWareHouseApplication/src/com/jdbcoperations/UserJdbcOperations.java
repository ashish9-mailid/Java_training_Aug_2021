package com.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import com.project.store.Book;

public class UserJdbcOperations {
private Connection conn;
	
	public UserJdbcOperations()
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
	
	public int dispatch(int bookId,int qty,String details)
	{
		Date d1=new Date();
		java.sql.Date d2=new java.sql.Date(d1.getTime());
		
		try{
			conn.setAutoCommit(false);
			String sql="insert into dispatch (details,date_of_dispatch,bookId,qty) values(?,?,?,?)";
			String sql1="update book set stock=stock-? where bookid=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,details);  pstmt.setDate(2, d2);
			pstmt.setInt(3,bookId); pstmt.setInt(4,qty);
			int n=pstmt.executeUpdate();
			pstmt=conn.prepareStatement(sql1);
			pstmt.setInt(1,qty );
			pstmt.setInt(2, bookId);
			pstmt.executeUpdate();
			conn.commit();
			return n;
			}catch(SQLException e)
			{
				try {
					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return -1;
			}
	}
	
	public List<DispatchDetails> getDispatchDetails(java.sql.Date d1)
	{
		System.out.println(d1);
		List<DispatchDetails> dispatchDetails=new ArrayList<DispatchDetails>();
		try{
			Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from dispatch where date_of_dispatch='"+d1+"'");
		while(rs.next())
		{
			DispatchDetails dis=new DispatchDetails();
			dis.setDispatch_ref(rs.getInt(1));
			dis.setDetails(rs.getString(2));
			dis.setDate_of_dispatch(rs.getDate(3));
			dis.setQty(rs.getInt(5));
			dis.setBookId(rs.getInt(4));
			dispatchDetails.add(dis);
			
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		return dispatchDetails;
		}catch(Exception e)
		{
			e.printStackTrace();return null;
		}
	}	
		public List<DispatchDetails> getDispatchDetails(java.sql.Date sqlDateFrom,java.sql.Date sqlDateTo)
		{
			List<DispatchDetails> dispatchDetails=new ArrayList<DispatchDetails>();
			try{
				Statement stmt=conn.createStatement();
				String sql="select * from dispatch where date_of_dispatch between '"+sqlDateFrom+"'and'"+sqlDateTo+"'";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				DispatchDetails dis=new DispatchDetails();
				dis.setDispatch_ref(rs.getInt(1));
				dis.setDetails(rs.getString(2));
				dis.setDate_of_dispatch(rs.getDate(3));
				dis.setQty(rs.getInt(5));
				dis.setBookId(rs.getInt(4));
				dispatchDetails.add(dis);
				
				//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			return dispatchDetails;
			}catch(Exception e)
			{
				e.printStackTrace();return null;
			}
		}
	
}
