class Caaa{ //父類別Caaa
	public int num1;
	public int num2;
        public void show(){
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
}
class Cbbb extends Caaa{ //繼承父類別Caaa 的子類別Cbbb
	public void set_num(int a,int b){
		num1=a;
		num2=b;
	}
}
public class Class01 {

	public static void main(String[] args) {
		Cbbb bb=new Cbbb(); //利用子類別建立 bb物件
		bb.set_num(5, 10); //呼叫父類別中的函數
		bb.show();
	}
}
