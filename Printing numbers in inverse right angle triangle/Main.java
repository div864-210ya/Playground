#include <stdio.h>
int main() {
  int n;
  
  scanf("%d",&n);
  for(int i=n;i>=1;i--)
  {
    for(int y=i;y>=1;y--)
    {
      printf("%d",y);
    }
    
    printf("\n");
  }
    // Type your code here
	return 0;
}