package org.jdsp.until;

import java.util.UUID;

public class Creat32UUID {
	
	public String get32UUID(){
		 String uuid = UUID.randomUUID().toString(); //��ȡUUID��ת��ΪString����  
	     uuid = uuid.replace("-", "");               //��ΪUUID����Ϊ32λֻ������ʱ���ˡ�-�������Խ�����ȥ��Ϳ�  
	     return uuid;
		
	}

	 
		       
		         
	

}
