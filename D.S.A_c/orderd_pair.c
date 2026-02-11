#include<stdio.h>
int main(){
    int n,sum;int count=0;
    printf("Enter size:");
    scanf("%d",&n);
    int arr[n];
    printf("Enter elements:");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter required sum: ");
    scanf("%d",&sum);
    for(int x=0;x<n;x++){
        for(int y=x+1;y<n;y++){
            if(arr[x]+arr[y]==sum){
                count++;
            }
        }
    }
    printf("Number of valid pairs = %d",count);

    return 0;
}