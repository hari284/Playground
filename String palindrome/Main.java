#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  int flag;
  char str[10];
  gets(str);
  for(int i=0;i<strlen(str);i++)
  {
    if(str[i] == str[strlen(str)-i-1])
      flag=1;
    else
    {
      flag=0;
      break;
    }
  }
  if(flag == 1)
  {
   for(int i=0;i<strlen(str);i++)
     printf("%c",str[i]);
    printf(" is a palindrome");
  }
  else
  {
   for(int i=0;i<strlen(str);i++)
     printf("%c",str[i]);
    printf(" is not a palindrome");
  }
  return 0;
}