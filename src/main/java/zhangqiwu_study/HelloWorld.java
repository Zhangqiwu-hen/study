package zhangqiwu_study;

import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入地名");
		String place = s.nextLine();
		System.out.println("请输入公司类型");
		String biness = s.nextLine();
		System.out.println("请输入公司名称");
		String name = s.nextLine();
		System.out.println("请输入公司老板名称");
		String boss = s.nextLine();
		System.out.println("请输入金额");
		int money = s.nextInt();
		String rn = s.nextLine();
		System.out.println("请输入产品");
		String chanpin = s.nextLine();
		System.out.println("请输入价格计量单位");
		String jiage = s.nextLine();
		System.out.printf("%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%d个亿，带着他的小姨子跑了!"
				+ "我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，现在全部只卖二十块，"
				+ "统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗"
				+ "钱，还我血汗钱!%n",place,biness,name,boss,money,chanpin,jiage,jiage,jiage,chanpin,boss);
	}
}
