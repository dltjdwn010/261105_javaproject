package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception04 {

	public static void main(String[] args) throws IOException {
		// IOException : Checked Exception
		
		InputStreamReader ir =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(ir);
		
		String name ="";
		name = br.readLine(); // == sc.next()
//		try {
//			name = br.readLine(); // == sc.next()
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		System.out.println(name);
		
		
//		ir.close();

	}

}
