#include<stdio.h>
int main(){
    int n;int search;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter element to search: ");
    scanf("%d",&search);
    for(int j=0;j<n;j++){
        if(arr[j]==search){
            printf("Element found at index %d\n",j);
            return 0;
        }
    }
    printf("Element not found!");
    return 0;
}