package p0119.serializable.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestSerializable {
	static File file=new File("a.bin");
	static File seeks = new File("seeks");
	static FileOutputStream fos = null;
	static ObjectOutputStream oos =null;
	static FileWriter fw =null;
	public static void main(String[] args) {
		try {
			fos = new FileOutputStream("a.bin");
			oos =  new ObjectOutputStream(fos);
			fw =  new FileWriter(seeks);
			List<Man> men = new ArrayList<Man>();
			Man m1 = new Man("tom", 12);
			Man m2 = new Man("tag", 44);
			Man m3 = new Man("wang", 23);
			men.add(m1);
			men.add(m2);
			men.add(m3);
			oos.writeObject(men);
			oos.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
