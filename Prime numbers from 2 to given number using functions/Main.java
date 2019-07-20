import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      prime(a);
	}
  public static void prime(int a){
    for(int i=2;i<=a;i++)
    {int flag=0;
      for(int j=2;j<=i/2;j++)
      {
        if(i%j==0)
        {
          flag=1;
          break;
        }
      }
      if(flag==0)
        System.out.println(i);
      //System.out.println("\n");
    }
  }
}