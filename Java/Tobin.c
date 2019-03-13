#include<stdio.h>
int n,k,a[100];
  
void pat(int x, int y){
    int i;
  
    if(x>=n){
        if(y==k){
            for(i=0; i<n; i++)printf("%d",a[i]);
            printf("\n");
        }
        return;
    }
  
  
    if(y<k){
        a[x]=1;
        pat(x+1,y+1);
    }
  
    a[x]=0;
    pat(x+1,y);
  
}
  
int main(void){
    scanf("%d %d",&n,&k);
  
    pat(0,0);
   
    return 0;
}