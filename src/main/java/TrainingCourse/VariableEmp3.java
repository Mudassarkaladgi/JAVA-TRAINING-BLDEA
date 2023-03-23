package TrainingCourse;
class Program1 {
	static int a, b, c; //static variables
	int m, n, o; //non-static variables
	//Static block
	static {
		a=10;
		b=20;
		c=30;
	}
	//non-static block
	{
		m=100;
		n=200;
		o=300;
	}
	//static method
	static void disp1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	//non-static method
	void disp2() {
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}
}

public class VariableEmp3 {
	public static void main(String[] args) {
		Program1.disp1();
		Program1 p1=new Program1();
		p1.disp2();
	}
}