#include<stdio.h>
int add_num(int num);

int main() {
  int n;
  scanf("%d",&n);
  printf("%d",add_num(n));
  return 0;
}

int add_num(int num){
  int i, sum=0;

  for(i=1; i<=num; i++){
    sum += i;
  }
  return sum;
}
   // Type your code here
   
