#include<stdio.h>
#include <string.h>
int  Rotation_check(char *st1, char *st2)
{int j;
 int rotation;
   char temp[20];
for(int i=strlen(st1)-1;i>=0;i--)
  {
    if(st2[i] == st1[0])
    {
      rotation = i;
      break;
    }
  }
  for(int index = 0; index < strlen(st1); index++)
  {
    j = (index + rotation) % strlen(st1);
    temp[j] = st1[index];
  }
  if(strcmp(temp,st2) == 0)
    printf("Yes");
  else
    printf("No");
  
  //Type your code here
}
int main()
{
  char st1[20], st2[20];
  
  scanf("%s\n",st1);
  scanf("%s\n",st2);
  Rotation_check(st1, st2);
  
  return 0;
}