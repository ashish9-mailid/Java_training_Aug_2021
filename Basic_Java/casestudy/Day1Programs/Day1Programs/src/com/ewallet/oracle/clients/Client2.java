package com.ewallet.oracle.clients;

import com.ewallet.oracle.classes.Account;
import com.ewallet.oracle.classes.User;


public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

User user=new User("sam","3883838",25);

		
Account account = new Account("2222 3333 2324 2442", "12/03/2020", 1000.00, user);

System.out.println(account.getCreditCardNo()+" "+account.getBalance());

System.out.println(account.getUser().getAge()+" ");


User ram=new User("ram", "44787888", 30);

Account account1 = new Account("2222 3433 5454 2442", "12/03/2020", 1000.00, ram);

User userRef=account1.getUser();
		
	}

}
