#include<stdio.h>
int main()
{
  	int n;
    scanf("%d",&n);
  int k = 1;
	for(int cur_row =1; cur_row <= n; cur_row++) 
      {
         
		 for(int cur_col=1; cur_col <= cur_row ; cur_col++)  
           {
             if(k%2==1) 
			   printf("*");
             else
               printf("#");
             k = k+1;
		   }
    	 printf("\n");
		 
	  }
  return 0;
}