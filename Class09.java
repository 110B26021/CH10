class CCircle              // 父類別 CCircle
{
   public CCircle(){}
   public void show()         // 父類別的 show() 函數
   {
      System.out.println("父類別的show()");
   }
}

class CCoin extends CCircle   // 子類別 CCoin
{
   public CCoin(){}
   public void show()         // 子類別的 show() 函數
   {
      System.out.println("子類別的show()");
   }
}

public class overriding
{
   public static void main(String args[])
   {
      CCoin coin=new CCoin();
      coin.show();         // 呼叫 show() 函數
   }
}
