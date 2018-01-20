package p0119.serializable.diffclass;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;

public class DeSerializable {
	public static void main(String[] args) {
		try {
			//随机文件访问类，可以用seek设置指针，从指定位置读取数据
			RandomAccessFile ris = new RandomAccessFile("b.bin", "r");
			//此处手动填入一个指针
			ris.seek(194);
			//手动设置长度
			int len =107;
			//以len长度创建一个byte数组用与存储从文件读取的信息
			byte[] buff = new byte[len];
			//读取数据到buff数组
			ris.read(buff, 0, len);
			
			//由于读取出来的byte数组不能直接用于反序列化，所以此处用了字节数组输入类
			ByteArrayInputStream bis = new ByteArrayInputStream(buff);
			ObjectInputStream ois= new ObjectInputStream(bis);
			
			//执行反序列化，强转
			Animal m = (Animal)ois.readObject();
			System.out.println(m.toString());
			
			ois.close();
			ris.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
