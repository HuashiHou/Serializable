package p0119.serializable.diffclass;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;

public class DeSerializable {
	public static void main(String[] args) {
		try {
			//����ļ������࣬������seek����ָ�룬��ָ��λ�ö�ȡ����
			RandomAccessFile ris = new RandomAccessFile("b.bin", "r");
			//�˴��ֶ�����һ��ָ��
			ris.seek(194);
			//�ֶ����ó���
			int len =107;
			//��len���ȴ���һ��byte��������洢���ļ���ȡ����Ϣ
			byte[] buff = new byte[len];
			//��ȡ���ݵ�buff����
			ris.read(buff, 0, len);
			
			//���ڶ�ȡ������byte���鲻��ֱ�����ڷ����л������Դ˴������ֽ�����������
			ByteArrayInputStream bis = new ByteArrayInputStream(buff);
			ObjectInputStream ois= new ObjectInputStream(bis);
			
			//ִ�з����л���ǿת
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
