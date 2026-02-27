#include<stdio.h>
int main(){
    int n;int count=0;
    printf("Enter size:");
    scanf("%d",&n);
    int A[n],B[n],C[n];
    for(int i=0;i<n;i++){
        scanf("%d",&A[i]);
    }
    for(int j=0;j<n;j++){
        scanf("%d",&B[j]);
    }
    for(int k=0;k<n;k++){
        scanf("%d",&C[k]);
    }
    for(int x=0;x<n;x++){
        for(int y=0;y<n;y++){
            for(int z=0;z<n;z++){
                if(A[x]==B[y] && B[y]==C[z])
                count++;
            }
        }
    }
    printf("Number of common triplets = %d",count);
    return 0;
}