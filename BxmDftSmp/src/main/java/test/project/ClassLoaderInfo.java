package test.project;

public class ClassLoaderInfo {

	public static void main(String args[]) {
		// 특정 클래스의 클래스 로더 확인
		if (args == null || args.length < 1) {
			System.out.println("invalid argument length");
			return;
		}
		try {
			Class<?> clazz = Class.forName(args[0]);
			System.out.println("C : " + clazz);

			ClassLoader classLoader = clazz.getClassLoader();
			if (classLoader != null) {
				System.out.println("ClassLoader: " + classLoader);
			} else {
				System.out.println(clazz.getName() + " is loaded by Bootstrap ClassLoader");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
