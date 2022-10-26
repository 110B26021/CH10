final class Cfinal
{
	public void show()
	{
		System.out.println("Cfinal 父類別");
	}
}
class Ctest extend Cfinal
{
	public void show()
	{
		System.out.println("Ctest 子類別");
	}
}

class Caaa
{
   protected final int num=10;

   public final void show()
   {
      System.out.println("Caaa_num="+num);
   }
}
class Cbbb extends Caaa
{
   int num=10;

   public void show()
   {
      super.num=20;
      System.out.println("Cbbb_num="+num);
      super.show();
   }
}

public class supervsthis
{
   public static void main(String args[])
   {
      Cbbb b=new Cbbb();
      b.show();
   }
}
