package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.classes.Employee;

public class EmpDao {
	
	//Connect to database
	
	private String jdbcDriverClass = "com.mysql.cj.jdbc.Driver";
	private String dbUrl = "jdbc:mysql://localhost:3306/training";
	private String username="root";
	private String password="root";
	
	private Connection connection;
	public EmpDao()
	{
		try {
			//step 1  load the driver
			Class.forName(jdbcDriverClass);
			//Step 2 get the connection
			
			connection = DriverManager.getConnection(dbUrl,username,password);
			if(connection!=null)
				System.out.println("Ping Successful");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public int addEmployee(long empId,String name,String dept)
	{
		//Step 3
		String template = "insert into employee values(?,?,?)";
		try(PreparedStatement pstmt = connection.prepareStatement(template)) {
		
		pstmt.setLong(1, empId);
		pstmt.setString(2, name);
		pstmt.setString(3, dept);
		
		return pstmt.executeUpdate();
			
		}catch(SQLException e)
		{
			e.printStackTrace(); return -1;
		}
		
	}
	
	public List<Employee> getAllEmployees()
	{
		String template = "select * from employee";
		List<Employee> empList=new ArrayList<>();
		try(Statement stmt = connection.createStatement())
		{
			ResultSet rs = stmt.executeQuery(template);
			while(rs.next())
			{
				Employee emp=new Employee();
				//System.out.println(rs.getLong(1)+" "+rs.getString(2)rs.getString(2)+" "+rs+" "+rs.getString(3));
			emp.setEmpCode(rs.getLong(1));
			emp.setName(rs.getString(2));
			emp.setDept(rs.getString(3));
			empList.add(emp);
						
			}
			return empList;
			
		}
		catch(SQLException e)
		{
			e.printStackTrace(); return empList;
		}
	}
	
	public int deleteEmployee(long empId)
	{
		return -1;
	}
	
	public Employee getEmployee(long empId)
	{
		return null;
	}
	
	public int updateDept(long empId,String newDept)
	{
		return -1;
	}
	
	

}
