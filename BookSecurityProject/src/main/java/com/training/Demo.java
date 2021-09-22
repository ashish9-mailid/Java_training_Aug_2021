package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
class Authority
{
	private String role;
	
}
public class Demo {

	public static void main(String[] args) {
		
		String roleString = "ROLE_USER,ROLE_ADMIN"; // to a list of Authority
		
		String roles[] = roleString.split(",");
		List<Authority> list = new ArrayList<>();
		
		for(String r:roles)
		{
			list.add(new Authority(r));
		}
		
		//java 8
		list = Arrays.stream(roleString.split(",")).map(Authority::new).collect(Collectors.toList());
		
		//Arrays.asList(roleString.split(","));  // list of Strings

	}

}
