package com.application;

public class Library {
Member members[]=new Member[5];
static int memberCount;

public Library(){ }

public void addMember(Member m1)
{
	members[memberCount++]=m1;
	//code to add a new member 
	
}

public boolean issued(String memCode){

	return true;
}

public boolean returned(String memCode)
{
	//code
	return true;
}

public boolean renewed(String memCode){

	//code
	return true;
}

public Member getMember(String memCode)
{
	for(int i=0;i<memberCount;i++)
	{
		Member mobj=members[i];
		if(mobj.getMemberCode().equals(memCode))
			return mobj;
		
	}
	return null;
}
public void getAllMembers()
{
	for(int i=0;i<memberCount;i++)
	{
		Member mobj=members[i];
		System.out.println(mobj.getMemberCode()+" "+mobj.getMemberName()+
				" "+mobj.getMemberType()+" "+mobj.getDateOfMembership());
	}
}

}