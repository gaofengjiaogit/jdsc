package org.jdsp.until;

import java.util.UUID;

public class Creat32UUID {
	
	public String get32UUID(){
		 String uuid = UUID.randomUUID().toString(); //获取UUID并转化为String对象  
	     uuid = uuid.replace("-", "");               //因为UUID本身为32位只是生成时多了“-”，所以将它们去点就可  
	     return uuid;
		
	}

	 
		       
		         
	

}
