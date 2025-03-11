package bxm.dft.smp.online.utils;

import bxm.Main;

public class TestService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("================================================================");
		 System.out.println("===========================test1==================================");
		 System.out.println("================================================================");
			if (args == null || args.length < 1) {
			      System.out.println("invalid argument length");
			      return;
			    } 
			
		        if (args.length != 2) {
		          System.out.println("required argument to encrypt."); 
		          return;
		        }
		    
		    // userId 배열로 입력, 콤마(,)로 구분
		    String [] newAccounts = args[0].split(",");
			
			String userPassword = args[1];

			 
			 for(int i = 0; i < newAccounts.length; i++) {
		            String newAccount = newAccounts[i];
		            String cryptoPwd = null;
		            cryptoPwd=Main.Encrypt.encrypt(userPassword) ;
				     System.out.println((cryptoPwd));
			 }
			 
		}
	}


