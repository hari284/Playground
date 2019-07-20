#include<stdio.h>
#include <string.h>
int main()
{
	//Try out your code here
  int flag=0,i=0;
    char arr[100];
    scanf("%s",&arr);
    for(i=0;i<strlen(arr);i++)
    {//flag=0;
      for(int j=0;j<strlen(arr);j++)
      {
        if(arr[i] == arr[j] && i != j)
        {
          flag=0;
          break;
        }
        else
          flag=1;
      }
      if(flag == 1)
      {
        printf("%c",arr[i]);
        break;
      }
     
    }
  if(i==strlen(arr) && flag == 0)
       printf("All the characters are repetitive");
	return 0;
}