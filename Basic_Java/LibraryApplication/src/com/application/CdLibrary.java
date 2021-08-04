package com.application;

public class CdLibrary extends Library{
//array of Cds
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
