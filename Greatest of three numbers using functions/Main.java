#include <stdio.h>
int greatest(int n1, int n2);
int main() {
	int n1, n2, n3;
	scanf("%d%d%d", &n1, &n2, &n3);
	int result = greatest(n1, n2);
	printf("%d",greatest(result, n3));
	return 0;
}
int greatest(int n1, int n2){
   int great=0;
    if(n1 > n2){
        great = n1;
    }
    else {
        great= n2;
    }
 
    return great;
}