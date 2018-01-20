package p0119.serializable.list;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TestDeSerializable {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Man> men = (List<Man>) ois.readObject();
			
			for(Man m:men) {
				System.out.println(m.toString());
			}
			
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
