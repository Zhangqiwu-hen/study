package zhangqiwu_study;

import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���������");
		String place = s.nextLine();
		System.out.println("�����빫˾����");
		String biness = s.nextLine();
		System.out.println("�����빫˾����");
		String name = s.nextLine();
		System.out.println("�����빫˾�ϰ�����");
		String boss = s.nextLine();
		System.out.println("��������");
		int money = s.nextInt();
		String rn = s.nextLine();
		System.out.println("�������Ʒ");
		String chanpin = s.nextLine();
		System.out.println("������۸������λ");
		String jiage = s.nextLine();
		System.out.printf("%s���%s%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����%d���ڣ���������С��������!"
				+ "����û�а취������%s�ֹ���!ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���%s������ȫ��ֻ����ʮ�飬"
				+ "ͳͳֻҪ��ʮ��!%s���˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��"
				+ "Ǯ������Ѫ��Ǯ!%n",place,biness,name,boss,money,chanpin,jiage,jiage,jiage,chanpin,boss);
	}
}
