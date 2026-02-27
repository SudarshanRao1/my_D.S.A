#include<stdio.h>
int binary(int arr[],int size,int search){
    int left=0,right=size-1;int mid;
    while(left<=right){
        mid=left+(right-left)/2;
        if(arr[mid]==search)
        return mid;

        else if(arr[mid]<search)
        left = mid + 1;

        else if(arr[mid]>search)
        right = mid - 1;
    }
    return -1;
}

int main(){
    int n;int search;
    scanf("%d",&n);
    int array[n];
    for(int i=0;i<n;i++){
        scanf("%d",&array[i]);
    }
    printf("Enter element to search: ");
    scanf("%d",&search);

    int index=binary(array,n,search);
    if(index!=-1)
    printf("Element found at index %d",index);
    else
    printf("Element not found!");
    return 0;
}