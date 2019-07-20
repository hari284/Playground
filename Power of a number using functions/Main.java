import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner base = new Scanner(System.in);
    int b = base.nextInt();
   
    int e = base.nextInt();
    power(b,e);
  }
  public static void power(int a,int b)
  {
    int pro = a;
    for(int i=0;i<b-1;i++)
      pro = pro*a;
    System.out.println(pro); 
  }
}