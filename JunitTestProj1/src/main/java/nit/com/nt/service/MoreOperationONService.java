package nit.com.nt.service;

import java.util.Date;

public class MoreOperationONService {
	
	
	//getting  Pallendrome
	public  boolean isPallendrome(String str)
	{
		
		if(str==null || str.length()==0 || str.equalsIgnoreCase(""))
		{
			throw new IllegalArgumentException("Invalid  Input");
		}
		String revstr=new StringBuffer(str).reverse().toString();
		
		if(str.equalsIgnoreCase(revstr))
			return true;
		else
			return false;
	}

	//getting Date
	public Date  showDateByMonth(int month)
	{
			if(month>=1 && month<=12)
				return new Date();
			else
				return null;
	}
	
}
