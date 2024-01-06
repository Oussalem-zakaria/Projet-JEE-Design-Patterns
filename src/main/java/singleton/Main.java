package singleton;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		Connection con1 = ThreadConnection.getcon();
		System.out.println(con1);
		Connection con2 = ThreadConnection.getcon();
		System.out.println(con2);
		System.out.println("sets");
	}

}
