package zhangqiwu_study;

public class HelloJava {
	int i = 10;

	void method(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		HelloJava ceshi = new HelloJava();
		ceshi.method(2);
	}
}