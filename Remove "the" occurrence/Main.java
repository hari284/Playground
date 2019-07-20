#include<stdio.h>
#include<string.h>
int main()
{
	//Try out your code here
  char str[100];
  scanf("%[^\n]s",&str);
  for(int i=0;i<strlen(str);i++)
  {
    if(str[i]>='A' && str[i]<='Z')
      str[i] = str[i]+32;
  }
  for(int i=0;i<strlen(str);i++)
  {
    if(str[i]=='t' && str[i+1]=='h' && str[i+2]=='e')
    {
      for(int k=0;k<=3;k++)
      {
      for(int j=i;j<strlen(str);j++)
      {
        str[j] = str[j+1];
      }
      }
    }
  }
  for(int i=0;i<strlen(str);i++)
    printf("%c",str[i]);
	return 0;
}