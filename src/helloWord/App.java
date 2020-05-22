
package helloWord;

import java.io.IOException;

public class App {
	public static void main (String[] args) {
		System.out.println("Hello World from Helll");
							String cmd = "";
							
		if (args.length > 0) {
			cmd = args[0];//1
			//if (args[0]=="dir") {
			//if (args[0].equals("dir")) {
			//cmd = "/c dir .";//2,3
			}

		else
			cmd = "/c tasklist";
		String[] cmdScript = new String[]{"cmd.exe", cmd};
		
		try {
			Process proScript = Runtime.getRuntime().exec(cmdScript);
			System.out.println(proScript.getOutputStream().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

}
