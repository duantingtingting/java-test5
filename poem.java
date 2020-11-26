package test5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Fangfa {
	public static void main(String[] args) throws Exception {
		Student stu=new Student("0415","¡ı≥©","≥§∫ﬁ∏Ë");
		System.out.println(stu.toString());
		write();
	}
		public static void write() throws Exception {
			File file = new File("C:\\Users\\Admin\\Desktop\\≥§∫ﬁ∏ËB.txt");
			FileInputStream fis = new FileInputStream(file);
			byte[] buf = new byte[1024];
			int len = -1;
			StringBuffer sbuf = new StringBuffer("");
			while ((len = (fis.read(buf))) != -1) {
				sbuf.append(new String(buf, 0, len));
			}
			fis.close();
			StringBuilder file1 = new StringBuilder(sbuf.toString());
			File file0 = new File("C:\\Users\\Admin\\Desktop\\≥§∫ﬁ∏ËA.txt");
			FileOutputStream fos = new FileOutputStream(file0);
			 int last = file1.length();
		        for(int i = 7; i <last+60 ; i+=18) {
		            file1.insert(i,'£¨');
		            file1.insert(i+8,'°£');
		            file1.insert(i+9,'\r');
		            file1.insert(i+10,'\n');
		        }
		            System.out.print(file1.toString());
			fos.write(file1.toString().getBytes());
			fos.close();
			}
}

