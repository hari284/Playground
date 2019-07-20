#include<stdio.h>
int main()
{
	int n;
    scanf("%d",&n);
  int k = 1;
	for(int row_no = 1 ; row_no <= n ; row_no++)
      {
		for(int space = 1 ; space <= (n-row_no) ; space++ ) 
           {
			 printf(" ");
	       }
		for(int col_no = 1 ; col_no <= row_no ; col_no++)
           {
			 printf("%d ",k);
             k = k + 1;
		   }
		printf("\n");			
	 }
     return 0;
}