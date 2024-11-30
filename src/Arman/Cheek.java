package Arman;
public class Cheek{
	
void NameCheek(String name) throws Exception {
	
	try {
		
		if(name.isEmpty()) {
			throw new Exception();
		}
		char [] Name = name.toCharArray();
		int x = Name.length;
		for(int i = 0;i<x;i++) {
			
			if((Name[i]>='a')&&(Name[i]<='z')) {
				
			}
			
			else if((Name[i]>='A')&&(Name[i]<='Z')) {
				
			}
			else if((Name[i]==' ')) {
				
			}
			
			else {
				throw new Exception();
			}
		}
		
	}
	catch (Exception e) {
		
		throw new Exception();
	}

		
	}

	void passwordCheek (String  Password) throws Exception{
		int capital=0,small=0,number=0,other=0;
		try {
			char[] password = Password.toCharArray();
			int x = password.length;
			if(x>=8) {
				for(int i = 0;i<x;i++) {
					
					if((password[i]>='A') && password[i]<='Z') {
						
						capital++;
					}
					else if((password[i]>='a') && password[i]<='z') {
						
						small++;
					}
					else if((password[i]>='0') && password[i]<='9') {
						
						number++;
					}
					else {
						
						other++;
					}
					
				}
			}
			

			if(capital==0||small==0||number==0||other==0) {
				throw new Exception();
			}
		}
		catch(Exception e) {
			throw new Exception();
		}

	
	
}
	
	
	
	void  UserCheek(String User) throws Exception {
		try {
			
			if(User.isEmpty()) {
				throw new Exception();
			}
			
			
			
			char[] user= User.toCharArray();
			int x = user.length;
			for(int i = 0;i<x;i++) {
				
				if((user[i]>='A') && user[i]<='Z') {
					
				}
				else if((user[i]>='a') && user[i]<='z') {
					
				}
				else if((user[i]>='0') && user[i]<='9') {	

				}
				else {
					
					throw new Exception();
				}
				
			}
		}
		catch(Exception e) {
			throw new Exception();
		}
		
	}
	
	
	
	void Confrimation(String str1, String str2) throws Exception {
		
		try {
			
		
			try {
				if(str1.isBlank()) {
					throw new Exception();
				}
			}
			catch (Exception e2) {
				throw new Exception();
			}
			
			
			
		if(str1.equals(str2)) {
		}
		else
			throw new Exception();	
	}
		catch(Exception e) {
			throw new Exception();
		}
	}
	
	
	
	void MobileNumber(String number) throws Exception {
		try {
			char[] Number = number.toCharArray();
			int x = Number.length;			
			if(x==11) {
				if(Number[0]=='0') {
					for(int i = 1;i<x;i++) {
						
						if((Number[i]>='0') && Number[i]<='9') {						
							
						}
						else {
							throw new Exception();
						}
					}
				}
				else {
					throw new Exception();
				}
				
			}
			else {
				throw new Exception();
			}
			
		}
		catch(Exception e) {
			throw new Exception();
		}

	}

	
	
	void NID(String nid) throws Exception{
	
	try {
		char [] NID = nid.toCharArray();
		int x= NID.length;
		if(x==10) {
			
		}
		else {
			throw new Exception();
		}
		
	}
	catch (Exception e) {
			throw new Exception();
		
		
	}
}



	void Union(String Union) throws Exception{
	try {
		
		if(Union.isEmpty()) {
			throw new Exception();
		}
		
		char[] union = Union.toCharArray();
		int x = union.length;
		for(int i = 0;i<x;i++) {
			
			if((union[i]>='A') && union[i]<='Z') {
				
			}
			else if((union[i]>='a') && union[i]<='z') {
				
			}
			else if((union[i]>='0') && union[i]<='9') {

			}
			else if((union[i]==' ')) {
				
			}
			else {
			
				throw new Exception();
			}
			
		}
	}
	catch(Exception e) {
		throw new Exception();
	}
	
}
	
	
}