package bxm.dft.smp.online.service;

public class TestEIMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String permId = "UPDATE";
		
		String lowerPermId = permId.toLowerCase();
		
		System.out.println("lowerPermId is "+lowerPermId);
		
		switch(lowerPermId) {
		case "select":
		case "insert":
		case "update":
		case "delete":
			System.out.println("case 1");
			int ncnt = 0;
			if(ncnt>0) {
			} else {
				if(lowerPermId.equals("select")) {
					System.out.println("select error");					
				}else if(lowerPermId.equals("insert")) {
					System.out.println("insert error");		
				}else if(lowerPermId.equals("update")) {
					System.out.println("update error");				
				}else if(lowerPermId.equals("delete")) {
					System.out.println("delete error");			
				}
			}
		default:
			throw new IllegalArgumentException("처리할 수 없는 CRUD구분코드입니다. (one of select/insert/update/delete. call["+permId+"])");
		}
	}

}
