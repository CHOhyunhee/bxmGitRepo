package test.project;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Class<?> c= Class.forName("bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto");

	            System.out.println("C : " + c);
	            Object obj= c.newInstance();
	            System.out.println("Obj : " + obj);
	        } catch (Exception e) {
	            e.printStackTrace(); 
	        }
	}

}
