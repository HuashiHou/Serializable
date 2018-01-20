package p0119.serializable.diffclass;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {
	//�ļ������
	static FileOutputStream fos = null;
	//���������
	static ObjectOutputStream oos=null;
	//�ֽ������
	static ByteArrayOutputStream bo=null;
	//File����
	static File file = new File("b.bin");
	
	public static void main(String[] args) {
		try {
			//trueΪд���ļ�ʱ׷�Ӷ����Ǹ���
			fos=new FileOutputStream(file,true);
			//���ֽ������������Ŀ���ǣ��������л������к󣬿���ʹ���������toByteArray����
			bo=new ByteArrayOutputStream();
			oos=new ObjectOutputStream(bo);
			
//			Man m = new Man("tom", 12);
			Animal a = new Animal("dog", "man");
			//���л�����
			oos.writeObject(a);
			//�����ж೤����Ͷ�󣬲����������ռ�ÿռ�
			byte[] buff = bo.toByteArray();
			
			//lenΪ���л���ĳ���
			int len=buff.length;
			//д���ļ�֮ǰ���ļ����ȣ����ڷ����л�ʱ��seek
			long beforLength = file.length();
			System.out.println("Seek:"+beforLength);
			System.out.println("Length:"+len);
			
			//���������л���Ķ����byte����д���ļ�
			fos.write(buff);
			fos.flush();
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}	
