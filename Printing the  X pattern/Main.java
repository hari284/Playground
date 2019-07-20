#include <stdio.h>
int main() {
	int n;
	scanf("%d", &n);
    
	for(int curr_row = 1; curr_row <= n; ++curr_row)
	{
        // Handle stars for each row
	    for(int curr_col = 1; curr_col <= n; ++curr_col)
	    {
            
	        // When row no and col no are equal, print "*"
            // Otherwise print space
	        if((curr_row == curr_col) ||
	          (curr_row + curr_col == n + 1))
	        {
	            printf("*");
	        }
            
	        else
	        {
	            printf(" ");
	        }
	    }
	    printf("\n");
	}
	return 0;
}